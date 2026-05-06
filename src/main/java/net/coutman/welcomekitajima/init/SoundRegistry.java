package net.coutman.welcomekitajima.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class SoundRegistry {
	// Records
	public static SoundEvent RECORD_STUDIOPOLISZONE_ACT1 = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.studiopoliszone.act1"));
	public static SoundEvent RECORD_HAGU = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.hagu"));
	public static SoundEvent RECORD_TURNPIKE = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.turnpike"));
	public static SoundEvent RECORD_RACEWAY = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.raceway"));
	public static SoundEvent RECORD_SMB2_OVERWORLD_SMAS = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.smb2_overworld_smas"));
	public static SoundEvent RECORD_SMB3_OVERWORLD_SMAS = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.smb3_overworld_smas"));
	public static SoundEvent RECORD_SPECIALZONE = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.specialzone"));
	public static SoundEvent RECORD_STUDIOPOLISCOMPLEX_CALM = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.studiopoliscomplex.calm"));
	public static SoundEvent RECORD_RUDE_BUSTER = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.rude_buster"));
	public static SoundEvent RECORD_JOKER = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.joker"));
	public static SoundEvent RECORD_BIG_SHOT = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.big_shot"));
	public static SoundEvent RECORD_TV_TIME = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.tv_time"));
	public static SoundEvent RECORD_THEFIRSTDROP = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.the_first_drop"));
	public static SoundEvent RECORD_EVER_DRIER = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.ever_drier"));
	public static SoundEvent RECORD_DAYTIME_WANDERING = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.daytime_wandering"));
	public static SoundEvent RECORD_ZUNDAMON_FIGHT = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.zundamon_fight"));
	public static SoundEvent RECORD_MESMERIZER_NERU_FIGHT = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.mesmerizer_neru_fight"));

	// Untitleds
	public static SoundEvent RECORD_NEEDLE = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.needle"));
	public static SoundEvent RECORD_NEWLY_EDGY_IDOLS = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.newly_edgy_idols"));
	public static SoundEvent RECORD_READY_STEADY = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.ready_steady"));
	public static SoundEvent RECORD_WORLDNOSTART = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.worldnostart"));
	public static SoundEvent RECORD_KUYAMUTOKAITEMIRAI = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.kuyamutokaitemirai"));

	// SEKAI Movie Songs
	public static SoundEvent RECORD_STORY = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.story"));
	public static SoundEvent RECORD_FUN = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.fun"));
	public static SoundEvent RECORD_FIRE_DANCE = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.fire_dance"));
	public static SoundEvent RECORD_SMILE_SYMPHONY = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.smile_symphony"));
	public static SoundEvent RECORD_LIGHT_DWELL = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.light_dwell"));

	// Block sounds
	public static SoundEvent BLOCK_DRIVE_SPINNING = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "block.drive.spinning"));
	public static SoundEvent BLOCK_DRIVE_EJECT = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "block.drive.eject"));
	public static SoundEvent BLOCK_DRIVE_CLOSE = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "block.drive.close"));

	// Music
	public static SoundEvent MUSIC_FOOD_MART = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "music.food_mart"));
	public static SoundEvent MUSIC_INTERIOR_SHOP = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "music.interior_shop"));

	// Misc. Sound effects
	public static SoundEvent TF2_CRIT = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "tf2_crit"));

	// SEKAI Background Music
	public static SoundEvent SCHOOL_SEKAI = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "school_sekai"));
	public static SoundEvent STAGE_SEKAI = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "stage_sekai"));
	public static SoundEvent STREET_SEKAI = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "street_sekai"));
	public static SoundEvent WONDERLAND_SEKAI = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "wonderland_sekai"));
	public static SoundEvent EMPTY_SEKAI = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "empty_sekai"));

	public static void load() {
		// Record registry events
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.studiopoliszone.act1"), RECORD_STUDIOPOLISZONE_ACT1);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.hagu"), RECORD_HAGU);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "music.food_mart"), MUSIC_FOOD_MART);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "music.interior_shop"), MUSIC_INTERIOR_SHOP);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.turnpike"), RECORD_TURNPIKE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.raceway"), RECORD_RACEWAY);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.smb2_overworld_smas"), RECORD_SMB2_OVERWORLD_SMAS);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.smb3_overworld_smas"), RECORD_SMB3_OVERWORLD_SMAS);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.specialzone"), RECORD_SPECIALZONE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.studiopoliscomplex.calm"), RECORD_STUDIOPOLISCOMPLEX_CALM);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.rude_buster"), RECORD_RUDE_BUSTER);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.joker"), RECORD_JOKER);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.big_shot"), RECORD_BIG_SHOT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.tv_time"), RECORD_TV_TIME);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.the_first_drop"), RECORD_THEFIRSTDROP);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.zundamon_fight"), RECORD_ZUNDAMON_FIGHT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.mesmerizer_neru_fight"), RECORD_MESMERIZER_NERU_FIGHT);

		// Untitled registry events
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.needle"), RECORD_NEEDLE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.newly_edgy_idols"), RECORD_NEWLY_EDGY_IDOLS);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.ready_steady"), RECORD_READY_STEADY);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.worldnostart"), RECORD_WORLDNOSTART);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.kuyamutokaitemirai"), RECORD_KUYAMUTOKAITEMIRAI);

		// SEKAI movie song fucking thing I hate registries
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.story"), RECORD_STORY);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.fun"), RECORD_FUN);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.fire_dance"), RECORD_FIRE_DANCE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.smile_symphony"), RECORD_SMILE_SYMPHONY);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.light_dwell"), RECORD_LIGHT_DWELL);

		// Block registry events
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "block.drive.spinning"), BLOCK_DRIVE_SPINNING);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "block.drive.eject"), BLOCK_DRIVE_EJECT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "block.drive.close"), BLOCK_DRIVE_CLOSE);

		// this fucking thing
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "tf2_crit"), TF2_CRIT);

		// SEKAI BGM Registry Events
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "school_sekai"), SCHOOL_SEKAI);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "stage_sekai"), STAGE_SEKAI);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "street_sekai"), STREET_SEKAI);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "wonderland_sekai"), WONDERLAND_SEKAI);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "empty_sekai"), EMPTY_SEKAI);
	}
}
