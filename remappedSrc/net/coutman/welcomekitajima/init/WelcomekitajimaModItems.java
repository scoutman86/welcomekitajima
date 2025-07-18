/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.item.TomatoItem;
import net.minecraft.client.item.ClampedModelPredicateProvider;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.coutman.welcomekitajima.item.ToadsTurnpikeItem;
import net.coutman.welcomekitajima.item.StudiopolisZoneAct1Item;
import net.coutman.welcomekitajima.item.StudiopolisComplexCalmItem;
import net.coutman.welcomekitajima.item.SmileSymphonyItem;
import net.coutman.welcomekitajima.item.SToRYItem;
import net.coutman.welcomekitajima.item.SMWSpecialItem;
import net.coutman.welcomekitajima.item.SMB3OverworldSMASItem;
import net.coutman.welcomekitajima.item.SMB2OverworldSMASItem;
import net.coutman.welcomekitajima.item.KuyamuItem;
import net.coutman.welcomekitajima.item.HaguItem;
import net.coutman.welcomekitajima.item.BlankDVDItem;
import net.coutman.welcomekitajima.item.BlankCompactDiscItem;
import net.coutman.welcomekitajima.item.BlankBDItem;
import net.coutman.welcomekitajima.WelcomekitajimaMod;

public class WelcomekitajimaModItems {
	public static Item EMPTY_SEKAI_STONE;
	public static Item EMPTY_SEKAI_TILES;
	public static Item EMPTY_SEKAI_TRUSS;
	public static Item POLISHED_STUDIOPOLIS_CONCRETE;
	public static Item SMOOTH_STUDIOPOLIS_CONCRETE;
	public static Item STUDIOPOLIS_TILES;
	public static Item STUDIOPOLIS_TILE_STAIRS;
	public static Item STUDIOPOLIS_TILE_SLAB;
	public static Item SMOOTH_STUDIOPOLIS_CONCRETE_STAIRS;
	public static Item SMOOTH_STUDIOPOLIS_CONCRETE_SLAB;
	public static Item STUDIOPOLIS_TILE_PILLAR;
	public static Item STUDIOPOLIS_TRUSS;
	public static Item STUDIOPOLIS_LAMP;
	public static Item WOODEN_MIPS_DOOR;
	public static Item SINGLE_STAR_WOODEN_MIPS_DOOR;
	public static Item METAL_MIPS_DOOR;
	public static Item FRAMEWORK_BLOCK;
	public static Item BLANK_COMPACT_DISC;
	public static Item BLANK_DVD;
	public static Item BLANK_BD;
	public static Item STUDIOPOLIS_ZONE_ACT_1;
	public static Item KUYAMU;
	public static Item HAGU;
	public static Item TOADS_TURNPIKE;
	public static Item SMB_2_OVERWORLD_SMAS;
	public static Item SMB_3_OVERWORLD_SMAS;
	public static Item S_TO_RY;
	public static Item SMW_SPECIAL;
	public static Item STUDIOPOLIS_COMPLEX_CALM;
	public static Item SMILE_SYMPHONY;
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
	public static Item TOMATO;

	public static void load() {
		EMPTY_SEKAI_STONE = register("empty_sekai_stone", new BlockItem(WelcomekitajimaModBlocks.EMPTY_SEKAI_STONE, new Item.Settings()));
		EMPTY_SEKAI_TILES = register("empty_sekai_tiles", new BlockItem(WelcomekitajimaModBlocks.EMPTY_SEKAI_TILES, new Item.Settings()));
		EMPTY_SEKAI_TRUSS = register("empty_sekai_truss", new BlockItem(WelcomekitajimaModBlocks.EMPTY_SEKAI_TRUSS, new Item.Settings()));
		POLISHED_STUDIOPOLIS_CONCRETE = register("polished_studiopolis_concrete", new BlockItem(WelcomekitajimaModBlocks.POLISHED_STUDIOPOLIS_CONCRETE, new Item.Settings()));
		SMOOTH_STUDIOPOLIS_CONCRETE = register("smooth_studiopolis_concrete", new BlockItem(WelcomekitajimaModBlocks.SMOOTH_STUDIOPOLIS_CONCRETE, new Item.Settings()));
		STUDIOPOLIS_TILES = register("studiopolis_tiles", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_TILES, new Item.Settings()));
		STUDIOPOLIS_TILE_STAIRS = register("studiopolis_tile_stairs", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_TILE_STAIRS, new Item.Settings()));
		STUDIOPOLIS_TILE_SLAB = register("studiopolis_tile_slab", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_TILE_SLAB, new Item.Settings()));
		SMOOTH_STUDIOPOLIS_CONCRETE_STAIRS = register("smooth_studiopolis_concrete_stairs", new BlockItem(WelcomekitajimaModBlocks.SMOOTH_STUDIOPOLIS_CONCRETE_STAIRS, new Item.Settings()));
		SMOOTH_STUDIOPOLIS_CONCRETE_SLAB = register("smooth_studiopolis_concrete_slab", new BlockItem(WelcomekitajimaModBlocks.SMOOTH_STUDIOPOLIS_CONCRETE_SLAB, new Item.Settings()));
		STUDIOPOLIS_TILE_PILLAR = register("studiopolis_tile_pillar", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_TILE_PILLAR, new Item.Settings()));
		STUDIOPOLIS_TRUSS = register("studiopolis_truss", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_TRUSS, new Item.Settings()));
		STUDIOPOLIS_LAMP = register("studiopolis_lamp", new BlockItem(WelcomekitajimaModBlocks.STUDIOPOLIS_LAMP, new Item.Settings()));
		WOODEN_MIPS_DOOR = register("wooden_mips_door", new BlockItem(WelcomekitajimaModBlocks.WOODEN_MIPS_DOOR, new Item.Settings()));
		SINGLE_STAR_WOODEN_MIPS_DOOR = register("single_star_wooden_mips_door", new BlockItem(WelcomekitajimaModBlocks.SINGLE_STAR_WOODEN_MIPS_DOOR, new Item.Settings()));
		METAL_MIPS_DOOR = register("metal_mips_door", new BlockItem(WelcomekitajimaModBlocks.METAL_MIPS_DOOR, new Item.Settings()));
		FRAMEWORK_BLOCK = register("framework_block", new BlockItem(WelcomekitajimaModBlocks.FRAMEWORK_BLOCK, new Item.Settings()));
		BLANK_COMPACT_DISC = register("blank_compact_disc", new BlankCompactDiscItem());
		BLANK_DVD = register("blank_dvd", new BlankDVDItem());
		BLANK_BD = register("blank_bd", new BlankBDItem());
		STUDIOPOLIS_ZONE_ACT_1 = register("studiopolis_zone_act_1", new StudiopolisZoneAct1Item());
		KUYAMU = register("kuyamu", new KuyamuItem());
		HAGU = register("hagu", new HaguItem());
		TOADS_TURNPIKE = register("toads_turnpike", new ToadsTurnpikeItem());
		SMB_2_OVERWORLD_SMAS = register("smb_2_overworld_smas", new SMB2OverworldSMASItem());
		SMB_3_OVERWORLD_SMAS = register("smb_3_overworld_smas", new SMB3OverworldSMASItem());
		S_TO_RY = register("s_to_ry", new SToRYItem());
		SMW_SPECIAL = register("smw_special", new SMWSpecialItem());
		STUDIOPOLIS_COMPLEX_CALM = register("studiopolis_complex_calm", new StudiopolisComplexCalmItem());
		SMILE_SYMPHONY = register("smile_symphony", new SmileSymphonyItem());
		FUYUKI_WOOD = register("fuyuki_wood", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_WOOD, new Item.Settings()));
		FUYUKI_LOG = register("fuyuki_log", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_LOG, new Item.Settings()));
		FUYUKI_PLANKS = register("fuyuki_planks", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_PLANKS, new Item.Settings()));
		FUYUKI_LEAVES = register("fuyuki_leaves", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_LEAVES, new Item.Settings()));
		FUYUKI_STAIRS = register("fuyuki_stairs", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_STAIRS, new Item.Settings()));
		FUYUKI_SLAB = register("fuyuki_slab", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_SLAB, new Item.Settings()));
		FUYUKI_FENCE = register("fuyuki_fence", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_FENCE, new Item.Settings()));
		FUYUKI_FENCE_GATE = register("fuyuki_fence_gate", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_FENCE_GATE, new Item.Settings()));
		FUYUKI_PRESSURE_PLATE = register("fuyuki_pressure_plate", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_PRESSURE_PLATE, new Item.Settings()));
		FUYUKI_BUTTON = register("fuyuki_button", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_BUTTON, new Item.Settings()));
		FUYUKI_DOOR = register("fuyuki_door", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_DOOR, new Item.Settings()));
		FUYUKI_TRAPDOOR = register("fuyuki_trapdoor", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_TRAPDOOR, new Item.Settings()));
		TOMATO = register("tomato", new TomatoItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(WelcomekitajimaMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ModelPredicateProviderRegistry.register(item, new Identifier("blocking"), (ClampedModelPredicateProvider) ModelPredicateProviderRegistry.get(Items.SHIELD, new Identifier("blocking")));
	}
}
