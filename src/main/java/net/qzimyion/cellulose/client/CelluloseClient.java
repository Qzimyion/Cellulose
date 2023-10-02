package net.qzimyion.cellulose.client;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.screen.CelluloseScreens;
import net.qzimyion.cellulose.screen.sawmill.SawmillScreen;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

@SuppressWarnings({"Deprecated API usage", "deprecation"})
public class CelluloseClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        RenderLayer Render = RenderLayer.getCutout();
        RenderLayer Render1 = RenderLayer.getTranslucent();

        BlockRenderLayerMap.INSTANCE.putBlock(SAWMILL, Render);

        //Frames
        BlockRenderLayerMap.INSTANCE.putBlock(OAK_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BIRCH_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(SPRUCE_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_OAK_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(ACACIA_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CRIMSON_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(WARPED_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(MANGROVE_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BAMBOO_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CHERRY_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(AZALEA_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BLOOMING_AZALEA_FRAME, Render);


        //Lintels
        BlockRenderLayerMap.INSTANCE.putBlock(OAK_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BIRCH_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(SPRUCE_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_OAK_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(ACACIA_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CRIMSON_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(WARPED_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(MANGROVE_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BAMBOO_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CHERRY_FRAME, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(AZALEA_LINTELS, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(BLOOMING_AZALEA_LINTELS, Render);

        //Nature
        BlockRenderLayerMap.INSTANCE.putBlock(AZALEA_FLOWERS, Render);


        //Screen
        ScreenRegistry.register(CelluloseScreens.SAWMILL_SCREEN_HANDLER, SawmillScreen::new);

        //Boats
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "cactus_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "cactus_chest_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "azalea_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "azalea_chest_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "blooming_azalea_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new Identifier(Cellulose.MOD_ID, "blooming_azalea_chest_boat"), false);

        //Doors and Trapdoors
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_DOOR, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_TRAPDOOR, Render);

        //CelluloseSigns and Hanging signs

    }
}
