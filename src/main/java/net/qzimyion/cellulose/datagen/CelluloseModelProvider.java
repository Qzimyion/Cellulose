package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
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
        BlockStateModelGenerator.BlockTexturePool VerticalOak = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_OAK_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalBirch = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_BIRCH_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalSpruce = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_SPRUCE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalDarkOak = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_DARK_OAK_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalJungle = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_JUNGLE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalAcacia = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_ACACIA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalCrimson = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_CRIMSON_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalWarped = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_WARPED_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalMangrove = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_MANGROVE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalBamboo = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_BAMBOO_PLANKS);
        BlockStateModelGenerator.BlockTexturePool VerticalCherry = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_CHERRY_PLANKS);

        BlockStateModelGenerator.BlockTexturePool MosaicOak = blockStateModelGenerator.registerCubeAllModelTexturePool(OAK_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicBirch = blockStateModelGenerator.registerCubeAllModelTexturePool(BIRCH_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicSpruce = blockStateModelGenerator.registerCubeAllModelTexturePool(SPRUCE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicDarkOak = blockStateModelGenerator.registerCubeAllModelTexturePool(DARK_OAK_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicJungle = blockStateModelGenerator.registerCubeAllModelTexturePool(JUNGLE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicAcacia = blockStateModelGenerator.registerCubeAllModelTexturePool(ACACIA_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicCrimson = blockStateModelGenerator.registerCubeAllModelTexturePool(CRIMSON_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicWarped = blockStateModelGenerator.registerCubeAllModelTexturePool(WARPED_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicMangrove = blockStateModelGenerator.registerCubeAllModelTexturePool(MANGROVE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool MosaicCherry = blockStateModelGenerator.registerCubeAllModelTexturePool(CHERRY_MOSAIC);

        BlockStateModelGenerator.LogTexturePool ChippedOak = blockStateModelGenerator.registerLog(CHIPPED_OAK);
        BlockStateModelGenerator.LogTexturePool ChippedBirch = blockStateModelGenerator.registerLog(CHIPPED_BIRCH);
        BlockStateModelGenerator.LogTexturePool ChippedSpruce = blockStateModelGenerator.registerLog(CHIPPED_SPRUCE);
        BlockStateModelGenerator.LogTexturePool ChippedDarkOak = blockStateModelGenerator.registerLog(CHIPPED_DARK_OAK);
        BlockStateModelGenerator.LogTexturePool ChippedJungle = blockStateModelGenerator.registerLog(CHIPPED_JUNGLE);
        BlockStateModelGenerator.LogTexturePool ChippedAcacia = blockStateModelGenerator.registerLog(CHIPPED_ACACIA);

        BlockStateModelGenerator.BlockTexturePool cactusTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cactusVerticalTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_CACTUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cactusMosaicTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_MOSAIC);

        //Log
        ChippedOak.log(CHIPPED_OAK);
        ChippedOak.wood(CHIPPED_OAK_WOOD);

        //Slabs
        VerticalOak.slab(VERTICAL_OAK_PLANKS_SLABS);
        VerticalBirch.slab(VERTICAL_BIRCH_PLANKS_SLABS);
        VerticalSpruce.slab(VERTICAL_SPRUCE_PLANKS_SLABS);
        VerticalDarkOak.slab(VERTICAL_DARK_OAK_PLANKS_SLABS);
        VerticalJungle.slab(VERTICAL_JUNGLE_PLANKS_SLABS);
        VerticalAcacia.slab(VERTICAL_ACACIA_PLANKS_SLABS);
        VerticalCrimson.slab(VERTICAL_CRIMSON_PLANKS_SLABS);
        VerticalWarped.slab(VERTICAL_WARPED_PLANKS_SLABS);
        VerticalMangrove.slab(VERTICAL_MANGROVE_PLANKS_SLABS);
        VerticalBamboo.slab(VERTICAL_BAMBOO_PLANKS_SLABS);
        VerticalCherry.slab(VERTICAL_CHERRY_PLANKS_SLABS);

        MosaicOak.slab(OAK_MOSAIC_SLABS);
        MosaicBirch.slab(BIRCH_MOSAIC_SLABS);
        MosaicSpruce.slab(SPRUCE_MOSAIC_SLABS);
        MosaicDarkOak.slab(DARK_OAK_MOSAIC_SLABS);
        MosaicJungle.slab(JUNGLE_MOSAIC_SLABS);
        MosaicAcacia.slab(ACACIA_MOSAIC_SLABS);
        MosaicCrimson.slab(CRIMSON_MOSAIC_SLABS);
        MosaicWarped.slab(WARPED_MOSAIC_SLABS);
        MosaicMangrove.slab(MANGROVE_MOSAIC_SLABS);
        MosaicCherry.slab(CHERRY_MOSAIC_SLABS);

        cactusTexturePool.slab(CACTUS_SLABS);
        cactusVerticalTexturePool.slab(VERTICAL_CACTUS_PLANKS_SLABS);
        cactusMosaicTexturePool.slab(CACTUS_MOSAIC_SLABS);

        //Stairs
        VerticalOak.stairs(VERTICAL_OAK_PLANKS_STAIRS);
        VerticalBirch.stairs(VERTICAL_BIRCH_PLANKS_STAIRS);
        VerticalSpruce.stairs(VERTICAL_SPRUCE_PLANKS_STAIRS);
        VerticalDarkOak.stairs(VERTICAL_DARK_OAK_PLANKS_STAIRS);
        VerticalJungle.stairs(VERTICAL_JUNGLE_PLANKS_STAIRS);
        VerticalAcacia.stairs(VERTICAL_ACACIA_PLANKS_STAIRS);
        VerticalCrimson.stairs(VERTICAL_CRIMSON_PLANKS_STAIRS);
        VerticalWarped.stairs(VERTICAL_WARPED_PLANKS_STAIRS);
        VerticalMangrove.stairs(VERTICAL_MANGROVE_PLANKS_STAIRS);
        VerticalBamboo.stairs(VERTICAL_BAMBOO_PLANKS_STAIRS);
        VerticalCherry.stairs(VERTICAL_CHERRY_PLANKS_STAIRS);

        MosaicOak.stairs(OAK_MOSAIC_STAIRS);
        MosaicBirch.stairs(BIRCH_MOSAIC_STAIRS);
        MosaicSpruce.stairs(SPRUCE_MOSAIC_STAIRS);
        MosaicDarkOak.stairs(DARK_OAK_MOSAIC_STAIRS);
        MosaicJungle.stairs(JUNGLE_MOSAIC_STAIRS);
        MosaicAcacia.stairs(ACACIA_MOSAIC_STAIRS);
        MosaicCrimson.stairs(CRIMSON_MOSAIC_STAIRS);
        MosaicWarped.stairs(WARPED_MOSAIC_STAIRS);
        MosaicMangrove.stairs(MANGROVE_MOSAIC_STAIRS);
        MosaicCherry.stairs(CHERRY_MOSAIC_STAIRS);

        cactusTexturePool.stairs(CACTUS_STAIRS);
        cactusVerticalTexturePool.stairs(VERTICAL_CACTUS_PLANKS_STAIRS);
        cactusMosaicTexturePool.stairs(CACTUS_MOSAIC_STAIRS);

        //Fence and Fence-Gates
        cactusTexturePool.fence(CACTUS_FENCE);
        cactusTexturePool.fenceGate(CACTUS_FENCE_GATE);

        //Button
        cactusTexturePool.button(CACTUS_BUTTON);

        //P.Plate
        cactusTexturePool.pressurePlate(CACTUS_PRESSURE_PLATE);

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
