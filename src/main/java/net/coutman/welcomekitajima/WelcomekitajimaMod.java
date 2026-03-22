package net.coutman.welcomekitajima;

import net.coutman.welcomekitajima.init.*;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.api.ModInitializer;

public class WelcomekitajimaMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "welcomekitajima";

	@Override
	public void onInitialize() {
		LOGGER.info("Stuff's going, give it a moment.");
		WelcomekitajimaModTabs.load();

		WelcomekitajimaModBlocks.load();
		WelcomekitajimaModItems.load();

		WelcomekitajimaModPaintings.load();
		WelcomekitajimaModProcedures.load();

		WelcomekitajimaModSounds.load();
		RegisterBannerPatterns.load();

		WelcomekitajimaModBiomes.loadEndBiomes();
		LOGGER.info("Hi there. I have no idea what to put here, but if you see this, chances are you're good to go.");
		if (FabricLoader.getInstance().isModLoaded("dazzle")) {
			LOGGER.info("Dazzle 2 is loaded, so the new textures will take priority.");
		} else {
			LOGGER.info("Dazzle 2 is not loaded, so the new textures will go unused.");
		}
		ServerLifecycleEvents.SERVER_STARTING.register(WelcomekitajimaModBiomes::load);
	}
}
