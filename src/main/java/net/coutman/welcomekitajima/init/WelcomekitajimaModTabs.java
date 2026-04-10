
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.coutman.welcomekitajima.WelcomekitajimaMod;

public class WelcomekitajimaModTabs {
	public static ResourceKey<CreativeModeTab> TAB_CDS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(WelcomekitajimaMod.MODID, "cds"));
	public static ResourceKey<CreativeModeTab> TAB_SPECIALTIES = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(WelcomekitajimaMod.MODID, "specialties"));
	public static ResourceKey<CreativeModeTab> TAB_BOSS_DROPS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(WelcomekitajimaMod.MODID, "boss_drops"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CDS,
				FabricItemGroup.builder().title(Component.translatable("item_group.welcomekitajima.cds")).icon(() -> new ItemStack(WelcomekitajimaModItems.BLANK_COMPACT_DISC)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_SPECIALTIES,
				FabricItemGroup.builder().title(Component.translatable("item_group.welcomekitajima.specialties")).icon(() -> new ItemStack(WelcomekitajimaModItems.KNUCKLE_SANDWICH)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_BOSS_DROPS,
				FabricItemGroup.builder().title(Component.translatable("item_group.welcomekitajima.boss_drops")).icon(() -> new ItemStack(WelcomekitajimaModItems.PROJECTION_PYRO_DROP)).build());
	}
}
