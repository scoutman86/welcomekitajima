
package net.coutman.welcomekitajima.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.coutman.welcomekitajima.procedures.TeleportToAndFromEmptySEKAIProcedure;
import net.coutman.welcomekitajima.init.WelcomekitajimaModTabs;

import java.util.List;

public class KuyamuItem extends Item {
	public KuyamuItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
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
		TeleportToAndFromEmptySEKAIProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
