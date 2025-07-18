
package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.init.WelcomekitajimaModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.sounds.SoundEvent;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.coutman.welcomekitajima.init.WelcomekitajimaModTabs;

import java.util.List;


public class HaguItem extends RecordItem {
	public HaguItem() {
		super(
				0, // comparator output
				WelcomekitajimaModSounds.RECORD_HAGU,
				new FabricItemSettings()
						.maxCount(1)
						.rarity(Rarity.RARE),
				2022 // track length in ticks
		);
		ItemGroupEvents.modifyEntriesEvent(WelcomekitajimaModTabs.TAB_CDS).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag context) {
		super.appendHoverText(stack, world, tooltip, context);
	}
}
