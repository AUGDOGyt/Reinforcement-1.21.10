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


	public static final RegistryKey<EquipmentAsset> REINFORCED_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(Reinforcement.MOD_ID, "reinforced_netherite"));
	public static final RegistryKey<EquipmentAsset> L_ALLOY_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(Reinforcement.MOD_ID, "lightweight_alloy"));
	public static final RegistryKey<EquipmentAsset> H_ALLOY_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(Reinforcement.MOD_ID, "lightweight_alloy"));

	public static final TagKey<Item> REPAIRS_ALLOY_ARMOR = TagKey.of(Registries.ITEM.getKey(), Identifier.of(Reinforcement.MOD_ID, "repairs_alloy_armor"));
	public static final TagKey<Item> REPAIRS_REINFORCED_ALL_ARMOR = TagKey.of(Registries.ITEM.getKey(), Identifier.of(Reinforcement.MOD_ID, "repairs_reinforced_all_armor"));
	public static final TagKey<Item> REPAIRS_REINFORCED_ARMOR = TagKey.of(Registries.ITEM.getKey(), Identifier.of(Reinforcement.MOD_ID, "repairs_reinforced_net_armor"));

	private static final int BASE_DURABILITY = 12;
	public static final ArmorMaterial ReinforcedNetheriteA = new ArmorMaterial(
			BASE_DURABILITY,
			Map.of(
					EquipmentType.HELMET, 5,
					EquipmentType.CHESTPLATE, 9,
					EquipmentType.LEGGINGS, 8,
					EquipmentType.BOOTS, 5
			),
			5,
			SoundEvents.ITEM_ARMOR_EQUIP_IRON,
			0.0F,
			0.0F,
			REPAIRS_REINFORCED_ARMOR,
			REINFORCED_ARMOR_MATERIAL_KEY
	);

	public static final ArmorMaterial LightweightAlloyA = new ArmorMaterial(
			BASE_DURABILITY,
			Map.of(
					EquipmentType.HELMET, 2,
					EquipmentType.CHESTPLATE, 6,
					EquipmentType.LEGGINGS, 4,
					EquipmentType.BOOTS, 1
			),
			5,
			SoundEvents.ITEM_ARMOR_EQUIP_IRON,
			0.0F,
			0.0F,
			REPAIRS_ALLOY_ARMOR,
			L_ALLOY_ARMOR_MATERIAL_KEY
	);

	public static final ArmorMaterial RLightweightAlloyA = new ArmorMaterial(
			BASE_DURABILITY,
			Map.of(
					EquipmentType.HELMET, 2,
					EquipmentType.CHESTPLATE, 6,
					EquipmentType.LEGGINGS, 4,
					EquipmentType.BOOTS, 1
			),
			5,
			SoundEvents.ITEM_ARMOR_EQUIP_IRON,
			0.0F,
			0.0F,
			REPAIRS_ALLOY_ARMOR,
			L_ALLOY_ARMOR_MATERIAL_KEY
	);

	public static final ArmorMaterial RHeavyAlloyA = new ArmorMaterial(
			BASE_DURABILITY,
			Map.of(
					EquipmentType.HELMET, 2,
					EquipmentType.CHESTPLATE, 6,
					EquipmentType.LEGGINGS, 4,
					EquipmentType.BOOTS, 1
			),
			5,
			SoundEvents.ITEM_ARMOR_EQUIP_IRON,
			0.0F,
			0.0F,
			REPAIRS_ALLOY_ARMOR,
			H_ALLOY_ARMOR_MATERIAL_KEY
	);

	public static final ArmorMaterial HeavyAlloyA = new ArmorMaterial(
			BASE_DURABILITY,
			Map.of(
					EquipmentType.HELMET, 4,
					EquipmentType.CHESTPLATE, 8,
					EquipmentType.LEGGINGS, 7,
					EquipmentType.BOOTS, 4
			),
			5,
			SoundEvents.ITEM_ARMOR_EQUIP_IRON,
			0.0F,
			0.0F,
			REPAIRS_ALLOY_ARMOR,
			H_ALLOY_ARMOR_MATERIAL_KEY
	);

	public static final ToolMaterial REINFORCED_NETHERITE = new ToolMaterial(
			BlockTags.INCORRECT_FOR_WOODEN_TOOL,
			700,
			5.0F,
			4.5F,
			22,
			REPAIRS_REINFORCED_NET_ARMOR
	);

	public static final ToolMaterial LIGHTWEIGHT_ALLOY = new ToolMaterial(
			BlockTags.INCORRECT_FOR_WOODEN_TOOL,
			700,
			5.0F,
			4.5F,
			22,
			REPAIRS_ALLOY_ARMOR
	);

	public static final ToolMaterial HEAVY_ALLOY = new ToolMaterial(
			BlockTags.INCORRECT_FOR_WOODEN_TOOL,
			700,
			5.0F,
			4.5F,
			22,
			REPAIRS_ALLOY_ARMOR
	);

	public static final ToolMaterial REINFORCED_LIGHTWEIGHT_ALLOY = new ToolMaterial(
			BlockTags.INCORRECT_FOR_WOODEN_TOOL,
			700,
			5.0F,
			4.5F,
			22,
			REPAIRS_REINFORCED_ALL_ARMOR
	);

	public static final ToolMaterial REINFORCED_HEAVY_ALLOY = new ToolMaterial(
			BlockTags.INCORRECT_FOR_WOODEN_TOOL,
			700,
			5.0F,
			4.5F,
			22,
			REPAIRS_REINFORCED_ALL_ARMOR
	);

	//crafting items
	public static final Item REINFORCED_STICK = register("reinforced_stick", Item::new, new Item.Settings());
    public static final Item REINFORCED_HANDLE = register("reinforced_handle", Item::new, new Item.Settings());
	public static final Item LIGHTWEIGHT_ALLOY_INGOT = register("lightweight_alloy_ingot", Item::new, new Item.Settings());
	public static final Item HEAVY_ALLOY_INGOT = register("heavy_alloy_ingot", Item::new, new Item.Settings());
    public static final Item COMPRESSED_DIAMOND = register("compressed_diamond", Item::new, new Item.Settings());
	public static final Item REINFORCED_LIGHTWEIGHT_ALLOY = register("reinforced_lightweight_alloy", Item::new, new Item.Settings());
	public static final Item REINFORCED_HEAVY_ALLOY = register("reinforced_heavy_alloy", Item::new, new Item.Settings());
	public static final Item REINFORCED_NETHERITE_INGOT = register("reinforced_netherite_ingot", Item::new, new Item.Settings());

	//vanilla extended
		//Non Metal
		public static final Item HEAVY_CROSSBOW = register("heavy crossbow", Item::new, new Item.Settings());
		public static final Item TOWER_SHIELD = register("tower_shield", Item::new, new Item.Settings());

		//Lightweight Alloy
			//tools
			public static final Item LIGHTWEIGHT_ALLOY_SWORD = register("lightweight_alloy_sword", Item::new, new Item.Settings().sword(LIGHTWEIGHT_ALLOY, 1.0f, 1.0f));
			public static final Item LIGHTWEIGHT_ALLOY_AXE = register("lightweight_alloy_axe", Item::new, new Item.Settings().axe(LIGHTWEIGHT_ALLOY, 1.0f, 1.0f));
			public static final Item LIGHTWEIGHT_ALLOY_PICKAXE = register("lightweight_alloy_pickaxe", Item::new, new Item.Settings().sword(LIGHTWEIGHT_ALLOY, 1.0f, 1.0f));
			public static final Item LIGHTWEIGHT_ALLOY_SHOVEL = register("lightweight_alloy_shovel", Item::new, new Item.Settings().axe(LIGHTWEIGHT_ALLOY, 1.0f, 1.0f));
			public static final Item LIGHTWEIGHT_ALLOY_HOE = register("lightweight_alloy_hoe", Item::new, new Item.Settings().sword(LIGHTWEIGHT_ALLOY, 1.0f, 1.0f));
			
			//armor
			public static final Item LIGHTWEIGHT_ALLOY_HELMET = register("lightweight_alloy_helmet", Item::new, 
				new Item.Settings().armor(LightweightAlloyA.INSTANCE, EquipmentType.HELMET)
				.maxDamage(EquipmentType.HELMET.getMaxDamage(LightweightAlloyA.BASE_DURABILITY))
			);
			public static final Item LIGHTWEIGHT_ALLOY_CHESTPLATE = register("lightweight_alloy_chestplate", Item::new, 
				new Item.Settings().armor(LightweightAlloyA.INSTANCE, EquipmentType.CHESTPLATE)
				.maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(LightweightAlloyA.BASE_DURABILITY))
			);
			public static final Item LIGHTWEIGHT_ALLOY_LEGGINGS = register("lightweight_alloy_leggings", Item::new, 
				new Item.Settings().armor(LightweightAlloyA.INSTANCE, EquipmentType.LEGGINGS)
				.maxDamage(EquipmentType.LEGGINGS.getMaxDamage(LightweightAlloyA.BASE_DURABILITY))
			);
			public static final Item LIGHTWEIGHT_ALLOY_BOOTS = register("lightweight_alloy_boots", Item::new, 
				new Item.Settings().armor(LightweightAlloyA.INSTANCE, EquipmentType.BOOTS)
				.maxDamage(EquipmentType.BOOTS.getMaxDamage(LightweightAlloyA.BASE_DURABILITY))
			);

		//Heavy Alloy
			//tools
			public static final Item HEAVY_ALLOY_SWORD = register("heavy_alloy_sword", Item::new, new Item.Settings().sword(HEAVY_ALLOY, 1.0f, 1.0f));
			public static final Item HEAVY_ALLOY_AXE = register("heavy_alloy_axe", Item::new, new Item.Settings().axe(HEAVY_ALLOY, 1.0f, 1.0f));
			public static final Item HEAVY_ALLOY_PICKAXE = register("heavy_alloy_pickaxe", Item::new, new Item.Settings().sword(HEAVY_ALLOY, 1.0f, 1.0f));
			public static final Item HEAVY_ALLOY_SHOVEL = register("heavy_alloy_shovel", Item::new, new Item.Settings().axe(HEAVY_ALLOY, 1.0f, 1.0f));
			public static final Item HEAVY_ALLOY_HOE = register("heavy_alloy_hoe", Item::new, new Item.Settings().axe(HEAVY_ALLOY, 1.0f, 1.0f));

			//armor
			public static final Item HEAVY_ALLOY_HELMET = register("heavy_alloy_helmet", Item::new, 
				new Item.Settings().armor(HeavyAlloyA.INSTANCE, EquipmentType.HELMET)
				.maxDamage(EquipmentType.HELMET.getMaxDamage(HeavyAlloyA.BASE_DURABILITY))
			);
			public static final Item HEAVY_ALLOY_CHESTPLATE = register("heavy_alloy_chestplate", Item::new, 
				new Item.Settings().armor(HeavyAlloyA.INSTANCE, EquipmentType.CHESTPLATE)
				.maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(HeavyAlloyA.BASE_DURABILITY))
			);
			public static final Item HEAVY_ALLOY_LEGGINGS = register("heavy_alloy_leggings", Item::new, 
				new Item.Settings().armor(HeavyAlloyA.INSTANCE, EquipmentType.LEGGINGS)
				.maxDamage(EquipmentType.LEGGINGS.getMaxDamage(HeavyAlloyA.BASE_DURABILITY))
			);
			public static final Item HEAVY_ALLOY_BOOTS = register("heavy_alloy_boots", Item::new, 
				new Item.Settings().armor(HeavyAlloyA.INSTANCE, EquipmentType.BOOTS)
				.maxDamage(EquipmentType.BOOTS.getMaxDamage(HeavyAlloyA.BASE_DURABILITY))
			);

		//Reinforced Lightweight Alloy
			//tools
			public static final Item REINFORCED_LIGHTWEIGHT_ALLOY_SWORD = register("reinforced_lightweight_alloy_sword", 
				Item::new, new Item.Settings().sword(LIGHTWEIGHT_ALLOY, 1.0f, 1.0f));
			public static final Item REINFORCED_LIGHTWEIGHT_ALLOY_AXE = register("reinforced_lightweight_alloy_axe", 
				Item::new, new Item.Settings().axe(LIGHTWEIGHT_ALLOY, 1.0f, 1.0f));
			public static final Item REINFORCED_LIGHTWEIGHT_ALLOY_PICKAXE = register("reinforced_lightweight_alloy_pickaxe", 
				Item::new, new Item.Settings().sword(LIGHTWEIGHT_ALLOY, 1.0f, 1.0f));
			public static final Item REINFORCED_LIGHTWEIGHT_ALLOY_SHOVEL = register("reinforced_lightweight_alloy_shovel", 
				Item::new, new Item.Settings().axe(LIGHTWEIGHT_ALLOY, 1.0f, 1.0f));
			public static final Item REINFORCED_LIGHTWEIGHT_ALLOY_HOE = register("reinforced_lightweight_alloy_hoe", 
				Item::new, new Item.Settings().sword(LIGHTWEIGHT_ALLOY, 1.0f, 1.0f));

			//armor
			public static final Item REINFORCED_LIGHTWEIGHT_ALLOY_HELMET = register("reinforced_lightweight_alloy_helmet", Item::new, 
				new Item.Settings().armor(LightweightAlloyA.INSTANCE, EquipmentType.HELMET)
				.maxDamage(EquipmentType.HELMET.getMaxDamage(LightweightAlloyA.BASE_DURABILITY))
			);
			public static final Item REINFORCED_LIGHTWEIGHT_ALLOY_CHESTPLATE = register("reinforced_lightweight_alloy_chestplate", Item::new, 
				new Item.Settings().armor(LightweightAlloyA.INSTANCE, EquipmentType.CHESTPLATE)
				.maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(LightweightAlloyA.BASE_DURABILITY))
			);
			public static final Item REINFORECED_LIGHTWEIGHT_ALLOY_LEGGINGS = register("reinforced_lightweight_alloy_leggings", Item::new, 
				new Item.Settings().armor(LightweightAlloyA.INSTANCE, EquipmentType.LEGGINGS)
				.maxDamage(EquipmentType.LEGGINGS.getMaxDamage(LightweightAlloyA.BASE_DURABILITY))
			);
			public static final Item REINFORCED_LIGHTWEIGHT_ALLOY_BOOTS = register("reinforced_lightweight_alloy_boots", Item::new, 
				new Item.Settings().armor(LightweightAlloyA.INSTANCE, EquipmentType.BOOTS)
				.maxDamage(EquipmentType.BOOTS.getMaxDamage(LightweightAlloyA.BASE_DURABILITY))
			);

		//Reinforced Heavy Alloy
			public static final Item REINFORCED_HEAVY_ALLOY_SWORD = register("reinforced_heavy_alloy_sword", Item::new, new Item.Settings().sword(HEAVY_ALLOY, 1.0f, 1.0f));
			public static final Item REINFORCED_HEAVY_ALLOY_AXE = register("reinforced_heavy_alloy_axe", Item::new, new Item.Settings().axe(HEAVY_ALLOY, 1.0f, 1.0f));
			public static final Item REINFORCED_HEAVY_ALLOY_PICKAXE = register("reinforced_heavy_alloy_pickaxe", Item::new, new Item.Settings().sword(HEAVY_ALLOY, 1.0f, 1.0f));
			public static final Item REINFORCED_HEAVY_ALLOY_SHOVEL = register("reinforced_heavy_alloy_shovel", Item::new, new Item.Settings().axe(HEAVY_ALLOY, 1.0f, 1.0f));
			public static final Item REINFORCED_HEAVY_ALLOY_HOE = register("reinforced_heavy_alloy_hoe", Item::new, new Item.Settings().axe(HEAVY_ALLOY, 1.0f, 1.0f));

			//armor
			public static final Item REINFORCED_HEAVY_ALLOY_HELMET = register("reinforced_heavy_alloy_helmet", Item::new, 
				new Item.Settings().armor(HeavyAlloyA.INSTANCE, EquipmentType.HELMET)
				.maxDamage(EquipmentType.HELMET.getMaxDamage(HeavyAlloyA.BASE_DURABILITY))
			);
			public static final Item REINFORCED_HEAVY_ALLOY_CHESTPLATE = register("reinforced_heavy_alloy_chestplate", Item::new, 
				new Item.Settings().armor(HeavyAlloyA.INSTANCE, EquipmentType.CHESTPLATE)
				.maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(HeavyAlloyA.BASE_DURABILITY))
			);
			public static final Item REINFORCED_HEAVY_ALLOY_LEGGINGS = register("reinforced_heavy_alloy_leggings", Item::new, 
				new Item.Settings().armor(HeavyAlloyA.INSTANCE, EquipmentType.LEGGINGS)
				.maxDamage(EquipmentType.LEGGINGS.getMaxDamage(HeavyAlloyA.BASE_DURABILITY))
			);
			public static final Item REINFORCED_HEAVY_ALLOY_BOOTS = register("reinforced_heavy_alloy_boots", Item::new, 
				new Item.Settings().armor(HeavyAlloyA.INSTANCE, EquipmentType.BOOTS)
				.maxDamage(EquipmentType.BOOTS.getMaxDamage(HeavyAlloyA.BASE_DURABILITY))
			);

		//reinforced netherite
			//items
    		public static final Item REINFORCED_NETHERITE_SWORD = register("reinforced_netherite_sword", Item::new, new Item.Settings().sword(REINFORCED_NETHERITE, 1.5f, 0.8f));
			public static final Item REINFORCED_NETHERITE_AXE = register("reinforced_netherite_axe", Item::new, new Item.Settings().axe(REINFORCED_NETHERITE, 1.8f, 0.6f ));
			public static final Item REINFORCED_NETHERITE_PICKAXE = register("reinforced_netherite_pickaxe", Item::new, new Item.Settings.pickaxe(REINFORCED_NETHERITE, 0.8f, 0.9f));

			//armor

	//spears
	public static final Item WOODEN_SPEAR = register("wooden_spear", Item::new, new Item.Settings().sword(WOOD, 1.2f, 0.7f));
	public static final Item STONE_SPEAR = register("stone_spear", Item::new, new Item.Settings().sword(STONE, 1.2f, 0.7f));
	public static final Item IRON_SPEAR = register("iron_spear", Item::new, new Item.Settings().sword(IRON, 1.2f, 0.7f));
	public static final Item GOLLDEN_SPEAR = register("gold_spear", Item::new, new Item.Settings().sword(GOLD, 1.2f, 0.7f));
	public static final Item DIAMOND_SPEAR = register("diamond_spear", Item::new, new Item.Settings().sword(DIAMOND, 1.2f, 0.7f));
	public static final Item REINFORCED_NETHERITE_SPEAR = register("reinforced_netherite_spear", Item::new, new Item.Settings().sword(REINFORCED_NETHERITE, 1.2f, 0.7f));

	//rapiers
	public static final Item WOODEN_RAPIER = register("wooden_rapier", Item::new, new Item.Settings().sword(WOOD_TOOL_MATERIAL, 0.9f, 0.7f));
	public static final Item STONE_RAPIER = register("stone_rapier", Item::new, new Item.Settings().sword(STONE_TOOL_MATERIAL, 0.9f, 0.7f));
	public static final Item IRON_RAPIER = register("iron_rapier", Item::new, new Item.Settings().sword(IRON_TOOL_MATERIAL, 0.9f, 0.7f));
	public static final Item GOLDEN_RAPIER = register("gold_rapier", Item::new, new Item.Settings().sword(GOLD_TOOL_MATERIAL_TOOL_MATERIAL, 0.9f, 0.7f));
	public static final Item DIAMOND_RAPIER = register("diamond_rapier", Item::new, new Item.Settings().sword(DIAMOND_TOOL_MATERIAL, 0.9f, 0.7f));
	public static final Item REINFORCED_NETHERITE_RAPIER = register("reinforced_netherite_rapier", Item::new, new Item.Settings().sword(REINFORCED_NETHERITE_TOOL_MATERIAL, 0.9f, 0.7f));

	//halberds
	public static final Item WOODEN_HALBERD = register("wooden_halberd", Item::new, new Item.Settings().sword(WOOD_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item STONE_HALBERD = register("stone_halberd", Item::new, new Item.Settings().sword(STONE_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item IRON_HALBERD = register("iron_halberd", Item::new, new Item.Settings().sword(IRON_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item GOLDEN_HALBERD = register("gold_halberd", Item::new, new Item.Settings().sword(GOLD_TOOL_MATERIAL_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item DIAMOND_HALBERD = register("diamond_halberd", Item::new, new Item.Settings().sword(DIAMOND_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item REINFORCED_NETHERITE_HALBERD = register("reinforced_netherite_halberd", Item::new, new Item.Settings().sword(REINFORCED_NETHERITE_TOOL_MATERIAL, 1.4f, 0.7f));

	//sickles
	public static final Item WOODEN_SICKLE = register("wooden_sickle", Item::new, new Item.Settings().sword(WOOD_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item STONE_SICKLE = register("stone_sickle", Item::new, new Item.Settings().sword(STONE_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item IRON_SICKLE = register("iron_sickle", Item::new, new Item.Settings().sword(IRON_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item GOLDEN_SICKLE = register("gold_sickle", Item::new, new Item.Settings().sword(GOLD_TOOL_MATERIAL_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item DIAMOND_SICKLE = register("diamond_sickle", Item::new, new Item.Settings().sword(DIAMOND_TOOL_MATERIAL, 1.4f, 0.7f));
	public static final Item REINFORCED_NETHERITE_SICKLE = register("reinforced_netherite_halberd", Item::new, new Item.Settings().sword(REINFORCED_NETHERITE_TOOL_MATERIAL, 1.4f, 0.7f));

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
