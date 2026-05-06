package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.init.SoundRegistry;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import java.util.List;

public class SMB3OverworldSMASItem extends RecordItem {
	public SMB3OverworldSMASItem() {
		super(
				0, // comparator output
				SoundRegistry.RECORD_SMB3_OVERWORLD_SMAS,
				new FabricItemSettings()
						.maxCount(1)
						.rarity(Rarity.COMMON),
				2022 // track length in ticks
		);
		ItemGroupEvents.modifyEntriesEvent(
				CreativeTabRegistry.TAB_CDS
		).register(content -> content.accept(this));
	}


	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
