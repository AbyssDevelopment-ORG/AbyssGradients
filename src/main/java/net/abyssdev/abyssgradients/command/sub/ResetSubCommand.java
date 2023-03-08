package net.abyssdev.abyssgradients.command.sub;

import lombok.SneakyThrows;
import net.abyssdev.abyssgradients.AbyssGradients;
import net.abyssdev.abyssgradients.player.GradientPlayer;
import net.abyssdev.abysslib.command.AbyssSubCommand;
import net.abyssdev.abysslib.command.context.CommandContext;
import net.abyssdev.abysslib.logger.AbyssLogger;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import org.bukkit.entity.Player;
import org.eclipse.collections.api.factory.Sets;
import org.eclipse.collections.api.set.ImmutableSet;

public final class ResetSubCommand extends AbyssSubCommand<AbyssGradients> {

    public ResetSubCommand(final AbyssGradients plugin) {
        super(plugin, 1, plugin.getMessageCache().getMessage("messages.help"), Sets.immutable.of("reset", "remove"));
    }

    @Override
    @SneakyThrows
    public void execute(final CommandContext<?> context) {

        if (!context.getSender().hasPermission("abyssgradients.admin")) {
            this.getInvalid().send(context.getSender());
            return;
        }

        if (!context.isPlayer(0)) {
            this.getInvalid().send(context.getSender());
            return;
        }

        final Player player = context.asPlayer(0);
        final GradientPlayer gradientPlayer = this.plugin.getStorage().get(player.getUniqueId());

        gradientPlayer.setGradient(null);
        player.setDisplayName(player.getName());

        this.plugin.getMessageCache().sendMessage(
                context.getSender(),
                "messages.reset-admin",
                new PlaceholderReplacer().addPlaceholder("%player%", player.getName())
        );
    }

}
