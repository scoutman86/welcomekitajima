package net.coutman.welcomekitajima;

import net.coutman.welcomekitajima.init.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.api.ModInitializer;

import static net.coutman.welcomekitajima.enchantment.FanfareEnchantment.FANFARE;

public class WelcomeKitajima implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "welcomekitajima";
	public static final Boolean IncludeExperimentalElementalFeatures = true;

	@Override
	public void onInitialize() {
		LOGGER.info("Welcome to Kitajima!");
		CreativeTabRegistry.load();
		WoodRegistry.registerWoodTypes();
		BlockRegistry.load();
		ItemRegistry.load();
		EntityRegistry.load();
		PaintingRegistry.load();
		SoundRegistry.load();
		BannerPatternRegistry.load();
		BiomeRegistry.loadEndBiomes();
		Registry.register(BuiltInRegistries.ENCHANTMENT, new ResourceLocation(WelcomeKitajima.MODID, "fanfare"), FANFARE);
		ServerLifecycleEvents.SERVER_STARTING.register(BiomeRegistry::load);
	}
}
