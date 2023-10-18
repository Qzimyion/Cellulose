package net.qzimyion.cellulose.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

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
        addDrop(VERTICAL_OAK_PLANKS);
        addDrop(VERTICAL_BIRCH_PLANKS);
        addDrop(VERTICAL_SPRUCE_PLANKS);
        addDrop(VERTICAL_DARK_OAK_PLANKS);
        addDrop(VERTICAL_JUNGLE_PLANKS);
        addDrop(VERTICAL_ACACIA_PLANKS);
        addDrop(VERTICAL_CRIMSON_PLANKS);
        addDrop(VERTICAL_WARPED_PLANKS);
        addDrop(VERTICAL_MANGROVE_PLANKS);
        addDrop(VERTICAL_BAMBOO_PLANKS);
        addDrop(VERTICAL_CHERRY_PLANKS);
        addDrop(VERTICAL_CACTUS_PLANKS);
        //Mosaic
        addDrop(CACTUS_PLANKS);
        addDrop(CACTUS_CROWN);
        addDrop(STRIPPED_CACTUS);
        addDrop(STRIPPED_CACTUS_BUNDLE);
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
        /*Plank Pillars*/
        addDrop(OAK_PLANK_PILLARS);
        addDrop(BIRCH_PLANK_PILLARS);
        addDrop(SPRUCE_PLANK_PILLARS);
        addDrop(DARK_OAK_PLANK_PILLARS);
        addDrop(JUNGLE_PLANK_PILLARS);
        addDrop(ACACIA_PLANK_PILLARS);
        addDrop(CRIMSON_PLANK_PILLARS);
        addDrop(WARPED_PLANK_PILLARS);
        addDrop(MANGROVE_PLANK_PILLARS);
        addDrop(BAMBOO_PLANK_PILLARS);
        addDrop(CHERRY_PLANK_PILLARS);
        addDrop(CACTUS_PLANK_PILLARS);
        /*Beams*/
        addDrop(OAK_BEAM);
        addDrop(BIRCH_BEAM);
        addDrop(SPRUCE_BEAM);
        addDrop(DARK_OAK_BEAM);
        addDrop(JUNGLE_BEAM);
        addDrop(ACACIA_BEAM);
        addDrop(CRIMSON_BEAM);
        addDrop(WARPED_BEAM);
        addDrop(MANGROVE_BEAM);
        addDrop(BAMBOO_BEAM);
        addDrop(CHERRY_BEAM);
        addDrop(CACTUS_BEAM);
        /*Tiles*/
        addDrop(OAK_TILES);
        addDrop(BIRCH_TILES);
        addDrop(SPRUCE_TILES);
        addDrop(DARK_OAK_TILES);
        addDrop(JUNGLE_TILES);
        addDrop(ACACIA_TILES);
        addDrop(CRIMSON_TILES);
        addDrop(WARPED_TILES);
        addDrop(MANGROVE_TILES);
        addDrop(BAMBOO_TILES);
        addDrop(CHERRY_TILES);
        addDrop(CACTUS_TILES);
        /*Boards*/
        addDrop(OAK_TIMBERS);
        addDrop(BIRCH_TIMBERS);
        addDrop(SPRUCE_TIMBERS);
        addDrop(DARK_OAK_TIMBERS);
        addDrop(JUNGLE_TIMBERS);
        addDrop(ACACIA_TIMBERS);
        addDrop(CRIMSON_TIMBERS);
        addDrop(WARPED_TIMBERS);
        addDrop(MANGROVE_TIMBERS);
        addDrop(BAMBOO_TIMBERS);
        addDrop(CHERRY_TIMBERS);
        addDrop(CACTUS_TIMBERS);
        /*Glazed*/
        addDrop(OAK_GLAZED);
        addDrop(BIRCH_GLAZED);
        addDrop(SPRUCE_GLAZED);
        addDrop(DARK_OAK_GLAZED);
        addDrop(JUNGLE_GLAZED);
        addDrop(ACACIA_GLAZED);
        addDrop(CRIMSON_GLAZED);
        addDrop(WARPED_GLAZED);
        addDrop(MANGROVE_GLAZED);
        addDrop(BAMBOO_GLAZED);
        addDrop(CHERRY_GLAZED);
        addDrop(CACTUS_GLAZED);
        /*carved*/
        addDrop(CHISELED_OAK);
        addDrop(CHISELED_BIRCH);
        addDrop(CHISELED_SPRUCE);
        addDrop(CHISELED_DARK_OAK);
        addDrop(CHISELED_JUNGLE);
        addDrop(CHISELED_ACACIA);
        addDrop(CHISELED_CRIMSON);
        addDrop(CHISELED_WARPED);
        addDrop(CHISELED_MANGROVE);
        addDrop(CHISELED_BAMBOO);
        addDrop(CHISELED_CHERRY);
        addDrop(CHISELED_CACTUS);
        addDrop(CHISELED_AZALEA);
        addDrop(CHISELED_BLOOMING_AZALEA);
        /*Pavement*/
        addDrop(OAK_PLANK_PAVEMENT);
        addDrop(BIRCH_PLANK_PAVEMENT);
        addDrop(SPRUCE_PLANK_PAVEMENT);
        addDrop(DARK_OAK_PLANK_PAVEMENT);
        addDrop(JUNGLE_PLANK_PAVEMENT);
        addDrop(ACACIA_PLANK_PAVEMENT);
        addDrop(CRIMSON_PLANK_PAVEMENT);
        addDrop(WARPED_PLANK_PAVEMENT);
        addDrop(MANGROVE_PLANK_PAVEMENT);
        addDrop(BAMBOO_PLANK_PAVEMENT);
        addDrop(CHERRY_PLANK_PAVEMENT);
        addDrop(CACTUS_PLANK_PAVEMENT);

        //Stairs
        /*Vertical Planks*/
        addDrop(VERTICAL_OAK_SLAB, slabDrops(VERTICAL_OAK_SLAB));
        addDrop(VERTICAL_BIRCH_SLAB, slabDrops(VERTICAL_BIRCH_SLAB));
        addDrop(VERTICAL_SPRUCE_SLAB, slabDrops(VERTICAL_SPRUCE_SLAB));
        addDrop(VERTICAL_DARK_OAK_SLAB, slabDrops(VERTICAL_DARK_OAK_SLAB));
        addDrop(VERTICAL_JUNGLE_SLAB, slabDrops(VERTICAL_JUNGLE_SLAB));
        addDrop(VERTICAL_ACACIA_SLAB, slabDrops(VERTICAL_ACACIA_SLAB));
        addDrop(VERTICAL_CRIMSON_SLAB, slabDrops(VERTICAL_CRIMSON_SLAB));
        addDrop(VERTICAL_WARPED_SLAB, slabDrops(VERTICAL_WARPED_SLAB));
        addDrop(VERTICAL_MANGROVE_SLAB, slabDrops(VERTICAL_MANGROVE_SLAB));
        addDrop(VERTICAL_BAMBOO_SLAB, slabDrops(VERTICAL_BAMBOO_SLAB));
        addDrop(VERTICAL_CHERRY_SLAB, slabDrops(VERTICAL_CHERRY_SLAB));
        addDrop(VERTICAL_CACTUS_SLAB, slabDrops(VERTICAL_CACTUS_SLAB));
        addDrop(VERTICAL_OAK_STAIR);
        addDrop(VERTICAL_BIRCH_STAIR);
        addDrop(VERTICAL_SPRUCE_STAIR);
        addDrop(VERTICAL_DARK_OAK_STAIR);
        addDrop(VERTICAL_JUNGLE_STAIR);
        addDrop(VERTICAL_ACACIA_STAIR);
        addDrop(VERTICAL_CRIMSON_STAIR);
        addDrop(VERTICAL_WARPED_STAIR);
        addDrop(VERTICAL_MANGROVE_STAIR);
        addDrop(VERTICAL_BAMBOO_STAIR);
        addDrop(VERTICAL_CHERRY_STAIR);
        addDrop(VERTICAL_CACTUS_STAIR);
        /*Mosaic*/
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
        /*Tiles*/
        addDrop(OAK_TILES_STAIRS);
        addDrop(BIRCH_TILES_STAIRS);
        addDrop(SPRUCE_TILES_STAIRS);
        addDrop(DARK_OAK_TILES_STAIRS);
        addDrop(JUNGLE_TILES_STAIRS);
        addDrop(ACACIA_TILES_STAIRS);
        addDrop(CRIMSON_TILES_STAIRS);
        addDrop(WARPED_TILES_STAIRS);
        addDrop(MANGROVE_TILES_STAIRS);
        addDrop(BAMBOO_TILES_STAIRS);
        addDrop(CHERRY_TILES_STAIRS);
        addDrop(CACTUS_TILES_STAIRS);
        /*Boards*/
        addDrop(OAK_BOARDS_STAIRS);
        addDrop(BIRCH_BOARDS_STAIRS);
        addDrop(SPRUCE_BOARDS_STAIRS);
        addDrop(DARK_OAK_BOARDS_STAIRS);
        addDrop(JUNGLE_BOARDS_STAIRS);
        addDrop(ACACIA_BOARDS_STAIRS);
        addDrop(CRIMSON_BOARDS_STAIRS);
        addDrop(WARPED_BOARDS_STAIRS);
        addDrop(MANGROVE_BOARDS_STAIRS);
        addDrop(BAMBOO_BOARDS_STAIRS);
        addDrop(CHERRY_BOARDS_STAIRS);
        addDrop(CACTUS_BOARDS_STAIRS);
        /*Glazed*/
        addDrop(GLAZED_OAK_STAIRS);
        addDrop(GLAZED_BIRCH_STAIRS);
        addDrop(GLAZED_SPRUCE_STAIRS);
        addDrop(GLAZED_DARK_OAK_STAIRS);
        addDrop(GLAZED_JUNGLE_STAIRS);
        addDrop(GLAZED_ACACIA_STAIRS);
        addDrop(GLAZED_CRIMSON_STAIRS);
        addDrop(GLAZED_WARPED_STAIRS);
        addDrop(GLAZED_MANGROVE_STAIRS);
        addDrop(GLAZED_BAMBOO_STAIRS);
        addDrop(GLAZED_CHERRY_STAIRS);
        addDrop(GLAZED_CACTUS_STAIRS);

        //Slabs
        addDrop(CACTUS_SLAB, slabDrops(CACTUS_SLAB));
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
        /*Tiles*/
        addDrop(OAK_TILES_SLABS, slabDrops(OAK_TILES_SLABS));
        addDrop(BIRCH_TILES_SLABS, slabDrops(BIRCH_TILES_SLABS));
        addDrop(SPRUCE_TILES_SLABS, slabDrops(SPRUCE_TILES_SLABS));
        addDrop(DARK_OAK_TILES_SLABS, slabDrops(DARK_OAK_TILES_SLABS));
        addDrop(JUNGLE_TILES_SLABS, slabDrops(JUNGLE_TILES_SLABS));
        addDrop(ACACIA_TILES_SLABS, slabDrops(ACACIA_TILES_SLABS));
        addDrop(CRIMSON_TILES_SLABS, slabDrops(CRIMSON_TILES_SLABS));
        addDrop(WARPED_TILES_SLABS, slabDrops(WARPED_TILES_SLABS));
        addDrop(MANGROVE_TILES_SLABS, slabDrops(MANGROVE_TILES_SLABS));
        addDrop(BAMBOO_TILES_SLABS, slabDrops(BAMBOO_TILES_SLABS));
        addDrop(CHERRY_TILES_SLABS, slabDrops(CHERRY_TILES_SLABS));
        addDrop(CACTUS_TILES_SLABS, slabDrops(CACTUS_TILES_SLABS));
        /*Boards*/
        addDrop(OAK_BOARDS_SLABS, slabDrops(OAK_BOARDS_SLABS));
        addDrop(BIRCH_BOARDS_SLABS, slabDrops(BIRCH_BOARDS_SLABS));
        addDrop(SPRUCE_BOARDS_SLABS, slabDrops(SPRUCE_BOARDS_SLABS));
        addDrop(DARK_OAK_BOARDS_SLABS, slabDrops(DARK_OAK_BOARDS_SLABS));
        addDrop(JUNGLE_BOARDS_SLABS, slabDrops(JUNGLE_BOARDS_SLABS));
        addDrop(ACACIA_BOARDS_SLABS, slabDrops(ACACIA_BOARDS_SLABS));
        addDrop(CRIMSON_BOARDS_SLABS, slabDrops(CRIMSON_BOARDS_SLABS));
        addDrop(WARPED_BOARDS_SLABS, slabDrops(WARPED_BOARDS_SLABS));
        addDrop(MANGROVE_BOARDS_SLABS, slabDrops(MANGROVE_BOARDS_SLABS));
        addDrop(BAMBOO_BOARDS_SLABS, slabDrops(BAMBOO_BOARDS_SLABS));
        addDrop(CHERRY_BOARDS_SLABS, slabDrops(CHERRY_BOARDS_SLABS));
        addDrop(CACTUS_BOARDS_SLABS, slabDrops(CACTUS_BOARDS_SLABS));
        /*Glazed*/
        addDrop(GLAZED_OAK_SLABS, slabDrops(GLAZED_OAK_SLABS));
        addDrop(GLAZED_BIRCH_SLABS, slabDrops(GLAZED_BIRCH_SLABS));
        addDrop(GLAZED_SPRUCE_SLABS, slabDrops(GLAZED_SPRUCE_SLABS));
        addDrop(GLAZED_DARK_OAK_SLABS, slabDrops(GLAZED_DARK_OAK_SLABS));
        addDrop(GLAZED_JUNGLE_SLABS, slabDrops(GLAZED_JUNGLE_SLABS));
        addDrop(GLAZED_ACACIA_SLABS, slabDrops(GLAZED_ACACIA_SLABS));
        addDrop(GLAZED_CRIMSON_SLABS, slabDrops(GLAZED_CRIMSON_SLABS));
        addDrop(GLAZED_WARPED_SLABS, slabDrops(GLAZED_WARPED_SLABS));
        addDrop(GLAZED_MANGROVE_SLABS, slabDrops(GLAZED_MANGROVE_SLABS));
        addDrop(GLAZED_BAMBOO_SLABS, slabDrops(GLAZED_BAMBOO_SLABS));
        addDrop(GLAZED_CHERRY_SLABS, slabDrops(GLAZED_CHERRY_SLABS));
        addDrop(GLAZED_CACTUS_SLABS, slabDrops(GLAZED_CACTUS_SLABS));

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


        //Chipped logs and wood
        addDrop(CHIPPED_OAK);
        addDrop(CHIPPED_BIRCH);
        addDrop(CHIPPED_SPRUCE);
        addDrop(CHIPPED_DARK_OAK);
        addDrop(CHIPPED_JUNGLE);
        addDrop(CHIPPED_ACACIA);
        addDrop(CHIPPED_CRIMSON);
        addDrop(CHIPPED_WARPED);
        addDrop(CHIPPED_MANGROVE);
        addDrop(CHIPPED_BAMBOO_BLOCK);
        addDrop(CHIPPED_CHERRY);
        addDrop(CHIPPED_CACTUS);
        addDrop(CHIPPED_OAK_WOOD);
        addDrop(CHIPPED_BIRCH_WOOD);
        addDrop(CHIPPED_SPRUCE_WOOD);
        addDrop(CHIPPED_DARK_OAK_WOOD);
        addDrop(CHIPPED_JUNGLE_WOOD);
        addDrop(CHIPPED_ACACIA_WOOD);
        addDrop(CHIPPED_CRIMSON_HYPHAE);
        addDrop(CHIPPED_WARPED_HYPHAE);
        addDrop(CHIPPED_MANGROVE_WOOD);
        addDrop(CHIPPED_BAMBOO_WOOD);
        addDrop(CHIPPED_CHERRY_WOOD);
        addDrop(CHIPPED_CACTUS_CROWN);

        //Barricades

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

        //Frames
        addDrop(OAK_FRAME, dropsWithSilkTouch(OAK_FRAME));
        addDrop(BIRCH_FRAME, dropsWithSilkTouch(BIRCH_FRAME));
        addDrop(SPRUCE_FRAME, dropsWithSilkTouch(SPRUCE_FRAME));
        addDrop(DARK_OAK_FRAME, dropsWithSilkTouch(DARK_OAK_FRAME));
        addDrop(JUNGLE_FRAME, dropsWithSilkTouch(JUNGLE_FRAME));
        addDrop(ACACIA_FRAME, dropsWithSilkTouch(ACACIA_FRAME));
        addDrop(CRIMSON_FRAME, dropsWithSilkTouch(CRIMSON_FRAME));
        addDrop(WARPED_FRAME, dropsWithSilkTouch(WARPED_FRAME));
        addDrop(MANGROVE_FRAME, dropsWithSilkTouch(MANGROVE_FRAME));
        addDrop(BAMBOO_FRAME, dropsWithSilkTouch(BAMBOO_FRAME));
        addDrop(CHERRY_FRAME, dropsWithSilkTouch(CHERRY_FRAME));
        addDrop(CACTUS_FRAME, dropsWithSilkTouch(CACTUS_FRAME));
        addDrop(AZALEA_FRAME, dropsWithSilkTouch(AZALEA_FRAME));
        addDrop(BLOOMING_AZALEA_FRAME, dropsWithSilkTouch(BLOOMING_AZALEA_FRAME));

        //Lintels
        addDrop(OAK_LINTELS, dropsWithSilkTouch(OAK_LINTELS));
        addDrop(BIRCH_LINTELS, dropsWithSilkTouch(BIRCH_LINTELS));
        addDrop(SPRUCE_LINTELS, dropsWithSilkTouch(SPRUCE_LINTELS));
        addDrop(DARK_OAK_LINTELS, dropsWithSilkTouch(DARK_OAK_LINTELS));
        addDrop(JUNGLE_LINTELS, dropsWithSilkTouch(JUNGLE_LINTELS));
        addDrop(ACACIA_LINTELS, dropsWithSilkTouch(ACACIA_LINTELS));
        addDrop(CRIMSON_LINTELS, dropsWithSilkTouch(CRIMSON_LINTELS));
        addDrop(WARPED_LINTELS, dropsWithSilkTouch(WARPED_LINTELS));
        addDrop(MANGROVE_LINTELS, dropsWithSilkTouch(MANGROVE_LINTELS));
        addDrop(BAMBOO_LINTELS, dropsWithSilkTouch(BAMBOO_LINTELS));
        addDrop(CHERRY_LINTELS, dropsWithSilkTouch(CHERRY_LINTELS));
        addDrop(CACTUS_LINTELS, dropsWithSilkTouch(CACTUS_LINTELS));
        addDrop(AZALEA_LINTELS, dropsWithSilkTouch(AZALEA_LINTELS));
        addDrop(BLOOMING_AZALEA_LINTELS, dropsWithSilkTouch(BLOOMING_AZALEA_LINTELS));

        //Misc
        addDrop(CACTUS_BUNDLE);
        addDrop(PAPER_BLOCK);
        addDrop(SOAKED_PAPER_BLOCK);
        addDrop(BLOCK_OF_CHARCOAL);
        addDrop(BLOCK_OF_STICKS);

        //Chipped Planks
        addDrop(CHIPPED_WARPED_PLANKS);
        addDrop(CHIPPED_WARPED_STAIR);
        addDrop(CHIPPED_WARPED_SLAB);

        ///Potion Rack
        addDrop(POTION_RACK, dropsWithSilkTouch(POTION_RACK));

    }
    public LootTable.Builder BookshelfDrops(Block drop) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ((LeafEntry.Builder) ItemEntry.builder(Items.BOOK).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3,3))))));
    }

}
