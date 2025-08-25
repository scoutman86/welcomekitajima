/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.coutman.welcomekitajima.item.*;
import net.coutman.welcomekitajima.WelcomekitajimaMod;
import net.minecraft.world.level.block.Block;

public class WelcomekitajimaModItems {
	public static Item EMPTY_SEKAI_STONE;
	public static Item EMPTY_SEKAI_TILES;
	public static Item EMPTY_SEKAI_TRUSS;
	// studiopolis
	public static Item POLISHED_STUDIOPOLIS_CONCRETE;
	public static Item SMOOTH_STUDIOPOLIS_CONCRETE;
	public static Item SMOOTH_STUDIOPOLIS_CONCRETE_STAIRS;
	public static Item SMOOTH_STUDIOPOLIS_CONCRETE_SLAB;
	public static Item STUDIOPOLIS_TILES;
	public static Item STUDIOPOLIS_TILE_STAIRS;
	public static Item STUDIOPOLIS_TILE_SLAB;
	public static Item STUDIOPOLIS_TILE_PILLAR;
	public static Item STUDIOPOLIS_TRUSS;
	public static Item STUDIOPOLIS_LAMP;
	// misc
	public static Item WOODEN_MIPS_DOOR;
	public static Item SINGLE_STAR_WOODEN_MIPS_DOOR;
	public static Item METAL_MIPS_DOOR;
	public static Item FRAMEWORK_BLOCK;
	// disc
	public static Item BLANK_COMPACT_DISC;
	public static Item BLANK_DVD;
	public static Item BLANK_BD;
	public static Item STUDIOPOLIS_ZONE_ACT_1;
	public static Item WORLDNOSTART;
	public static Item KUYAMU;
	public static Item HAGU;
	public static Item TOADS_TURNPIKE;
	public static Item SMB_2_OVERWORLD_SMAS;
	public static Item SMB_3_OVERWORLD_SMAS;
	public static Item SMW_SPECIAL;
	public static Item STUDIOPOLIS_COMPLEX_CALM;
	public static Item S_TO_RY;
	public static Item SMILE_SYMPHONY;
	// fuyuki
	public static Item FUYUKI_WOOD;
	public static Item FUYUKI_LOG;
	public static Item FUYUKI_PLANKS;
	public static Item FUYUKI_LEAVES;
	public static Item FUYUKI_STAIRS;
	public static Item FUYUKI_SLAB;
	public static Item FUYUKI_FENCE;
	public static Item FUYUKI_FENCE_GATE;
	public static Item FUYUKI_PRESSURE_PLATE;
	public static Item FUYUKI_BUTTON;
	public static Item FUYUKI_DOOR;
	public static Item FUYUKI_TRAPDOOR;
	// fuck off
	public static Item LABYRINTH_STONE;
	public static Item LABYRINTH_COAL_ORE;
	public static Item LABYRINTH_COPPER_ORE;
	public static Item LABYRINTH_DIAMOND_ORE;
	public static Item LABYRINTH_EMERALD_ORE;
	public static Item LABYRINTH_GOLD_ORE;
	public static Item LABYRINTH_IRON_ORE;
	public static Item LABYRINTH_LAPIS_ORE;
	public static Item LABYRINTH_REDSTONE_ORE;
	public static Item COBBLED_LABYRINTH_STONE;
	public static Item COBBLED_LABYRINTH_STONE_STAIRS;
	public static Item COBBLED_LABYRINTH_STONE_SLAB;
	public static Item POLISHED_LABYRINTH_STONE;
	public static Item POLISHED_LABYRINTH_STONE_STAIRS;
	public static Item POLISHED_LABYRINTH_STONE_SLAB;
	public static Item POLISHED_LABYRINTH_STONE_BRICKS;
	public static Item POLISHED_LABYRINTH_STONE_BRICK_STAIRS;
	public static Item POLISHED_LABYRINTH_STONE_BRICK_SLAB;
	public static Item POLISHED_LABYRINTH_STONE_TILES;
	public static Item POLISHED_LABYRINTH_STONE_TILE_STAIRS;
	public static Item POLISHED_LABYRINTH_STONE_TILE_SLAB;
	public static Item CHISELED_LABYRINTH_STONE;
	public static Item CHISELED_LABYRINTH_STONE_STAIRS;
	public static Item CHISELED_LABYRINTH_STONE_SLAB;
	// i really hate this
	public static Item MOSSY_LABYRINTH_STONE;
	public static Item MOSSY_COBBLED_LABYRINTH_STONE;
	public static Item MOSSY_COBBLED_LABYRINTH_STONE_STAIRS;
	public static Item MOSSY_COBBLED_LABYRINTH_STONE_SLAB;
	public static Item MOSSY_POLISHED_LABYRINTH_STONE;
	public static Item MOSSY_POLISHED_LABYRINTH_STONE_STAIRS;
	public static Item MOSSY_POLISHED_LABYRINTH_STONE_SLAB;
	public static Item MOSSY_POLISHED_LABYRINTH_STONE_BRICKS;
	public static Item MOSSY_POLISHED_LABYRINTH_STONE_BRICK_STAIRS;
	public static Item MOSSY_POLISHED_LABYRINTH_STONE_BRICK_SLAB;
	public static Item MOSSY_POLISHED_LABYRINTH_STONE_TILES;
	public static Item MOSSY_POLISHED_LABYRINTH_STONE_TILE_STAIRS;
	public static Item MOSSY_POLISHED_LABYRINTH_STONE_TILE_SLAB;
	public static Item MOSSY_CHISELED_LABYRINTH_STONE;
	public static Item MOSSY_CHISELED_LABYRINTH_STONE_STAIRS;
	public static Item MOSSY_CHISELED_LABYRINTH_STONE_SLAB;

	public static void load() {
		EMPTY_SEKAI_STONE = register("empty_sekai_stone", new BlockItem(WelcomekitajimaModBlocks.EMPTY_SEKAI_STONE, new Item.Properties()));
		EMPTY_SEKAI_TILES = register("empty_sekai_tiles", new BlockItem(WelcomekitajimaModBlocks.EMPTY_SEKAI_TILES, new Item.Properties()));
		EMPTY_SEKAI_TRUSS = register("empty_sekai_truss", new BlockItem(WelcomekitajimaModBlocks.EMPTY_SEKAI_TRUSS, new Item.Properties()));
		// studiopolis
		POLISHED_STUDIOPOLIS_CONCRETE = register("polished_studiopolis_concrete", new BlockItem(WelcomekitajimaModBlocks.POLISHED_STUDIOPOLIS_CONCRETE, new Item.Properties()));
		SMOOTH_STUDIOPOLIS_CONCRETE = register("smooth_studiopolis_concrete", new BlockItem(WelcomekitajimaModBlocks.SMOOTH_STUDIOPOLIS_CONCRETE, new Item.Properties()));
		SMOOTH_STUDIOPOLIS_CONCRETE_STAIRS = register("smooth_studiopolis_concrete_stairs", new BlockItem(WelcomekitajimaModBlocks.SMOOTH_STUDIOPOLIS_CONCRETE_STAIRS, new Item.Properties()));
		SMOOTH_STUDIOPOLIS_CONCRETE_SLAB = register("smooth_studiopolis_concrete_slab", new BlockItem(WelcomekitajimaModBlocks.SMOOTH_STUDIOPOLIS_CONCRETE_SLAB, new Item.Properties()));
		STUDIOPOLIS_TILES = register("studiopolis_tiles", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_TILES, new Item.Properties()));
		STUDIOPOLIS_TILE_STAIRS = register("studiopolis_tile_stairs", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_TILE_STAIRS, new Item.Properties()));
		STUDIOPOLIS_TILE_SLAB = register("studiopolis_tile_slab", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_TILE_SLAB, new Item.Properties()));
		STUDIOPOLIS_TILE_PILLAR = register("studiopolis_tile_pillar", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_TILE_PILLAR, new Item.Properties()));
		STUDIOPOLIS_TRUSS = register("studiopolis_truss", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_TRUSS, new Item.Properties()));
		STUDIOPOLIS_LAMP = register("studiopolis_lamp", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_LAMP, new Item.Properties()));
		// misc
		WOODEN_MIPS_DOOR = register("wooden_mips_door", new BlockItem(WelcomekitajimaModBlocks.WOODEN_MIPS_DOOR, new Item.Properties()));
		SINGLE_STAR_WOODEN_MIPS_DOOR = register("single_star_wooden_mips_door", new BlockItem(WelcomekitajimaModBlocks.SINGLE_STAR_WOODEN_MIPS_DOOR, new Item.Properties()));
		METAL_MIPS_DOOR = register("metal_mips_door", new BlockItem(WelcomekitajimaModBlocks.METAL_MIPS_DOOR, new Item.Properties()));
		FRAMEWORK_BLOCK = register("framework_block", new BlockItem(WelcomekitajimaModBlocks.FRAMEWORK_BLOCK, new Item.Properties()));
		// discs
		BLANK_COMPACT_DISC = register("blank_compact_disc", new BlankCompactDiscItem());
		BLANK_DVD = register("blank_dvd", new BlankDVDItem());
		BLANK_BD = register("blank_bd", new BlankBDItem());
		STUDIOPOLIS_ZONE_ACT_1 = register("studiopolis_zone_act_1", new StudiopolisZoneAct1Item());
		WORLDNOSTART = register("the_world_hasnt_started_yet", new WorldNoStartItem());
		KUYAMU = register("kuyamu", new KuyamuItem());
		HAGU = register("hagu", new HaguItem());
		TOADS_TURNPIKE = register("toads_turnpike", new ToadsTurnpikeItem());
		SMB_2_OVERWORLD_SMAS = register("smb_2_overworld_smas", new SMB2OverworldSMASItem());
		SMB_3_OVERWORLD_SMAS = register("smb_3_overworld_smas", new SMB3OverworldSMASItem());
		SMW_SPECIAL = register("smw_special", new SMWSpecialItem());
		STUDIOPOLIS_COMPLEX_CALM = register("studiopolis_complex_calm", new StudiopolisComplexCalmItem());
		S_TO_RY = register("s_to_ry", new SToRYItem());
		SMILE_SYMPHONY = register("smile_symphony", new SmileSymphonyItem());
		// fuyuki
		FUYUKI_WOOD = register("fuyuki_wood", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_WOOD, new Item.Properties()));
		FUYUKI_LOG = register("fuyuki_log", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_LOG, new Item.Properties()));
		FUYUKI_PLANKS = register("fuyuki_planks", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_PLANKS, new Item.Properties()));
		FUYUKI_LEAVES = register("fuyuki_leaves", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_LEAVES, new Item.Properties()));
		FUYUKI_STAIRS = register("fuyuki_stairs", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_STAIRS, new Item.Properties()));
		FUYUKI_SLAB = register("fuyuki_slab", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_SLAB, new Item.Properties()));
		FUYUKI_FENCE = register("fuyuki_fence", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_FENCE, new Item.Properties()));
		FUYUKI_FENCE_GATE = register("fuyuki_fence_gate", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_FENCE_GATE, new Item.Properties()));
		FUYUKI_PRESSURE_PLATE = register("fuyuki_pressure_plate", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_PRESSURE_PLATE, new Item.Properties()));
		FUYUKI_BUTTON = register("fuyuki_button", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_BUTTON, new Item.Properties()));
		FUYUKI_DOOR = register("fuyuki_door", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_DOOR, new Item.Properties()));
		FUYUKI_TRAPDOOR = register("fuyuki_trapdoor", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_TRAPDOOR, new Item.Properties()));
		// fucking piece of shit I hate you
		LABYRINTH_STONE = register("labyrinth_stone", new BlockItem(WelcomekitajimaModBlocks.LABYRINTH_STONE, new Item.Properties()));
		LABYRINTH_COAL_ORE = register("labyrinth_coal_ore", new BlockItem(WelcomekitajimaModBlocks.LABYRINTH_COAL_ORE, new Item.Properties()));
		LABYRINTH_COPPER_ORE = register("labyrinth_copper_ore", new BlockItem(WelcomekitajimaModBlocks.LABYRINTH_COPPER_ORE, new Item.Properties()));
		LABYRINTH_DIAMOND_ORE = register("labyrinth_diamond_ore", new BlockItem(WelcomekitajimaModBlocks.LABYRINTH_DIAMOND_ORE, new Item.Properties()));
		LABYRINTH_EMERALD_ORE = register("labyrinth_emerald_ore", new BlockItem(WelcomekitajimaModBlocks.LABYRINTH_EMERALD_ORE, new Item.Properties()));
		LABYRINTH_GOLD_ORE = register("labyrinth_gold_ore", new BlockItem(WelcomekitajimaModBlocks.LABYRINTH_GOLD_ORE, new Item.Properties()));
		LABYRINTH_IRON_ORE = register("labyrinth_iron_ore", new BlockItem(WelcomekitajimaModBlocks.LABYRINTH_IRON_ORE, new Item.Properties()));
		LABYRINTH_LAPIS_ORE = register("labyrinth_lapis_ore", new BlockItem(WelcomekitajimaModBlocks.LABYRINTH_LAPIS_ORE, new Item.Properties()));
		LABYRINTH_REDSTONE_ORE = register("labyrinth_redstone_ore", new BlockItem(WelcomekitajimaModBlocks.LABYRINTH_REDSTONE_ORE, new Item.Properties()));
		COBBLED_LABYRINTH_STONE = register("cobbled_labyrinth_stone", new BlockItem(WelcomekitajimaModBlocks.COBBLED_LABYRINTH_STONE, new Item.Properties()));
		COBBLED_LABYRINTH_STONE_STAIRS = register("cobbled_labyrinth_stone_stairs", new BlockItem(WelcomekitajimaModBlocks.COBBLED_LABYRINTH_STONE_STAIRS, new Item.Properties()));
		COBBLED_LABYRINTH_STONE_SLAB = register("cobbled_labyrinth_stone_slab", new BlockItem(WelcomekitajimaModBlocks.COBBLED_LABYRINTH_STONE_SLAB, new Item.Properties()));
		POLISHED_LABYRINTH_STONE = register("polished_labyrinth_stone", new BlockItem(WelcomekitajimaModBlocks.POLISHED_LABYRINTH_STONE, new Item.Properties()));
		POLISHED_LABYRINTH_STONE_STAIRS = register("polished_labyrinth_stone_stairs", new BlockItem(WelcomekitajimaModBlocks.POLISHED_LABYRINTH_STONE_STAIRS, new Item.Properties()));
		POLISHED_LABYRINTH_STONE_SLAB = register("polished_labyrinth_stone_slab", new BlockItem(WelcomekitajimaModBlocks.POLISHED_LABYRINTH_STONE_SLAB, new Item.Properties()));
		POLISHED_LABYRINTH_STONE_BRICKS = register("polished_labyrinth_stone_bricks", new BlockItem(WelcomekitajimaModBlocks.POLISHED_LABYRINTH_STONE_BRICKS, new Item.Properties()));
		POLISHED_LABYRINTH_STONE_BRICK_STAIRS = register("polished_labyrinth_stone_brick_stairs", new BlockItem(WelcomekitajimaModBlocks.POLISHED_LABYRINTH_STONE_BRICK_STAIRS, new Item.Properties()));
		POLISHED_LABYRINTH_STONE_BRICK_SLAB = register("polished_labyrinth_stone_brick_slab", new BlockItem(WelcomekitajimaModBlocks.POLISHED_LABYRINTH_STONE_BRICK_SLAB, new Item.Properties()));
		POLISHED_LABYRINTH_STONE_TILES = register("polished_labyrinth_stone_tiles", new BlockItem(WelcomekitajimaModBlocks.POLISHED_LABYRINTH_STONE_TILES, new Item.Properties()));
		POLISHED_LABYRINTH_STONE_TILE_STAIRS = register("polished_labyrinth_stone_tile_stairs", new BlockItem(WelcomekitajimaModBlocks.POLISHED_LABYRINTH_STONE_TILE_STAIRS, new Item.Properties()));
		POLISHED_LABYRINTH_STONE_TILE_SLAB = register("polished_labyrinth_stone_tile_slab", new BlockItem(WelcomekitajimaModBlocks.POLISHED_LABYRINTH_STONE_TILE_SLAB, new Item.Properties()));
		CHISELED_LABYRINTH_STONE = register("chiseled_labyrinth_stone", new BlockItem(WelcomekitajimaModBlocks.CHISELED_LABYRINTH_STONE, new Item.Properties()));
		CHISELED_LABYRINTH_STONE_STAIRS = register("chiseled_labyrinth_stone_stairs", new BlockItem(WelcomekitajimaModBlocks.CHISELED_LABYRINTH_STONE_STAIRS, new Item.Properties()));
		CHISELED_LABYRINTH_STONE_SLAB = register("chiseled_labyrinth_stone_slab", new BlockItem(WelcomekitajimaModBlocks.CHISELED_LABYRINTH_STONE_SLAB, new Item.Properties()));
		MOSSY_LABYRINTH_STONE = register("mossy_labyrinth_stone", new BlockItem(WelcomekitajimaModBlocks.MOSSY_LABYRINTH_STONE, new Item.Properties()));
		MOSSY_COBBLED_LABYRINTH_STONE = register("mossy_cobbled_labyrinth_stone", new BlockItem(WelcomekitajimaModBlocks.MOSSY_COBBLED_LABYRINTH_STONE, new Item.Properties()));
		MOSSY_COBBLED_LABYRINTH_STONE_STAIRS = register("mossy_cobbled_labyrinth_stone_stairs", new BlockItem(WelcomekitajimaModBlocks.MOSSY_COBBLED_LABYRINTH_STONE_STAIRS, new Item.Properties()));
		MOSSY_COBBLED_LABYRINTH_STONE_SLAB = register("mossy_cobbled_labyrinth_stone_slab", new BlockItem(WelcomekitajimaModBlocks.MOSSY_COBBLED_LABYRINTH_STONE_SLAB, new Item.Properties()));
		MOSSY_POLISHED_LABYRINTH_STONE = register("mossy_polished_labyrinth_stone", new BlockItem(WelcomekitajimaModBlocks.MOSSY_POLISHED_LABYRINTH_STONE, new Item.Properties()));
		MOSSY_POLISHED_LABYRINTH_STONE_STAIRS = register("mossy_polished_labyrinth_stone_stairs", new BlockItem(WelcomekitajimaModBlocks.MOSSY_POLISHED_LABYRINTH_STONE_STAIRS, new Item.Properties()));
		MOSSY_POLISHED_LABYRINTH_STONE_SLAB = register("mossy_polished_labyrinth_stone_slab", new BlockItem(WelcomekitajimaModBlocks.MOSSY_POLISHED_LABYRINTH_STONE_SLAB, new Item.Properties()));
		MOSSY_POLISHED_LABYRINTH_STONE_BRICKS = register("mossy_polished_labyrinth_stone_bricks", new BlockItem(WelcomekitajimaModBlocks.MOSSY_POLISHED_LABYRINTH_STONE_BRICKS, new Item.Properties()));
		MOSSY_POLISHED_LABYRINTH_STONE_BRICK_STAIRS = register("mossy_polished_labyrinth_stone_brick_stairs", new BlockItem(WelcomekitajimaModBlocks.MOSSY_POLISHED_LABYRINTH_STONE_BRICK_STAIRS, new Item.Properties()));
		MOSSY_POLISHED_LABYRINTH_STONE_BRICK_SLAB = register("mossy_polished_labyrinth_stone_brick_slab", new BlockItem(WelcomekitajimaModBlocks.MOSSY_POLISHED_LABYRINTH_STONE_BRICK_SLAB, new Item.Properties()));
		MOSSY_POLISHED_LABYRINTH_STONE_TILES = register("mossy_polished_labyrinth_stone_tiles", new BlockItem(WelcomekitajimaModBlocks.MOSSY_POLISHED_LABYRINTH_STONE_TILES, new Item.Properties()));
		MOSSY_POLISHED_LABYRINTH_STONE_TILE_STAIRS = register("mossy_polished_labyrinth_stone_tile_stairs", new BlockItem(WelcomekitajimaModBlocks.MOSSY_POLISHED_LABYRINTH_STONE_TILE_STAIRS, new Item.Properties()));
		MOSSY_POLISHED_LABYRINTH_STONE_TILE_SLAB = register("mossy_polished_labyrinth_stone_tile_slab", new BlockItem(WelcomekitajimaModBlocks.MOSSY_POLISHED_LABYRINTH_STONE_TILE_SLAB, new Item.Properties()));
		MOSSY_CHISELED_LABYRINTH_STONE = register("mossy_chiseled_labyrinth_stone", new BlockItem(WelcomekitajimaModBlocks.MOSSY_CHISELED_LABYRINTH_STONE, new Item.Properties()));
		MOSSY_CHISELED_LABYRINTH_STONE_STAIRS = register("mossy_chiseled_labyrinth_stone_stairs", new BlockItem(WelcomekitajimaModBlocks.MOSSY_CHISELED_LABYRINTH_STONE_STAIRS, new Item.Properties()));
		MOSSY_CHISELED_LABYRINTH_STONE_SLAB = register("mossy_chiseled_labyrinth_stone_slab", new BlockItem(WelcomekitajimaModBlocks.MOSSY_CHISELED_LABYRINTH_STONE_SLAB, new Item.Properties()));
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomekitajimaMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
