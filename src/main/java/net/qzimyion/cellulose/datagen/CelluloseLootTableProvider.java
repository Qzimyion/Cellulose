package net.qzimyion.cellulose.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import static net.qzimyion.cellulose.registry.CelluloseBlocks.*;

public class CelluloseLootTableProvider extends FabricBlockLootTableProvider {
    public CelluloseLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Blocks
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

        //Stairs
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

        //Slabs
        addDrop(OAK_MOSAIC_SLABS);
        addDrop(BIRCH_MOSAIC_SLABS);
        addDrop(SPRUCE_MOSAIC_SLABS);
        addDrop(DARK_OAK_MOSAIC_SLABS);
        addDrop(JUNGLE_MOSAIC_SLABS);
        addDrop(ACACIA_MOSAIC_SLABS);
        addDrop(CRIMSON_MOSAIC_SLABS);
        addDrop(WARPED_MOSAIC_SLABS);
        addDrop(MANGROVE_MOSAIC_SLABS);
        addDrop(CHERRY_MOSAIC_SLABS);

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

        //Sawmill
        addDrop(SAWMILL);

        /*SilkTouch Stuff
        //Frames:*/
        dropsWithSilkTouch(OAK_FRAME);
        dropsWithSilkTouch(BIRCH_FRAME);
        dropsWithSilkTouch(SPRUCE_FRAME);

        //Lintels
        dropsWithSilkTouch(OAK_LINTELS);
        dropsWithSilkTouch(BIRCH_LINTELS);

    }
}
