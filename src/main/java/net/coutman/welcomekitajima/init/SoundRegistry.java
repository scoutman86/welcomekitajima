package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.block.LabyrinthStoneBlockFamily;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class SoundRegistry {
	public static final SoundEvent CATALYST_SHOOT = SoundEvent.createVariableRangeEvent(new ResourceLocation(WelcomeKitajima.MODID, "item.catalyst.shoot"));
	public static final SoundEvent LABYRINTH_GUITAR = SoundEvent.createVariableRangeEvent(new ResourceLocation(WelcomeKitajima.MODID, "block.note_block.labyrinth_guitar"));

	public static void load() {
		Registry.register(
				BuiltInRegistries.SOUND_EVENT,
				new ResourceLocation(WelcomeKitajima.MODID, "item.catalyst.shoot"),
				CATALYST_SHOOT
		);
		Registry.register(
				BuiltInRegistries.SOUND_EVENT,
				new ResourceLocation(WelcomeKitajima.MODID, "block.note_block.labyrinth_guitar"),
				LABYRINTH_GUITAR
		);
	}
}
