package net.abyssdev.abyssgradients.player;

import lombok.Data;
import net.abyssdev.abysslib.storage.id.Id;

import java.util.UUID;

@Data
public final class GradientPlayer {

    @Id
    private final UUID uuid;

    private String gradient;

}
