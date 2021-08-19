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
    private final ModelPart teeth_r11;
    private final ModelPart teeth_r12;
    private final ModelPart teeth_r13;
    private final ModelPart teeth_r14;
    private final ModelPart mouth;
    private final ModelPart mouth_r1;
    private final ModelPart body;
    private final ModelPart fin;
    private final ModelPart fin_r1;
    private final ModelPart rfin;
    private final ModelPart fin_r2;
    private final ModelPart lfin;
    private final ModelPart fin_r3;
    private final ModelPart backfin;

    public SharkEntityModel(ModelPart root) {
        this.main = root.getChild("main");
        this.body = this.main.getChild("body");
        this.backfin = this.body.getChild("backfin");
        this.fin = this.body.getChild("fin");
        this.lfin = this.fin.getChild("lfin");
        this.fin_r3 = this.lfin.getChild("fin_r3");
        this.rfin = this.fin.getChild("rfin");
        this.fin_r2 = this.rfin.getChild("fin_r2");
        this.fin_r1 = this.fin.getChild("fin_r1");
        this.head = this.main.getChild("head");
        this.mouth = this.head.getChild("mouth");
        this.mouth_r1 = this.mouth.getChild("mouth_r1");
        this.teeth = this.head.getChild("teeth");
        this.teeth_r14 = this.teeth.getChild("teeth_r14");
        this.teeth_r13 = this.teeth.getChild("teeth_r13");
        this.teeth_r12 = this.teeth.getChild("teeth_r12");
        this.teeth_r11 = this.teeth.getChild("teeth_r11");
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
        ModelPartData modelPartData1 = modelPartData.addChild("main", ModelPartBuilder.create(), ModelTransform.pivot(1.0F,23.0F,-9.0F));
        ModelPartData modelPartData2 = modelPartData1.addChild("head", ModelPartBuilder.create().uv(40,0).cuboid(-4.0F, -2.25F, -6.0F, 6.0F, 3.0F, 6.0F).uv(50,16).cuboid(-4.0F, -1.35F, -8.0F, 6.0F, 2.0F, 2.0F).uv(0,3).cuboid(-1.15F, -1.9F, -6.7F, 3.0F, 1.0F, 1.0F).uv(0,5).cuboid(-3.85F, -1.9F, -6.7F, 3.0F, 1.0F, 1.0F).uv(15,15).cuboid(-4.2F, -1.3F, -3.0F, 1.0F, 1.0F, 2.0F).uv(15,15).cuboid(1.2F, -1.3F, -3.0F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(0.0F,-0.25F,1.0F));
        ModelPartData modelPartData3 = modelPartData2.addChild("teeth", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,-1.0F));
        modelPartData3.addChild("teeth_r1", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(1.3F,0.269F,0.2455F));
        modelPartData3.addChild("teeth_r2", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(1.3F,0.269F,-0.7545F));
        modelPartData3.addChild("teeth_r3", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(1.3F,0.269F,-1.7545F));
        modelPartData3.addChild("teeth_r4", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(1.1F,0.269F,-2.7545F));
        modelPartData3.addChild("teeth_r5", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(0.8F,0.269F,-3.8545F));
        modelPartData3.addChild("teeth_r6", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(0.2F,0.269F,-4.3545F));
        modelPartData3.addChild("teeth_r7", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(-0.6F,0.269F,-4.3545F));
        modelPartData3.addChild("teeth_r8", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(-1.4F,0.269F,-4.3545F));
        modelPartData3.addChild("teeth_r9", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(-2.2F,0.269F,-4.3545F));
        modelPartData3.addChild("teeth_r10", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(-2.9F,0.269F,-3.8545F));
        modelPartData3.addChild("teeth_r11", ModelPartBuilder.create().uv(60,62).cuboid(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(-3.3F,0.269F,-2.8545F));
        modelPartData3.addChild("teeth_r12", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(-3.3F,0.269F,0.2455F));
        modelPartData3.addChild("teeth_r13", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(-3.3F,0.269F,-0.7545F));
        modelPartData3.addChild("teeth_r14", ModelPartBuilder.create().uv(60,62).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(-3.3F,0.269F,-1.7545F));
        ModelPartData modelPartData4 = modelPartData2.addChild("mouth", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,1.0F,2.0F));
        modelPartData4.addChild("mouth_r1", ModelPartBuilder.create().uv(40,9).cuboid(-4.0F, -0.05F, -6.0F, 6.0F, 1.0F, 6.0F), ModelTransform.pivot(0.0F,0.0F,-2.0F));
        ModelPartData modelPartData5 = modelPartData1.addChild("body", ModelPartBuilder.create().uv(0,41).cuboid(-5.0F, -3.0F, 1.0F, 8.0F, 5.0F, 17.0F).uv(15,7).cuboid(-4.0F, -3.0F, 18.0F, 6.0F, 5.0F, 1.0F).uv(15,0).cuboid(-3.0F, -2.75F, 19.0F, 4.0F, 4.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData6 = modelPartData5.addChild("fin", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData6.addChild("fin_r1", ModelPartBuilder.create().uv(52,48).cuboid(0.0086F, -2.5F, -1.4686F, 1.0F, 3.0F, 5.0F), ModelTransform.pivot(-1.5F,-2.7088F,10.7066F));
        ModelPartData modelPartData7 = modelPartData6.addChild("rfin", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData7.addChild("fin_r2", ModelPartBuilder.create().uv(33,52).cuboid(-7.0F, 0.0F, 0.0F, 7.0F, 1.0F, 5.0F).uv(44,48).cuboid(-8.0F, 0.0F, 2.0F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-4.0F,0.0F,4.0F));
        ModelPartData modelPartData8 = modelPartData6.addChild("lfin", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData8.addChild("fin_r3", ModelPartBuilder.create().uv(33,52).cuboid(0.0F, 0.0F, 0.0F, 7.0F, 1.0F, 5.0F, true).uv(44,48).cuboid(7.0F, 0.0F, 2.0F, 1.0F, 1.0F, 3.0F, true), ModelTransform.pivot(2.0F,0.0F,4.0F));
        modelPartData5.addChild("backfin", ModelPartBuilder.create().uv(0,34).cuboid(-1.5F, 1.0F, 23.0F, 1.0F, 1.0F, 3.0F).uv(0,19).cuboid(-2.0F, -1.5F, 20.0F, 2.0F, 2.0F, 2.0F).uv(0,11).cuboid(-1.5F, -3.0F, 22.0F, 1.0F, 2.0F, 2.0F).uv(0,26).cuboid(-1.5F, -1.0F, 22.0F, 1.0F, 2.0F, 2.0F).uv(0,7).cuboid(-1.5F, -4.0F, 23.0F, 1.0F, 1.0F, 3.0F).uv(0,31).cuboid(-1.5F, 0.0F, 24.0F, 1.0F, 1.0F, 1.0F).uv(0,16).cuboid(-1.5F, -3.0F, 24.0F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        return TexturedModelData.of(modelData,64,64);
    }

    @Override
    public void setAngles(SharkEntity sharkEntity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
        setRotationAngle(teeth_r1, 0.6089F, -0.1685F, 0.2657F);
        setRotationAngle(teeth_r2, 0.6545F, 0.0F, 0.2618F);
        setRotationAngle(teeth_r3, 0.7237F, 0.2527F, 0.2706F);
        setRotationAngle(teeth_r4, 0.7746F, 0.4205F, 0.2875F);
        setRotationAngle(teeth_r5, 0.6545F, 0.0F, 0.7854F);
        setRotationAngle(teeth_r6, 0.6545F, 0.0F, 0.7854F);
        setRotationAngle(teeth_r7, 0.6545F, 0.0F, 0.7854F);
        setRotationAngle(teeth_r8, 0.6646F, 0.0138F, 0.8302F);
        setRotationAngle(teeth_r9, 0.6646F, 0.0138F, 0.8302F);
        setRotationAngle(teeth_r10, 0.6545F, 0.0F, 0.7854F);
        setRotationAngle(teeth_r11, 0.7237F, -0.2527F, -0.2706F);
        setRotationAngle(teeth_r12, 0.5972F, 0.2106F, -0.2679F);
        setRotationAngle(teeth_r13, 0.6545F, 0.0F, -0.2618F);
        setRotationAngle(teeth_r14, 0.6886F, -0.1264F, -0.264F);
        setRotationAngle(mouth_r1, 0.0873F, 0.0F, 0.0F);
        setRotationAngle(fin_r1, 0.9599F, 0.0F, 0.0F);
        setRotationAngle(fin_r2, 0.0F, 0.1745F, -0.1745F);
        setRotationAngle(fin_r3, 0.0F, -0.1745F, 0.1745F);
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