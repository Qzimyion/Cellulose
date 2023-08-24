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

import static net.minecraft.registry.tag.BlockTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

public class CelluloseBlockTagsProvider extends FabricTagProvider.BlockTagProvider
{

    public CelluloseBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg)
    {
        TagKey<Block> WOODEN_MOSAICS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "wooden_mosaics"));
        TagKey<Block> WOODEN_MOSAICS_SLABS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "wooden_mosaics_slabs"));
        TagKey<Block> WOODEN_MOSAICS_STAIRS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "wooden_mosaics_stairs"));
        TagKey<Block> WOODEN_FRAMES = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "wooden_frames"));
        TagKey<Block> LINTELS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "lintels"));
        TagKey<Block> CHARRABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "charrable"));

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

        getOrCreateTagBuilder(PLANKS)
                .add(CACTUS_PLANKS)
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
                .add(VERTICAL_CACTUS_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(CACTUS_SLABS)
                .add(VERTICAL_OAK_PLANKS_SLABS)
                .add(VERTICAL_BIRCH_PLANKS_SLABS)
                .add(VERTICAL_SPRUCE_PLANKS_SLABS)
                .add(VERTICAL_DARK_OAK_PLANKS_SLABS)
                .add(VERTICAL_JUNGLE_PLANKS_SLABS)
                .add(VERTICAL_ACACIA_PLANKS_SLABS)
                .add(VERTICAL_CRIMSON_PLANKS_SLABS)
                .add(VERTICAL_WARPED_PLANKS_SLABS)
                .add(VERTICAL_MANGROVE_PLANKS_SLABS)
                .add(VERTICAL_BAMBOO_PLANKS_SLABS)
                .add(VERTICAL_CHERRY_PLANKS_SLABS)
                .add(VERTICAL_CACTUS_PLANKS_SLABS);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(CACTUS_STAIRS)
                .add(VERTICAL_OAK_PLANKS_STAIRS)
                .add(VERTICAL_BIRCH_PLANKS_STAIRS)
                .add(VERTICAL_SPRUCE_PLANKS_STAIRS)
                .add(VERTICAL_DARK_OAK_PLANKS_STAIRS)
                .add(VERTICAL_JUNGLE_PLANKS_STAIRS)
                .add(VERTICAL_ACACIA_PLANKS_STAIRS)
                .add(VERTICAL_CRIMSON_PLANKS_STAIRS)
                .add(VERTICAL_WARPED_PLANKS_STAIRS)
                .add(VERTICAL_MANGROVE_PLANKS_STAIRS)
                .add(VERTICAL_BAMBOO_PLANKS_STAIRS)
                .add(VERTICAL_CHERRY_PLANKS_STAIRS)
                .add(VERTICAL_CACTUS_PLANKS_STAIRS);

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

        getOrCreateTagBuilder(CHARRABLE)
                .forceAddTag(PLANKS)
                .forceAddTag(BlockTags.LOGS_THAT_BURN)
                .forceAddTag(WOODEN_MOSAICS)
                .forceAddTag(WOODEN_MOSAICS_SLABS)
                .forceAddTag(WOODEN_MOSAICS_STAIRS);

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
                .add(VERTICAL_OAK_PLANKS_SLABS)
                .add(VERTICAL_BIRCH_PLANKS_SLABS)
                .add(VERTICAL_SPRUCE_PLANKS_SLABS)
                .add(VERTICAL_DARK_OAK_PLANKS_SLABS)
                .add(VERTICAL_JUNGLE_PLANKS_SLABS)
                .add(VERTICAL_ACACIA_PLANKS_SLABS)
                .add(VERTICAL_CRIMSON_PLANKS_SLABS)
                .add(VERTICAL_WARPED_PLANKS_SLABS)
                .add(VERTICAL_MANGROVE_PLANKS_SLABS)
                .add(VERTICAL_BAMBOO_PLANKS_SLABS)
                .add(VERTICAL_CHERRY_PLANKS_SLABS)
                .add(VERTICAL_CACTUS_PLANKS_SLABS)
                .add(VERTICAL_OAK_PLANKS_STAIRS)
                .add(VERTICAL_BIRCH_PLANKS_STAIRS)
                .add(VERTICAL_SPRUCE_PLANKS_STAIRS)
                .add(VERTICAL_DARK_OAK_PLANKS_STAIRS)
                .add(VERTICAL_JUNGLE_PLANKS_STAIRS)
                .add(VERTICAL_ACACIA_PLANKS_STAIRS)
                .add(VERTICAL_CRIMSON_PLANKS_STAIRS)
                .add(VERTICAL_WARPED_PLANKS_STAIRS)
                .add(VERTICAL_MANGROVE_PLANKS_STAIRS)
                .add(VERTICAL_BAMBOO_PLANKS_STAIRS)
                .add(VERTICAL_CHERRY_PLANKS_STAIRS)
                .add(VERTICAL_CACTUS_PLANKS_STAIRS)

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

                //Lintels
                .add(OAK_LINTELS)
                .add(BIRCH_LINTELS)

                //Planks
                .add(CACTUS_PLANKS)
                .add(CACTUS_SLABS)
                .add(CACTUS_STAIRS)

                //Fence and Fence-gates
                .add(CACTUS_FENCE)
                .add(CACTUS_FENCE_GATE)

                //Button
                .add(CACTUS_BUTTON)

                //PressurePlate
                .add(CACTUS_PRESSURE_PLATE)

                //Door
                .add(CACTUS_DOOR)

                //Trapdoor
                .add(CACTUS_TRAPDOOR)

                //Signs
                .add(CACTUS_SIGN)
                .add(CACTUS_HANGING_SIGN)

                //Mics
                .add(CACTUS_BUNDLE);
    }
}
