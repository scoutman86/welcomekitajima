package net.coutman.welcomekitajima.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class WishPieceItem extends Item {
    public WishPieceItem() {
        super(
            new FabricItemSettings()
                    .rarity(Rarity.UNCOMMON)
        );
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(content -> content.accept(this));
    }
}
