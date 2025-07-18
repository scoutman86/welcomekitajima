
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.WelcomekitajimaMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WelcomekitajimaModPaintings {
	public static void load() {
		Registry.register(Registries.PAINTING_VARIANT, new Identifier(WelcomekitajimaMod.MODID, "bob_omb_battlefield"), new PaintingVariant(64, 64));
		Registry.register(Registries.PAINTING_VARIANT, new Identifier(WelcomekitajimaMod.MODID, "whomps_fortress"), new PaintingVariant(64, 64));
		Registry.register(Registries.PAINTING_VARIANT, new Identifier(WelcomekitajimaMod.MODID, "tall_tall_mountain"), new PaintingVariant(64, 64));
		Registry.register(Registries.PAINTING_VARIANT, new Identifier(WelcomekitajimaMod.MODID, "watashi_wa_ame"), new PaintingVariant(64, 48));
		Registry.register(Registries.PAINTING_VARIANT, new Identifier(WelcomekitajimaMod.MODID, "emu_is_meaning_smile"), new PaintingVariant(128, 128));
		Registry.register(Registries.PAINTING_VARIANT, new Identifier(WelcomekitajimaMod.MODID, "mario_luigi"), new PaintingVariant(32, 32));
	}
}
