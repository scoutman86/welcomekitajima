
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.coutman.welcomekitajima.block.*;
import net.coutman.welcomekitajima.block.fuyuki.*;
import net.coutman.welcomekitajima.block.miyashita_sakura.*;
import net.coutman.welcomekitajima.block.labyrinth.*;

public class BlockRegistry {
	public static Block EMPTY_SEKAI_STONE;
	public static Block EMPTY_SEKAI_TILES;
	public static Block EMPTY_SEKAI_TRUSS;
	// studiopolis
	public static Block POLISHED_STUDIOPOLIS_CONCRETE;
	public static Block SMOOTH_STUDIOPOLIS_CONCRETE;
	public static Block SMOOTH_STUDIOPOLIS_CONCRETE_STAIRS;
	public static Block SMOOTH_STUDIOPOLIS_CONCRETE_SLAB;
	public static Block STUDIOPOLIS_TILES;
	public static Block STUDIOPOLIS_TILE_STAIRS;
	public static Block STUDIOPOLIS_TILE_SLAB;
	public static Block STUDIOPOLIS_TILE_PILLAR;
	public static Block STUDIOPOLIS_TRUSS;
	public static Block STUDIOPOLIS_LAMP;
	// misc
	public static Block WOODEN_MIPS_DOOR;
	public static Block SINGLE_STAR_WOODEN_MIPS_DOOR;
	public static Block METAL_MIPS_DOOR;
	public static Block FRAMEWORK_BLOCK;
	// fuyuki
	public static Block FUYUKI_WOOD;
	public static Block FUYUKI_LOG;
	public static Block FUYUKI_PLANKS;
	public static Block FUYUKI_LEAVES;
	public static Block FUYUKI_STAIRS;
	public static Block FUYUKI_SLAB;
	public static Block FUYUKI_FENCE;
	public static Block FUYUKI_FENCE_GATE;
	public static Block FUYUKI_PRESSURE_PLATE;
	public static Block FUYUKI_BUTTON;
	public static Block FUYUKI_DOOR;
	public static Block FUYUKI_TRAPDOOR;
	public static Block STRIPPED_FUYUKI_LOG;
	public static Block STRIPPED_FUYUKI_WOOD;
	// miyashita sakura
	public static Block MIYASHITA_SAKURA_WOOD;
	public static Block MIYASHITA_SAKURA_LOG;
	public static Block MIYASHITA_SAKURA_PLANKS;
	public static Block MIYASHITA_SAKURA_LEAVES;
	public static Block MIYASHITA_SAKURA_STAIRS;
	public static Block MIYASHITA_SAKURA_SLAB;
	public static Block MIYASHITA_SAKURA_FENCE;
	public static Block MIYASHITA_SAKURA_FENCE_GATE;
	public static Block MIYASHITA_SAKURA_PRESSURE_PLATE;
	public static Block MIYASHITA_SAKURA_BUTTON;
	public static Block MIYASHITA_SAKURA_DOOR;
	public static Block MIYASHITA_SAKURA_TRAPDOOR;
	public static Block STRIPPED_MIYASHITA_SAKURA_LOG;
	public static Block STRIPPED_MIYASHITA_SAKURA_WOOD;
	// labyrinth
	public static Block LABYRINTH_STONE;
	public static Block LABYRINTH_COAL_ORE;
	public static Block LABYRINTH_COPPER_ORE;
	public static Block LABYRINTH_DIAMOND_ORE;
	public static Block LABYRINTH_EMERALD_ORE;
	public static Block LABYRINTH_GOLD_ORE;
	public static Block LABYRINTH_IRON_ORE;
	public static Block LABYRINTH_LAPIS_ORE;
	public static Block LABYRINTH_REDSTONE_ORE;
	public static Block COBBLED_LABYRINTH_STONE;
	public static Block COBBLED_LABYRINTH_STONE_STAIRS;
	public static Block COBBLED_LABYRINTH_STONE_SLAB;
	public static Block POLISHED_LABYRINTH_STONE;
	public static Block POLISHED_LABYRINTH_STONE_STAIRS;
	public static Block POLISHED_LABYRINTH_STONE_SLAB;
	public static Block POLISHED_LABYRINTH_STONE_BRICKS;
	public static Block POLISHED_LABYRINTH_STONE_BRICK_STAIRS;
	public static Block POLISHED_LABYRINTH_STONE_BRICK_SLAB;
	public static Block POLISHED_LABYRINTH_STONE_TILES;
	public static Block POLISHED_LABYRINTH_STONE_TILE_STAIRS;
	public static Block POLISHED_LABYRINTH_STONE_TILE_SLAB;
	public static Block CHISELED_LABYRINTH_STONE;
	public static Block CHISELED_LABYRINTH_STONE_STAIRS;
	public static Block CHISELED_LABYRINTH_STONE_SLAB;
	// i really hate this
	public static Block MOSSY_LABYRINTH_STONE;
	public static Block MOSSY_COBBLED_LABYRINTH_STONE;
	public static Block MOSSY_COBBLED_LABYRINTH_STONE_STAIRS;
	public static Block MOSSY_COBBLED_LABYRINTH_STONE_SLAB;
	public static Block MOSSY_POLISHED_LABYRINTH_STONE;
	public static Block MOSSY_POLISHED_LABYRINTH_STONE_STAIRS;
	public static Block MOSSY_POLISHED_LABYRINTH_STONE_SLAB;
	public static Block MOSSY_POLISHED_LABYRINTH_STONE_BRICKS;
	public static Block MOSSY_POLISHED_LABYRINTH_STONE_BRICK_STAIRS;
	public static Block MOSSY_POLISHED_LABYRINTH_STONE_BRICK_SLAB;
	public static Block MOSSY_POLISHED_LABYRINTH_STONE_TILES;
	public static Block MOSSY_POLISHED_LABYRINTH_STONE_TILE_STAIRS;
	public static Block MOSSY_POLISHED_LABYRINTH_STONE_TILE_SLAB;
	public static Block MOSSY_CHISELED_LABYRINTH_STONE;
	public static Block MOSSY_CHISELED_LABYRINTH_STONE_STAIRS;
	public static Block MOSSY_CHISELED_LABYRINTH_STONE_SLAB;

	public static void load() {
		EMPTY_SEKAI_STONE = register("empty_sekai_stone", new EmptySEKAIStoneBlock());
		EMPTY_SEKAI_TILES = register("empty_sekai_tiles", new EmptySEKAITilesBlock());
		EMPTY_SEKAI_TRUSS = register("empty_sekai_truss", new EmptySEKAITrussBlock());
		// Studiopolis Blocks
		POLISHED_STUDIOPOLIS_CONCRETE = register("polished_studiopolis_concrete", new PolishedStudiopolisConcreteBlock());
		SMOOTH_STUDIOPOLIS_CONCRETE = register("smooth_studiopolis_concrete", new SmoothStudiopolisConcreteBlock());
		STUDIOPOLIS_TILES = register("studiopolis_tiles", new StudiopolisTilesBlock());
		STUDIOPOLIS_TILE_STAIRS = register("studiopolis_tile_stairs", new StudiopolisTileStairsBlock());
		STUDIOPOLIS_TILE_SLAB = register("studiopolis_tile_slab", new StudiopolisTileSlabBlock());
		SMOOTH_STUDIOPOLIS_CONCRETE_STAIRS = register("smooth_studiopolis_concrete_stairs", new SmoothStudiopolisConcreteStairsBlock());
		SMOOTH_STUDIOPOLIS_CONCRETE_SLAB = register("smooth_studiopolis_concrete_slab", new SmoothStudiopolisConcreteSlabBlock());
		STUDIOPOLIS_TILE_PILLAR = register("studiopolis_tile_pillar", new StudiopolisTilePillarBlock());
		STUDIOPOLIS_TRUSS = register("studiopolis_truss", new StudiopolisTrussBlock());
		STUDIOPOLIS_LAMP = register("studiopolis_lamp", new StudiopolisLampBlock());
		// this shit
		WOODEN_MIPS_DOOR = register("wooden_mips_door", new WoodenMIPSDoorBlock());
		SINGLE_STAR_WOODEN_MIPS_DOOR = register("single_star_wooden_mips_door", new SingleStarWoodenMIPSDoorBlock());
		METAL_MIPS_DOOR = register("metal_mips_door", new MetalMIPSDoorBlock());
		FRAMEWORK_BLOCK = register("framework_block", new FrameworkBlockBlock());
		// Fuyuki Blocks
		FUYUKI_WOOD = register("fuyuki_wood", new FuyukiWoodBlock());
		FUYUKI_LOG = register("fuyuki_log", new FuyukiLogBlock());
		FUYUKI_PLANKS = register("fuyuki_planks", new FuyukiPlanksBlock());
		FUYUKI_LEAVES = register("fuyuki_leaves", new FuyukiLeavesBlock());
		FUYUKI_STAIRS = register("fuyuki_stairs", new FuyukiStairsBlock());
		FUYUKI_SLAB = register("fuyuki_slab", new FuyukiSlabBlock());
		FUYUKI_FENCE = register("fuyuki_fence", new FuyukiFenceBlock());
		FUYUKI_FENCE_GATE = register("fuyuki_fence_gate", new FuyukiFenceGateBlock());
		FUYUKI_PRESSURE_PLATE = register("fuyuki_pressure_plate", new FuyukiPressurePlateBlock());
		FUYUKI_BUTTON = register("fuyuki_button", new FuyukiButtonBlock());
		FUYUKI_DOOR = register("fuyuki_door", new FuyukiDoorBlock());
		FUYUKI_TRAPDOOR = register("fuyuki_trapdoor", new FuyukiTrapdoorBlock());
		STRIPPED_FUYUKI_LOG = register("stripped_fuyuki_log", new FuyukiStrippedLogBlock());
		STRIPPED_FUYUKI_WOOD = register("stripped_fuyuki_wood", new FuyukiStrippedWoodBlock());
		// Miyashita Sakura Blocks
		MIYASHITA_SAKURA_WOOD = register("miyashita_sakura_wood", new MiyashitaSakuraWoodBlock());
		MIYASHITA_SAKURA_LOG = register("miyashita_sakura_log", new MiyashitaSakuraLogBlock());
		MIYASHITA_SAKURA_PLANKS = register("miyashita_sakura_planks", new MiyashitaSakuraPlanksBlock());
		MIYASHITA_SAKURA_LEAVES = register("miyashita_sakura_leaves", new MiyashitaSakuraLeavesBlock());
		MIYASHITA_SAKURA_STAIRS = register("miyashita_sakura_stairs", new MiyashitaSakuraStairsBlock());
		MIYASHITA_SAKURA_SLAB = register("miyashita_sakura_slab", new MiyashitaSakuraSlabBlock());
		MIYASHITA_SAKURA_FENCE = register("miyashita_sakura_fence", new MiyashitaSakuraFenceBlock());
		MIYASHITA_SAKURA_FENCE_GATE = register("miyashita_sakura_fence_gate", new MiyashitaSakuraFenceGateBlock());
		MIYASHITA_SAKURA_PRESSURE_PLATE = register("miyashita_sakura_pressure_plate", new MiyashitaSakuraPressurePlateBlock());
		MIYASHITA_SAKURA_BUTTON = register("miyashita_sakura_button", new MiyashitaSakuraButtonBlock());
		MIYASHITA_SAKURA_DOOR = register("miyashita_sakura_door", new MiyashitaSakuraDoorBlock());
		MIYASHITA_SAKURA_TRAPDOOR = register("miyashita_sakura_trapdoor", new MiyashitaSakuraTrapdoorBlock());
		STRIPPED_MIYASHITA_SAKURA_LOG = register("stripped_miyashita_sakura_log", new MiyashitaSakuraStrippedLogBlock());
		STRIPPED_MIYASHITA_SAKURA_WOOD = register("stripped_miyashita_sakura_wood", new MiyashitaSakuraStrippedWoodBlock());
		// fuck you
		LABYRINTH_STONE = register("labyrinth_stone", new LabyrinthStoneBlock());
		// ore
		LABYRINTH_COAL_ORE = register("labyrinth_coal_ore", new LabyrinthCoalOreBlock());
		LABYRINTH_COPPER_ORE = register("labyrinth_copper_ore", new LabyrinthCopperOreBlock());
		LABYRINTH_DIAMOND_ORE = register("labyrinth_diamond_ore", new LabyrinthDiamondOreBlock());
		LABYRINTH_EMERALD_ORE = register("labyrinth_emerald_ore", new LabyrinthEmeraldOreBlock());
		LABYRINTH_GOLD_ORE = register("labyrinth_gold_ore", new LabyrinthGoldOreBlock());
		LABYRINTH_IRON_ORE = register("labyrinth_iron_ore", new LabyrinthIronOreBlock());
		LABYRINTH_LAPIS_ORE = register("labyrinth_lapis_ore", new LabyrinthLapisOreBlock());
		LABYRINTH_REDSTONE_ORE = register("labyrinth_redstone_ore", new LabyrinthRedstoneOreBlock());
		// cobbled
		COBBLED_LABYRINTH_STONE = register("cobbled_labyrinth_stone", new CobbledLabyrinthStoneBlock());
		COBBLED_LABYRINTH_STONE_STAIRS = register("cobbled_labyrinth_stone_stairs", new CobbledLabyrinthStoneStairsBlock());
		COBBLED_LABYRINTH_STONE_SLAB = register("cobbled_labyrinth_stone_slab", new CobbledLabyrinthStoneSlabBlock());
		// polished
		POLISHED_LABYRINTH_STONE = register("polished_labyrinth_stone", new PolishedLabyrinthStoneBlock());
		POLISHED_LABYRINTH_STONE_STAIRS = register("polished_labyrinth_stone_stairs", new PolishedLabyrinthStoneStairsBlock());
		POLISHED_LABYRINTH_STONE_SLAB = register("polished_labyrinth_stone_slab", new PolishedLabyrinthStoneSlabBlock());
		POLISHED_LABYRINTH_STONE_BRICKS = register("polished_labyrinth_stone_bricks", new PolishedLabyrinthStoneBricksBlock());
		POLISHED_LABYRINTH_STONE_BRICK_STAIRS = register("polished_labyrinth_stone_brick_stairs", new PolishedLabyrinthStoneBrickStairsBlock());
		POLISHED_LABYRINTH_STONE_BRICK_SLAB = register("polished_labyrinth_stone_brick_slab", new PolishedLabyrinthStoneBrickSlabBlock());
		POLISHED_LABYRINTH_STONE_TILES = register("polished_labyrinth_stone_tiles", new PolishedLabyrinthStoneTilesBlock());
		POLISHED_LABYRINTH_STONE_TILE_STAIRS = register("polished_labyrinth_stone_tile_stairs", new PolishedLabyrinthStoneTileStairsBlock());
		POLISHED_LABYRINTH_STONE_TILE_SLAB = register("polished_labyrinth_stone_tile_slab", new PolishedLabyrinthStoneTileSlabBlock());
		CHISELED_LABYRINTH_STONE = register("chiseled_labyrinth_stone", new ChiseledLabyrinthStoneBlock());
		CHISELED_LABYRINTH_STONE_STAIRS = register("chiseled_labyrinth_stone_stairs", new ChiseledLabyrinthStoneStairsBlock());
		CHISELED_LABYRINTH_STONE_SLAB = register("chiseled_labyrinth_stone_slab", new ChiseledLabyrinthStoneSlabBlock());

		// AAAAAAAAAAAAAAAAAAA
		MOSSY_LABYRINTH_STONE = register("mossy_labyrinth_stone", new MossyLabyrinthStoneBlock());
		MOSSY_COBBLED_LABYRINTH_STONE = register("mossy_cobbled_labyrinth_stone", new MossyCobbledLabyrinthStoneBlock());
		MOSSY_COBBLED_LABYRINTH_STONE_STAIRS = register("mossy_cobbled_labyrinth_stone_stairs", new MossyCobbledLabyrinthStoneStairsBlock());
		MOSSY_COBBLED_LABYRINTH_STONE_SLAB = register("mossy_cobbled_labyrinth_stone_slab", new MossyCobbledLabyrinthStoneSlabBlock());
		MOSSY_POLISHED_LABYRINTH_STONE = register("mossy_polished_labyrinth_stone", new MossyPolishedLabyrinthStoneBlock());
		MOSSY_POLISHED_LABYRINTH_STONE_STAIRS = register("mossy_polished_labyrinth_stone_stairs", new MossyPolishedLabyrinthStoneStairsBlock());
		MOSSY_POLISHED_LABYRINTH_STONE_SLAB = register("mossy_polished_labyrinth_stone_slab", new MossyPolishedLabyrinthStoneSlabBlock());
		MOSSY_POLISHED_LABYRINTH_STONE_BRICKS = register("mossy_polished_labyrinth_stone_bricks", new MossyPolishedLabyrinthStoneBricksBlock());
		MOSSY_POLISHED_LABYRINTH_STONE_BRICK_STAIRS = register("mossy_polished_labyrinth_stone_brick_stairs", new MossyPolishedLabyrinthStoneBrickStairsBlock());
		MOSSY_POLISHED_LABYRINTH_STONE_BRICK_SLAB = register("mossy_polished_labyrinth_stone_brick_slab", new MossyPolishedLabyrinthStoneBrickSlabBlock());
		MOSSY_POLISHED_LABYRINTH_STONE_TILES = register("mossy_polished_labyrinth_stone_tiles", new MossyPolishedLabyrinthStoneTilesBlock());
		MOSSY_POLISHED_LABYRINTH_STONE_TILE_STAIRS = register("mossy_polished_labyrinth_stone_tile_stairs", new MossyPolishedLabyrinthStoneTileStairsBlock());
		MOSSY_POLISHED_LABYRINTH_STONE_TILE_SLAB = register("mossy_polished_labyrinth_stone_tile_slab", new MossyPolishedLabyrinthStoneTileSlabBlock());
		MOSSY_CHISELED_LABYRINTH_STONE = register("mossy_chiseled_labyrinth_stone", new MossyChiseledLabyrinthStoneBlock());
		MOSSY_CHISELED_LABYRINTH_STONE_STAIRS = register("mossy_chiseled_labyrinth_stone_stairs", new MossyChiseledLabyrinthStoneStairsBlock());
		MOSSY_CHISELED_LABYRINTH_STONE_SLAB = register("mossy_chiseled_labyrinth_stone_slab", new MossyChiseledLabyrinthStoneSlabBlock());
	}

	public static void clientLoad() {
		// hateful
		EmptySEKAIStoneBlock.clientInit();
		EmptySEKAITilesBlock.clientInit();
		EmptySEKAITrussBlock.clientInit();
		PolishedStudiopolisConcreteBlock.clientInit();
		SmoothStudiopolisConcreteBlock.clientInit();
		SmoothStudiopolisConcreteStairsBlock.clientInit();
		SmoothStudiopolisConcreteSlabBlock.clientInit();
		StudiopolisTilesBlock.clientInit();
		StudiopolisTileStairsBlock.clientInit();
		StudiopolisTileSlabBlock.clientInit();
		StudiopolisTilePillarBlock.clientInit();
		StudiopolisTrussBlock.clientInit();
		StudiopolisLampBlock.clientInit();
		WoodenMIPSDoorBlock.clientInit();
		SingleStarWoodenMIPSDoorBlock.clientInit();
		MetalMIPSDoorBlock.clientInit();
		FrameworkBlockBlock.clientInit();

		FuyukiWoodBlock.clientInit();
		FuyukiLogBlock.clientInit();
		FuyukiPlanksBlock.clientInit();
		FuyukiLeavesBlock.clientInit();
		FuyukiStairsBlock.clientInit();
		FuyukiSlabBlock.clientInit();
		FuyukiFenceBlock.clientInit();
		FuyukiFenceGateBlock.clientInit();
		FuyukiPressurePlateBlock.clientInit();
		FuyukiButtonBlock.clientInit();
		FuyukiDoorBlock.clientInit();
		FuyukiTrapdoorBlock.clientInit();

		MiyashitaSakuraWoodBlock.clientInit();
		MiyashitaSakuraLogBlock.clientInit();
		MiyashitaSakuraPlanksBlock.clientInit();
		MiyashitaSakuraLeavesBlock.clientInit();
		MiyashitaSakuraStairsBlock.clientInit();
		MiyashitaSakuraSlabBlock.clientInit();
		MiyashitaSakuraFenceBlock.clientInit();
		MiyashitaSakuraFenceGateBlock.clientInit();
		MiyashitaSakuraPressurePlateBlock.clientInit();
		MiyashitaSakuraButtonBlock.clientInit();
		MiyashitaSakuraDoorBlock.clientInit();
		MiyashitaSakuraTrapdoorBlock.clientInit();

		LabyrinthStoneBlock.clientInit();

		LabyrinthCoalOreBlock.clientInit();
		LabyrinthCopperOreBlock.clientInit();
		LabyrinthDiamondOreBlock.clientInit();
		LabyrinthEmeraldOreBlock.clientInit();
		LabyrinthGoldOreBlock.clientInit();
		LabyrinthIronOreBlock.clientInit();
		LabyrinthLapisOreBlock.clientInit();
		LabyrinthRedstoneOreBlock.clientInit();

		CobbledLabyrinthStoneBlock.clientInit();
		CobbledLabyrinthStoneStairsBlock.clientInit();
		CobbledLabyrinthStoneSlabBlock.clientInit();

		PolishedLabyrinthStoneBlock.clientInit();
		PolishedLabyrinthStoneStairsBlock.clientInit();
		PolishedLabyrinthStoneSlabBlock.clientInit();
		PolishedLabyrinthStoneBricksBlock.clientInit();
		PolishedLabyrinthStoneBrickStairsBlock.clientInit();
		PolishedLabyrinthStoneBrickSlabBlock.clientInit();
		PolishedLabyrinthStoneTilesBlock.clientInit();
		PolishedLabyrinthStoneTileStairsBlock.clientInit();
		PolishedLabyrinthStoneTileSlabBlock.clientInit();

		ChiseledLabyrinthStoneBlock.clientInit();
		ChiseledLabyrinthStoneStairsBlock.clientInit();
		ChiseledLabyrinthStoneSlabBlock.clientInit();

		MossyLabyrinthStoneBlock.clientInit();
		MossyCobbledLabyrinthStoneBlock.clientInit();
		MossyCobbledLabyrinthStoneStairsBlock.clientInit();
		MossyCobbledLabyrinthStoneSlabBlock.clientInit();
		MossyPolishedLabyrinthStoneBlock.clientInit();
		MossyPolishedLabyrinthStoneStairsBlock.clientInit();
		MossyPolishedLabyrinthStoneSlabBlock.clientInit();
		MossyPolishedLabyrinthStoneBricksBlock.clientInit();
		MossyPolishedLabyrinthStoneBrickStairsBlock.clientInit();
		MossyPolishedLabyrinthStoneBrickSlabBlock.clientInit();
		MossyPolishedLabyrinthStoneTilesBlock.clientInit();
		MossyPolishedLabyrinthStoneTileStairsBlock.clientInit();
		MossyPolishedLabyrinthStoneTileSlabBlock.clientInit();
		MossyChiseledLabyrinthStoneBlock.clientInit();
		MossyChiseledLabyrinthStoneStairsBlock.clientInit();
		MossyChiseledLabyrinthStoneSlabBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(WelcomeKitajima.MODID, registryName), block);
	}
}
