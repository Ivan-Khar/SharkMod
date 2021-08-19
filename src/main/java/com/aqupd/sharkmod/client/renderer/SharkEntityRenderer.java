package com.aqupd.sharkmod.client.renderer;

import com.aqupd.sharkmod.MainClient;
import com.aqupd.sharkmod.client.model.SharkEntityModel;
import com.aqupd.sharkmod.entity.SharkEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class SharkEntityRenderer extends MobEntityRenderer<SharkEntity, SharkEntityModel<SharkEntity>> {

    public SharkEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SharkEntityModel<SharkEntity>(context.getPart(MainClient.SHARK_MODEL_LAYER)), 1.0f);
    }

    @Override
    public Identifier getTexture(SharkEntity entity) {
        return new Identifier("aqupd", "textures/entity/shark.png");
    }

    protected void scale(SharkEntity sharkEntity, MatrixStack matrixStack, float f) {
        matrixStack.scale(2.0F, 2.0F, 2.0F);
    }
}