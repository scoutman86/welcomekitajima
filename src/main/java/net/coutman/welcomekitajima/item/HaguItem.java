
package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.init.SoundRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.coutman.welcomekitajima.init.CreativeTabRegistry;

import java.util.List;


public class HaguItem extends RecordItem {
	public HaguItem() {
		super(
				0, // comparator output
				SoundRegistry.RECORD_HAGU,
				new FabricItemSettings()
						.maxCount(1)
						.rarity(Rarity.RARE),
				2022 // track length in ticks
		);
		ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.TAB_CDS).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag context) {
		super.appendHoverText(stack, world, tooltip, context);
	}
}
