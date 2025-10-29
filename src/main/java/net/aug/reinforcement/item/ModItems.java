package net.aug.reinforcement.item;

import net.aug.reinforcement.Reinforcement;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.spongepowered.include.com.google.common.base.Function;

import java.util.Map;

public class ModItems {

	public static final TagKey<Item> REPAIRS_REINFORCED_ARMOR = TagKey.of(Registries.ITEM.getKey(), Identifier.of(Reinforcement.MOD_ID, "repairs_reinforced_armor"));
	public static final RegistryKey<EquipmentAsset> REINFORCED_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(Reinforcement.MOD_ID, "reinforced_netherite"));

	private static final int BASE_DURABILITY = 12;
	public static final ArmorMaterial REINFORCED_ARMOR_MATERIAL = new ArmorMaterial(
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
			REPAIRS_REINFORCED_ARMOR,
			REINFORCED_ARMOR_MATERIAL_KEY
	);

	public static final ToolMaterial REINFORCED_NETHERITE_TOOL_MATERIAL = new ToolMaterial(
			BlockTags.INCORRECT_FOR_WOODEN_TOOL,
			700,
			5.0F,
			4.5F,
			22,
			REPAIRS_REINFORCED_ARMOR
	);

	//crafting items
	public static final Item REINFORCED_STICK = register("reinforced_stick", Item::new, new Item.Settings());
    public static final Item REINFORCED_HANDLE = register("reinforced_handle", Item::new, new Item.Settings());
    public static final Item COMPRESSED_DIAMOND = register("compressed_diamond", Item::new, new Item.Settings());

	//vanilla extended
    public static final Item REINFORCED_NETHERITE_SWORD = register("reinforced_netherite_sword", Item::new, new Item.Settings().sword(REINFORCED_NETHERITE_TOOL_MATERIAL, 1.5f, 0.8f));
	public static final Item REINFORCED_NETHERITE_AXE = register("reinforced_netherite_axe", Item::new, new Item.Settings().axe(REINFORCED_NETHERITE_TOOL_MATERIAL, 1.8f, 0.6f ));
	public static final Item REINFORCED_NETHERITE_PICKAXE = register("reinforced_netherite_pickaxe", Item::new, new Item.Settings.pickaxe(REINFORCED_NETHERITE_TOOL_MATERIAL, 0.8f, 0.9f));

	//spears
	public static final Item WOODEN_SPEAR = register("wooden_spear", Item::new, new Item.Settings().spear(WOOD_TOOL_MATERIAL, 1.2f, 0.7f));
	public static final Item STONE_SPEAR = register("stone_spear", Item::new, new Item.Settings().spear(STONE_TOOL_MATERIAL, 1.2f, 0.7f));
	public static final Item IRON_SPEAR = register("iron_spear", Item::new, new Item.Settings().spear(IRON_TOOL_MATERIAL, 1.2f, 0.7f));
	public static final Item GOLLDEN_SPEAR = register("gold_spear", Item::new, new Item.Settings().spear(GOLD_TOOL_MATERIAL_TOOL_MATERIAL, 1.2f, 0.7f));
	public static final Item DIAMOND_SPEAR = register("diamond_spear", Item::new, new Item.Settings().spear(DIAMOND_TOOL_MATERIAL, 1.2f, 0.7f));
	public static final Item REINFORCED_NETHERITE_SPEAR = register("reinforced_netherite_spear", Item::new, new Item.Settings().spear(REINFORCED_NETHERITE_TOOL_MATERIAL, 1.2f, 0.7f));

	//rapiers
	public static final Item WOODEN_RAPIER = register("wooden_rapier", Item::new, new Item.Settings().spear(WOOD_TOOL_MATERIAL, 0.9f, 0.7f));
	public static final Item STONE_RAPIER = register("stone_rapier", Item::new, new Item.Settings().spear(STONE_TOOL_MATERIAL, 0.9f, 0.7f));
	public static final Item IRON_RAPIER = register("iron_rapier", Item::new, new Item.Settings().spear(IRON_TOOL_MATERIAL, 0.9f, 0.7f));
	public static final Item GOLDEN_RAPIER = register("gold_rapier", Item::new, new Item.Settings().spear(GOLD_TOOL_MATERIAL_TOOL_MATERIAL, 0.9f, 0.7f));
	public static final Item DIAMOND_RAPIER = register("diamond_rapier", Item::new, new Item.Settings().spear(DIAMOND_TOOL_MATERIAL, 0.9f, 0.7f));
	public static final Item REINFORCED_NETHERITE_RAPIER = register("reinforced_netherite_rapier", Item::new, new Item.Settings().spear(REINFORCED_NETHERITE_TOOL_MATERIAL, 0.9f, 0.7f));

	//halberds
	public static final Item WOODEN_HALBERD = register("wooden_halberd", Item::new, new Item.Settings().spear(WOOD_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item STONE_HALBERD = register("stone_halberd", Item::new, new Item.Settings().spear(STONE_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item IRON_HALBERD = register("iron_halberd", Item::new, new Item.Settings().spear(IRON_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item GOLDEN_HALBERD = register("gold_halberd", Item::new, new Item.Settings().spear(GOLD_TOOL_MATERIAL_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item DIAMOND_HALBERD = register("diamond_halberd", Item::new, new Item.Settings().spear(DIAMOND_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item REINFORCED_NETHERITE_HALBERD = register("reinforced_netherite_halberd", Item::new, new Item.Settings().spear(REINFORCED_NETHERITE_TOOL_MATERIAL, 1.4f, 0.7f));

	//sickles
	public static final Item WOODEN_HALBERD = register("wooden_halberd", Item::new, new Item.Settings().spear(WOOD_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item STONE_HALBERD = register("stone_halberd", Item::new, new Item.Settings().spear(STONE_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item IRON_HALBERD = register("iron_halberd", Item::new, new Item.Settings().spear(IRON_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item GOLDEN_HALBERD = register("gold_halberd", Item::new, new Item.Settings().spear(GOLD_TOOL_MATERIAL_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item DIAMOND_HALBERD = register("diamond_halberd", Item::new, new Item.Settings().spear(DIAMOND_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item REINFORCED_NETHERITE_HALBERD = register("reinforced_netherite_halberd", Item::new, new Item.Settings().spear(REINFORCED_NETHERITE_TOOL_MATERIAL, 1.4f, 0.7f));

	//maces
	public static final Item WOODEN_HALBERD = register("wooden_halberd", Item::new, new Item.Settings().spear(WOOD_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item STONE_HALBERD = register("stone_halberd", Item::new, new Item.Settings().spear(STONE_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item IRON_HALBERD = register("iron_halberd", Item::new, new Item.Settings().spear(IRON_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item GOLDEN_HALBERD = register("gold_halberd", Item::new, new Item.Settings().spear(GOLD_TOOL_MATERIAL_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item DIAMOND_HALBERD = register("diamond_halberd", Item::new, new Item.Settings().spear(DIAMOND_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item REINFORCED_NETHERITE_HALBERD = register("reinforced_netherite_halberd", Item::new, new Item.Settings().spear(REINFORCED_NETHERITE_TOOL_MATERIAL, 1.4f, 0.7f));

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY  = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Reinforcement.MOD_ID, "reinforcement"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.REINFORCED_STICK))
		.displayName(Text.translatable("itemGroup.reinforcement"))
		.build();




	public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
		// Create the item key.
		RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Reinforcement.MOD_ID, name));

		// Create the item instance.
		Item item = itemFactory.apply(settings.registryKey(itemKey));

		// Register the item.
		Registry.register(Registries.ITEM, itemKey, item);

		return item;
	}

    public static void registerModItems() {
        Reinforcement.LOGGER.info("Registering Mod Items " + Reinforcement.MOD_ID);

		Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(entries -> {
            entries.add(REINFORCED_STICK);
            entries.add(COMPRESSED_DIAMOND);
            entries.add(REINFORCED_HANDLE);

			entries.add(WOODEN_SPEAR);
			entries.add(WOODEN_RAPIER);
			entries.add(WOODEN_HALBERD);
        });
    }
}
