
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.block.WoodenMIPSDoorBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.coutman.welcomekitajima.block.StudiopolisTrussBlock;
import net.coutman.welcomekitajima.block.StudiopolisTilesBlock;
import net.coutman.welcomekitajima.block.StudiopolisTileStairsBlock;
import net.coutman.welcomekitajima.block.StudiopolisTileSlabBlock;
import net.coutman.welcomekitajima.block.StudiopolisTilePillarBlock;
import net.coutman.welcomekitajima.block.StudiopolisLampBlock;
import net.coutman.welcomekitajima.block.SmoothStudiopolisConcreteStairsBlock;
import net.coutman.welcomekitajima.block.SmoothStudiopolisConcreteSlabBlock;
import net.coutman.welcomekitajima.block.SmoothStudiopolisConcreteBlock;
import net.coutman.welcomekitajima.block.SingleStarWoodenMIPSDoorBlock;
import net.coutman.welcomekitajima.block.PolishedStudiopolisConcreteBlock;
import net.coutman.welcomekitajima.block.MetalMIPSDoorBlock;
import net.coutman.welcomekitajima.block.FuyukiWoodBlock;
import net.coutman.welcomekitajima.block.FuyukiTrapdoorBlock;
import net.coutman.welcomekitajima.block.FuyukiStairsBlock;
import net.coutman.welcomekitajima.block.FuyukiSlabBlock;
import net.coutman.welcomekitajima.block.FuyukiPressurePlateBlock;
import net.coutman.welcomekitajima.block.FuyukiPlanksBlock;
import net.coutman.welcomekitajima.block.FuyukiLogBlock;
import net.coutman.welcomekitajima.block.FuyukiLeavesBlock;
import net.coutman.welcomekitajima.block.FuyukiFenceGateBlock;
import net.coutman.welcomekitajima.block.FuyukiFenceBlock;
import net.coutman.welcomekitajima.block.FuyukiDoorBlock;
import net.coutman.welcomekitajima.block.FuyukiButtonBlock;
import net.coutman.welcomekitajima.block.FrameworkBlockBlock;
import net.coutman.welcomekitajima.block.EmptySEKAITrussBlock;
import net.coutman.welcomekitajima.block.EmptySEKAITilesBlock;
import net.coutman.welcomekitajima.block.EmptySEKAIStoneBlock;
import net.coutman.welcomekitajima.WelcomekitajimaMod;

public class WelcomekitajimaModBlocks {
	public static Block EMPTY_SEKAI_STONE;
	public static Block EMPTY_SEKAI_TILES;
	public static Block EMPTY_SEKAI_TRUSS;
	public static Block POLISHED_STUDIOPOLIS_CONCRETE;
	public static Block SMOOTH_STUDIOPOLIS_CONCRETE;
	public static Block STUDIOPOLIS_TILES;
	public static Block STUDIOPOLIS_TILE_STAIRS;
	public static Block STUDIOPOLIS_TILE_SLAB;
	public static Block SMOOTH_STUDIOPOLIS_CONCRETE_STAIRS;
	public static Block SMOOTH_STUDIOPOLIS_CONCRETE_SLAB;
	public static Block STUDIOPOLIS_TILE_PILLAR;
	public static Block STUDIOPOLIS_TRUSS;
	public static Block STUDIOPOLIS_LAMP;
	public static Block WOODEN_MIPS_DOOR;
	public static Block SINGLE_STAR_WOODEN_MIPS_DOOR;
	public static Block METAL_MIPS_DOOR;
	public static Block FRAMEWORK_BLOCK;
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

	public static void load() {
		EMPTY_SEKAI_STONE = register("empty_sekai_stone", new EmptySEKAIStoneBlock());
		EMPTY_SEKAI_TILES = register("empty_sekai_tiles", new EmptySEKAITilesBlock());
		EMPTY_SEKAI_TRUSS = register("empty_sekai_truss", new EmptySEKAITrussBlock());
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
		WOODEN_MIPS_DOOR = register("wooden_mips_door", new WoodenMIPSDoorBlock());
		SINGLE_STAR_WOODEN_MIPS_DOOR = register("single_star_wooden_mips_door", new SingleStarWoodenMIPSDoorBlock());
		METAL_MIPS_DOOR = register("metal_mips_door", new MetalMIPSDoorBlock());
		FRAMEWORK_BLOCK = register("framework_block", new FrameworkBlockBlock());
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
	}

	public static void clientLoad() {
		EmptySEKAIStoneBlock.clientInit();
		EmptySEKAITilesBlock.clientInit();
		EmptySEKAITrussBlock.clientInit();
		PolishedStudiopolisConcreteBlock.clientInit();
		SmoothStudiopolisConcreteBlock.clientInit();
		StudiopolisTilesBlock.clientInit();
		StudiopolisTileStairsBlock.clientInit();
		StudiopolisTileSlabBlock.clientInit();
		SmoothStudiopolisConcreteStairsBlock.clientInit();
		SmoothStudiopolisConcreteSlabBlock.clientInit();
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
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(Registries.BLOCK, new Identifier(WelcomekitajimaMod.MODID, registryName), block);
	}
}
