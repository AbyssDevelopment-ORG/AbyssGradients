package net.abyssdev.abyssgradients.menu;

import lombok.SneakyThrows;
import net.abyssdev.abyssgradients.AbyssGradients;
import net.abyssdev.abyssgradients.menu.item.GradientItem;
import net.abyssdev.abyssgradients.player.GradientPlayer;
import net.abyssdev.abysslib.builders.ItemBuilder;
import net.abyssdev.abysslib.builders.PageBuilder;
import net.abyssdev.abysslib.config.AbyssConfig;
import net.abyssdev.abysslib.menu.MenuBuilder;
import net.abyssdev.abysslib.menu.item.MenuItemBuilder;
import net.abyssdev.abysslib.menu.templates.AbyssMenu;
import net.abyssdev.abysslib.placeholder.PlaceholderReplacer;
import net.abyssdev.abysslib.text.Color;
import net.abyssdev.abysslib.utils.Utils;
import net.abyssdev.abysslib.utils.gradient.Gradients;
import org.bukkit.entity.Player;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.factory.Sets;
import org.eclipse.collections.impl.list.mutable.primitive.IntArrayList;

import java.util.*;

public final class GradientMenu extends AbyssMenu {

    private final Set<GradientItem> gradients = Sets.mutable.empty();

    private final MenuItemBuilder next;
    private final MenuItemBuilder current;
    private final MenuItemBuilder previous;
    private final MenuItemBuilder reset;
    private final MenuItemBuilder currentGradient;

    private final AbyssGradients plugin;

    private final IntArrayList slots;

    public GradientMenu(final AbyssGradients plugin) {
        super(plugin.getMenusConfig(), "menus.gradients.");
        this.plugin = plugin;

        final AbyssConfig config = plugin.getMenusConfig();

        this.slots = config.getPrimitiveIntList("menus.gradients.slots");

        this.next = new MenuItemBuilder(
                new ItemBuilder(config, "menus.gradients.items.next"),
                config.getInt("menus.gradients.items.next.slot"));

        this.current = new MenuItemBuilder(
                new ItemBuilder(config, "menus.gradients.items.current"),
                config.getInt("menus.gradients.items.current.slot"));

        this.previous = new MenuItemBuilder(
                new ItemBuilder(config, "menus.gradients.items.previous"),
                config.getInt("menus.gradients.items.previous.slot"));

        this.reset = new MenuItemBuilder(
                new ItemBuilder(config, "menus.gradients.items.reset"),
                config.getInt("menus.gradients.items.reset.slot"));

        this.currentGradient = new MenuItemBuilder(
                new ItemBuilder(config, "menus.gradients.items.current-gradient"),
                config.getInt("menus.gradients.items.current-gradient.slot"));

        for (final String key : config.getSectionKeys("menus.gradients.gradients")) {
            this.gradients.add(
                    new GradientItem(
                            key,
                            config.getInt("menus.gradients.gradients." + key + ".slot"),
                            new ItemBuilder(config, "menus.gradients.gradients." + key + ".locked"),
                            new ItemBuilder(config, "menus.gradients.gradients." + key + ".unlocked")
                    ));
        }

    }

    @SneakyThrows
    public void open(final Player player, final int page) {

        final MenuBuilder builder = this.createBase();
        final GradientPlayer gradientPlayer = this.plugin.getStorage().get(player.getUniqueId());

        final List<GradientItem> sorted = new LinkedList<>();
        final Set<GradientItem> later = Sets.mutable.empty();

        for (final GradientItem item : this.gradients) {

            if (player.hasPermission("abyssgradients." + item.getGradient())) {
                sorted.add(item);
                continue;
            }

            later.add(item);
        }

        sorted.addAll(later);

        final PlaceholderReplacer itemReplacer = new PlaceholderReplacer()
                .addPlaceholder("%current%", Utils.format(page + 1))
                .addPlaceholder("%gradient%", gradientPlayer.getGradient() == null ?
                        Color.parse("&fNONE")
                        : Color.parse(Gradients.gradient(player.getName(), this.plugin.getGradients().get(gradientPlayer.getGradient()).get())));

        builder.setItem(this.next.getSlot(), this.next.getItem().parse(player, itemReplacer));
        builder.setItem(this.previous.getSlot(), this.previous.getItem().parse(player, itemReplacer));
        builder.setItem(this.current.getSlot(), this.current.getItem().parse(player, itemReplacer));
        builder.setItem(this.reset.getSlot(), this.reset.getItem().parse(player, itemReplacer));
        builder.setItem(this.currentGradient.getSlot(), this.currentGradient.getItem().parse(player, itemReplacer));

        final PageBuilder<GradientItem> pages = new PageBuilder<>(new LinkedList<>(sorted), this.slots.size());

        builder.addClickEvent(this.next.getSlot(), event -> {
            if (!pages.hasPage(page + 1)) {
                return;
            }

            this.open(player, page + 1);
        });


        builder.addClickEvent(this.previous.getSlot(), event -> {
            if (page - 1 < 0) {
                return;
            }

            this.open(player, page - 1);
        });

        builder.addClickEvent(this.reset.getSlot(), event -> {
            event.setCancelled(true);
            player.closeInventory();

            gradientPlayer.setGradient(null);
            player.setDisplayName(player.getName());

            this.plugin.getMessageCache().sendMessage(player, "messages.reset");
        });

        int index = 0;
        for (final int i : this.slots.toArray()) {
            if (sorted.size() <= index) {
                break;
            }

            final GradientItem item = sorted.get(i);

            final String parsed = Color.parse(Gradients.gradient(player.getName(), this.plugin.getGradients().get(item.getGradient()).get()));

            final PlaceholderReplacer replacer = new PlaceholderReplacer();
            replacer.setUsePlaceholderAPI(this.plugin.isPlaceholderAPI());
            replacer.addPlaceholder("%gradient%", parsed);

            index++;

            if (player.hasPermission("abyssgradients." + item.getGradient())) {
                builder.setItem(item.getSlot(), item.getUnlocked().parse(player, replacer));

                builder.addClickEvent(item.getSlot(), event -> {
                    event.setCancelled(true);

                    if (gradientPlayer.getGradient() != null && gradientPlayer.getGradient().equals(item.getGradient())) {
                        return;
                    }

                    player.closeInventory();
                    player.setDisplayName(parsed);
                    gradientPlayer.setGradient(item.getGradient());

                    this.plugin.getMessageCache().sendMessage(player, "messages.set-gradient");
                });
                continue;
            }

            builder.setItem(item.getSlot(), item.getLocked().parse(player, replacer));

        }

        player.openInventory(builder.build());

    }
}
