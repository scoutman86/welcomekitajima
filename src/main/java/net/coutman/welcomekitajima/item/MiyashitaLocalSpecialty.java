package net.coutman.welcomekitajima.item;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.init.CreativeTabRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

public class MiyashitaLocalSpecialty extends Item {
    public record LocalSpecialties(String specialtyName, Rarity rarity) {
        public Item.Properties getProperties() {
            return new Properties();
        }
    }

    public MiyashitaLocalSpecialty(Properties properties) {
        super(properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeTabRegistry.SMITHING_CRAFTING_ITEMS).register(content -> content.accept(this));
    }

    public static final List<LocalSpecialties> LOCAL_SPECIALTIES = List.of(
            new LocalSpecialties("stardust", Rarity.UNCOMMON),
            new LocalSpecialties("starbit", Rarity.RARE),
            new LocalSpecialties("miyashita_sakura", Rarity.UNCOMMON)
    );

    public static void register() {
        for (LocalSpecialties entry : LOCAL_SPECIALTIES) {
            Item item = new MiyashitaLocalSpecialty(entry.getProperties());
            Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WelcomeKitajima.MODID, entry.specialtyName), item);
        }
    }
}
