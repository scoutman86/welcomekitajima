package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SoulFragmentDrop extends Item {
    public SoulFragmentDrop() {
        super(
                new FabricItemSettings()
                        .rarity(Rarity.EPIC)
                        .maxCount(1)
        );
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.TAB_BOSS_DROPS).register(content -> content.accept(this));
    }

    public static Item SOUL_FRAGMENT_DROP;

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("itemTooltip.welcomekitajima.soul_fragment_drop").withStyle(ChatFormatting.GRAY));
    }

    public static void register() {
        SOUL_FRAGMENT_DROP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, "soul_fragment_drop"), new SoulFragmentDrop());
    }
}
