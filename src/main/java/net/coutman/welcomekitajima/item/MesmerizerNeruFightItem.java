package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.init.WelcomekitajimaModSounds;
import net.coutman.welcomekitajima.init.WelcomekitajimaModTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class MesmerizerNeruFightItem extends RecordItem {
    public MesmerizerNeruFightItem() {
        super(
                0,
                WelcomekitajimaModSounds.RECORD_MESMERIZER_NERU_FIGHT,
                new FabricItemSettings()
                        .maxCount(1)
                        .rarity(Rarity.EPIC),
                4192
        );
        ItemGroupEvents.modifyEntriesEvent(WelcomekitajimaModTabs.TAB_CDS).register(content -> content.accept(this));
    }
}
