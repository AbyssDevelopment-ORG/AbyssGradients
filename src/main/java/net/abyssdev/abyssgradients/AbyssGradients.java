package net.abyssdev.abyssgradients;

import lombok.Getter;
import net.abyssdev.abyssgradients.command.GradientCommand;
import net.abyssdev.abyssgradients.listener.ChatListener;
import net.abyssdev.abyssgradients.menu.GradientMenu;
import net.abyssdev.abyssgradients.player.GradientPlayer;
import net.abyssdev.abyssgradients.storage.GradientJsonStorage;
import net.abyssdev.abyssgradients.storage.GradientMongoStorage;
import net.abyssdev.abyssgradients.storage.GradientSQLStorage;
import net.abyssdev.abysslib.config.AbyssConfig;
import net.abyssdev.abysslib.patterns.registry.Registry;
import net.abyssdev.abysslib.patterns.registry.impl.EclipseRegistry;
import net.abyssdev.abysslib.plugin.AbyssPlugin;
import net.abyssdev.abysslib.storage.common.CommonStorageImpl;
import net.abyssdev.abysslib.text.MessageCache;
import org.eclipse.collections.api.list.ImmutableList;

import java.util.UUID;

@Getter
public final class AbyssGradients extends AbyssPlugin {

    private final Registry<String, String[]> gradients = new EclipseRegistry<>();

    private final MessageCache messageCache = new MessageCache(this.getConfig("lang"));

    private final AbyssConfig langConfig = this.getAbyssConfig("lang");
    private final AbyssConfig settingsConfig = this.getAbyssConfig("settings");
    private final AbyssConfig menusConfig = this.getAbyssConfig("menus");
    private final AbyssConfig gradientsConfig = this.getAbyssConfig("gradients");
    private final AbyssConfig storageConfig = this.getAbyssConfig("storage");

    private final GradientMenu menu = new GradientMenu(this);

    private CommonStorageImpl<UUID, GradientPlayer> storage;

    private boolean placeholderAPI;

    @Override
    public void onEnable() {
        // Plugin startup logic

        if (!this.getServer().getPluginManager().isPluginEnabled("AbyssLib")) {
            this.getLogger().severe("AbyssLib is not enabled! Disabling...");
            return;
        }

        if (this.getServer().getPluginManager().isPluginEnabled("PlaceholderAPI")) {
            this.placeholderAPI = true;
            this.getLogger().info("Detected PlaceholderAPI! Hooking...");
        }

        this.loadMessages(this.messageCache, this.langConfig);

        for (final String key : this.gradientsConfig.getSectionKeys("gradients")) {

            final ImmutableList<String> list = this.gradientsConfig.getImmutableStringList("gradients." + key);
            final String[] gradients = new String[list.size()];

            int index = 0;
            for (final String string : list) {
                gradients[index] = string;
                index++;
            }

            this.gradients.register(key, gradients);
        }

        final String type = this.storageConfig.getString("storage.type");

        switch (type) {
            case "JSON": {
                this.getLogger().info("Using storage type " + type + "...");
                this.storage = new CommonStorageImpl<>(new GradientJsonStorage(this));
                this.getLogger().info("Storage loaded!");
                break;
            }

            case "SQL": {
                this.getLogger().info("Using storage type " + type + "...");
                this.storage = new CommonStorageImpl<>(new GradientSQLStorage(this));
                this.getLogger().info("Storage loaded!");
                break;
            }

            case "MONGO_DB": {
                this.getLogger().info("Using storage type " + type + "...");
                this.storage = new CommonStorageImpl<>(new GradientMongoStorage(this));
                this.getLogger().info("Storage loaded!");
                break;
            }

            default: {
                this.getLogger().severe("The storage type " + type + " is not supported yet!");
                this.getLogger().severe("Suggest to add it at discord.gg/abyssdev");
            }
        }

        new GradientCommand(this);
        new ChatListener(this);

        this.getLogger().info("Enabled!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        this.getLogger().info("Saving data...");
        this.storage.write();
        this.getLogger().info("Saved data!");

        this.getLogger().info("Disabled!");
    }

}
