package net.abyssdev.abyssgradients.storage;

import net.abyssdev.abyssgradients.player.GradientPlayer;
import net.abyssdev.abysslib.storage.json.JsonStorage;
import net.abyssdev.abysslib.utils.file.Files;
import org.bukkit.plugin.Plugin;

import java.util.UUID;

public final class GradientJsonStorage extends JsonStorage<UUID, GradientPlayer> {

    public GradientJsonStorage(final Plugin plugin) {
        super(Files.file("storage.json", plugin), GradientPlayer.class);
    }

    @Override
    public GradientPlayer constructValue(final UUID key) {
        return new GradientPlayer(key);
    }
}
