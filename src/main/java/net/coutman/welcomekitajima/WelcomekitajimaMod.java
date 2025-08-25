package net.coutman.welcomekitajima;

import net.coutman.welcomekitajima.init.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.api.ModInitializer;

public class WelcomekitajimaMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "welcomekitajima";

	@Override
	public void onInitialize() {
		LOGGER.info("Hi there. I have no idea what to put here, but if you see this, chances are you're good to go.");

		WelcomekitajimaModTabs.load();

		WelcomekitajimaModBlocks.load();
		WelcomekitajimaModItems.load();

		WelcomekitajimaModPaintings.load();
		WelcomekitajimaModProcedures.load();

		WelcomekitajimaModSounds.load();

		WelcomekitajimaModBiomes.loadEndBiomes();
		ServerLifecycleEvents.SERVER_STARTING.register((server) -> {
			WelcomekitajimaModBiomes.load(server);
		});
	}
}
