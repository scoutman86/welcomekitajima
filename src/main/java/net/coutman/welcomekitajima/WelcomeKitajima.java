package net.coutman.welcomekitajima;

import net.coutman.welcomekitajima.init.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.api.ModInitializer;

public class WelcomeKitajima implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "welcomekitajima";
	public static final Boolean IncludeExperimentalElementalFeatures = true;

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
		ServerLifecycleEvents.SERVER_STARTING.register(BiomeRegistry::load);
	}
}
