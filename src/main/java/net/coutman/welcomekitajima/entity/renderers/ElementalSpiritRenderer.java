package net.coutman.welcomekitajima.entity.renderers;

import net.coutman.welcomekitajima.WelcomeKitajima;
import net.coutman.welcomekitajima.entity.ElementalSpirit;
import net.coutman.welcomekitajima.entity.models.VexSpiritModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ElementalSpiritRenderer extends MobRenderer<ElementalSpirit, VexSpiritModel<ElementalSpirit>> {
    public ElementalSpiritRenderer(EntityRendererProvider.Context context) {
        super(context, new VexSpiritModel<>(context.bakeLayer(ModelLayers.ALLAY)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(ElementalSpirit entity) {
        String elementName = entity.getElement().name().toLowerCase();
        return new ResourceLocation(WelcomeKitajima.MODID, "textures/entity/spirit/" + elementName + ".png");
    }
}