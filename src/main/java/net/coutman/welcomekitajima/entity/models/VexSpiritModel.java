package net.coutman.welcomekitajima.entity.models;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.item.ItemStack;

public class VexSpiritModel<T extends net.minecraft.world.entity.animal.allay.Allay> extends net.minecraft.client.model.HierarchicalModel<T> {
    private final ModelPart root;
    private final ModelPart body;
    private final ModelPart rightArm;
    private final ModelPart leftArm;
    private final ModelPart rightWing;
    private final ModelPart leftWing;
    private final ModelPart head;

    public VexSpiritModel(ModelPart $$0) {
        super(RenderType::entityTranslucent);
        this.root = $$0.getChild("root");
        this.body = this.root.getChild("body");
        this.rightArm = this.body.getChild("right_arm");
        this.leftArm = this.body.getChild("left_arm");
        this.rightWing = this.body.getChild("right_wing");
        this.leftWing = this.body.getChild("left_wing");
        this.head = this.root.getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition $$0 = new MeshDefinition();
        PartDefinition $$1 = $$0.getRoot();
        PartDefinition $$2 = $$1.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, 0.0F));
        $$2.addOrReplaceChild(
                "head",
                CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 20.0F, 0.0F)
        );
        PartDefinition $$3 = $$2.addOrReplaceChild(
                "body",
                CubeListBuilder.create()
                        .texOffs(0, 10)
                        .addBox(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 16)
                        .addBox(-1.5F, 1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)),
                PartPose.offset(0.0F, 20.0F, 0.0F)
        );
        $$3.addOrReplaceChild(
                "right_arm",
                CubeListBuilder.create().texOffs(23, 0).addBox(-1.25F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)),
                PartPose.offset(-1.75F, 0.25F, 0.0F)
        );
        $$3.addOrReplaceChild(
                "left_arm",
                CubeListBuilder.create().texOffs(23, 6).addBox(-0.75F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)),
                PartPose.offset(1.75F, 0.25F, 0.0F)
        );
        $$3.addOrReplaceChild(
                "left_wing",
                CubeListBuilder.create().texOffs(16, 14).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(0.5F, 1.0F, 1.0F)
        );
        $$3.addOrReplaceChild(
                "right_wing",
                CubeListBuilder.create().texOffs(16, 14).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.5F, 1.0F, 1.0F)
        );
        return LayerDefinition.create($$0, 32, 32);
    }

    public void setupAnim(Allay $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.head.yRot = $$4 * (float) (Math.PI / 180.0);
        this.head.xRot = $$5 * (float) (Math.PI / 180.0);
        float $$6 = Mth.cos($$3 * 5.5F * (float) (Math.PI / 180.0)) * 0.1F;
        this.rightArm.zRot = (float) (Math.PI / 5) + $$6;
        this.leftArm.zRot = -((float) (Math.PI / 5) + $$6);
        /*
        if ($$0.isCharging()) {
            this.body.xRot = 0.0F;
            this.setArmsCharging($$0.getMainHandItem(), $$0.getOffhandItem(), $$6);
        } else {
            this.body.xRot = (float) (Math.PI / 20);
        }
         */

        this.leftWing.yRot = 1.0995574F + Mth.cos($$3 * 45.836624F * (float) (Math.PI / 180.0)) * (float) (Math.PI / 180.0) * 16.2F;
        this.rightWing.yRot = -this.leftWing.yRot;
        this.leftWing.xRot = 0.47123888F;
        this.leftWing.zRot = -0.47123888F;
        this.rightWing.xRot = 0.47123888F;
        this.rightWing.zRot = 0.47123888F;
    }

    private void setArmsCharging(ItemStack $$0, ItemStack $$1, float $$2) {
        if ($$0.isEmpty() && $$1.isEmpty()) {
            this.rightArm.xRot = -1.2217305F;
            this.rightArm.yRot = (float) (Math.PI / 12);
            this.rightArm.zRot = -0.47123888F - $$2;
            this.leftArm.xRot = -1.2217305F;
            this.leftArm.yRot = (float) (-Math.PI / 12);
            this.leftArm.zRot = 0.47123888F + $$2;
        } else {
            if (!$$0.isEmpty()) {
                this.rightArm.xRot = (float) (Math.PI * 7.0 / 6.0);
                this.rightArm.yRot = (float) (Math.PI / 12);
                this.rightArm.zRot = -0.47123888F - $$2;
            }

            if (!$$1.isEmpty()) {
                this.leftArm.xRot = (float) (Math.PI * 7.0 / 6.0);
                this.leftArm.yRot = (float) (-Math.PI / 12);
                this.leftArm.zRot = 0.47123888F + $$2;
            }
        }
    }

    @Override
    public ModelPart root() {
        return this.root;
    }

    public void translateToHand(HumanoidArm $$0, PoseStack $$1) {
        boolean $$2 = $$0 == HumanoidArm.RIGHT;
        ModelPart $$3 = $$2 ? this.rightArm : this.leftArm;
        this.root.translateAndRotate($$1);
        this.body.translateAndRotate($$1);
        $$3.translateAndRotate($$1);
        $$1.scale(0.55F, 0.55F, 0.55F);
        this.offsetStackPosition($$1, $$2);
    }

    private void offsetStackPosition(PoseStack $$0, boolean $$1) {
        if ($$1) {
            $$0.translate(0.046875, -0.15625, 0.078125);
        } else {
            $$0.translate(-0.046875, -0.15625, 0.078125);
        }
    }
}
