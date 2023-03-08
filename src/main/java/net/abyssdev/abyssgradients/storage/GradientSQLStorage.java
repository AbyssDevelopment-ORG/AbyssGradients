package net.abyssdev.abyssgradients.storage;

import net.abyssdev.abyssgradients.AbyssGradients;
import net.abyssdev.abyssgradients.player.GradientPlayer;
import net.abyssdev.abysslib.storage.credentials.Credentials;
import net.abyssdev.abysslib.storage.sql.SQLStorage;

import java.util.UUID;

public final class GradientSQLStorage extends SQLStorage<UUID, GradientPlayer> {

    public GradientSQLStorage(final AbyssGradients plugin) {
        super(UUID.class, GradientPlayer.class, "abyssgradients", Credentials.from(plugin.getStorageConfig()));
    }

    @Override
    public GradientPlayer constructValue(final UUID key) {
        return new GradientPlayer(key);
    }
}
