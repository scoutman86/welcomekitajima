package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.init.SoundRegistry;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class ZundamonFightItem extends RecordItem {
    public ZundamonFightItem() {
        super(
                0,
                SoundRegistry.RECORD_ZUNDAMON_FIGHT,
                new FabricItemSettings()
                        .maxCount(1)
                        .rarity(Rarity.EPIC),
                3224
        );
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.TAB_CDS).register(content -> content.accept(this));
    }
}
