package net.coutman.welcomekitajima.mixins;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;
import java.util.ArrayList;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RepairItemRecipe;
import net.minecraft.registry.DynamicRegistryManager;
import com.google.common.collect.Lists;

@Mixin(RepairItemRecipe.class)
public abstract class WelcomekitajimaModRepairItemRecipeMixin {
	@Inject(method = "assemble", at = @At("HEAD"), cancellable = true)
	public void assemble(RecipeInputInventory craftingContainer, DynamicRegistryManager registryAccess, CallbackInfoReturnable<ItemStack> cir) {
		ItemStack itemStack3;
		ItemStack itemStack;
		ArrayList<ItemStack> list = Lists.newArrayList();
		for (int i = 0; i < craftingContainer.size(); ++i) {
			ItemStack itemStack2;
			itemStack = craftingContainer.getStack(i);
			if (itemStack.isEmpty())
				continue;
			list.add(itemStack);
		}
	}
}
