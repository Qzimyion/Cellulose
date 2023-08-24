package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

public class CelluloseModelProvider extends FabricModelProvider {
    public CelluloseModelProvider(FabricDataOutput output)
    {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Texturepool
        BlockStateModelGenerator.BlockTexturePool cactusTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cactusVerticalTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_CACTUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cactusMosaicTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_MOSAIC);


        //Slabs
        cactusTexturePool.slab(CACTUS_SLABS);
        cactusTexturePool.slab(VERTICAL_CACTUS_PLANKS_SLABS);
        cactusMosaicTexturePool.slab(CACTUS_MOSAIC_SLABS);

        //Stairs
        cactusTexturePool.stairs(CACTUS_STAIRS);
        cactusTexturePool.stairs(VERTICAL_CACTUS_PLANKS_STAIRS);
        cactusMosaicTexturePool.stairs(CACTUS_MOSAIC_STAIRS);

        //Fence and Fence-Gates
        cactusTexturePool.fence(CACTUS_FENCE);
        cactusTexturePool.fenceGate(CACTUS_FENCE_GATE);

        //Button
        cactusTexturePool.button(CACTUS_BUTTON);

        //P.Plate
        cactusTexturePool.pressurePlate(CACTUS_PRESSURE_PLATE);

        //Hanging Sign
        blockStateModelGenerator.registerHangingSign(STRIPPED_CACTUS, CACTUS_HANGING_SIGN, CACTUS_WALL_HANGING_SIGN);

        //Door
        blockStateModelGenerator.registerDoor(CACTUS_DOOR);

        //Trapdoor
        blockStateModelGenerator.registerTrapdoor(CACTUS_TRAPDOOR);

        //Panes
        blockStateModelGenerator.registerGlassPane(OAK_FRAME, OAK_LINTELS);
        blockStateModelGenerator.registerGlassPane(BIRCH_FRAME, BIRCH_LINTELS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {

    }
}
