
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.coutman.welcomekitajima.WelcomekitajimaMod;

public class WelcomekitajimaModTabs {
	public static RegistryKey<ItemGroup> TAB_CDS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(WelcomekitajimaMod.MODID, "cds"));

	public static void load() {
		Registry.register(Registries.ITEM_GROUP, TAB_CDS,
				FabricItemGroup.builder().displayName(Text.translatable("item_group." + WelcomekitajimaMod.MODID + ".cds")).icon(() -> new ItemStack(WelcomekitajimaModBlocks.EMPTY_SEKAI_TRUSS)).build());
	}
}
