package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class SoundRegistry {
	public static final SoundEvent CATALYST_SHOOT = SoundEvent.createVariableRangeEvent(new ResourceLocation(WelcomeKitajima.MODID, "item.catalyst.shoot"));

	public static void load() {
		Registry.register(
				BuiltInRegistries.SOUND_EVENT,
				new ResourceLocation(WelcomeKitajima.MODID, "item.catalyst.shoot"),
				CATALYST_SHOOT

		);
	}
}
