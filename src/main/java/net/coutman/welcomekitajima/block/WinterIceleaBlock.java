package net.coutman.welcomekitajima.block;

import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.effect.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.Collections;
import java.util.List;

public class WinterIceleaBlock extends FlowerBlock {
    public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of()
            .ignitedByLava()
            .sound(SoundType.GRASS)
            .noOcclusion()
            .noCollission();

    public WinterIceleaBlock() {
        super(MobEffects.DAMAGE_RESISTANCE, 0, PROPERTIES);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
