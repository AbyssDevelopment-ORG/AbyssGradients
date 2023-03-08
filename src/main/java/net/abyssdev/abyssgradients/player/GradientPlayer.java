package net.abyssdev.abyssgradients.player;

import dev.morphia.annotations.Converters;
import dev.morphia.converters.UUIDConverter;
import lombok.Data;
import net.abyssdev.abysslib.storage.id.Id;

import java.util.UUID;

@Data
@Converters(UUIDConverter.class)
public final class GradientPlayer {

    @Id
    @dev.morphia.annotations.Id
    private final UUID uuid;

    private String gradient;

}
