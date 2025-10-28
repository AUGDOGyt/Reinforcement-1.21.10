package net.aug.reinforcement.item;

import net.aug.reinforcement.Reinforcement;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item REINFORCED_STICK = registerItem("reinforced_stick", new Item(new Item.Settings()));
    public static final Item COMPRESSED_DIAMOND = registerItem("compressed_diamond", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Reinforcement.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Reinforcement.LOGGER.info("Registering Mod Items " + Reinforcement.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(REINFORCED_STICK);
            entries.add(COMPRESSED_DIAMOND);
        });
    }
}
