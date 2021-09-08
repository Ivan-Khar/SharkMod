// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.aqupd.sharkmod.client.model;

import com.aqupd.sharkmod.entity.SharkEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.util.math.MathHelper;

import static com.aqupd.sharkmod.utils.AqLogger.logInfo;

public class SharkEntityModel<C extends HostileEntity> extends EntityModel<SharkEntity> {
    private final ModelPart main;
    private final ModelPart head;
    private final ModelPart teeth;
    private final ModelPart teeth_r1;
    private final ModelPart teeth_r2;
    private final ModelPart teeth_r3;
    private final ModelPart teeth_r4;
    private final ModelPart teeth_r5;
    private final ModelPart teeth_r6;
    private final ModelPart teeth_r7;
    private final ModelPart teeth_r8;
    private final ModelPart teeth_r9;
    private final ModelPart teeth_r10;
    private final ModelPart mouth;
    private final ModelPart mouth_r1;
    private final ModelPart body;
    private final ModelPart body_r1;
    private final ModelPart fin;
    private final ModelPart fin_r1;
    private final ModelPart rfin;
    private final ModelPart fin_r2;
    private final ModelPart lfin;
    private final ModelPart fin_r3;
    private final ModelPart backfin;
    private final ModelPart backfin1;
    private final ModelPart backfin2;
    private final ModelPart backfin3;
    public SharkEntityModel(ModelPart root) {
        this.main = root.getChild("main");
        this.body = this.main.getChild("body");
        this.backfin = this.body.getChild("backfin");
        this.backfin1 = this.backfin.getChild("backfin1");
        this.backfin2 = this.backfin1.getChild("backfin2");
        this.backfin3 = this.backfin2.getChild("backfin3");
        this.lfin = this.body.getChild("lfin");
        this.fin_r3 = this.lfin.getChild("fin_r3");
        this.rfin = this.body.getChild("rfin");
        this.fin_r2 = this.rfin.getChild("fin_r2");
        this.fin = this.body.getChild("fin");
        this.fin_r1 = this.fin.getChild("fin_r1");
        this.body_r1 = this.body.getChild("body_r1");
        this.head = this.main.getChild("head");
        this.mouth = this.head.getChild("mouth");
        this.mouth_r1 = this.mouth.getChild("mouth_r1");
        this.teeth = this.head.getChild("teeth");
        this.teeth_r10 = this.teeth.getChild("teeth_r10");
        this.teeth_r9 = this.teeth.getChild("teeth_r9");
        this.teeth_r8 = this.teeth.getChild("teeth_r8");
        this.teeth_r7 = this.teeth.getChild("teeth_r7");
        this.teeth_r6 = this.teeth.getChild("teeth_r6");
        this.teeth_r5 = this.teeth.getChild("teeth_r5");
        this.teeth_r4 = this.teeth.getChild("teeth_r4");
        this.teeth_r3 = this.teeth.getChild("teeth_r3");
        this.teeth_r2 = this.teeth.getChild("teeth_r2");
        this.teeth_r1 = this.teeth.getChild("teeth_r1");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData modelPartData1 = modelPartData.addChild("main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,23.0F,1.0F));
        ModelPartData modelPartData2 = modelPartData1.addChild("head", ModelPartBuilder.create().uv(0,0).cuboid(-4.0F, -2.25F, -6.0F, 6.0F, 3.0F, 6.0F).uv(0,16).cuboid(-4.0F, -1.35F, -8.0F, 6.0F, 2.0F, 2.0F).uv(18,62).cuboid(-1.15F, -1.9F, -6.9F, 3.0F, 1.0F, 1.0F).uv(18,62).cuboid(-3.85F, -1.9F, -6.9F, 3.0F, 1.0F, 1.0F).uv(26,61).cuboid(-4.2F, -1.3F, -3.0F, 1.0F, 1.0F, 2.0F).uv(26,61).cuboid(1.2F, -1.3F, -3.0F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(1.0F,-0.25F,-9.0F));
        ModelPartData modelPartData3 = modelPartData2.addChild("teeth", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F,0.0F,-3.0F));
        modelPartData3.addChild("teeth_r1", ModelPartBuilder.create().uv(62,63).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(-0.7F,0.75F,-2.5F));
        modelPartData3.addChild("teeth_r2", ModelPartBuilder.create().uv(62,63).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(-1.95F,0.75F,-2.0F));
        modelPartData3.addChild("teeth_r3", ModelPartBuilder.create().uv(62,63).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(0.7F,0.75F,-2.5F));
        modelPartData3.addChild("teeth_r4", ModelPartBuilder.create().uv(62,63).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(2.0F,0.75F,-2.05F));
        modelPartData3.addChild("teeth_r5", ModelPartBuilder.create().uv(62,63).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(-2.5F,0.75F,2.0F));
        modelPartData3.addChild("teeth_r6", ModelPartBuilder.create().uv(62,63).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(-2.5F,0.75F,-0.8F));
        modelPartData3.addChild("teeth_r7", ModelPartBuilder.create().uv(62,63).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(-2.5F,0.75F,0.6F));
        modelPartData3.addChild("teeth_r8", ModelPartBuilder.create().uv(62,63).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(2.5F,0.75F,2.0F));
        modelPartData3.addChild("teeth_r9", ModelPartBuilder.create().uv(62,63).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(2.5F,0.75F,0.6F));
        modelPartData3.addChild("teeth_r10", ModelPartBuilder.create().uv(62,63).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(2.5F,0.75F,-0.8F));
        ModelPartData modelPartData4 = modelPartData2.addChild("mouth", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,1.0F,2.0F));
        modelPartData4.addChild("mouth_r1", ModelPartBuilder.create().uv(0,9).cuboid(-4.0F, -0.05F, -6.0F, 6.0F, 1.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,-2.0F));
        ModelPartData modelPartData5 = modelPartData1.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-1.0F,0.0F));
        modelPartData5.addChild("body_r1", ModelPartBuilder.create().uv(0,44).cuboid(-4.0F, -8.5F, -2.5F, 8.0F, 15.0F, 5.0F, true), ModelTransform.pivot(0.0F,0.5F,-0.5F));
        ModelPartData modelPartData6 = modelPartData5.addChild("fin", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.0F,0.0F));
        modelPartData6.addChild("fin_r1", ModelPartBuilder.create().uv(52,48).cuboid(0.0086F, -2.5F, -1.4686F, 1.0F, 3.0F, 5.0F), ModelTransform.pivot(-0.5F,0.2912F,0.7066F));
        ModelPartData modelPartData7 = modelPartData5.addChild("rfin", ModelPartBuilder.create(), ModelTransform.pivot(-4.0F,1.0F,-3.0F));
        modelPartData7.addChild("fin_r2", ModelPartBuilder.create().uv(33,52).cuboid(-7.0F, 0.0F, 0.0F, 7.0F, 1.0F, 5.0F).uv(44,48).cuboid(-8.0F, 0.0F, 2.0F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(1.0F,0.0F,-3.0F));
        ModelPartData modelPartData8 = modelPartData5.addChild("lfin", ModelPartBuilder.create(), ModelTransform.pivot(4.0F,1.0F,-3.0F));
        modelPartData8.addChild("fin_r3", ModelPartBuilder.create().uv(33,52).cuboid(0.0F, 0.0F, 0.0F, 7.0F, 1.0F, 5.0F, true).uv(44,48).cuboid(7.0F, 0.0F, 2.0F, 1.0F, 1.0F, 3.0F, true), ModelTransform.pivot(-1.0F,0.0F,-3.0F));
        ModelPartData modelPartData9 = modelPartData5.addChild("backfin", ModelPartBuilder.create().uv(0,36).cuboid(-3.0F, -1.5F, -0.5F, 6.0F, 4.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,6.0F));
        ModelPartData modelPartData10 = modelPartData9.addChild("backfin1", ModelPartBuilder.create().uv(0,29).cuboid(-2.0F, -1.25F, 0.0F, 4.0F, 3.0F, 4.0F), ModelTransform.pivot(0.0F,0.5F,3.0F));
        ModelPartData modelPartData11 = modelPartData10.addChild("backfin2", ModelPartBuilder.create().uv(0,23).cuboid(-1.0F, -0.75F, -0.6F, 2.0F, 2.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,4.0F));
        modelPartData11.addChild("backfin3", ModelPartBuilder.create().uv(21,32).cuboid(0.0F, -5.5F, -0.4F, 0.0F, 11.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,2.4F));
        return TexturedModelData.of(modelData,64,64);
    }
    @Override
    public void setAngles(SharkEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        setRotationAngle(teeth_r1, 0.0F, 0.0F, -0.7854F);
        setRotationAngle(teeth_r2, -0.567F, 0.4929F, -0.9317F);
        setRotationAngle(teeth_r3, 0.0F, 0.0F, -0.7854F);
        setRotationAngle(teeth_r4, 0.5749F, -0.4981F, -0.9355F);
        setRotationAngle(teeth_r5, 1.5708F, -0.7854F, -1.5708F);
        setRotationAngle(teeth_r6, 1.5708F, -0.7854F, -1.5708F);
        setRotationAngle(teeth_r7, 1.5708F, -0.7854F, -1.5708F);
        setRotationAngle(teeth_r8, 1.5708F, -0.7854F, -1.5708F);
        setRotationAngle(teeth_r9, 1.5708F, -0.7854F, -1.5708F);
        setRotationAngle(teeth_r10, 1.5708F, -0.7854F, -1.5708F);
        setRotationAngle(mouth_r1, 0.0436F, 0.0F, 0.0F);
        setRotationAngle(body_r1, 1.5708F, 0.0F, 0.0F);
        setRotationAngle(fin_r1, 0.9599F, 0.0F, 0.0F);
        setRotationAngle(fin_r2, 0.0F, 0.1745F, -0.1745F);
        setRotationAngle(fin_r3, 0.0F, -0.1745F, 0.1745F);
        main.setPivot(1.0F, 20.5F, 0.0F);

        setRotationAngle(main, (headPitch * 0.012453292F), (headYaw * 0.012453292F), 0.0F);
        setRotationAngle(head, (headPitch * 0.0027453292F), (headYaw * 0.0327453292F), 0.0F);

        if (!entity.isAttacking() && entity.getVelocity().horizontalLengthSquared() > 1.0E-7D) {
            this.backfin.yaw = -0.15F * MathHelper.cos(animationProgress * 0.4F);
            this.backfin1.yaw = -0.2F * MathHelper.cos(animationProgress * 0.4F);
            this.backfin2.yaw = -0.3F * MathHelper.cos(animationProgress * 0.4F);
            this.backfin3.yaw = -0.4F * MathHelper.cos(animationProgress * 0.4F);
            this.head.yaw = -0.05F * MathHelper.cos(animationProgress * 0.4F);

            this.rfin.roll = 0.4F * MathHelper.cos(animationProgress * 0.4F);
            this.lfin.roll = -0.4F * MathHelper.cos(animationProgress * 0.43F);
        }
        if (entity.isAttacking()){
            this.mouth_r1.pitch = 0.2936F;
            if (entity.getVelocity().horizontalLengthSquared() > 1.0E-7D) {
                this.backfin.yaw = -0.35F * MathHelper.cos(animationProgress * 0.7F);
                this.backfin1.yaw = -0.4F * MathHelper.cos(animationProgress * 0.7F);
                this.backfin2.yaw = -0.5F * MathHelper.cos(animationProgress * 0.7F);
                this.backfin3.yaw = -0.6F * MathHelper.cos(animationProgress * 0.7F);
                this.head.yaw = -0.05F * MathHelper.cos(animationProgress * 0.5F);

                this.rfin.roll = 0.4F * MathHelper.cos(animationProgress * 0.8F);
                this.lfin.roll = -0.4F * MathHelper.cos(animationProgress * 0.87F);
            }
        }
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        main.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    public void setRotationAngle(ModelPart bone, float pitch, float yaw, float roll) {
        bone.pitch = pitch;
        bone.yaw = yaw;
        bone.roll = roll;
    }
}