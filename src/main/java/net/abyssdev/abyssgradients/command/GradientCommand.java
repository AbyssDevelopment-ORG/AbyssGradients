package net.abyssdev.abyssgradients.command;

import net.abyssdev.abyssgradients.AbyssGradients;
import net.abyssdev.abyssgradients.command.sub.ResetSubCommand;
import net.abyssdev.abysslib.command.AbyssCommand;
import net.abyssdev.abysslib.command.context.CommandContext;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class GradientCommand extends AbyssCommand<AbyssGradients, CommandSender> {


    public GradientCommand(final AbyssGradients plugin) {
        super(
                plugin,
                plugin.getSettingsConfig().getString("command.base-command"),
                "AbyssGradients Main Command",
                plugin.getSettingsConfig().getStringList("command.aliases"),
                CommandSender.class
        );

        this.register(new ResetSubCommand(plugin));
        this.register();
    }

    @Override
    public void execute(final CommandContext<CommandSender> context) {

        final CommandSender sender = context.getSender();

        if (!(sender instanceof Player)) {
            this.plugin.getMessageCache().sendMessage(sender, "messages.admin-help");
            return;
        }

        this.plugin.getMenu().open(context.getSender(), 0);

    }
}
