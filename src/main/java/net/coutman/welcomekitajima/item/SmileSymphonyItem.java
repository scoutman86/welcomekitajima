
package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.init.WelcomekitajimaModSounds;
import net.coutman.welcomekitajima.init.WelcomekitajimaModTabs;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import java.util.List;

public class SmileSymphonyItem extends RecordItem {
	public SmileSymphonyItem() {
		super(
				0, // comparator output
				WelcomekitajimaModSounds.RECORD_SMILE_SYMPHONY,
				new FabricItemSettings()
						.maxCount(1)
						.rarity(Rarity.EPIC),
				4629 // track length in ticks
		);
		ItemGroupEvents.modifyEntriesEvent(WelcomekitajimaModTabs.TAB_CDS).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
