package net.coutman.welcomekitajima.item;

// Imports

import net.coutman.welcomekitajima.init.WelcomekitajimaModSounds;
import net.coutman.welcomekitajima.init.WelcomekitajimaModTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class JokerItem extends RecordItem {
    public JokerItem() {
        super(
                0, // Comparator output
                WelcomekitajimaModSounds.RECORD_JOKER, // Sound event
                new FabricItemSettings()
                        .maxCount(1) // Max amount of an item stack
                        .rarity(Rarity.RARE), // Item rarity
                2842 // Length in ticks
        );
        ItemGroupEvents.modifyEntriesEvent(WelcomekitajimaModTabs.TAB_CDS).register(content -> content.accept(this));
    }

    @Override
    public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag context) {
        super.appendHoverText(stack, world, tooltip, context);
    }
}
