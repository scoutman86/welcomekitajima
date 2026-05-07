package net.coutman.welcomekitajima;

import net.coutman.welcomekitajima.init.*;
// import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.api.ModInitializer;

public class WelcomeKitajima implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "welcomekitajima";

	@Override
	public void onInitialize() {
		LOGGER.info("Water comes in many flavors to the discerning palate.");
		CreativeTabRegistry.load();

		BlockRegistry.load();
		ItemRegistry.load();

		PaintingRegistry.load();
		ProcedureRegistry.load();

		SoundRegistry.load();
		BannerPatternRegistry.load();

		BiomeRegistry.loadEndBiomes();
		LOGGER.info("Mondstadt's water is crisp and pure, while water from Liyue has an enduring aftertaste.");
		// commented out because we don't need dazzle replacements anymore
		/*
		if (FabricLoader.getInstance().isModLoaded("dazzle")) {
			LOGGER.info("Dazzle 2 is loaded, so the new textures will take priority.");
		} else {
			LOGGER.info("Dazzle 2 is not loaded, so the new textures will go unused.");
		}
		*/
		ServerLifecycleEvents.SERVER_STARTING.register(BiomeRegistry::load);
	}
}
