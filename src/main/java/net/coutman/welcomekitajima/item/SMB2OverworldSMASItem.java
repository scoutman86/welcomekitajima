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

public class SMB2OverworldSMASItem extends RecordItem {

    public SMB2OverworldSMASItem() {
        super(
            0, // comparator output
            WelcomekitajimaModSounds.RECORD_SMB2_OVERWORLD_SMAS,
            new FabricItemSettings()
                .maxCount(1)
                .rarity(Rarity.COMMON),
            2022 // track length in ticks
        );
        ItemGroupEvents.modifyEntriesEvent(
                WelcomekitajimaModTabs.TAB_CDS
        ).register(content -> content.accept(this));
    }

    @Override
    public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag context) {
        super.appendHoverText(stack, world, tooltip, context);
    }
}
