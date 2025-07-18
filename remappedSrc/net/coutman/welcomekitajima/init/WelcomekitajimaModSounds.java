
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class WelcomekitajimaModSounds {
	public static SoundEvent RECORD_STUDIOPOLISZONE_ACT1 = SoundEvent.of(new Identifier("welcomekitajima", "record.studiopoliszone.act1"));
	public static SoundEvent BLOCK_DRIVE_SPINNING = SoundEvent.of(new Identifier("welcomekitajima", "block.drive.spinning"));
	public static SoundEvent RECORD_KUYAMUTOKAITEMIRAI = SoundEvent.of(new Identifier("welcomekitajima", "record.kuyamutokaitemirai"));
	public static SoundEvent BLOCK_DRIVE_EJECT = SoundEvent.of(new Identifier("welcomekitajima", "block.drive.eject"));
	public static SoundEvent BLOCK_DRIVE_CLOSE = SoundEvent.of(new Identifier("welcomekitajima", "block.drive.close"));
	public static SoundEvent RECORD_HAGU = SoundEvent.of(new Identifier("welcomekitajima", "record.hagu"));
	public static SoundEvent MUSIC_FOOD_MART = SoundEvent.of(new Identifier("welcomekitajima", "music.food_mart"));
	public static SoundEvent MUSIC_INTERIOR_SHOP = SoundEvent.of(new Identifier("welcomekitajima", "music.interior_shop"));
	public static SoundEvent TF2_CRIT = SoundEvent.of(new Identifier("welcomekitajima", "tf2_crit"));
	public static SoundEvent RECORD_TURNPIKE = SoundEvent.of(new Identifier("welcomekitajima", "record.turnpike"));
	public static SoundEvent RECORD_SMB2_OVERWORLD_SMAS = SoundEvent.of(new Identifier("welcomekitajima", "record.smb2_overworld_smas"));
	public static SoundEvent RECORD_SMB3_OVERWORLD_SMAS = SoundEvent.of(new Identifier("welcomekitajima", "record.smb3_overworld_smas"));
	public static SoundEvent RECORD_STORY = SoundEvent.of(new Identifier("welcomekitajima", "record.story"));
	public static SoundEvent RECORD_SPECIALZONE = SoundEvent.of(new Identifier("welcomekitajima", "record.specialzone"));
	public static SoundEvent RECORD_STUDIOPOLISCOMPLEX_CALM = SoundEvent.of(new Identifier("welcomekitajima", "record.studiopoliscomplex_calm"));
	public static SoundEvent RECORD_SMILE_SYMPHONY = SoundEvent.of(new Identifier("welcomekitajima", "record.smile_symphony"));
	public static SoundEvent EMPTY_SEKAI = SoundEvent.of(new Identifier("welcomekitajima", "empty_sekai"));

	public static void load() {
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "record.studiopoliszone.act1"), RECORD_STUDIOPOLISZONE_ACT1);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "block.drive.spinning"), BLOCK_DRIVE_SPINNING);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "record.kuyamutokaitemirai"), RECORD_KUYAMUTOKAITEMIRAI);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "block.drive.eject"), BLOCK_DRIVE_EJECT);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "block.drive.close"), BLOCK_DRIVE_CLOSE);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "record.hagu"), RECORD_HAGU);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "music.food_mart"), MUSIC_FOOD_MART);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "music.interior_shop"), MUSIC_INTERIOR_SHOP);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "tf2_crit"), TF2_CRIT);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "record.turnpike"), RECORD_TURNPIKE);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "record.smb2_overworld_smas"), RECORD_SMB2_OVERWORLD_SMAS);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "record.smb3_overworld_smas"), RECORD_SMB3_OVERWORLD_SMAS);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "record.story"), RECORD_STORY);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "record.specialzone"), RECORD_SPECIALZONE);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "record.studiopoliscomplex.calm"), RECORD_STUDIOPOLISCOMPLEX_CALM);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "record.smile_symphony"), RECORD_SMILE_SYMPHONY);
		Registry.register(Registries.SOUND_EVENT, new Identifier("welcomekitajima", "empty_sekai"), EMPTY_SEKAI);
	}
}
