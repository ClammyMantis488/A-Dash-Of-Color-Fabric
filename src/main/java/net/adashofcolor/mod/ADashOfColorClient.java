package net.adashofcolor.mod;

import net.adashofcolor.mod.content.CTorch;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class ADashOfColorClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                CTorch.PINK_TORCH,
                CTorch.PINK_WALL_TORCH
        );

    }
}
