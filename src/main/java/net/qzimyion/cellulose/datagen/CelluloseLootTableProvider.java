package net.qzimyion.cellulose.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

public class CelluloseLootTableProvider extends FabricBlockLootTableProvider {
    public CelluloseLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Blocks
        addDrop(CACTUS_PLANKS);
        addDrop(CACTUS_CROWN);
        addDrop(STRIPPED_CACTUS);
        addDrop(STRIPPED_CACTUS_CROWN);
        addDrop(OAK_MOSAIC);
        addDrop(BIRCH_MOSAIC);
        addDrop(SPRUCE_MOSAIC);
        addDrop(DARK_OAK_MOSAIC);
        addDrop(JUNGLE_MOSAIC);
        addDrop(ACACIA_MOSAIC);
        addDrop(CRIMSON_MOSAIC);
        addDrop(WARPED_MOSAIC);
        addDrop(MANGROVE_MOSAIC);
        addDrop(CHERRY_MOSAIC);
        addDrop(CACTUS_MOSAIC);

        //Stairs
        addDrop(CACTUS_STAIRS);
        addDrop(OAK_MOSAIC_STAIRS);
        addDrop(BIRCH_MOSAIC_STAIRS);
        addDrop(SPRUCE_MOSAIC_STAIRS);
        addDrop(DARK_OAK_MOSAIC_STAIRS);
        addDrop(JUNGLE_MOSAIC_STAIRS);
        addDrop(ACACIA_MOSAIC_STAIRS);
        addDrop(CRIMSON_MOSAIC_STAIRS);
        addDrop(WARPED_MOSAIC_STAIRS);
        addDrop(MANGROVE_MOSAIC_STAIRS);
        addDrop(CHERRY_MOSAIC_STAIRS);
        addDrop(CACTUS_MOSAIC_STAIRS);
        addDrop(OAK_LOG_STAIRS);
        addDrop(STRIPPED_OAK_LOG_STAIRS);

        //Slabs
        addDrop(CACTUS_SLABS, slabDrops(CACTUS_SLABS));
        addDrop(OAK_MOSAIC_SLABS, slabDrops(OAK_MOSAIC_SLABS));
        addDrop(BIRCH_MOSAIC_SLABS, slabDrops(BIRCH_MOSAIC_SLABS));
        addDrop(SPRUCE_MOSAIC_SLABS, slabDrops(SPRUCE_MOSAIC_SLABS));
        addDrop(DARK_OAK_MOSAIC_SLABS, slabDrops(DARK_OAK_MOSAIC_SLABS));
        addDrop(JUNGLE_MOSAIC_SLABS, slabDrops(JUNGLE_MOSAIC_SLABS));
        addDrop(ACACIA_MOSAIC_SLABS, slabDrops(ACACIA_MOSAIC_SLABS));
        addDrop(CRIMSON_MOSAIC_SLABS, slabDrops(CRIMSON_MOSAIC_SLABS));
        addDrop(WARPED_MOSAIC_SLABS, slabDrops(WARPED_MOSAIC_SLABS));
        addDrop(MANGROVE_MOSAIC_SLABS, slabDrops(MANGROVE_MOSAIC_SLABS));
        addDrop(CHERRY_MOSAIC_SLABS, slabDrops(CHERRY_MOSAIC_SLABS));
        addDrop(CACTUS_MOSAIC_SLABS, slabDrops(CACTUS_MOSAIC_SLABS));
        addDrop(OAK_LOG_SLABS, slabDrops(OAK_LOG_SLABS));
        addDrop(STRIPPED_OAK_LOG_SLABS, slabDrops(STRIPPED_OAK_LOG_SLABS));

        //Engraved logs and wood
        addDrop(ENGRAVED_OAK);
        addDrop(ENGRAVED_BIRCH);
        addDrop(ENGRAVED_SPRUCE);
        addDrop(ENGRAVED_DARK_OAK);
        addDrop(ENGRAVED_JUNGLE);
        addDrop(ENGRAVED_ACACIA);
        addDrop(ENGRAVED_CRIMSON);
        addDrop(ENGRAVED_WARPED);
        addDrop(ENGRAVED_MANGROVE);
        addDrop(ENGRAVED_CHERRY);
        addDrop(ENGRAVED_CACTUS);
        addDrop(ENGRAVED_OAK_WOOD);
        addDrop(ENGRAVED_BIRCH_WOOD);
        addDrop(ENGRAVED_SPRUCE_WOOD);
        addDrop(ENGRAVED_DARK_OAK_WOOD);
        addDrop(ENGRAVED_JUNGLE_WOOD);
        addDrop(ENGRAVED_ACACIA_WOOD);
        addDrop(ENGRAVED_CRIMSON_HYPHAE);
        addDrop(ENGRAVED_WARPED_HYPHAE);
        addDrop(ENGRAVED_MANGROVE_WOOD);
        addDrop(ENGRAVED_CHERRY_WOOD);
        addDrop(ENGRAVED_CACTUS_CROWN);
        addDrop(CHIPPED_OAK);
        addDrop(CHIPPED_OAK_WOOD);

        //Fences and Fence-gates
        addDrop(CACTUS_FENCE);
        addDrop(CACTUS_FENCE_GATE);

        //Button
        addDrop(CACTUS_BUTTON);

        //Pressure Plate
        addDrop(CACTUS_PRESSURE_PLATE);

        //Door and Trapdoors
        addDrop(CACTUS_DOOR, doorDrops(CACTUS_DOOR));
        addDrop(CACTUS_TRAPDOOR);

        //Sawmill
        addDrop(SAWMILL);

        /*SilkTouch Stuff
        //Frames*/

        addDrop(OAK_FRAME, dropsWithSilkTouch(OAK_FRAME));
        addDrop(BIRCH_FRAME, dropsWithSilkTouch(BIRCH_FRAME));
        addDrop(SPRUCE_FRAME, dropsWithSilkTouch(SPRUCE_FRAME));
        /*Charredwoodset*/
        addDrop(CHARRED_PLANKS, dropsWithSilkTouch(CHARRED_PLANKS));

        //Lintels
        addDrop(OAK_LINTELS, dropsWithSilkTouch(OAK_LINTELS));
        addDrop(BIRCH_LINTELS, dropsWithSilkTouch(BIRCH_LINTELS));

        //Misc
        addDrop(CACTUS_BUNDLE);

    }
}
