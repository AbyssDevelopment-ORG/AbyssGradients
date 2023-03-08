package net.abyssdev.abyssgradients.listener;

import net.abyssdev.abyssgradients.AbyssGradients;
import net.abyssdev.abyssgradients.player.GradientPlayer;
import net.abyssdev.abysslib.listener.AbyssListener;
import net.abyssdev.abysslib.text.Color;
import net.abyssdev.abysslib.utils.gradient.Gradients;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public final class ChatListener extends AbyssListener<AbyssGradients> {

    public ChatListener(final AbyssGradients plugin) {
        super(plugin);
    }

    @EventHandler
    public void chat(final AsyncPlayerChatEvent event) {
        final GradientPlayer player = this.plugin.getStorage().get(event.getPlayer().getUniqueId());

        if (player.getGradient() == null) {
            return;
        }

        event.getPlayer().setDisplayName(
                Color.parse(Gradients.gradient(event.getPlayer().getName(),
                        this.plugin.getGradients().get(player.getGradient()).get()))
        );
    }

    @EventHandler
    public void join(final PlayerJoinEvent event) {

        final GradientPlayer player = this.plugin.getStorage().get(event.getPlayer().getUniqueId());

        if (player.getGradient() == null) {
            return;
        }

        event.getPlayer().setDisplayName(
                Color.parse(Gradients.gradient(event.getPlayer().getName(),
                        this.plugin.getGradients().get(player.getGradient()).get()))
        );

    }

}
