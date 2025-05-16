package net.qzimyion.cellulose.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

@SuppressWarnings({"rawtypes", "unchecked"})
public class CelluloseBlockLootTableProvider extends FabricBlockLootTableProvider {
    public CelluloseBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Blocks
        //Vertical Planks
        dropSelf(VERTICAL_OAK_PLANKS);
        dropSelf(VERTICAL_BIRCH_PLANKS);
        dropSelf(VERTICAL_SPRUCE_PLANKS);
        dropSelf(VERTICAL_DARK_OAK_PLANKS);
        dropSelf(VERTICAL_JUNGLE_PLANKS);
        dropSelf(VERTICAL_ACACIA_PLANKS);
        dropSelf(VERTICAL_CRIMSON_PLANKS);
        dropSelf(VERTICAL_WARPED_PLANKS);
        dropSelf(VERTICAL_MANGROVE_PLANKS);
        dropSelf(VERTICAL_BAMBOO_PLANKS);
        dropSelf(VERTICAL_CHERRY_PLANKS);
        dropSelf(VERTICAL_CACTUS_PLANKS);
        //Mosaic
        dropSelf(CACTUS_PLANKS);
        dropSelf(CACTUS_CROWN);
        dropSelf(STRIPPED_CACTUS);
        dropSelf(STRIPPED_CACTUS_BUNDLE);
        dropSelf(OAK_MOSAIC);
        dropSelf(BIRCH_MOSAIC);
        dropSelf(SPRUCE_MOSAIC);
        dropSelf(DARK_OAK_MOSAIC);
        dropSelf(JUNGLE_MOSAIC);
        dropSelf(ACACIA_MOSAIC);
        dropSelf(CRIMSON_MOSAIC);
        dropSelf(WARPED_MOSAIC);
        dropSelf(MANGROVE_MOSAIC);
        dropSelf(CHERRY_MOSAIC);
        dropSelf(CACTUS_MOSAIC);
        /*Plank Pillars*/
        dropSelf(OAK_PLANK_PILLARS);
        dropSelf(BIRCH_PLANK_PILLARS);
        dropSelf(SPRUCE_PLANK_PILLARS);
        dropSelf(DARK_OAK_PLANK_PILLARS);
        dropSelf(JUNGLE_PLANK_PILLARS);
        dropSelf(ACACIA_PLANK_PILLARS);
        dropSelf(CRIMSON_PLANK_PILLARS);
        dropSelf(WARPED_PLANK_PILLARS);
        dropSelf(MANGROVE_PLANK_PILLARS);
        dropSelf(BAMBOO_PLANK_PILLARS);
        dropSelf(CHERRY_PLANK_PILLARS);
        dropSelf(CACTUS_PLANK_PILLARS);
        /*Log mosaics*/
        dropSelf(OAK_LOG_MOSAIC);
        dropSelf(BIRCH_LOG_MOSAIC);
        dropSelf(SPRUCE_LOG_MOSAIC);
        dropSelf(DARK_LOG_MOSAIC);
        dropSelf(JUNGLE_LOG_MOSAIC);
        dropSelf(ACACIA_LOG_MOSAIC);
        dropSelf(CRIMSON_LOG_MOSAIC);
        dropSelf(WARPED_LOG_MOSAIC);
        dropSelf(MANGROVE_LOG_MOSAIC);
        dropSelf(BAMBOO_LOG_MOSAIC);
        dropSelf(CHERRY_LOG_MOSAIC);
        dropSelf(CACTUS_LOG_MOSAIC);
        dropSelf(AZALEA_LOG_MOSAIC);
        /*Tiles*/
        dropSelf(OAK_BOARDS);
        dropSelf(BIRCH_TILES);
        dropSelf(SPRUCE_TILES);
        dropSelf(DARK_OAK_TILES);
        dropSelf(JUNGLE_TILES);
        dropSelf(ACACIA_TILES);
        dropSelf(CRIMSON_TILES);
        dropSelf(WARPED_TILES);
        dropSelf(MANGROVE_TILES);
        dropSelf(BAMBOO_TILES);
        dropSelf(CHERRY_TILES);
        dropSelf(CACTUS_TILES);
        /*Boards*/
        dropSelf(OAK_TIMBERS);
        dropSelf(BIRCH_TIMBERS);
        dropSelf(SPRUCE_TIMBERS);
        dropSelf(DARK_OAK_TIMBERS);
        dropSelf(JUNGLE_TIMBERS);
        dropSelf(ACACIA_TIMBERS);
        dropSelf(CRIMSON_TIMBERS);
        dropSelf(WARPED_TIMBERS);
        dropSelf(MANGROVE_TIMBERS);
        dropSelf(BAMBOO_TIMBERS);
        dropSelf(CHERRY_TIMBERS);
        dropSelf(CACTUS_TIMBERS);
        /*Glazed*/
        dropSelf(OAK_GLAZED);
        dropSelf(BIRCH_GLAZED);
        dropSelf(SPRUCE_GLAZED);
        dropSelf(DARK_OAK_GLAZED);
        dropSelf(JUNGLE_GLAZED);
        dropSelf(ACACIA_GLAZED);
        dropSelf(CRIMSON_GLAZED);
        dropSelf(WARPED_GLAZED);
        dropSelf(MANGROVE_GLAZED);
        dropSelf(BAMBOO_GLAZED);
        dropSelf(CHERRY_GLAZED);
        dropSelf(CACTUS_GLAZED);
        /*carved*/
        dropSelf(CHISELED_OAK);
        dropSelf(CHISELED_BIRCH);
        dropSelf(CHISELED_SPRUCE);
        dropSelf(CHISELED_DARK_OAK);
        dropSelf(CHISELED_JUNGLE);
        dropSelf(CHISELED_ACACIA);
        dropSelf(CHISELED_CRIMSON);
        dropSelf(CHISELED_WARPED);
        dropSelf(CHISELED_MANGROVE);
        dropSelf(CHISELED_BAMBOO);
        dropSelf(CHISELED_CHERRY);
        dropSelf(CHISELED_CACTUS);
        dropSelf(CHISELED_AZALEA);
        /*Pavement*/
        dropSelf(OAK_PLANK_PAVEMENT);
        dropSelf(BIRCH_PLANK_PAVEMENT);
        dropSelf(SPRUCE_PLANK_PAVEMENT);
        dropSelf(DARK_OAK_PLANK_PAVEMENT);
        dropSelf(JUNGLE_PLANK_PAVEMENT);
        dropSelf(ACACIA_PLANK_PAVEMENT);
        dropSelf(CRIMSON_PLANK_PAVEMENT);
        dropSelf(WARPED_PLANK_PAVEMENT);
        dropSelf(MANGROVE_PLANK_PAVEMENT);
        dropSelf(BAMBOO_PLANK_PAVEMENT);
        dropSelf(CHERRY_PLANK_PAVEMENT);
        dropSelf(CACTUS_PLANK_PAVEMENT);

        //Stairs
        /*Vertical Planks*/
        add(VERTICAL_OAK_SLAB, createSlabItemTable(VERTICAL_OAK_SLAB));
        add(VERTICAL_BIRCH_SLAB, createSlabItemTable(VERTICAL_BIRCH_SLAB));
        add(VERTICAL_SPRUCE_SLAB, createSlabItemTable(VERTICAL_SPRUCE_SLAB));
        add(VERTICAL_DARK_OAK_SLAB, createSlabItemTable(VERTICAL_DARK_OAK_SLAB));
        add(VERTICAL_JUNGLE_SLAB, createSlabItemTable(VERTICAL_JUNGLE_SLAB));
        add(VERTICAL_ACACIA_SLAB, createSlabItemTable(VERTICAL_ACACIA_SLAB));
        add(VERTICAL_CRIMSON_SLAB, createSlabItemTable(VERTICAL_CRIMSON_SLAB));
        add(VERTICAL_WARPED_SLAB, createSlabItemTable(VERTICAL_WARPED_SLAB));
        add(VERTICAL_MANGROVE_SLAB, createSlabItemTable(VERTICAL_MANGROVE_SLAB));
        add(VERTICAL_BAMBOO_SLAB, createSlabItemTable(VERTICAL_BAMBOO_SLAB));
        add(VERTICAL_CHERRY_SLAB, createSlabItemTable(VERTICAL_CHERRY_SLAB));
        add(VERTICAL_CACTUS_SLAB, createSlabItemTable(VERTICAL_CACTUS_SLAB));
        dropSelf(VERTICAL_OAK_STAIR);
        dropSelf(VERTICAL_BIRCH_STAIR);
        dropSelf(VERTICAL_SPRUCE_STAIR);
        dropSelf(VERTICAL_DARK_OAK_STAIR);
        dropSelf(VERTICAL_JUNGLE_STAIR);
        dropSelf(VERTICAL_ACACIA_STAIR);
        dropSelf(VERTICAL_CRIMSON_STAIR);
        dropSelf(VERTICAL_WARPED_STAIR);
        dropSelf(VERTICAL_MANGROVE_STAIR);
        dropSelf(VERTICAL_BAMBOO_STAIR);
        dropSelf(VERTICAL_CHERRY_STAIR);
        dropSelf(VERTICAL_CACTUS_STAIR);
        /*Mosaic*/
        dropSelf(CACTUS_STAIRS);
        dropSelf(OAK_MOSAIC_STAIRS);
        dropSelf(BIRCH_MOSAIC_STAIRS);
        dropSelf(SPRUCE_MOSAIC_STAIRS);
        dropSelf(DARK_OAK_MOSAIC_STAIRS);
        dropSelf(JUNGLE_MOSAIC_STAIRS);
        dropSelf(ACACIA_MOSAIC_STAIRS);
        dropSelf(CRIMSON_MOSAIC_STAIRS);
        dropSelf(WARPED_MOSAIC_STAIRS);
        dropSelf(MANGROVE_MOSAIC_STAIRS);
        dropSelf(CHERRY_MOSAIC_STAIRS);
        dropSelf(CACTUS_MOSAIC_STAIRS);
        /*Tiles*/
        dropSelf(OAK_TILES_STAIRS);
        dropSelf(BIRCH_TILES_STAIRS);
        dropSelf(SPRUCE_TILES_STAIRS);
        dropSelf(DARK_OAK_TILES_STAIRS);
        dropSelf(JUNGLE_TILES_STAIRS);
        dropSelf(ACACIA_TILES_STAIRS);
        dropSelf(CRIMSON_TILES_STAIRS);
        dropSelf(WARPED_TILES_STAIRS);
        dropSelf(MANGROVE_TILES_STAIRS);
        dropSelf(BAMBOO_TILES_STAIRS);
        dropSelf(CHERRY_TILES_STAIRS);
        dropSelf(CACTUS_TILES_STAIRS);
        /*Boards*/
        dropSelf(OAK_TIMBERS_STAIRS);
        dropSelf(BIRCH_TIMBERS_STAIRS);
        dropSelf(SPRUCE_TIMBERS_STAIRS);
        dropSelf(DARK_OAK_TIMBERS_STAIRS);
        dropSelf(JUNGLE_TIMBERS_STAIRS);
        dropSelf(ACACIA_TIMBERS_STAIRS);
        dropSelf(CRIMSON_TIMBERS_STAIRS);
        dropSelf(WARPED_TIMBERS_STAIRS);
        dropSelf(MANGROVE_TIMBERS_STAIRS);
        dropSelf(BAMBOO_TIMBERS_STAIRS);
        dropSelf(CHERRY_TIMBERS_STAIRS);
        dropSelf(CACTUS_TIMBERS_STAIRS);
        /*Glazed*/
        dropSelf(GLAZED_OAK_STAIRS);
        dropSelf(GLAZED_BIRCH_STAIRS);
        dropSelf(GLAZED_SPRUCE_STAIRS);
        dropSelf(GLAZED_DARK_OAK_STAIRS);
        dropSelf(GLAZED_JUNGLE_STAIRS);
        dropSelf(GLAZED_ACACIA_STAIRS);
        dropSelf(GLAZED_CRIMSON_STAIRS);
        dropSelf(GLAZED_WARPED_STAIRS);
        dropSelf(GLAZED_MANGROVE_STAIRS);
        dropSelf(GLAZED_BAMBOO_STAIRS);
        dropSelf(GLAZED_CHERRY_STAIRS);
        dropSelf(GLAZED_CACTUS_STAIRS);

        //Slabs
        add(CACTUS_SLAB, createSlabItemTable(CACTUS_SLAB));
        add(OAK_MOSAIC_SLABS, createSlabItemTable(OAK_MOSAIC_SLABS));
        add(BIRCH_MOSAIC_SLABS, createSlabItemTable(BIRCH_MOSAIC_SLABS));
        add(SPRUCE_MOSAIC_SLABS, createSlabItemTable(SPRUCE_MOSAIC_SLABS));
        add(DARK_OAK_MOSAIC_SLABS, createSlabItemTable(DARK_OAK_MOSAIC_SLABS));
        add(JUNGLE_MOSAIC_SLABS, createSlabItemTable(JUNGLE_MOSAIC_SLABS));
        add(ACACIA_MOSAIC_SLABS, createSlabItemTable(ACACIA_MOSAIC_SLABS));
        add(CRIMSON_MOSAIC_SLABS, createSlabItemTable(CRIMSON_MOSAIC_SLABS));
        add(WARPED_MOSAIC_SLABS, createSlabItemTable(WARPED_MOSAIC_SLABS));
        add(MANGROVE_MOSAIC_SLABS, createSlabItemTable(MANGROVE_MOSAIC_SLABS));
        add(CHERRY_MOSAIC_SLABS, createSlabItemTable(CHERRY_MOSAIC_SLABS));
        add(CACTUS_MOSAIC_SLABS, createSlabItemTable(CACTUS_MOSAIC_SLABS));

        /*Tiles*/
        add(OAK_TILES_SLABS, createSlabItemTable(OAK_TILES_SLABS));
        add(BIRCH_TILES_SLABS, createSlabItemTable(BIRCH_TILES_SLABS));
        add(SPRUCE_TILES_SLABS, createSlabItemTable(SPRUCE_TILES_SLABS));
        add(DARK_OAK_TILES_SLABS, createSlabItemTable(DARK_OAK_TILES_SLABS));
        add(JUNGLE_TILES_SLABS, createSlabItemTable(JUNGLE_TILES_SLABS));
        add(ACACIA_TILES_SLABS, createSlabItemTable(ACACIA_TILES_SLABS));
        add(CRIMSON_TILES_SLABS, createSlabItemTable(CRIMSON_TILES_SLABS));
        add(WARPED_TILES_SLABS, createSlabItemTable(WARPED_TILES_SLABS));
        add(MANGROVE_TILES_SLABS, createSlabItemTable(MANGROVE_TILES_SLABS));
        add(BAMBOO_TILES_SLABS, createSlabItemTable(BAMBOO_TILES_SLABS));
        add(CHERRY_TILES_SLABS, createSlabItemTable(CHERRY_TILES_SLABS));
        add(CACTUS_TILES_SLABS, createSlabItemTable(CACTUS_TILES_SLABS));
        /*Boards*/
        add(OAK_TIMBERS_SLABS, createSlabItemTable(OAK_TIMBERS_SLABS));
        add(BIRCH_TIMBERS_SLABS, createSlabItemTable(BIRCH_TIMBERS_SLABS));
        add(SPRUCE_TIMBERS_SLABS, createSlabItemTable(SPRUCE_TIMBERS_SLABS));
        add(DARK_OAK_TIMBERS_SLABS, createSlabItemTable(DARK_OAK_TIMBERS_SLABS));
        add(JUNGLE_TIMBERS_SLABS, createSlabItemTable(JUNGLE_TIMBERS_SLABS));
        add(ACACIA_TIMBERS_SLABS, createSlabItemTable(ACACIA_TIMBERS_SLABS));
        add(CRIMSON_TIMBERS_SLABS, createSlabItemTable(CRIMSON_TIMBERS_SLABS));
        add(WARPED_TIMBERS_SLABS, createSlabItemTable(WARPED_TIMBERS_SLABS));
        add(MANGROVE_TIMBERS_SLABS, createSlabItemTable(MANGROVE_TIMBERS_SLABS));
        add(BAMBOO_TIMBERS_SLABS, createSlabItemTable(BAMBOO_TIMBERS_SLABS));
        add(CHERRY_TIMBERS_SLABS, createSlabItemTable(CHERRY_TIMBERS_SLABS));
        add(CACTUS_TIMBERS_SLABS, createSlabItemTable(CACTUS_TIMBERS_SLABS));
        /*Glazed*/
        add(GLAZED_OAK_SLABS, createSlabItemTable(GLAZED_OAK_SLABS));
        add(GLAZED_BIRCH_SLABS, createSlabItemTable(GLAZED_BIRCH_SLABS));
        add(GLAZED_SPRUCE_SLABS, createSlabItemTable(GLAZED_SPRUCE_SLABS));
        add(GLAZED_DARK_OAK_SLABS, createSlabItemTable(GLAZED_DARK_OAK_SLABS));
        add(GLAZED_JUNGLE_SLABS, createSlabItemTable(GLAZED_JUNGLE_SLABS));
        add(GLAZED_ACACIA_SLABS, createSlabItemTable(GLAZED_ACACIA_SLABS));
        add(GLAZED_CRIMSON_SLABS, createSlabItemTable(GLAZED_CRIMSON_SLABS));
        add(GLAZED_WARPED_SLABS, createSlabItemTable(GLAZED_WARPED_SLABS));
        add(GLAZED_MANGROVE_SLABS, createSlabItemTable(GLAZED_MANGROVE_SLABS));
        add(GLAZED_BAMBOO_SLABS, createSlabItemTable(GLAZED_BAMBOO_SLABS));
        add(GLAZED_CHERRY_SLABS, createSlabItemTable(GLAZED_CHERRY_SLABS));
        add(GLAZED_CACTUS_SLABS, createSlabItemTable(GLAZED_CACTUS_SLABS));

        //Engraved logs and wood
        dropSelf(ENGRAVED_OAK);
        dropSelf(ENGRAVED_BIRCH);
        dropSelf(ENGRAVED_SPRUCE);
        dropSelf(ENGRAVED_DARK_OAK);
        dropSelf(ENGRAVED_JUNGLE);
        dropSelf(ENGRAVED_ACACIA);
        dropSelf(ENGRAVED_CRIMSON);
        dropSelf(ENGRAVED_WARPED);
        dropSelf(ENGRAVED_MANGROVE);
        dropSelf(ENGRAVED_CHERRY);
        dropSelf(ENGRAVED_CACTUS);
        dropSelf(ENGRAVED_OAK_WOOD);
        dropSelf(ENGRAVED_BIRCH_WOOD);
        dropSelf(ENGRAVED_SPRUCE_WOOD);
        dropSelf(ENGRAVED_DARK_OAK_WOOD);
        dropSelf(ENGRAVED_JUNGLE_WOOD);
        dropSelf(ENGRAVED_ACACIA_WOOD);
        dropSelf(ENGRAVED_CRIMSON_HYPHAE);
        dropSelf(ENGRAVED_WARPED_HYPHAE);
        dropSelf(ENGRAVED_MANGROVE_WOOD);
        dropSelf(ENGRAVED_CHERRY_WOOD);
        dropSelf(ENGRAVED_CACTUS_CROWN);


        //Chipped logs and wood
        dropSelf(CHIPPED_OAK);
        dropSelf(CHIPPED_BIRCH);
        dropSelf(CHIPPED_SPRUCE);
        dropSelf(CHIPPED_DARK_OAK);
        dropSelf(CHIPPED_JUNGLE);
        dropSelf(CHIPPED_ACACIA);
        dropSelf(CHIPPED_CRIMSON);
        dropSelf(CHIPPED_WARPED);
        dropSelf(CHIPPED_MANGROVE);
        dropSelf(CHIPPED_BAMBOO_BLOCK);
        dropSelf(CHIPPED_CHERRY);
        dropSelf(CHIPPED_CACTUS);
        dropSelf(CHIPPED_OAK_WOOD);
        dropSelf(CHIPPED_BIRCH_WOOD);
        dropSelf(CHIPPED_SPRUCE_WOOD);
        dropSelf(CHIPPED_DARK_OAK_WOOD);
        dropSelf(CHIPPED_JUNGLE_WOOD);
        dropSelf(CHIPPED_ACACIA_WOOD);
        dropSelf(CHIPPED_CRIMSON_HYPHAE);
        dropSelf(CHIPPED_WARPED_HYPHAE);
        dropSelf(CHIPPED_MANGROVE_WOOD);
        dropSelf(CHIPPED_BAMBOO_WOOD);
        dropSelf(CHIPPED_CHERRY_WOOD);
        dropSelf(CHIPPED_CACTUS_CROWN);

        //Barricades

        //Fences and Fence-gates
        dropSelf(CACTUS_FENCE);
        dropSelf(CACTUS_FENCE_GATE);

        //Button
        dropSelf(CACTUS_BUTTON);

        //Pressure Plate
        dropSelf(CACTUS_PRESSURE_PLATE);

        //Door and Trapdoors
        add(CACTUS_DOOR, createDoorTable(CACTUS_DOOR));
        dropSelf(CACTUS_TRAPDOOR);

        //Sawmill
        dropSelf(SAWMILL);

        //Frames
        add(OAK_FRAME, createSilkTouchOnlyTable(OAK_FRAME));
        add(BIRCH_FRAME, createSilkTouchOnlyTable(BIRCH_FRAME));
        add(SPRUCE_FRAME, createSilkTouchOnlyTable(SPRUCE_FRAME));
        add(DARK_OAK_FRAME, createSilkTouchOnlyTable(DARK_OAK_FRAME));
        add(JUNGLE_FRAME, createSilkTouchOnlyTable(JUNGLE_FRAME));
        add(ACACIA_FRAME, createSilkTouchOnlyTable(ACACIA_FRAME));
        add(CRIMSON_FRAME, createSilkTouchOnlyTable(CRIMSON_FRAME));
        add(WARPED_FRAME, createSilkTouchOnlyTable(WARPED_FRAME));
        add(MANGROVE_FRAME, createSilkTouchOnlyTable(MANGROVE_FRAME));
        add(BAMBOO_FRAME, createSilkTouchOnlyTable(BAMBOO_FRAME));
        add(CHERRY_FRAME, createSilkTouchOnlyTable(CHERRY_FRAME));
        add(CACTUS_FRAME, createSilkTouchOnlyTable(CACTUS_FRAME));
        add(AZALEA_FRAME, createSilkTouchOnlyTable(AZALEA_FRAME));

        //Lintels
        add(OAK_LINTELS, createSilkTouchOnlyTable(OAK_LINTELS));
        add(BIRCH_LINTELS, createSilkTouchOnlyTable(BIRCH_LINTELS));
        add(SPRUCE_LINTELS, createSilkTouchOnlyTable(SPRUCE_LINTELS));
        add(DARK_OAK_LINTELS, createSilkTouchOnlyTable(DARK_OAK_LINTELS));
        add(JUNGLE_LINTELS, createSilkTouchOnlyTable(JUNGLE_LINTELS));
        add(ACACIA_LINTELS, createSilkTouchOnlyTable(ACACIA_LINTELS));
        add(CRIMSON_LINTELS, createSilkTouchOnlyTable(CRIMSON_LINTELS));
        add(WARPED_LINTELS, createSilkTouchOnlyTable(WARPED_LINTELS));
        add(MANGROVE_LINTELS, createSilkTouchOnlyTable(MANGROVE_LINTELS));
        add(BAMBOO_LINTELS, createSilkTouchOnlyTable(BAMBOO_LINTELS));
        add(CHERRY_LINTELS, createSilkTouchOnlyTable(CHERRY_LINTELS));
        add(CACTUS_LINTELS, createSilkTouchOnlyTable(CACTUS_LINTELS));
        add(AZALEA_LINTELS, createSilkTouchOnlyTable(AZALEA_LINTELS));

        //Misc
        dropSelf(CACTUS_BUNDLE);
        dropSelf(PAPER_BLOCK);
        dropSelf(SOAKED_PAPER_BLOCK);

        //Chipped Planks
        dropSelf(CHIPPED_WARPED_PLANKS);
        dropSelf(CHIPPED_WARPED_STAIRS);
        dropSelf(CHIPPED_WARPED_SLAB);

        ///Potion Rack
        add(POTION_RACK, createSilkTouchOnlyTable(POTION_RACK));

    }
    public LootTable.Builder BookshelfDrops(Block drop) {
        return BlockLootSubProvider.createSilkTouchDispatchTable(drop, (LootPoolEntryContainer.Builder)this.applyExplosionDecay(drop, ((LootPoolSingletonContainer.Builder) LootItem.lootTableItem(Items.BOOK).apply(SetItemCountFunction.setCount(UniformGenerator.between(3,3))))));
    }

}
