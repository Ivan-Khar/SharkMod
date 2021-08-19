package com.aqupd.sharkmod;

import com.aqupd.sharkmod.client.model.SharkEntityModel;
import com.aqupd.sharkmod.client.renderer.SharkEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

@Environment(EnvType.CLIENT)
@SuppressWarnings("deprecation")
public class MainClient implements ClientModInitializer {
    public static final EntityModelLayer SHARK_MODEL_LAYER = new EntityModelLayer(Main.SHARK_ID, "main");

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(SHARK_MODEL_LAYER, () -> SharkEntityModel.getTexturedModelData());
        //Register the renderer
        EntityRendererRegistry.INSTANCE.register(Main.SHARK, SharkEntityRenderer::new);

    }
}
