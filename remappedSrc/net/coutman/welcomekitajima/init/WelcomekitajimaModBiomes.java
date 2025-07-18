
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.coutman.welcomekitajima.WelcomekitajimaMod;

public class WelcomekitajimaModBiomes {
	public static RegistryKey<Biome> EMPTY_SEKAI = RegistryKey.of(RegistryKeys.BIOME, new Identifier(WelcomekitajimaMod.MODID, "empty_sekai"));

	public static void loadEndBiomes() {
	}

	public static void load(MinecraftServer server) {
		Registry<DimensionType> dimensionTypeRegistry = server.getRegistryManager().get(RegistryKeys.DIMENSION_TYPE);
		Registry<DimensionOptions> levelStemTypeRegistry = server.getRegistryManager().get(RegistryKeys.DIMENSION);
		Registry<Biome> biomeRegistry = server.getRegistryManager().get(RegistryKeys.BIOME);
		for (DimensionOptions levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.dimensionTypeEntry().value();

		}
	}
}
