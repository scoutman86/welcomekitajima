
package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.init.WelcomekitajimaModSounds;
import net.coutman.welcomekitajima.init.WelcomekitajimaModTabs;
import net.coutman.welcomekitajima.procedures.TeleportToAndFromSchoolSEKAIProcedure;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class NeedleItem extends RecordItem {
	public NeedleItem() {
		super(0, // comparator output
				WelcomekitajimaModSounds.RECORD_NEEDLE,
				new FabricItemSettings()
						.maxCount(1)
						.rarity(Rarity.EPIC),
				2022 // track length in ticks
		);
		ItemGroupEvents.modifyEntriesEvent(WelcomekitajimaModTabs.TAB_CDS).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		TeleportToAndFromSchoolSEKAIProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
