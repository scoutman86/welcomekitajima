package net.coutman.welcomekitajima.item.specialty;

import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CitlaliTataco extends Item {
    public CitlaliTataco() {
        super(
            new FabricItemSettings()
                    .food(
                            new FoodProperties.Builder()
                                    .nutrition(3)
                                    .saturationMod(0.5f)
                                    .build())
                    .rarity(Rarity.UNCOMMON)
        );
        ItemGroupEvents.modifyEntriesEvent(
                CreativeTabRegistry.TAB_SPECIALTIES
        ).register(content -> content.accept(this));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("itemTooltip.welcomekitajima.secret_art").withStyle(ChatFormatting.GRAY));
    }
}
