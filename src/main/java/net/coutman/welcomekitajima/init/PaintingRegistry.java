
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PaintingRegistry {
	public static void load() {
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WelcomeKitajima.MODID, "bob_omb_battlefield"), new PaintingVariant(64, 64));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WelcomeKitajima.MODID, "whomps_fortress"), new PaintingVariant(64, 64));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WelcomeKitajima.MODID, "tall_tall_mountain"), new PaintingVariant(64, 64));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WelcomeKitajima.MODID, "watashi_wa_ame"), new PaintingVariant(64, 48));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WelcomeKitajima.MODID, "emu_is_meaning_smile"), new PaintingVariant(128, 128));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WelcomeKitajima.MODID, "mario_luigi"), new PaintingVariant(32, 32));
	}
}
