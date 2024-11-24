package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.qzimyion.cellulose.util.CelluloseTags;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.tags.ItemTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.boats.CelluloseBoats.*;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

@SuppressWarnings("noinspection deprecation")
public class CelluloseItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public CelluloseItemTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void addTags(HolderLookup.Provider arg) {
        //==Vanilla Tags==//
        getOrCreateTagBuilder(PLANKS)
                .add(Item.byBlock(BLOOMING_AZALEA_PLANKS))
                .add(Item.byBlock(AZALEA_PLANKS))
                .add(Item.byBlock(CACTUS_PLANKS))
                .add(Item.byBlock(VERTICAL_OAK_PLANKS))
                .add(Item.byBlock(VERTICAL_BIRCH_PLANKS))
                .add(Item.byBlock(VERTICAL_SPRUCE_PLANKS))
                .add(Item.byBlock(VERTICAL_DARK_OAK_PLANKS))
                .add(Item.byBlock(VERTICAL_JUNGLE_PLANKS))
                .add(Item.byBlock(VERTICAL_ACACIA_PLANKS))
                .add(Item.byBlock(VERTICAL_CRIMSON_PLANKS))
                .add(Item.byBlock(VERTICAL_WARPED_PLANKS))
                .add(Item.byBlock(VERTICAL_MANGROVE_PLANKS))
                .add(Item.byBlock(VERTICAL_BAMBOO_PLANKS))
                .add(Item.byBlock(VERTICAL_CHERRY_PLANKS))
                .add(Item.byBlock(VERTICAL_CACTUS_PLANKS))
                .add(Item.byBlock(VERTICAL_AZALEA_PLANKS))
                .add(Item.byBlock(VERTICAL_BLOOMING_AZALEA_PLANKS));

        getOrCreateTagBuilder(WOODEN_SLABS)
                .add(Item.byBlock(BLOOMING_AZALEA_SLAB))
                .add(Item.byBlock(AZALEA_SLAB))
                .add(Item.byBlock(CACTUS_SLAB))
                .add(Item.byBlock(VERTICAL_OAK_SLAB))
                .add(Item.byBlock(VERTICAL_BIRCH_SLAB))
                .add(Item.byBlock(VERTICAL_SPRUCE_SLAB))
                .add(Item.byBlock(VERTICAL_DARK_OAK_SLAB))
                .add(Item.byBlock(VERTICAL_JUNGLE_SLAB))
                .add(Item.byBlock(VERTICAL_ACACIA_SLAB))
                .add(Item.byBlock(VERTICAL_CRIMSON_SLAB))
                .add(Item.byBlock(VERTICAL_WARPED_SLAB))
                .add(Item.byBlock(VERTICAL_MANGROVE_SLAB))
                .add(Item.byBlock(VERTICAL_BAMBOO_SLAB))
                .add(Item.byBlock(VERTICAL_CHERRY_SLAB))
                .add(Item.byBlock(VERTICAL_CACTUS_SLAB))
                .add(Item.byBlock(VERTICAL_AZALEA_SLAB))
                .add(Item.byBlock(VERTICAL_BLOOMING_AZALEA_SLAB))

                //Mosaic
                .add(Item.byBlock(OAK_MOSAIC_SLABS))
                .add(Item.byBlock(BIRCH_MOSAIC_SLABS))
                .add(Item.byBlock(SPRUCE_MOSAIC_SLABS))
                .add(Item.byBlock(DARK_OAK_MOSAIC_SLABS))
                .add(Item.byBlock(JUNGLE_MOSAIC_SLABS))
                .add(Item.byBlock(ACACIA_MOSAIC_SLABS))
                .add(Item.byBlock(CRIMSON_MOSAIC_SLABS))
                .add(Item.byBlock(WARPED_MOSAIC_SLABS))
                .add(Item.byBlock(MANGROVE_MOSAIC_SLABS))
                .add(Items.BAMBOO_MOSAIC_SLAB)
                .add(Item.byBlock(CHERRY_MOSAIC_SLABS))
                .add(Item.byBlock(CACTUS_MOSAIC_SLABS))
                .add(Item.byBlock(AZALEA_MOSAIC_SLABS))
                .add(Item.byBlock(BLOOMING_AZALEA_MOSAIC_SLABS))

        //Tiles
        ;

        getOrCreateTagBuilder(WOODEN_STAIRS)
                .add(Item.byBlock(BLOOMING_AZALEA_STAIRS))
                .add(Item.byBlock(AZALEA_STAIRS))
                .add(Item.byBlock(CACTUS_STAIRS))
                .add(Item.byBlock(VERTICAL_OAK_STAIR))
                .add(Item.byBlock(VERTICAL_BIRCH_STAIR))
                .add(Item.byBlock(VERTICAL_SPRUCE_STAIR))
                .add(Item.byBlock(VERTICAL_DARK_OAK_STAIR))
                .add(Item.byBlock(VERTICAL_JUNGLE_STAIR))
                .add(Item.byBlock(VERTICAL_ACACIA_STAIR))
                .add(Item.byBlock(VERTICAL_CRIMSON_STAIR))
                .add(Item.byBlock(VERTICAL_WARPED_STAIR))
                .add(Item.byBlock(VERTICAL_MANGROVE_STAIR))
                .add(Item.byBlock(VERTICAL_BAMBOO_STAIR))
                .add(Item.byBlock(VERTICAL_CHERRY_STAIR))
                .add(Item.byBlock(VERTICAL_CACTUS_STAIR))
                .add(Item.byBlock(VERTICAL_AZALEA_STAIR))
                .add(Item.byBlock(VERTICAL_BLOOMING_AZALEA_STAIR))

                //Mosaic
                .add(Item.byBlock(OAK_MOSAIC_STAIRS))
                .add(Item.byBlock(BIRCH_MOSAIC_STAIRS))
                .add(Item.byBlock(SPRUCE_MOSAIC_STAIRS))
                .add(Item.byBlock(DARK_OAK_MOSAIC_STAIRS))
                .add(Item.byBlock(JUNGLE_MOSAIC_STAIRS))
                .add(Item.byBlock(ACACIA_MOSAIC_STAIRS))
                .add(Item.byBlock(CRIMSON_MOSAIC_STAIRS))
                .add(Item.byBlock(WARPED_MOSAIC_STAIRS))
                .add(Item.byBlock(MANGROVE_MOSAIC_STAIRS))
                .add(Items.BAMBOO_MOSAIC_STAIRS)
                .add(Item.byBlock(CHERRY_MOSAIC_STAIRS))
                .add(Item.byBlock(CACTUS_MOSAIC_STAIRS))
                .add(Item.byBlock(AZALEA_MOSAIC_STAIRS))
                .add(Item.byBlock(BLOOMING_AZALEA_MOSAIC_STAIRS))
        ;

        getOrCreateTagBuilder(WOODEN_FENCES)
                .add(Item.byBlock(AZALEA_FENCE))
                .add(Item.byBlock(CACTUS_FENCE));

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(Item.byBlock(AZALEA_FENCE_GATE))
                .add(Item.byBlock(CACTUS_FENCE_GATE));

        getOrCreateTagBuilder(WOODEN_BUTTONS)
                .add(Item.byBlock(AZALEA_BUTTON))
                .add(Item.byBlock(CACTUS_BUTTON));

        getOrCreateTagBuilder(WOODEN_PRESSURE_PLATES)
                .add(Item.byBlock(AZALEA_PRESSURE_PLATE))
                .add(Item.byBlock(CACTUS_PRESSURE_PLATE));

        getOrCreateTagBuilder(WOODEN_DOORS)
                .add(Item.byBlock(BLOOMING_AZALEA_DOOR))
                .add(Item.byBlock(AZALEA_DOOR))
                .add(Item.byBlock(CACTUS_DOOR));

        getOrCreateTagBuilder(WOODEN_TRAPDOORS)
                .add(Item.byBlock(BLOOMING_AZALEA_TRAPDOOR))
                .add(Item.byBlock(AZALEA_TRAPDOOR))
                .add(Item.byBlock(CACTUS_TRAPDOOR));

        //Logs
        getOrCreateTagBuilder(OAK_LOGS)
                .add(Item.byBlock(ENGRAVED_OAK))
                .add(Item.byBlock(ENGRAVED_OAK_WOOD))
                .add(Item.byBlock(CHIPPED_OAK))
                .add(Item.byBlock(CHIPPED_OAK_WOOD));

        getOrCreateTagBuilder(BIRCH_LOGS)
                .add(Item.byBlock(ENGRAVED_BIRCH))
                .add(Item.byBlock(ENGRAVED_BIRCH_WOOD))
                .add(Item.byBlock(CHIPPED_BIRCH))
                .add(Item.byBlock(CHIPPED_BIRCH_WOOD));

        getOrCreateTagBuilder(SPRUCE_LOGS)
                .add(Item.byBlock(ENGRAVED_SPRUCE))
                .add(Item.byBlock(ENGRAVED_SPRUCE_WOOD))
                .add(Item.byBlock(CHIPPED_SPRUCE))
                .add(Item.byBlock(CHIPPED_SPRUCE_WOOD));

        getOrCreateTagBuilder(DARK_OAK_LOGS)
                .add(Item.byBlock(ENGRAVED_DARK_OAK))
                .add(Item.byBlock(ENGRAVED_DARK_OAK_WOOD))
                .add(Item.byBlock(CHIPPED_DARK_OAK))
                .add(Item.byBlock(CHIPPED_DARK_OAK_WOOD));

        getOrCreateTagBuilder(ACACIA_LOGS)
                .add(Item.byBlock(ENGRAVED_ACACIA))
                .add(Item.byBlock(ENGRAVED_ACACIA_WOOD))
                .add(Item.byBlock(CHIPPED_OAK))
                .add(Item.byBlock(CHIPPED_OAK_WOOD));

        getOrCreateTagBuilder(JUNGLE_LOGS)
                .add(Item.byBlock(ENGRAVED_JUNGLE))
                .add(Item.byBlock(ENGRAVED_JUNGLE_WOOD))
                .add(Item.byBlock(CHIPPED_JUNGLE))
                .add(Item.byBlock(CHIPPED_JUNGLE_WOOD));

        getOrCreateTagBuilder(CRIMSON_STEMS)
                .add(Item.byBlock(ENGRAVED_CRIMSON))
                .add(Item.byBlock(ENGRAVED_CRIMSON_HYPHAE))
                .add(Item.byBlock(CHIPPED_CRIMSON))
                .add(Item.byBlock(CHIPPED_CRIMSON_HYPHAE));

        getOrCreateTagBuilder(WARPED_STEMS)
                .add(Item.byBlock(ENGRAVED_WARPED))
                .add(Item.byBlock(ENGRAVED_WARPED_HYPHAE))
                .add(Item.byBlock(CHIPPED_WARPED))
                .add(Item.byBlock(CHIPPED_WARPED_HYPHAE));

        getOrCreateTagBuilder(MANGROVE_LOGS)
                .add(Item.byBlock(ENGRAVED_MANGROVE))
                .add(Item.byBlock(ENGRAVED_MANGROVE_WOOD))
                .add(Item.byBlock(CHIPPED_MANGROVE))
                .add(Item.byBlock(CHIPPED_MANGROVE_WOOD));

        getOrCreateTagBuilder(CHERRY_LOGS)
                .add(Item.byBlock(ENGRAVED_CHERRY))
                .add(Item.byBlock(ENGRAVED_CHERRY_WOOD))
                .add(Item.byBlock(CHIPPED_CHERRY))
                .add(Item.byBlock(CHIPPED_CHERRY_WOOD));

        getOrCreateTagBuilder(LOGS)
                .forceAddTag(LOGS_THAT_BURN)
                .forceAddTag(CRIMSON_STEMS)
                .forceAddTag(WARPED_STEMS)
                .forceAddTag(CelluloseTags.Items.CACTUS_LOGS);

        getOrCreateTagBuilder(LOGS_THAT_BURN)
                .forceAddTag(OAK_LOGS)
                .forceAddTag(BIRCH_LOGS)
                .forceAddTag(SPRUCE_LOGS)
                .forceAddTag(DARK_OAK_LOGS)
                .forceAddTag(JUNGLE_LOGS)
                .forceAddTag(ACACIA_LOGS)
                .forceAddTag(MANGROVE_LOGS)
                .forceAddTag(CHERRY_LOGS)
                .forceAddTag(CelluloseTags.Items.AZALEA_LOGS)
                .forceAddTag(CelluloseTags.Items.CEDAR_LOGS);

        getOrCreateTagBuilder(BOATS)
                .add(CACTUS_BOAT_ID)
                .add(AZALEA_BOAT_ID)
                .add(BLOOMING_AZALEA_BOAT_ID)
        ;

        getOrCreateTagBuilder(CHEST_BOATS)
                .add(CACTUS_CHEST_BOAT_ID)
                .add(AZALEA_CHEST_BOAT_ID)
                .add(BLOOMING_AZALEA_CHEST_BOAT_ID)
        ;

        ///Modded Tags

        getOrCreateTagBuilder(CelluloseTags.Items.WOODEN_MOSAICS)
                .add(Item.byBlock(OAK_MOSAIC))
                .add(Item.byBlock(BIRCH_MOSAIC))
                .add(Item.byBlock(SPRUCE_MOSAIC))
                .add(Item.byBlock(DARK_OAK_MOSAIC))
                .add(Item.byBlock(JUNGLE_MOSAIC))
                .add(Item.byBlock(ACACIA_MOSAIC))
                .add(Item.byBlock(CRIMSON_MOSAIC))
                .add(Item.byBlock(WARPED_MOSAIC))
                .add(Item.byBlock(MANGROVE_MOSAIC))
                .add(Items.BAMBOO_MOSAIC)
                .add(Item.byBlock(CHERRY_MOSAIC))
                .add(Item.byBlock(CACTUS_MOSAIC))
                .add(Item.byBlock(AZALEA_MOSAIC))
                .add(Item.byBlock(BLOOMING_AZALEA_MOSAIC));

        //Flowering
        getOrCreateTagBuilder(CelluloseTags.Items.AZALEA_FLOWER)
                .add(Item.byBlock(AZALEA_FLOWERS));

        //Woodsets
        getOrCreateTagBuilder(CelluloseTags.Items.CACTUS_LOGS)
                .add(Item.byBlock(CACTUS_CROWN))
                .add(Item.byBlock(STRIPPED_CACTUS))
                .add(Item.byBlock(STRIPPED_CACTUS_BUNDLE))
                .add(Item.byBlock(ENGRAVED_CACTUS))
                .add(Item.byBlock(ENGRAVED_CACTUS_CROWN))
                .add(Item.byBlock(CHIPPED_CACTUS))
                .add(Item.byBlock(CHIPPED_CACTUS_CROWN));

        getOrCreateTagBuilder(CelluloseTags.Items.AZALEA_LOGS)
                .add(Item.byBlock(AZALEA_LOG))
                .add(Item.byBlock(AZALEA_WOOD))
                .add(Item.byBlock(STRIPPED_AZALEA_LOG))
                .add(Item.byBlock(STRIPPED_AZALEA_WOOD))
                .add(Item.byBlock(ENGRAVED_AZALEA))
                .add(Item.byBlock(ENGRAVED_AZALEA_WOOD))
                .add(Item.byBlock(CHIPPED_AZALEA))
                .add(Item.byBlock(CHIPPED_AZALEA_WOOD));

        getOrCreateTagBuilder(CelluloseTags.Items.CEDAR_LOGS)
                .add(Item.byBlock(PINE_LOG))
                .add(Item.byBlock(PINE_WOOD))
                .add(Item.byBlock(STRIPPED_PINE_LOG))
                .add(Item.byBlock(STRIPPED_PINE_WOOD))
        ;

        getOrCreateTagBuilder(CelluloseTags.Items.PAVEMENTS)
                .add(Item.byBlock(OAK_PLANK_PAVEMENT))
                .add(Item.byBlock(BIRCH_PLANK_PAVEMENT))
                .add(Item.byBlock(SPRUCE_PLANK_PAVEMENT))
                .add(Item.byBlock(DARK_OAK_PLANK_PAVEMENT))
                .add(Item.byBlock(JUNGLE_PLANK_PAVEMENT))
                .add(Item.byBlock(ACACIA_PLANK_PAVEMENT))
                .add(Item.byBlock(CRIMSON_PLANK_PAVEMENT))
                .add(Item.byBlock(WARPED_PLANK_PAVEMENT))
                .add(Item.byBlock(MANGROVE_PLANK_PAVEMENT))
                .add(Item.byBlock(BAMBOO_PLANK_PAVEMENT))
                .add(Item.byBlock(CHERRY_PLANK_PAVEMENT))
                .add(Item.byBlock(CACTUS_PLANK_PAVEMENT))
                .add(Item.byBlock(AZALEA_PLANK_PAVEMENT))
                .add(Item.byBlock(BLOOMING_AZALEA_PLANK_PAVEMENT))
        ;

        getOrCreateTagBuilder(CelluloseTags.Items.WOODEN_FRAMES)
                .add(Item.byBlock(OAK_FRAME))
                .add(Item.byBlock(BIRCH_FRAME))
                .add(Item.byBlock(SPRUCE_FRAME))
                .add(Item.byBlock(DARK_OAK_FRAME))
                .add(Item.byBlock(JUNGLE_FRAME))
                .add(Item.byBlock(ACACIA_FRAME))
                .add(Item.byBlock(CRIMSON_FRAME))
                .add(Item.byBlock(WARPED_FRAME))
                .add(Item.byBlock(MANGROVE_FRAME))
                .add(Item.byBlock(BAMBOO_FRAME))
                .add(Item.byBlock(CHERRY_FRAME))
                .add(Item.byBlock(CACTUS_FRAME))
                .add(Item.byBlock(AZALEA_FRAME))
                .add(Item.byBlock(BLOOMING_AZALEA_FRAME))
        ;


        getOrCreateTagBuilder(CelluloseTags.Items.LINTELS)
                .add(Item.byBlock(OAK_LINTELS))
                .add(Item.byBlock(BIRCH_LINTELS))
                .add(Item.byBlock(SPRUCE_LINTELS))
                .add(Item.byBlock(DARK_OAK_LINTELS))
                .add(Item.byBlock(JUNGLE_LINTELS))
                .add(Item.byBlock(ACACIA_LINTELS))
                .add(Item.byBlock(CRIMSON_LINTELS))
                .add(Item.byBlock(WARPED_LINTELS))
                .add(Item.byBlock(MANGROVE_LINTELS))
                .add(Item.byBlock(BAMBOO_LINTELS))
                .add(Item.byBlock(CHERRY_LINTELS))
                .add(Item.byBlock(CACTUS_LINTELS))
                .add(Item.byBlock(AZALEA_LINTELS))
                .add(Item.byBlock(BLOOMING_AZALEA_LINTELS))
        ;

        //Barks
        getOrCreateTagBuilder(CelluloseTags.Items.BARK)
                .add(OAK_BARK)
                .add(BIRCH_BARK)
                .add(SPRUCE_BARK)
                .add(DARK_OAK_BARK)
                .add(JUNGLE_BARK)
                .add(ACACIA_BARK)
                .add(CRIMSON_BARK)
                .add(WARPED_BARK)
                .add(MANGROVE_BARK)
                .add(BAMBOO_BARK)
                .add(CHERRY_BARK)
                .add(AZALEA_BARK)
        ;

        //Plank Tags
        getOrCreateTagBuilder(CelluloseTags.Items.OAK_PLANKS)
                .add(Items.OAK_PLANKS)
                .add(Item.byBlock(VERTICAL_OAK_PLANKS))
                .add(Item.byBlock(CHIPPED_OAK_PLANKS))
                .add(Item.byBlock(CHIPPED_VERTICAL_OAK_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.BIRCH_PLANKS)
                .add(Items.BIRCH_PLANKS)
                .add(Item.byBlock(VERTICAL_BIRCH_PLANKS))
                .add(Item.byBlock(CHIPPED_BIRCH_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.SPRUCE_PLANKS)
                .add(Items.SPRUCE_PLANKS)
                .add(Item.byBlock(VERTICAL_SPRUCE_PLANKS))
                .add(Item.byBlock(CHIPPED_SPRUCE_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.DARK_OAK_PLANKS)
                .add(Items.DARK_OAK_PLANKS)
                .add(Item.byBlock(VERTICAL_DARK_OAK_PLANKS))
                .add(Item.byBlock(CHIPPED_DARK_OAK_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.JUNGLE_PLANKS)
                .add(Items.JUNGLE_PLANKS)
                .add(Item.byBlock(VERTICAL_JUNGLE_PLANKS))
                .add(Item.byBlock(CHIPPED_JUNGLE_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.ACACIA_PLANKS)
                .add(Items.ACACIA_PLANKS)
                .add(Item.byBlock(VERTICAL_ACACIA_PLANKS))
                .add(Item.byBlock(CHIPPED_ACACIA_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.CRIMSON_PLANKS)
                .add(Items.CRIMSON_PLANKS)
                .add(Item.byBlock(VERTICAL_CRIMSON_PLANKS))
                .add(Item.byBlock(CHIPPED_CRIMSON_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.WARPED_PLANKS)
                .add(Items.WARPED_PLANKS)
                .add(Item.byBlock(VERTICAL_WARPED_PLANKS))
                .add(Item.byBlock(CHIPPED_WARPED_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.MANGROVE_PLANKS)
                .add(Items.MANGROVE_PLANKS)
                .add(Item.byBlock(VERTICAL_MANGROVE_PLANKS))
                .add(Item.byBlock(CHIPPED_MANGROVE_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.BAMBOO_PLANKS)
                .add(Items.BAMBOO_PLANKS)
                .add(Item.byBlock(VERTICAL_BAMBOO_PLANKS))
                .add(Item.byBlock(CHIPPED_BAMBOO_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.CHERRY_PLANKS)
                .add(Items.CHERRY_PLANKS)
                .add(Item.byBlock(VERTICAL_CHERRY_PLANKS))
                .add(Item.byBlock(CHIPPED_CHERRY_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.CACTUS_PLANKS)
                .add(Item.byBlock(CACTUS_PLANKS))
                .add(Item.byBlock(VERTICAL_CACTUS_PLANKS))
                .add(Item.byBlock(CHIPPED_CACTUS_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.AZALEA_PLANKS)
                .add(Item.byBlock(AZALEA_PLANKS))
                .add(Item.byBlock(VERTICAL_AZALEA_PLANKS))
                .add(Item.byBlock(CHIPPED_AZALEA_PLANKS));

        getOrCreateTagBuilder(CelluloseTags.Items.BLOOMING_AZALEA_PLANKS)
                .add(Item.byBlock(BLOOMING_AZALEA_PLANKS))
                .add(Item.byBlock(VERTICAL_BLOOMING_AZALEA_PLANKS))
                .add(Item.byBlock(CHIPPED_BLOOMING_AZALEA_PLANKS));

        //Wooden Slab Tags
        getOrCreateTagBuilder(CelluloseTags.Items.OAK_SLABS)
                .add(Items.OAK_SLAB)
                .add(Item.byBlock(VERTICAL_OAK_SLAB))
                .add(Item.byBlock(CHIPPED_OAK_SLAB))
                .add(Item.byBlock(CHIPPED_VERTICAL_OAK_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.BIRCH_SLABS)
                .add(Items.BIRCH_SLAB)
                .add(Item.byBlock(VERTICAL_BIRCH_SLAB))
                .add(Item.byBlock(CHIPPED_BIRCH_SLAB));
        getOrCreateTagBuilder(CelluloseTags.Items.SPRUCE_SLABS)
                .add(Items.SPRUCE_SLAB)
                .add(Item.byBlock(VERTICAL_SPRUCE_SLAB))
                .add(Item.byBlock(CHIPPED_SPRUCE_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.DARK_OAK_SLABS)
                .add(Items.DARK_OAK_SLAB)
                .add(Item.byBlock(VERTICAL_DARK_OAK_SLAB))
                .add(Item.byBlock(CHIPPED_DARK_OAK_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.JUNGLE_SLABS)
                .add(Items.JUNGLE_SLAB)
                .add(Item.byBlock(VERTICAL_JUNGLE_SLAB))
                .add(Item.byBlock(CHIPPED_JUNGLE_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.ACACIA_SLABS)
                .add(Items.ACACIA_SLAB)
                .add(Item.byBlock(VERTICAL_ACACIA_SLAB))
                .add(Item.byBlock(CHIPPED_ACACIA_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.CRIMSON_SLABS)
                .add(Items.CRIMSON_SLAB)
                .add(Item.byBlock(VERTICAL_CRIMSON_SLAB))
                .add(Item.byBlock(CHIPPED_CRIMSON_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.WARPED_SLABS)
                .add(Items.WARPED_SLAB)
                .add(Item.byBlock(VERTICAL_WARPED_SLAB))
                .add(Item.byBlock(CHIPPED_WARPED_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.MANGROVE_SLABS)
                .add(Items.MANGROVE_SLAB)
                .add(Item.byBlock(VERTICAL_MANGROVE_SLAB))
                .add(Item.byBlock(CHIPPED_MANGROVE_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.BAMBOO_SLABS)
                .add(Items.BAMBOO_SLAB)
                .add(Item.byBlock(VERTICAL_BAMBOO_SLAB))
                .add(Item.byBlock(CHIPPED_BAMBOO_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.CHERRY_SLABS)
                .add(Items.CHERRY_SLAB)
                .add(Item.byBlock(VERTICAL_CHERRY_SLAB))
                .add(Item.byBlock(CHIPPED_CHERRY_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.CACTUS_SLABS)
                .add(Item.byBlock(CACTUS_SLAB))
                .add(Item.byBlock(VERTICAL_CACTUS_SLAB))
                .add(Item.byBlock(CHIPPED_CACTUS_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.AZALEA_SLABS)
                .add(Item.byBlock(AZALEA_SLAB))
                .add(Item.byBlock(VERTICAL_AZALEA_SLAB))
                .add(Item.byBlock(CHIPPED_AZALEA_SLAB));

        getOrCreateTagBuilder(CelluloseTags.Items.BLOOMING_AZALEA_SLABS)
                .add(Item.byBlock(BLOOMING_AZALEA_SLAB))
                .add(Item.byBlock(VERTICAL_BLOOMING_AZALEA_SLAB))
                .add(Item.byBlock(CHIPPED_BLOOMING_AZALEA_SLAB));

        //

        getOrCreateTagBuilder(CelluloseTags.Items.POTION_RACK_POTIONS)
                .add(Items.GLASS_BOTTLE)
                .add(Items.POTION)
                .add(Items.SPLASH_POTION)
                .add(Items.LINGERING_POTION)
                .add(Items.HONEY_BOTTLE)
                .add(Items.EXPERIENCE_BOTTLE);

        getOrCreateTagBuilder(CelluloseTags.Items.BOOKSHELVES)
                .add(Items.BOOKSHELF)
                .add(Item.byBlock(BIRCH_BOOKSHELF))
                .add(Item.byBlock(SPRUCE_BOOKSHELF))
                .add(Item.byBlock(DARK_OAK_BOOKSHELF))
                .add(Item.byBlock(JUNGLE_BOOKSHELF))
                .add(Item.byBlock(ACACIA_BOOKSHELF))
                .add(Item.byBlock(CRIMSON_BOOKSHELF))
                .add(Item.byBlock(WARPED_BOOKSHELF))
                .add(Item.byBlock(MANGROVE_BOOKSHELF))
                .add(Item.byBlock(BAMBOO_BOOKSHELF))
                .add(Item.byBlock(CHERRY_BOOKSHELF))
                .add(Item.byBlock(CACTUS_BOOKSHELF))
                .add(Item.byBlock(AZALEA_BOOKSHELF))
        ;

        getOrCreateTagBuilder(CelluloseTags.Items.EMPTY_BOOKSHELVES)
                .add(Item.byBlock(EMPTY_OAK_BOOKSHELF))
                .add(Item.byBlock(EMPTY_BIRCH_BOOKSHELF))
                .add(Item.byBlock(EMPTY_SPRUCE_BOOKSHELF))
                .add(Item.byBlock(EMPTY_DARK_OAK_BOOKSHELF))
                .add(Item.byBlock(EMPTY_JUNGLE_BOOKSHELF))
                .add(Item.byBlock(EMPTY_ACACIA_BOOKSHELF))
                .add(Item.byBlock(EMPTY_CRIMSON_BOOKSHELF))
                .add(Item.byBlock(EMPTY_WARPED_BOOKSHELF))
                .add(Item.byBlock(EMPTY_MANGROVE_BOOKSHELF))
                .add(Item.byBlock(EMPTY_BAMBOO_BOOKSHELF))
                .add(Item.byBlock(EMPTY_CHERRY_BOOKSHELF))
                .add(Item.byBlock(EMPTY_CACTUS_BOOKSHELF))
                .add(Item.byBlock(EMPTY_AZALEA_BOOKSHELF))
        ;

        getOrCreateTagBuilder(CelluloseTags.Items.ABANDONED_BOOKSHELVES)
                .add(Item.byBlock(ABANDONED_OAK_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_BIRCH_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_SPRUCE_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_DARK_OAK_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_JUNGLE_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_ACACIA_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_CRIMSON_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_WARPED_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_MANGROVE_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_BAMBOO_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_CHERRY_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_CACTUS_BOOKSHELF))
                .add(Item.byBlock(ABANDONED_AZALEA_BOOKSHELF))
        ;

        getOrCreateTagBuilder(CelluloseTags.Items.COBWEBBED_BOOKSHELVES)
                .add(Item.byBlock(COBWEBBED_OAK_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_BIRCH_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_SPRUCE_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_DARK_OAK_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_JUNGLE_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_ACACIA_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_CRIMSON_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_WARPED_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_MANGROVE_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_BAMBOO_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_CHERRY_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_CACTUS_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_AZALEA_BOOKSHELF))
        ;

        getOrCreateTagBuilder(CelluloseTags.Items.COBWEBBED_EMPTY_BOOKSHELVES)
                .add(Item.byBlock(COBWEBBED_EMPTY_OAK_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_BIRCH_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_SPRUCE_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_DARK_OAK_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_JUNGLE_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_ACACIA_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_CRIMSON_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_WARPED_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_MANGROVE_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_BAMBOO_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_CHERRY_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_CACTUS_BOOKSHELF))
                .add(Item.byBlock(COBWEBBED_EMPTY_AZALEA_BOOKSHELF))
        ;
    }
}
