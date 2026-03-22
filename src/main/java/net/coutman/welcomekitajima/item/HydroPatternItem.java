package net.coutman.welcomekitajima.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BannerPatternItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.entity.BannerPattern;

public class HydroPatternItem extends BannerPatternItem {
    private static final TagKey<BannerPattern> HYDRO_PATTERN_TAG = TagKey.create(
            Registries.BANNER_PATTERN,
            new ResourceLocation("welcomekitajima", "hydro")
    );

    public HydroPatternItem() {
        super(HYDRO_PATTERN_TAG,
                new FabricItemSettings().maxCount(1));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(content -> content.accept(this));
    }
}