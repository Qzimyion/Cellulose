package net.qzimyion.cellulose.client;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.screen.CelluloseScreens;
import net.qzimyion.cellulose.screen.sawmill.SawmillScreen;

public class CelluloseClient implements ClientModInitializer
{
    @SuppressWarnings({"Deprecated API usage", "deprecation"})
    @Override
    public void onInitializeClient()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.SAWMILL, RenderLayer.getCutout());

        //Frames
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.OAK_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.BIRCH_FRAME, RenderLayer.getCutout());

        //Lintels
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.OAK_LINTELS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.BIRCH_FRAME, RenderLayer.getCutout());

        //Screen
        ScreenRegistry.register(CelluloseScreens.SAWMILL_SCREEN_HANDLER, SawmillScreen::new);

        //Boats
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "cactus_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "cactus_chest_boat"), false);

        //Doors and Trapdoors
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.CACTUS_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CelluloseBlocks.CACTUS_TRAPDOOR, RenderLayer.getCutout());

        //Signs and Hanging signs

    }
}
