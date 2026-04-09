package net.coutman.welcomekitajima.init;


import net.coutman.welcomekitajima.item.specialty.CitlaliTataco;
import net.coutman.welcomekitajima.item.specialty.KnucklesToast;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

// these imports were only required for the legacy mcreator functions, no idea if they still are needed

// import net.minecraft.world.item.Items;
// import net.minecraft.client.renderer.item.ItemProperties;
// import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.coutman.welcomekitajima.item.*;
import net.coutman.welcomekitajima.WelcomekitajimaMod;

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
	public static Item HAGU;
	public static Item TOADS_TURNPIKE;
	public static Item RACEWAYS;
	public static Item SMB_2_OVERWORLD_SMAS;
	public static Item SMB_3_OVERWORLD_SMAS;
	public static Item SMW_SPECIAL;
	public static Item STUDIOPOLIS_COMPLEX_CALM;
	public static Item RUDE_BUSTER;
	public static Item JOKER;
	public static Item BIG_SHOT;
	public static Item TV_TIME;
	public static Item THE_FIRST_DROP;
	public static Item EVER_DRIER;
	public static Item DAYTIME_WANDERING;
	public static Item ZUNDAMON_FIGHT;
	public static Item MESMERIZER_NERU_FIGHT;
	// untitled
	public static Item NEEDLE;
	public static Item NEWLY_EDGY_IDOLS;
	public static Item READY_STEADY;
	public static Item WORLDNOSTART;
	public static Item KUYAMU;
	// movie songs
	public static Item STORY;
	public static Item FUN;
	public static Item FIRE_DANCE;
	public static Item SMILE_SYMPHONY;
	public static Item LIGHT_DWELL;
	// real items
	public static Item CRYSTAL;
	public static Item WISH_PIECE;
	// specialties
	public static Item SECRET_ART;
	public static Item KNUCKLE_SANDWICH;
	// banner patterns because fuck you
	public static Item PYRO_BANNER_PATTERN;
	public static Item HYDRO_BANNER_PATTERN;
	public static Item ANEMO_BANNER_PATTERN;
	public static Item ELECTRO_BANNER_PATTERN;
	public static Item DENDRO_BANNER_PATTERN;
	public static Item CRYO_BANNER_PATTERN;
	public static Item GEO_BANNER_PATTERN;
	public static Item MIYASHITA_BANNER_PATTERN;
	// boss drops
	public static Item PROJECTION_PYRO_DROP;
	public static Item PROJECTION_ELECTRO_DROP;
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
	public static Item STRIPPED_FUYUKI_LOG;
	public static Item STRIPPED_FUYUKI_WOOD;
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
	// i really fucking hate this
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
		// empty sekai blocks
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
		HAGU = register("hagu", new HaguItem());
		TOADS_TURNPIKE = register("toads_turnpike", new ToadsTurnpikeItem());
		RACEWAYS = register("raceways", new RacewaysItem());
		SMB_2_OVERWORLD_SMAS = register("smb_2_overworld_smas", new SMB2OverworldSMASItem());
		SMB_3_OVERWORLD_SMAS = register("smb_3_overworld_smas", new SMB3OverworldSMASItem());
		SMW_SPECIAL = register("smw_special", new SMWSpecialItem());
		STUDIOPOLIS_COMPLEX_CALM = register("studiopolis_complex_calm", new StudiopolisComplexCalmItem());
		RUDE_BUSTER = register("rude_buster", new RudeBusterItem());
		JOKER = register("joker", new JokerItem());
		BIG_SHOT = register("big_shot", new BigShotItem());
		TV_TIME = register("its_tv_time", new TVTimeItem());
		THE_FIRST_DROP = register("the_first_drop", new FirstDropItem());
		EVER_DRIER = register("ever_drier", new EverDrierItem());
		DAYTIME_WANDERING = register("daytime_wandering", new DaytimeWanderingItem());
		ZUNDAMON_FIGHT = register("zundamon_fight", new ZundamonFightItem());
		MESMERIZER_NERU_FIGHT = register("mesmerizer_neru_fight", new MesmerizerNeruFightItem());

		// untitled
		NEEDLE = register("needle", new NeedleItem());
		NEWLY_EDGY_IDOLS = register("newly_edgy_idols", new NewlyEdgyIdolsItem());
		READY_STEADY = register("ready_steady", new ReadySteadyItem());
		WORLDNOSTART = register("the_world_hasnt_started_yet", new WorldNoStartItem());
		KUYAMU = register("kuyamu", new KuyamuItem());

		// movie songs
		STORY = register("story", new SToRYItem());
		FUN = register("fun", new FunItem());
		FIRE_DANCE = register("fire_dance", new FireDanceItem());
		SMILE_SYMPHONY = register("smile_symphony", new SmileSymphonyItem());
		LIGHT_DWELL = register("the_light_that_dwells_here", new LightDwellItem());

		// okay real items
		CRYSTAL = register("crystal", new SEKAICrystalItem());
		WISH_PIECE = register("wish_piece", new WishPieceItem());

		// specialty foods
		SECRET_ART = register("secret_art", new CitlaliTataco());
		KNUCKLE_SANDWICH = register("knuckle_sandwich", new KnucklesToast());

		// AAAAAAAAAAAAA
		PYRO_BANNER_PATTERN = register("pyro_banner_pattern", new PyroPatternItem());
		HYDRO_BANNER_PATTERN = register("hydro_banner_pattern", new HydroPatternItem());
		ANEMO_BANNER_PATTERN = register("anemo_banner_pattern", new AnemoPatternItem());
		ELECTRO_BANNER_PATTERN = register("electro_banner_pattern", new ElectroPatternItem());
		DENDRO_BANNER_PATTERN = register("dendro_banner_pattern", new DendroPatternItem());
		CRYO_BANNER_PATTERN = register("cryo_banner_pattern", new CryoPatternItem());
		GEO_BANNER_PATTERN = register("geo_banner_pattern", new GeoPatternItem());
		MIYASHITA_BANNER_PATTERN = register("miyashita_banner_pattern", new MiyashitaSakuraPatternItem());

		// boss drops
		PROJECTION_PYRO_DROP = register("projection_pyro_drop", new ProjectionPyroDrop());
		PROJECTION_ELECTRO_DROP = register("projection_electro_drop", new ProjectionElectroDrop());

		// fuyuki
		FUYUKI_LOG = register("fuyuki_log", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_LOG, new Item.Properties()));
		FUYUKI_WOOD = register("fuyuki_wood", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_WOOD, new Item.Properties()));
		STRIPPED_FUYUKI_LOG = register("stripped_fuyuki_log", new BlockItem(WelcomekitajimaModBlocks.STRIPPED_FUYUKI_LOG, new Item.Properties()));
		STRIPPED_FUYUKI_WOOD = register("stripped_fuyuki_wood", new BlockItem(WelcomekitajimaModBlocks.STRIPPED_FUYUKI_WOOD, new Item.Properties()));
		FUYUKI_LEAVES = register("fuyuki_leaves", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_LEAVES, new Item.Properties()));
		FUYUKI_PLANKS = register("fuyuki_planks", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_PLANKS, new Item.Properties()));
		FUYUKI_STAIRS = register("fuyuki_stairs", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_STAIRS, new Item.Properties()));
		FUYUKI_SLAB = register("fuyuki_slab", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_SLAB, new Item.Properties()));
		FUYUKI_FENCE = register("fuyuki_fence", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_FENCE, new Item.Properties()));
		FUYUKI_FENCE_GATE = register("fuyuki_fence_gate", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_FENCE_GATE, new Item.Properties()));
		FUYUKI_DOOR = register("fuyuki_door", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_DOOR, new Item.Properties()));
		FUYUKI_TRAPDOOR = register("fuyuki_trapdoor", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_TRAPDOOR, new Item.Properties()));
		FUYUKI_PRESSURE_PLATE = register("fuyuki_pressure_plate", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_PRESSURE_PLATE, new Item.Properties()));
		FUYUKI_BUTTON = register("fuyuki_button", new BlockItem(WelcomekitajimaModBlocks.FUYUKI_BUTTON, new Item.Properties()));

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
	// legacy method leftover from mcreator
	// public static void clientLoad() {
	// }

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomekitajimaMod.MODID, registryName), item);
	}
	// another legacy method leftover from mcreator
	// private static void registerBlockingProperty(Item item) {
		// ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	// }
}
