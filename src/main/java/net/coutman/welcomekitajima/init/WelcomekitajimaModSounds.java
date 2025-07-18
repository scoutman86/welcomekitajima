
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class WelcomekitajimaModSounds {
	public static SoundEvent RECORD_STUDIOPOLISZONE_ACT1 = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.studiopoliszone.act1"));
	public static SoundEvent BLOCK_DRIVE_SPINNING = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "block.drive.spinning"));
	public static SoundEvent RECORD_KUYAMUTOKAITEMIRAI = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.kuyamutokaitemirai"));
	public static SoundEvent RECORD_WORLDNOSTART = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.worldnostart"));
	public static SoundEvent BLOCK_DRIVE_EJECT = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "block.drive.eject"));
	public static SoundEvent BLOCK_DRIVE_CLOSE = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "block.drive.close"));
	public static final SoundEvent RECORD_HAGU = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.hagu"));
	public static SoundEvent MUSIC_FOOD_MART = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "music.food_mart"));
	public static SoundEvent MUSIC_INTERIOR_SHOP = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "music.interior_shop"));
	public static SoundEvent TF2_CRIT = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "tf2_crit"));
	public static SoundEvent RECORD_TURNPIKE = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.turnpike"));
	public static final SoundEvent RECORD_SMB2_OVERWORLD_SMAS = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.smb2_overworld_smas"));
	public static SoundEvent RECORD_SMB3_OVERWORLD_SMAS = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.smb3_overworld_smas"));
	public static SoundEvent RECORD_STORY = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.story"));
	public static SoundEvent RECORD_SPECIALZONE = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.specialzone"));
	public static SoundEvent RECORD_STUDIOPOLISCOMPLEX_CALM = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.studiopoliscomplex_calm"));
	public static SoundEvent RECORD_SMILE_SYMPHONY = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "record.smile_symphony"));
	public static SoundEvent EMPTY_SEKAI = SoundEvent.createVariableRangeEvent(new ResourceLocation("welcomekitajima", "empty_sekai"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.studiopoliszone.act1"), RECORD_STUDIOPOLISZONE_ACT1);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "block.drive.spinning"), BLOCK_DRIVE_SPINNING);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.kuyamutokaitemirai"), RECORD_KUYAMUTOKAITEMIRAI);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.worldnostart"), RECORD_WORLDNOSTART);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "block.drive.eject"), BLOCK_DRIVE_EJECT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "block.drive.close"), BLOCK_DRIVE_CLOSE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.hagu"), RECORD_HAGU);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "music.food_mart"), MUSIC_FOOD_MART);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "music.interior_shop"), MUSIC_INTERIOR_SHOP);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "tf2_crit"), TF2_CRIT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.turnpike"), RECORD_TURNPIKE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.smb2_overworld_smas"), RECORD_SMB2_OVERWORLD_SMAS);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.smb3_overworld_smas"), RECORD_SMB3_OVERWORLD_SMAS);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.story"), RECORD_STORY);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.specialzone"), RECORD_SPECIALZONE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.studiopoliscomplex.calm"), RECORD_STUDIOPOLISCOMPLEX_CALM);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "record.smile_symphony"), RECORD_SMILE_SYMPHONY);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("welcomekitajima", "empty_sekai"), EMPTY_SEKAI);
	}
}
