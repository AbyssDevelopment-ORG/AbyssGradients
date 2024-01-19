package net.abyssdev.abyssgradients.placeholder;

import lombok.RequiredArgsConstructor;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.abyssdev.abyssgradients.AbyssGradients;
import net.abyssdev.abyssgradients.player.GradientPlayer;
import net.abyssdev.abysslib.text.Color;
import net.abyssdev.abysslib.utils.gradient.Gradients;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The gradient placeholder expansion class
 *
 * @author Relocation
 */
@RequiredArgsConstructor
public final class GradientPlaceholderExpansion extends PlaceholderExpansion {

    private final AbyssGradients plugin;

    @Override
    public @NotNull String getIdentifier() {
        return "abyssgradients";
    }

    @Override
    public @NotNull String getAuthor() {
        return "AbyssDev";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public @Nullable String onRequest(final OfflinePlayer offlinePlayer, @NotNull final String params) {
        if (!offlinePlayer.isOnline()) {
            return offlinePlayer.getName();
        }

        final GradientPlayer player = this.plugin.getStorage().get(offlinePlayer.getUniqueId());

        if (player.getGradient() == null) {
            return offlinePlayer.getName();
        }

        return Color.parse(Gradients.gradient(offlinePlayer.getName(),
                this.plugin.getGradients().get(player.getGradient()).get()));
    }

}