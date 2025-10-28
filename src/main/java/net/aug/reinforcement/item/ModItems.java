package net.aug.reinforcement.item;

import net.aug.reinforcement.Reinforcement;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item REINFORCED_STICK = register("reinforced_stick", Item::new, new Item.Settings());
    public static final Item REINFORCED_HANDLE = register("reinforced_handle", Item::new, new Item.Settings());
    public static final Item COMPRESSED_DIAMOND = register("compressed_diamond", Item::new, new Item.Settings());

    public static final Item REINFORCED_NETHERITE_SWORD = register("reinforced_netherite_sword", Item::new, new Item.settings().sword(REINFORCED_NETHERITE_TOOL_MATERIAL, 1.5f, 08.f));

    public static final ToolMaterial REINFORCED_NETHERITE_TOOL_MATERIAL = new ToolMaterial(
		BlockTags.INCORRECT_FOR_WOODEN_TOOL,
		700,
		5.0F,
		4.5F,
		22,
    );

    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
		BASE_DURABILITY,
		Map.of(
				EquipmentType.HELMET, 3,
				EquipmentType.CHESTPLATE, 8,
				EquipmentType.LEGGINGS, 6,
				EquipmentType.BOOTS, 3
		),
		5,
		SoundEvents.ITEM_ARMOR_EQUIP_IRON,
		0.0F,
		0.0F,
		REPAIRS_GUIDITE_ARMOR,
		GUIDITE_ARMOR_MATERIAL_KEY
);

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY  = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Reinforcement.MOD_ID, "reinforcement"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.reinforced_stick))
		.displayName(Text.translatable("itemGroup.reinforcement"))
		.build();

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
		// Create the item key.
		RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, name));

		// Create the item instance.
		Item item = itemFactory.apply(settings.registryKey(itemKey));

		// Register the item.
		Registry.register(Registries.ITEM, itemKey, item);

		return item;
	}

    public static void registerModItems() {
        Reinforcement.LOGGER.info("Registering Mod Items " + Reinforcement.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(entries -> {
            entries.add(REINFORCED_STICK);
            entries.add(COMPRESSED_DIAMOND);
            entries.add(REINFORCED_HANDLE);
        });
    }
}
