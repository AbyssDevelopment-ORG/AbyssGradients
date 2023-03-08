package net.abyssdev.abyssgradients.storage;

import net.abyssdev.abyssgradients.AbyssGradients;
import net.abyssdev.abyssgradients.player.GradientPlayer;
import net.abyssdev.abysslib.storage.credentials.Credentials;
import net.abyssdev.abysslib.storage.json.JsonStorage;
import net.abyssdev.abysslib.storage.mongo.MongoStorage;
import net.abyssdev.abysslib.utils.file.Files;
import org.bukkit.plugin.Plugin;

import java.util.UUID;

public final class GradientMongoStorage extends MongoStorage<UUID, GradientPlayer> {

    public GradientMongoStorage(final AbyssGradients plugin) {
        super(AbyssGradients.class, GradientPlayer.class, Credentials.from(plugin.getStorageConfig()));
    }

    @Override
    public GradientPlayer constructValue(final UUID key) {
        return new GradientPlayer(key);
    }
}
