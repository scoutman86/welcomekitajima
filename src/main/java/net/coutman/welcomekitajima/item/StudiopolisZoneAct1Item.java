
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

public class StudiopolisZoneAct1Item extends RecordItem {
	public StudiopolisZoneAct1Item() {
		super(
				0, // comparator output
				SoundRegistry.RECORD_STUDIOPOLISZONE_ACT1,
				new FabricItemSettings()
						.maxCount(1)
						.rarity(Rarity.COMMON),
		2000
		);
		ItemGroupEvents.modifyEntriesEvent(
				CreativeTabRegistry.TAB_CDS
		).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
