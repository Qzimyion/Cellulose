package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import java.util.concurrent.CompletableFuture;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.registry.tag.BlockTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.util.CelluloseTags.Blocks.*;

public class CelluloseBlockTagsProvider extends FabricTagProvider.BlockTagProvider
{

    public CelluloseBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg)
    {
        //Blocks
        TagKey<Block> TILES = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "tiles"));
        TagKey<Block> BOARDS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "boards"));
        TagKey<Block> CARPENTED_WOOD = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "carpented_wood"));
        TagKey<Block> CHIPPED_PLANKS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "chipped_planks"));
        TagKey<Block> CHIPPED_PLANKS_SLAB = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "chipped_planks_slabs"));
        TagKey<Block> CHIPPED_STAIR = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "chipped_planks_stairs"));
        TagKey<Block> CARVED_WOOD = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "carved_wood"));
        TagKey<Block> GLAZED_WOOD = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "glazed_wood"));
        TagKey<Block> WOODEN_PAVEMENTS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "wooden_pavements"));
        TagKey<Block> PLANK_PILLARS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "plank_pillars"));
        TagKey<Block> BEAMS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "beams"));
        TagKey<Block> APPLE_PLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "apple_placeable"));
        TagKey<Block> LOTUS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "lotus"));

        //Misc
        TagKey<Block> LOG_SLABS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "log_slabs"));
        TagKey<Block> LOG_STAIRS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "log_stairs"));

        //Woodsets
        TagKey<Block> CHARRABLE_PLANKS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "charrable_planks"));


        getOrCreateTagBuilder(WOODEN_MOSAICS)
                .add(OAK_MOSAIC)
                .add(BIRCH_MOSAIC)
                .add(SPRUCE_MOSAIC)
                .add(DARK_OAK_MOSAIC)
                .add(JUNGLE_MOSAIC)
                .add(ACACIA_MOSAIC)
                .add(CRIMSON_MOSAIC)
                .add(WARPED_MOSAIC)
                .add(MANGROVE_MOSAIC)
                .add(CHERRY_MOSAIC)
                .add(CACTUS_MOSAIC);

        getOrCreateTagBuilder(WOODEN_MOSAICS_SLABS)
                .add(OAK_MOSAIC_SLABS)
                .add(BIRCH_MOSAIC_SLABS)
                .add(SPRUCE_MOSAIC_SLABS)
                .add(DARK_OAK_MOSAIC_SLABS)
                .add(JUNGLE_MOSAIC_SLABS)
                .add(ACACIA_MOSAIC_SLABS)
                .add(CRIMSON_MOSAIC_SLABS)
                .add(WARPED_MOSAIC_SLABS)
                .add(MANGROVE_MOSAIC_SLABS)
                .add(CHERRY_MOSAIC_SLABS)
                .add(CACTUS_MOSAIC_SLABS);

        getOrCreateTagBuilder(WOODEN_FRAMES)
                .add(OAK_FRAME)
                .add(BIRCH_FRAME)
                .add(SPRUCE_FRAME);

        getOrCreateTagBuilder(LINTELS)
                .add(OAK_LINTELS)
                .add(BIRCH_LINTELS);

        getOrCreateTagBuilder(WOODEN_MOSAICS_STAIRS)
                .add(OAK_MOSAIC_STAIRS)
                .add(BIRCH_MOSAIC_STAIRS)
                .add(SPRUCE_MOSAIC_STAIRS)
                .add(DARK_OAK_MOSAIC_STAIRS)
                .add(JUNGLE_MOSAIC_STAIRS)
                .add(ACACIA_MOSAIC_STAIRS)
                .add(CRIMSON_MOSAIC_STAIRS)
                .add(WARPED_MOSAIC_STAIRS)
                .add(MANGROVE_MOSAIC_STAIRS)
                .add(CHERRY_MOSAIC_STAIRS)
                .add(CACTUS_MOSAIC_STAIRS);

        getOrCreateTagBuilder(CHIPPED_PLANKS)
                .add(CHIPPED_WARPED_PLANKS)
                .add(CHIPPED_CRIMSON_PLANKS);

        getOrCreateTagBuilder(CHIPPED_PLANKS_SLAB)
                .add(CHIPPED_WARPED_SLAB)
                .add(CHIPPED_CRIMSON_SLAB);

        getOrCreateTagBuilder(CHIPPED_STAIR)
                .add(CHIPPED_WARPED_STAIR)
                .add(CHIPPED_CRIMSON_STAIR);

        //Vanilla Tags

        getOrCreateTagBuilder(PLANKS)
                .add(CACTUS_PLANKS)
                .forceAddTag(VERTICAL_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(CACTUS_SLAB)
                .add(VERTICAL_OAK_SLAB)
                .add(VERTICAL_BIRCH_SLAB)
                .add(VERTICAL_SPRUCE_SLAB)
                .add(VERTICAL_DARK_OAK_SLAB)
                .add(VERTICAL_JUNGLE_SLAB)
                .add(VERTICAL_ACACIA_SLAB)
                .add(VERTICAL_CRIMSON_SLAB)
                .add(VERTICAL_WARPED_SLAB)
                .add(VERTICAL_MANGROVE_SLAB)
                .add(VERTICAL_BAMBOO_SLAB)
                .add(VERTICAL_CHERRY_SLAB)
                .add(VERTICAL_CACTUS_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(CACTUS_STAIRS)
                .add(VERTICAL_OAK_STAIR)
                .add(VERTICAL_BIRCH_STAIR)
                .add(VERTICAL_SPRUCE_STAIR)
                .add(VERTICAL_DARK_OAK_STAIR)
                .add(VERTICAL_JUNGLE_STAIR)
                .add(VERTICAL_ACACIA_STAIR)
                .add(VERTICAL_CRIMSON_STAIR)
                .add(VERTICAL_WARPED_STAIR)
                .add(VERTICAL_MANGROVE_STAIR)
                .add(VERTICAL_BAMBOO_STAIR)
                .add(VERTICAL_CHERRY_STAIR)
                .add(VERTICAL_CACTUS_STAIR);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(CACTUS_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(CACTUS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(CACTUS_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(CACTUS_TRAPDOOR);

        //Logs
        getOrCreateTagBuilder(BlockTags.OAK_LOGS)
                .add(ENGRAVED_OAK)
                .add(ENGRAVED_OAK_WOOD);

        getOrCreateTagBuilder(BlockTags.BIRCH_LOGS)
                .add(ENGRAVED_BIRCH)
                .add(ENGRAVED_BIRCH_WOOD);

        getOrCreateTagBuilder(BlockTags.SPRUCE_LOGS)
                .add(ENGRAVED_SPRUCE)
                .add(ENGRAVED_SPRUCE_WOOD);

        getOrCreateTagBuilder(BlockTags.DARK_OAK_LOGS)
                .add(ENGRAVED_DARK_OAK)
                .add(ENGRAVED_DARK_OAK_WOOD);

        getOrCreateTagBuilder(BlockTags.ACACIA_LOGS)
                .add(ENGRAVED_ACACIA)
                .add(ENGRAVED_ACACIA_WOOD);

        getOrCreateTagBuilder(BlockTags.JUNGLE_LOGS)
                .add(ENGRAVED_JUNGLE)
                .add(ENGRAVED_JUNGLE_WOOD);

        getOrCreateTagBuilder(BlockTags.CRIMSON_STEMS)
                .add(ENGRAVED_CRIMSON)
                .add(ENGRAVED_CRIMSON_HYPHAE);

        getOrCreateTagBuilder(BlockTags.WARPED_STEMS)
                .add(ENGRAVED_WARPED)
                .add(ENGRAVED_WARPED_HYPHAE);

        getOrCreateTagBuilder(BlockTags.MANGROVE_LOGS)
                .add(ENGRAVED_MANGROVE)
                .add(ENGRAVED_MANGROVE_WOOD);

        getOrCreateTagBuilder(BlockTags.CHERRY_LOGS)
                .add(ENGRAVED_CHERRY)
                .add(ENGRAVED_CHERRY_WOOD);

        getOrCreateTagBuilder(CACTUS_LOGS)
                .add(CACTUS_BUNDLE)
                .add(CACTUS_CROWN)
                .add(STRIPPED_CACTUS)
                .add(STRIPPED_CACTUS_CROWN)
                .add(ENGRAVED_CACTUS)
                .add(ENGRAVED_CACTUS_CROWN);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .forceAddTag(BlockTags.LOGS_THAT_BURN)
                .forceAddTag(BlockTags.CRIMSON_STEMS)
                .forceAddTag(BlockTags.WARPED_STEMS);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .forceAddTag(BlockTags.OAK_LOGS)
                .forceAddTag(BlockTags.BIRCH_LOGS)
                .forceAddTag(BlockTags.SPRUCE_LOGS)
                .forceAddTag(BlockTags.DARK_OAK_LOGS)
                .forceAddTag(BlockTags.JUNGLE_LOGS)
                .forceAddTag(BlockTags.ACACIA_LOGS)
                .forceAddTag(BlockTags.MANGROVE_LOGS)
                .forceAddTag(BlockTags.CHERRY_LOGS);

        getOrCreateTagBuilder(NORMAL_PLANKS)
                .add(OAK_PLANKS)
                .add(BIRCH_PLANKS)
                .add(SPRUCE_PLANKS)
                .add(DARK_OAK_PLANKS)
                .add(JUNGLE_PLANKS)
                .add(ACACIA_PLANKS)
                .add(MANGROVE_PLANKS)
                .add(CACTUS_PLANKS)
                .add(CHERRY_PLANKS);

        getOrCreateTagBuilder(VERTICAL_PLANKS)
                .add(VERTICAL_OAK_PLANKS)
                .add(VERTICAL_BIRCH_PLANKS)
                .add(VERTICAL_SPRUCE_PLANKS)
                .add(VERTICAL_DARK_OAK_PLANKS)
                .add(VERTICAL_JUNGLE_PLANKS)
                .add(VERTICAL_ACACIA_PLANKS)
                .add(VERTICAL_MANGROVE_PLANKS)
                .add(VERTICAL_CACTUS_PLANKS)
                .add(VERTICAL_CHERRY_PLANKS);

        getOrCreateTagBuilder(CHARRABLE_PLANKS)
                .forceAddTag(NORMAL_PLANKS);

        getOrCreateTagBuilder(LOG_SLABS)
                .add(OAK_LOG_SLABS)
                .add(STRIPPED_OAK_LOG_SLABS);

        getOrCreateTagBuilder(LOG_STAIRS)
                .add(OAK_LOG_STAIRS)
                .add(STRIPPED_OAK_LOG_STAIRS);

        getOrCreateTagBuilder(WOODEN_FENCES)
                .add(CACTUS_FENCE);

        getOrCreateTagBuilder(FENCES)
                .add(CACTUS_FENCE);

        getOrCreateTagBuilder(FENCE_GATES)
                .add(CACTUS_FENCE_GATE);

        getOrCreateTagBuilder(AXE_MINEABLE)
                //Vertical Planks
                .add(VERTICAL_OAK_PLANKS)
                .add(VERTICAL_BIRCH_PLANKS)
                .add(VERTICAL_SPRUCE_PLANKS)
                .add(VERTICAL_DARK_OAK_PLANKS)
                .add(VERTICAL_JUNGLE_PLANKS)
                .add(VERTICAL_ACACIA_PLANKS)
                .add(VERTICAL_CRIMSON_PLANKS)
                .add(VERTICAL_WARPED_PLANKS)
                .add(VERTICAL_MANGROVE_PLANKS)
                .add(VERTICAL_BAMBOO_PLANKS)
                .add(VERTICAL_CHERRY_PLANKS)
                .add(VERTICAL_CACTUS_PLANKS)
                .add(VERTICAL_OAK_SLAB)
                .add(VERTICAL_BIRCH_SLAB)
                .add(VERTICAL_SPRUCE_SLAB)
                .add(VERTICAL_DARK_OAK_SLAB)
                .add(VERTICAL_JUNGLE_SLAB)
                .add(VERTICAL_ACACIA_SLAB)
                .add(VERTICAL_CRIMSON_SLAB)
                .add(VERTICAL_WARPED_SLAB)
                .add(VERTICAL_MANGROVE_SLAB)
                .add(VERTICAL_BAMBOO_SLAB)
                .add(VERTICAL_CHERRY_SLAB)
                .add(VERTICAL_CACTUS_SLAB)
                .add(VERTICAL_OAK_STAIR)
                .add(VERTICAL_BIRCH_STAIR)
                .add(VERTICAL_SPRUCE_STAIR)
                .add(VERTICAL_DARK_OAK_STAIR)
                .add(VERTICAL_JUNGLE_STAIR)
                .add(VERTICAL_ACACIA_STAIR)
                .add(VERTICAL_CRIMSON_STAIR)
                .add(VERTICAL_WARPED_STAIR)
                .add(VERTICAL_MANGROVE_STAIR)
                .add(VERTICAL_BAMBOO_STAIR)
                .add(VERTICAL_CHERRY_STAIR)
                .add(VERTICAL_CACTUS_STAIR)

                //Mosaic
                .add(OAK_MOSAIC)
                .add(OAK_MOSAIC_SLABS)
                .add(OAK_MOSAIC_STAIRS)
                .add(BIRCH_MOSAIC)
                .add(BIRCH_MOSAIC_SLABS)
                .add(BIRCH_MOSAIC_STAIRS)
                .add(SPRUCE_MOSAIC)
                .add(SPRUCE_MOSAIC_SLABS)
                .add(SPRUCE_MOSAIC_STAIRS)
                .add(DARK_OAK_MOSAIC)
                .add(DARK_OAK_MOSAIC_SLABS)
                .add(DARK_OAK_MOSAIC_STAIRS)
                .add(JUNGLE_MOSAIC)
                .add(JUNGLE_MOSAIC_SLABS)
                .add(JUNGLE_MOSAIC_STAIRS)
                .add(ACACIA_MOSAIC)
                .add(ACACIA_MOSAIC_SLABS)
                .add(ACACIA_MOSAIC_STAIRS)
                .add(CRIMSON_MOSAIC)
                .add(CRIMSON_MOSAIC_SLABS)
                .add(CRIMSON_MOSAIC_STAIRS)
                .add(WARPED_MOSAIC)
                .add(WARPED_MOSAIC_SLABS)
                .add(WARPED_MOSAIC_STAIRS)
                .add(MANGROVE_MOSAIC)
                .add(MANGROVE_MOSAIC_SLABS)
                .add(MANGROVE_MOSAIC_STAIRS)
                .add(CHERRY_MOSAIC)
                .add(CHERRY_MOSAIC_SLABS)
                .add(CHERRY_MOSAIC_STAIRS)
                .add(CACTUS_MOSAIC)
                .add(CACTUS_MOSAIC_SLABS)
                .add(CACTUS_MOSAIC_STAIRS)

                //Engraved log and wood
                .add(ENGRAVED_OAK)
                .add(ENGRAVED_BIRCH)
                .add(ENGRAVED_SPRUCE)
                .add(ENGRAVED_DARK_OAK)
                .add(ENGRAVED_JUNGLE)
                .add(ENGRAVED_ACACIA)
                .add(ENGRAVED_CRIMSON)
                .add(ENGRAVED_WARPED)
                .add(ENGRAVED_MANGROVE)
                .add(ENGRAVED_CHERRY)
                .add(ENGRAVED_CACTUS)
                .add(ENGRAVED_OAK_WOOD)
                .add(ENGRAVED_BIRCH_WOOD)
                .add(ENGRAVED_SPRUCE_WOOD)
                .add(ENGRAVED_DARK_OAK_WOOD)
                .add(ENGRAVED_JUNGLE_WOOD)
                .add(ENGRAVED_ACACIA_WOOD)
                .add(ENGRAVED_CRIMSON_HYPHAE)
                .add(ENGRAVED_WARPED_HYPHAE)
                .add(ENGRAVED_MANGROVE_WOOD)
                .add(ENGRAVED_CHERRY_WOOD)
                .add(ENGRAVED_CACTUS_CROWN)

                //Sawmill
                .add(SAWMILL)

                //Frame blocks
                .add(OAK_FRAME)
                .add(BIRCH_FRAME)
                .add(SPRUCE_FRAME)
                .add(DARK_OAK_FRAME)
                .add(JUNGLE_FRAME)
                .add(ACACIA_FRAME)
                .add(CRIMSON_FRAME)
                .add(WARPED_FRAME)
                .add(MANGROVE_FRAME)
                .add(BAMBOO_FRAME)
                .add(CHERRY_FRAME)
                .add(SPRUCE_FRAME)

                //Lintels
                .add(OAK_LINTELS)
                .add(BIRCH_LINTELS)
                .add(SPRUCE_LINTELS)
                .add(DARK_OAK_LINTELS)
                .add(JUNGLE_LINTELS)
                .add(ACACIA_LINTELS)
                .add(CRIMSON_LINTELS)
                .add(WARPED_LINTELS)
                .add(MANGROVE_LINTELS)
                .add(BAMBOO_LINTELS)
                .add(CHERRY_LINTELS)
                .add(SPRUCE_LINTELS)

                ///Woodsets
                //Cactus
                .add(CACTUS_PLANKS)
                .add(CACTUS_SLAB)
                .add(CACTUS_STAIRS)
                .add(CACTUS_FENCE)
                .add(CACTUS_FENCE_GATE)
                .add(CACTUS_BUTTON)
                .add(CACTUS_PRESSURE_PLATE)
                .add(CACTUS_DOOR)
                .add(CACTUS_TRAPDOOR)
                .forceAddTag(CACTUS_LOGS);
    }
}
