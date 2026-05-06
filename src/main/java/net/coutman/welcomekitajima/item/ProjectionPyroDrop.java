package net.coutman.welcomekitajima.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ProjectionPyroDrop extends Item {
    public ProjectionPyroDrop() {
        super(
                new FabricItemSettings()
                        .rarity(Rarity.EPIC)
                        .maxCount(1)
        );
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.TAB_BOSS_DROPS).register(content -> content.accept(this));
    }
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("itemTooltip.welcomekitajima.projection_pyro_drop").withStyle(ChatFormatting.GRAY));
    }
}
