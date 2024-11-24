package net.qzimyion.cellulose.client;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.FoliageColor;
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
        RenderType Render = RenderType.cutout();
        RenderType Render1 = RenderType.translucent();
        RenderType Render2 = RenderType.cutoutMipped();

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
        TerraformBoatClientHelper.registerModelLayers(new ResourceLocation(Cellulose.MOD_ID, "cactus_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new ResourceLocation(Cellulose.MOD_ID, "cactus_chest_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new ResourceLocation(Cellulose.MOD_ID, "azalea_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new ResourceLocation(Cellulose.MOD_ID, "azalea_chest_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new ResourceLocation(Cellulose.MOD_ID, "blooming_azalea_boat"), false);
        TerraformBoatClientHelper.registerModelLayers(new ResourceLocation(Cellulose.MOD_ID, "blooming_azalea_chest_boat"), false);

        //Doors and Trapdoors
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_DOOR, Render);
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_TRAPDOOR, Render);

        //Signs and Hanging signs

        //Shoji
        BlockRenderLayerMap.INSTANCE.putBlock(OAK_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(BIRCH_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(SPRUCE_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_OAK_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(ACACIA_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(CRIMSON_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(WARPED_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(MANGROVE_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(BAMBOO_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(CHERRY_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(CACTUS_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(AZALEA_SHOJI, Render1);
        BlockRenderLayerMap.INSTANCE.putBlock(BLOOMING_AZALEA_SHOJI, Render1);

        //Tints
        ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) -> FoliageColor.getDefaultColor()), OAK_LEAF);
    }
}
