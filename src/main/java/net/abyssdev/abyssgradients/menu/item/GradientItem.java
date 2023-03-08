package net.abyssdev.abyssgradients.menu.item;

import lombok.Data;
import net.abyssdev.abysslib.builders.ItemBuilder;

@Data
public final class GradientItem {

    private final String gradient;
    private final int slot;

    private final ItemBuilder locked;
    private final ItemBuilder unlocked;

}
