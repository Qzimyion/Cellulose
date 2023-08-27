package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

import static net.minecraft.block.Blocks.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

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

        BlockStateModelGenerator.BlockTexturePool OakWood = blockStateModelGenerator.registerCubeAllModelTexturePool(OAK_LOG);
        BlockStateModelGenerator.BlockTexturePool BirchWood = blockStateModelGenerator.registerCubeAllModelTexturePool(BIRCH_LOG);
        BlockStateModelGenerator.BlockTexturePool SpruceWood = blockStateModelGenerator.registerCubeAllModelTexturePool(SPRUCE_LOG);
        BlockStateModelGenerator.BlockTexturePool DarkOakWood = blockStateModelGenerator.registerCubeAllModelTexturePool(DARK_OAK_LOG);
        BlockStateModelGenerator.BlockTexturePool JungleWood = blockStateModelGenerator.registerCubeAllModelTexturePool(JUNGLE_LOG);
        BlockStateModelGenerator.BlockTexturePool AcaciaWood = blockStateModelGenerator.registerCubeAllModelTexturePool(ACACIA_LOG);
        BlockStateModelGenerator.BlockTexturePool CrimsonWood = blockStateModelGenerator.registerCubeAllModelTexturePool(CRIMSON_STEM);
        BlockStateModelGenerator.BlockTexturePool WarpedWood = blockStateModelGenerator.registerCubeAllModelTexturePool(WARPED_STEM);
        BlockStateModelGenerator.BlockTexturePool MangroveWood = blockStateModelGenerator.registerCubeAllModelTexturePool(MANGROVE_LOG);
        BlockStateModelGenerator.BlockTexturePool CherryWood = blockStateModelGenerator.registerCubeAllModelTexturePool(CHERRY_LOG);

        BlockStateModelGenerator.BlockTexturePool StrippedOakWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_OAK_LOG);
        BlockStateModelGenerator.BlockTexturePool StrippedBirchWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_BIRCH_LOG);
        BlockStateModelGenerator.BlockTexturePool StrippedSpruceWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_SPRUCE_LOG);
        BlockStateModelGenerator.BlockTexturePool StrippedDarkOakWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_DARK_OAK_LOG);
        BlockStateModelGenerator.BlockTexturePool StrippedJungleWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_JUNGLE_LOG);
        BlockStateModelGenerator.BlockTexturePool StrippedAcaciaWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_ACACIA_LOG);
        BlockStateModelGenerator.BlockTexturePool StrippedCrimsonWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_CRIMSON_STEM);
        BlockStateModelGenerator.BlockTexturePool StrippedWarpedWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_WARPED_STEM);
        BlockStateModelGenerator.BlockTexturePool StrippedMangroveWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_MANGROVE_LOG);
        BlockStateModelGenerator.BlockTexturePool StrippedCherryWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_CHERRY_LOG);
        BlockStateModelGenerator.BlockTexturePool StrippedCactusWood = blockStateModelGenerator.registerCubeAllModelTexturePool(STRIPPED_CACTUS);

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

        BlockStateModelGenerator.LogTexturePool Cactus = blockStateModelGenerator.registerLog(CACTUS_BUNDLE);
        BlockStateModelGenerator.LogTexturePool StrippedCactus = blockStateModelGenerator.registerLog(STRIPPED_CACTUS);

        BlockStateModelGenerator.LogTexturePool EngravedOak = blockStateModelGenerator.registerLog(ENGRAVED_OAK);
        BlockStateModelGenerator.LogTexturePool EngravedBirch = blockStateModelGenerator.registerLog(ENGRAVED_BIRCH);
        BlockStateModelGenerator.LogTexturePool EngravedSpruce = blockStateModelGenerator.registerLog(ENGRAVED_SPRUCE);
        BlockStateModelGenerator.LogTexturePool EngravedDarkOak = blockStateModelGenerator.registerLog(ENGRAVED_DARK_OAK);
        BlockStateModelGenerator.LogTexturePool EngravedJungle = blockStateModelGenerator.registerLog(ENGRAVED_JUNGLE);
        BlockStateModelGenerator.LogTexturePool EngravedAcacia = blockStateModelGenerator.registerLog(ENGRAVED_ACACIA);
        BlockStateModelGenerator.LogTexturePool EngravedCrimson = blockStateModelGenerator.registerLog(ENGRAVED_CRIMSON);
        BlockStateModelGenerator.LogTexturePool EngravedWarped = blockStateModelGenerator.registerLog(ENGRAVED_WARPED);
        BlockStateModelGenerator.LogTexturePool EngravedMangrove = blockStateModelGenerator.registerLog(ENGRAVED_MANGROVE);
        BlockStateModelGenerator.LogTexturePool EngravedCherry = blockStateModelGenerator.registerLog(ENGRAVED_CHERRY);
        BlockStateModelGenerator.LogTexturePool EngravedCactus = blockStateModelGenerator.registerLog(ENGRAVED_CACTUS);


        BlockStateModelGenerator.BlockTexturePool cactusTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cactusVerticalTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VERTICAL_CACTUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cactusMosaicTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(CACTUS_MOSAIC);

        //Log
        EngravedOak.log(ENGRAVED_OAK);
        EngravedBirch.log(ENGRAVED_BIRCH);
        EngravedSpruce.log(ENGRAVED_SPRUCE);
        EngravedDarkOak.log(ENGRAVED_DARK_OAK);
        EngravedJungle.log(ENGRAVED_JUNGLE);
        EngravedAcacia.log(ENGRAVED_ACACIA);
        EngravedCrimson.log(ENGRAVED_CRIMSON);
        EngravedWarped.log(ENGRAVED_WARPED);
        EngravedMangrove.log(ENGRAVED_MANGROVE);
        EngravedCherry.log(ENGRAVED_CHERRY);
        EngravedCactus.log(ENGRAVED_CACTUS);
        Cactus.log(CACTUS_BUNDLE);
        ChippedOak.log(CHIPPED_OAK);

        //Wood
        EngravedOak.wood(ENGRAVED_OAK_WOOD);
        EngravedBirch.wood(ENGRAVED_BIRCH_WOOD);
        EngravedSpruce.wood(ENGRAVED_SPRUCE_WOOD);
        EngravedDarkOak.wood(ENGRAVED_DARK_OAK_WOOD);
        EngravedJungle.wood(ENGRAVED_JUNGLE_WOOD);
        EngravedAcacia.wood(ENGRAVED_ACACIA_WOOD);
        EngravedCrimson.wood(ENGRAVED_CRIMSON_HYPHAE);
        EngravedWarped.wood(ENGRAVED_WARPED_HYPHAE);
        EngravedMangrove.wood(ENGRAVED_MANGROVE_WOOD);
        EngravedCherry.wood(ENGRAVED_CHERRY_WOOD);
        EngravedCactus.wood(ENGRAVED_CACTUS_CROWN);
        Cactus.wood(CACTUS_CROWN);
        StrippedCactus.wood(STRIPPED_CACTUS_CROWN);
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

        OakWood.slab(OAK_WOOD_SLABS);
        StrippedOakWood.slab(STRIPPED_OAK_WOOD_SLABS);

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

        OakWood.stairs(OAK_WOOD_STAIRS);

        StrippedOakWood.stairs(STRIPPED_OAK_WOOD_STAIRS);

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
