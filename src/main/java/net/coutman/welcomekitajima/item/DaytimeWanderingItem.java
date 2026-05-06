package net.coutman.welcomekitajima.item;

// Imports

import net.coutman.welcomekitajima.init.SoundRegistry;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class DaytimeWanderingItem extends RecordItem {
    public DaytimeWanderingItem() {
        super(
            0, // Comparator output
            SoundRegistry.RECORD_DAYTIME_WANDERING, // Sound event
            new FabricItemSettings()
                .maxCount(1) // Max amount of an item stack
                .rarity(Rarity.UNCOMMON), // Item rarity
            1441 // Length in ticks
        );
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.TAB_CDS).register(content -> content.accept(this));
}
    @Override
    public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag context) {
        super.appendHoverText(stack, world, tooltip, context);
    }
}
