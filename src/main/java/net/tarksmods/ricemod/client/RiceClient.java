package net.tarksmods.ricemod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static net.tarksmods.ricemod.blocks.RiceModBlocks.RICE_CROP_BLOCK;

public class RiceClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RICE_CROP_BLOCK);

    }
}
