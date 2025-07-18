
package net.coutman.welcomekitajima.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.coutman.welcomekitajima.procedures.TeleportToAndFromEmptySEKAIProcedure;
import net.coutman.welcomekitajima.init.WelcomekitajimaModTabs;

import java.util.List;

public class KuyamuItem extends Item {
	public KuyamuItem() {
		super(new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON));
		ItemGroupEvents.modifyEntriesEvent(WelcomekitajimaModTabs.TAB_CDS).register(content -> content.add(this));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendTooltip(ItemStack itemstack, World world, List<Text> list, TooltipContext flag) {
		super.appendTooltip(itemstack, world, list, flag);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity entity, Hand hand) {
		TypedActionResult<ItemStack> ar = super.use(world, entity, hand);
		TeleportToAndFromEmptySEKAIProcedure.execute(entity, ar.getValue());
		return ar;
	}
}
