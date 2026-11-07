package net.coutman.welcomekitajima.enchantment;

import net.coutman.welcomekitajima.item.CatalystWeapon;
import net.coutman.welcomekitajima.item.PolearmWeapon;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class FanfareEnchantment extends Enchantment {
    public FanfareEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    public static final Enchantment FANFARE = new FanfareEnchantment();

    @Override
    public boolean canEnchant(ItemStack itemStack) {
        return itemStack.getItem() instanceof CatalystWeapon || itemStack.getItem() instanceof PolearmWeapon;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void doPostAttack(LivingEntity livingEntity, Entity entity, int i) {
        super.doPostAttack(livingEntity, entity, i);
    }
}
