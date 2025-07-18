package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.init.WelcomekitajimaModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import java.util.List;

public class SMB2OverworldSMASItem extends MusicDiscItem {

    public SMB2OverworldSMASItem() {
        super(
            0, // comparator output
            WelcomekitajimaModSounds.RECORD_SMB2_OVERWORLD_SMAS,
            new FabricItemSettings()
                .maxCount(1)
                .rarity(Rarity.COMMON),
            2022 // track length in ticks
        );
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Super Mario Bros. 2 Overworld (SMAS) - Soyo Oka"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
