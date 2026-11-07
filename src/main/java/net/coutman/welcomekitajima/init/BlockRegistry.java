package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.coutman.welcomekitajima.init.TreeRegistry.*;

import net.coutman.welcomekitajima.block.*;
import net.coutman.welcomekitajima.block.fuyuki.*;
import net.coutman.welcomekitajima.block.miyashita_sakura.*;
import net.coutman.welcomekitajima.block.ashwood.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

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
	public static Block MIYASHITA_SAKURA_SAPLING;
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
	// ashwood
	public static Block ASHWOOD_WOOD;
	public static Block ASHWOOD_LOG;
	public static Block ASHWOOD_PLANKS;
	public static Block ASHWOOD_LEAVES;
	public static Block ASHWOOD_STAIRS;
	public static Block ASHWOOD_SLAB;
	public static Block ASHWOOD_FENCE;
	public static Block ASHWOOD_FENCE_GATE;
	public static Block ASHWOOD_PRESSURE_PLATE;
	public static Block ASHWOOD_BUTTON;
	public static Block ASHWOOD_DOOR;
	public static Block ASHWOOD_TRAPDOOR;
	public static Block STRIPPED_ASHWOOD_LOG;
	public static Block STRIPPED_ASHWOOD_WOOD;
	// labyrinth
	public static Block LABYRINTH_STONE;
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
		FuyukiSignBlock.register();
		// Miyashita Sakura Blocks
		MIYASHITA_SAKURA_SAPLING = register("miyashita_sakura_sapling", Saplings.MIYASHITA_SAKURA_SAPLING);
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
		MiyashitaSakuraSignBlock.register();
		// Ashwood Blocks
		ASHWOOD_WOOD = register("ashwood_wood", new AshwoodWoodBlock());
		ASHWOOD_LOG = register("ashwood_log", new AshwoodLogBlock());
		ASHWOOD_PLANKS = register("ashwood_planks", new AshwoodPlanksBlock());
		ASHWOOD_LEAVES = register("ashwood_leaves", new AshwoodLeavesBlock());
		ASHWOOD_STAIRS = register("ashwood_stairs", new AshwoodStairsBlock());
		ASHWOOD_SLAB = register("ashwood_slab", new AshwoodSlabBlock());
		ASHWOOD_FENCE = register("ashwood_fence", new AshwoodFenceBlock());
		ASHWOOD_FENCE_GATE = register("ashwood_fence_gate", new AshwoodFenceGateBlock());
		ASHWOOD_PRESSURE_PLATE = register("ashwood_pressure_plate", new AshwoodPressurePlateBlock());
		ASHWOOD_BUTTON = register("ashwood_button", new AshwoodButtonBlock());
		ASHWOOD_DOOR = register("ashwood_door", new AshwoodDoorBlock());
		ASHWOOD_TRAPDOOR = register("ashwood_trapdoor", new AshwoodTrapdoorBlock());
		STRIPPED_ASHWOOD_LOG = register("stripped_ashwood_log", new AshwoodStrippedLogBlock());
		STRIPPED_ASHWOOD_WOOD = register("stripped_ashwood_wood", new AshwoodStrippedWoodBlock());
		AshwoodSignBlock.register();
		// fuck you
		LABYRINTH_STONE = register("labyrinth_stone",
				new LabyrinthStoneBlockFamily.LabyrinthBaseBlock(LabyrinthStoneBlockFamily.PROPERTIES, () -> COBBLED_LABYRINTH_STONE.asItem()));
		// cobbled
		COBBLED_LABYRINTH_STONE = register("cobbled_labyrinth_stone",
				new LabyrinthStoneBlockFamily.LabyrinthBaseBlock(LabyrinthStoneBlockFamily.PROPERTIES, null));
		COBBLED_LABYRINTH_STONE_STAIRS = register("cobbled_labyrinth_stone_stairs",
				new LabyrinthStoneBlockFamily.LabyrinthBaseStairBlock(Blocks.AIR.defaultBlockState(), LabyrinthStoneBlockFamily.PROPERTIES, null));
		COBBLED_LABYRINTH_STONE_SLAB = register("cobbled_labyrinth_stone_slab",
				new LabyrinthStoneBlockFamily.LabyrinthBaseSlabBlock(LabyrinthStoneBlockFamily.PROPERTIES, null));
		// polished
		POLISHED_LABYRINTH_STONE = register("polished_labyrinth_stone",
				new LabyrinthStoneBlockFamily.LabyrinthBaseBlock(LabyrinthStoneBlockFamily.PROPERTIES, null));
		POLISHED_LABYRINTH_STONE_STAIRS = register("polished_labyrinth_stone_stairs",
				new LabyrinthStoneBlockFamily.LabyrinthBaseStairBlock(Blocks.AIR.defaultBlockState(), LabyrinthStoneBlockFamily.PROPERTIES, null));
		POLISHED_LABYRINTH_STONE_SLAB = register("polished_labyrinth_stone_slab",
				new LabyrinthStoneBlockFamily.LabyrinthBaseSlabBlock(LabyrinthStoneBlockFamily.PROPERTIES, null));

		POLISHED_LABYRINTH_STONE_BRICKS = register("polished_labyrinth_stone_bricks",
				new LabyrinthStoneBlockFamily.LabyrinthBaseBlock(LabyrinthStoneBlockFamily.PROPERTIES, null));
		POLISHED_LABYRINTH_STONE_BRICK_STAIRS = register("polished_labyrinth_stone_brick_stairs",
				new LabyrinthStoneBlockFamily.LabyrinthBaseStairBlock(Blocks.AIR.defaultBlockState(), LabyrinthStoneBlockFamily.PROPERTIES, null));
		POLISHED_LABYRINTH_STONE_BRICK_SLAB = register("polished_labyrinth_stone_brick_slab",
				new LabyrinthStoneBlockFamily.LabyrinthBaseSlabBlock(LabyrinthStoneBlockFamily.PROPERTIES, null));

		POLISHED_LABYRINTH_STONE_TILES = register("polished_labyrinth_stone_tiles",
				new LabyrinthStoneBlockFamily.LabyrinthBaseBlock(LabyrinthStoneBlockFamily.PROPERTIES, null));
		POLISHED_LABYRINTH_STONE_TILE_STAIRS = register("polished_labyrinth_stone_tile_stairs",
				new LabyrinthStoneBlockFamily.LabyrinthBaseStairBlock(Blocks.AIR.defaultBlockState(), LabyrinthStoneBlockFamily.PROPERTIES, null));
		POLISHED_LABYRINTH_STONE_TILE_SLAB = register("polished_labyrinth_stone_tile_slab",
				new LabyrinthStoneBlockFamily.LabyrinthBaseSlabBlock(LabyrinthStoneBlockFamily.PROPERTIES, null));

		CHISELED_LABYRINTH_STONE = register("chiseled_labyrinth_stone",
				new LabyrinthStoneBlockFamily.LabyrinthBaseBlock(LabyrinthStoneBlockFamily.PROPERTIES, null));
		CHISELED_LABYRINTH_STONE_STAIRS = register("chiseled_labyrinth_stone_stairs",
				new LabyrinthStoneBlockFamily.LabyrinthBaseStairBlock(Blocks.AIR.defaultBlockState(), LabyrinthStoneBlockFamily.PROPERTIES, null));
		CHISELED_LABYRINTH_STONE_SLAB = register("chiseled_labyrinth_stone_slab",
				new LabyrinthStoneBlockFamily.LabyrinthBaseSlabBlock(LabyrinthStoneBlockFamily.PROPERTIES, null));

		TrafficLamps.registerBlocks();
		BlackVolcanicSand.register();

		// stripping??!?!!??!! in MY family friendly video game???!?!?!?
		StrippableBlockRegistry.register(FUYUKI_LOG, STRIPPED_FUYUKI_LOG);
		StrippableBlockRegistry.register(FUYUKI_WOOD, STRIPPED_FUYUKI_WOOD);
		StrippableBlockRegistry.register(MIYASHITA_SAKURA_LOG, MIYASHITA_SAKURA_LOG);
		StrippableBlockRegistry.register(MIYASHITA_SAKURA_WOOD, MIYASHITA_SAKURA_WOOD);
		StrippableBlockRegistry.register(ASHWOOD_LOG, STRIPPED_ASHWOOD_LOG);
		StrippableBlockRegistry.register(ASHWOOD_WOOD, STRIPPED_ASHWOOD_WOOD);
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

		AshwoodWoodBlock.clientInit();
		AshwoodLogBlock.clientInit();
		AshwoodPlanksBlock.clientInit();
		AshwoodLeavesBlock.clientInit();
		AshwoodStairsBlock.clientInit();
		AshwoodSlabBlock.clientInit();
		AshwoodFenceBlock.clientInit();
		AshwoodFenceGateBlock.clientInit();
		AshwoodPressurePlateBlock.clientInit();
		AshwoodButtonBlock.clientInit();
		AshwoodDoorBlock.clientInit();
		AshwoodTrapdoorBlock.clientInit();

		LabyrinthStoneBlockFamily.clientInit();

		TrafficLamps.clientInit();
		BlackVolcanicSand.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(WelcomeKitajima.MODID, registryName), block);
	}
}
