/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.coutman.welcomekitajima;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.api.ModInitializer;

import net.coutman.welcomekitajima.init.WelcomekitajimaModTabs;
import net.coutman.welcomekitajima.init.WelcomekitajimaModSounds;
import net.coutman.welcomekitajima.init.WelcomekitajimaModProcedures;
import net.coutman.welcomekitajima.init.WelcomekitajimaModPaintings;
import net.coutman.welcomekitajima.init.WelcomekitajimaModItems;
import net.coutman.welcomekitajima.init.WelcomekitajimaModBlocks;
import net.coutman.welcomekitajima.init.WelcomekitajimaModBiomes;

public class WelcomekitajimaMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "welcomekitajima";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing WelcomekitajimaMod");

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
