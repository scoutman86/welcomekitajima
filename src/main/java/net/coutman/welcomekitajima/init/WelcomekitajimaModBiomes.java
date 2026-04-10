
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;

import net.coutman.welcomekitajima.WelcomekitajimaMod;

public class WelcomekitajimaModBiomes {
	public static ResourceKey<Biome> EMPTY_SEKAI = ResourceKey.create(Registries.BIOME, new ResourceLocation(WelcomekitajimaMod.MODID, "empty_sekai"));
	// Kitajima Prefecture
	public static ResourceKey<Biome> KITAJIMA_PREFECTURE = ResourceKey.create(
			Registries.BIOME, new ResourceLocation(WelcomekitajimaMod.MODID, "kitajima_prefecture")
	);
	public static ResourceKey<Biome> KAZAGURUMA_ARCHIPELAGO = ResourceKey.create(
			Registries.BIOME, new ResourceLocation(WelcomekitajimaMod.MODID, "kazaguruma_archipelago")
	);
	// Miyashita Prefecture
	public static ResourceKey<Biome> MIYASHITA_PREFECTURE = ResourceKey.create(
			Registries.BIOME, new ResourceLocation(WelcomekitajimaMod.MODID, "miyashita_prefecture")
	);
	// Hanasato Prefecture
	public static ResourceKey<Biome> HANASATO_PREFECTURE = ResourceKey.create(
			Registries.BIOME, new ResourceLocation(WelcomekitajimaMod.MODID, "hanasato_prefecture")
	);

	public static void loadEndBiomes() {
	}

	public static void load(MinecraftServer server) {
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registries.DIMENSION_TYPE);
		Registry<LevelStem> levelStemTypeRegistry = server.registryAccess().registryOrThrow(Registries.LEVEL_STEM);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registries.BIOME);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.type().value();

		}
	}
}
