package net.qzimyion.cellulose.datagen;

import com.google.common.collect.Lists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.qzimyion.cellulose.items.CelluloseItems;
import net.qzimyion.cellulose.recipe.SawmillingRecipe;
import net.qzimyion.cellulose.util.CelluloseTags;

import java.util.List;
import java.util.function.Consumer;

import static net.minecraft.item.Items.*;
import static net.minecraft.recipe.book.RecipeCategory.*;
import static net.minecraft.registry.tag.ItemTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

@SuppressWarnings("deprecation")
public class CelluloseRecipeGenerator extends FabricRecipeProvider {
    public CelluloseRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter)
    {
        /*Crafting table recipes*/
        //This section adds vertical plank recipes (BLOCK)

        offerVerticalPlanksRecipe(exporter, VERTICAL_OAK_PLANKS, OAK_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_BIRCH_PLANKS, BIRCH_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_SPRUCE_PLANKS, SPRUCE_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_DARK_OAK_PLANKS, DARK_OAK_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_JUNGLE_PLANKS, JUNGLE_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_ACACIA_PLANKS, ACACIA_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_CRIMSON_PLANKS, CRIMSON_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_WARPED_PLANKS, WARPED_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_MANGROVE_PLANKS, MANGROVE_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_BAMBOO_PLANKS, BAMBOO_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_CHERRY_PLANKS, CHERRY_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_AZALEA_PLANKS, AZALEA_PLANKS);
        offerVerticalPlanksRecipe(exporter, VERTICAL_BLOOMING_AZALEA_PLANKS, BLOOMING_AZALEA_PLANKS);

        //Reverse recipe
        offerReverseVerticalPlanksRecipe(exporter, OAK_PLANKS, VERTICAL_OAK_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, BIRCH_PLANKS, VERTICAL_BIRCH_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, SPRUCE_PLANKS, VERTICAL_SPRUCE_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, DARK_OAK_PLANKS, VERTICAL_DARK_OAK_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, JUNGLE_PLANKS, VERTICAL_JUNGLE_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, ACACIA_PLANKS, VERTICAL_ACACIA_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, CRIMSON_PLANKS, VERTICAL_CRIMSON_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, WARPED_PLANKS, VERTICAL_WARPED_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, MANGROVE_PLANKS, VERTICAL_MANGROVE_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, BAMBOO_PLANKS, VERTICAL_BAMBOO_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, CHERRY_PLANKS, VERTICAL_CHERRY_PLANKS);

        //This section adds vertical plank recipes (SLAB)

        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_OAK_SLAB, VERTICAL_OAK_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_BIRCH_SLAB, VERTICAL_BIRCH_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_SPRUCE_SLAB, VERTICAL_SPRUCE_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_DARK_OAK_SLAB, VERTICAL_DARK_OAK_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_JUNGLE_SLAB, VERTICAL_JUNGLE_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_ACACIA_SLAB, VERTICAL_ACACIA_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_CRIMSON_SLAB, VERTICAL_CRIMSON_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_WARPED_SLAB, VERTICAL_WARPED_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_MANGROVE_SLAB, VERTICAL_MANGROVE_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_BAMBOO_SLAB, VERTICAL_BAMBOO_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_CHERRY_SLAB, VERTICAL_CHERRY_PLANKS);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, VERTICAL_CACTUS_SLAB, VERTICAL_CACTUS_PLANKS);

        //This section adds vertical plank recipes (STAIRS)
        

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_BIRCH_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_BIRCH_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BIRCH_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BIRCH_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_OAK_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_OAK_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_SPRUCE_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_SPRUCE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_SPRUCE_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_DARK_OAK_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_DARK_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_DARK_OAK_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_JUNGLE_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_JUNGLE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_JUNGLE_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_ACACIA_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_ACACIA_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_ACACIA_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_ACACIA_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_CRIMSON_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_CRIMSON_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CRIMSON_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_WARPED_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_WARPED_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_WARPED_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_WARPED_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_MANGROVE_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_MANGROVE_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_MANGROVE_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_BAMBOO_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_BAMBOO_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_BAMBOO_STAIR)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, VERTICAL_CHERRY_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', VERTICAL_CHERRY_PLANKS).criterion(FabricRecipeProvider.hasItem(VERTICAL_CHERRY_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(VERTICAL_CHERRY_STAIR)));


        // This section adds wooden mosaics recipes (Block)

        offerMosaicRecipe(exporter, BUILDING_BLOCKS,OAK_MOSAIC, OAK_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,BIRCH_MOSAIC, BIRCH_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,SPRUCE_MOSAIC, SPRUCE_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,DARK_OAK_MOSAIC, DARK_OAK_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,JUNGLE_MOSAIC, JUNGLE_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,ACACIA_MOSAIC, ACACIA_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,CRIMSON_MOSAIC, CRIMSON_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,WARPED_MOSAIC, WARPED_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,MANGROVE_MOSAIC, MANGROVE_SLAB);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS,CHERRY_MOSAIC, CHERRY_SLAB);

        //This section adds mosaic recipes (SLAB)

        offerSlabRecipe(exporter, BUILDING_BLOCKS,OAK_MOSAIC_SLABS, OAK_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,BIRCH_MOSAIC_SLABS, BIRCH_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,SPRUCE_MOSAIC_SLABS, SPRUCE_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,DARK_OAK_MOSAIC_SLABS, DARK_OAK_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,JUNGLE_MOSAIC_SLABS, JUNGLE_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,ACACIA_MOSAIC_SLABS, ACACIA_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,CRIMSON_MOSAIC_SLABS, CRIMSON_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,WARPED_MOSAIC_SLABS, WARPED_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,MANGROVE_MOSAIC_SLABS, MANGROVE_MOSAIC);
        offerSlabRecipe(exporter, BUILDING_BLOCKS,CHERRY_MOSAIC_SLABS, CHERRY_MOSAIC);

        //This section adds mosaic recipes (STAIRS)
        createStairsRecipe(OAK_MOSAIC_STAIRS, OAK_MOSAIC);
        createStairsRecipe(BIRCH_MOSAIC_STAIRS, BIRCH_MOSAIC);
        createStairsRecipe(SPRUCE_MOSAIC_STAIRS, SPRUCE_MOSAIC);
        createStairsRecipe(DARK_OAK_MOSAIC_STAIRS, DARK_OAK_MOSAIC);
        createStairsRecipe(JUNGLE_MOSAIC_STAIRS, JUNGLE_MOSAIC);
        createStairsRecipe(ACACIA_MOSAIC_STAIRS, ACACIA_MOSAIC);
        createStairsRecipe(CRIMSON_MOSAIC_STAIRS, CRIMSON_MOSAIC);
        createStairsRecipe(WARPED_MOSAIC_STAIRS, WARPED_MOSAIC);
        createStairsRecipe(MANGROVE_MOSAIC_STAIRS, MANGROVE_MOSAIC);
        createStairsRecipe(CHERRY_MOSAIC_STAIRS, CHERRY_MOSAIC);
        createStairsRecipe(CACTUS_MOSAIC_STAIRS, CACTUS_MOSAIC);
        createStairsRecipe(AZALEA_MOSAIC_STAIRS, AZALEA_MOSAIC);
        createStairsRecipe(BLOOMING_AZALEA_MOSAIC_STAIRS, BLOOMING_AZALEA_MOSAIC);


        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, BIRCH_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', BIRCH_MOSAIC).criterion(FabricRecipeProvider.hasItem(BIRCH_MOSAIC), FabricRecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(BIRCH_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, OAK_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', OAK_MOSAIC).criterion(FabricRecipeProvider.hasItem(OAK_MOSAIC), FabricRecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(OAK_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, SPRUCE_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', SPRUCE_MOSAIC).criterion(FabricRecipeProvider.hasItem(SPRUCE_MOSAIC), FabricRecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SPRUCE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, DARK_OAK_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', DARK_OAK_MOSAIC).criterion(FabricRecipeProvider.hasItem(DARK_OAK_MOSAIC), FabricRecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(DARK_OAK_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, JUNGLE_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', JUNGLE_MOSAIC).criterion(FabricRecipeProvider.hasItem(JUNGLE_MOSAIC), FabricRecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(JUNGLE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, ACACIA_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ACACIA_MOSAIC).criterion(FabricRecipeProvider.hasItem(ACACIA_MOSAIC), FabricRecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ACACIA_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CRIMSON_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CRIMSON_MOSAIC).criterion(FabricRecipeProvider.hasItem(CRIMSON_MOSAIC), FabricRecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CRIMSON_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, WARPED_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', WARPED_MOSAIC).criterion(FabricRecipeProvider.hasItem(WARPED_MOSAIC), FabricRecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(WARPED_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, MANGROVE_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', MANGROVE_MOSAIC).criterion(FabricRecipeProvider.hasItem(MANGROVE_MOSAIC), FabricRecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MANGROVE_MOSAIC_STAIRS)));

        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CHERRY_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CHERRY_MOSAIC).criterion(FabricRecipeProvider.hasItem(CHERRY_MOSAIC), FabricRecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CHERRY_MOSAIC_STAIRS)));

        //Sawmill recipe
        ShapedRecipeJsonBuilder.create(DECORATIONS, SAWMILL, 1)
                .pattern(" # ")
                .pattern("AAA").input('#', IRON_INGOT).input('A', PLANKS).criterion(FabricRecipeProvider.hasItem(OAK_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(SAWMILL)));

        //Frame recipes
        offerFrameRecipes(exporter, OAK_FRAME, CelluloseTags.Items.OAK_PLANKS);
        offerFrameRecipes(exporter, BIRCH_FRAME, CelluloseTags.Items.BIRCH_PLANKS);
        offerFrameRecipes(exporter, SPRUCE_FRAME, CelluloseTags.Items.SPRUCE_PLANKS);
        offerFrameRecipes(exporter, DARK_OAK_FRAME, CelluloseTags.Items.DARK_OAK_PLANKS);
        offerFrameRecipes(exporter, JUNGLE_FRAME, CelluloseTags.Items.JUNGLE_PLANKS);
        offerFrameRecipes(exporter, ACACIA_FRAME, CelluloseTags.Items.ACACIA_PLANKS);
        offerFrameRecipes(exporter, CRIMSON_FRAME, CelluloseTags.Items.CRIMSON_PLANKS);
        offerFrameRecipes(exporter, WARPED_FRAME, CelluloseTags.Items.WARPED_PLANKS);
        offerFrameRecipes(exporter, MANGROVE_FRAME, CelluloseTags.Items.MANGROVE_PLANKS);
        offerFrameRecipes(exporter, BAMBOO_FRAME, CelluloseTags.Items.BAMBOO_PLANKS);
        offerFrameRecipes(exporter, CHERRY_FRAME, CelluloseTags.Items.CHERRY_PLANKS);
        offerFrameRecipes(exporter, CACTUS_FRAME, CelluloseTags.Items.CACTUS_PLANKS);
        offerFrameRecipes(exporter, AZALEA_FRAME, CelluloseTags.Items.AZALEA_PLANKS);
        offerFrameRecipes(exporter, BLOOMING_AZALEA_FRAME, CelluloseTags.Items.BLOOMING_AZALEA_PLANKS);

        //Lintel recipes
        offerLintelsRecipes(exporter, OAK_LINTELS, OAK_FRAME);
        offerLintelsRecipes(exporter, BIRCH_LINTELS, BIRCH_FRAME);
        offerLintelsRecipes(exporter, SPRUCE_LINTELS, SPRUCE_FRAME);
        offerLintelsRecipes(exporter, DARK_OAK_LINTELS, DARK_OAK_FRAME);
        offerLintelsRecipes(exporter, JUNGLE_LINTELS, JUNGLE_FRAME);
        offerLintelsRecipes(exporter, ACACIA_LINTELS, ACACIA_FRAME);
        offerLintelsRecipes(exporter, CRIMSON_LINTELS, CRIMSON_FRAME);
        offerLintelsRecipes(exporter, WARPED_LINTELS, WARPED_FRAME);
        offerLintelsRecipes(exporter, MANGROVE_LINTELS, MANGROVE_FRAME);
        offerLintelsRecipes(exporter, BAMBOO_LINTELS, BAMBOO_FRAME);
        offerLintelsRecipes(exporter, CHERRY_LINTELS, CHERRY_FRAME);
        offerLintelsRecipes(exporter, CACTUS_LINTELS, CACTUS_FRAME);
        offerLintelsRecipes(exporter, AZALEA_LINTELS, AZALEA_FRAME);
        offerLintelsRecipes(exporter, BLOOMING_AZALEA_LINTELS, BLOOMING_AZALEA_FRAME);

        //Tile recipes
        offerTilesRecipes(exporter, OAK_TILES, OAK_PLANKS, OAK_SLAB);
        offerTilesRecipes(exporter, BIRCH_TILES, BIRCH_PLANKS, BIRCH_SLAB);
        offerTilesRecipes(exporter, SPRUCE_TILES, SPRUCE_PLANKS, SPRUCE_SLAB);
        offerTilesRecipes(exporter, DARK_OAK_TILES, DARK_OAK_PLANKS, DARK_OAK_SLAB);
        offerTilesRecipes(exporter, JUNGLE_TILES, JUNGLE_PLANKS, JUNGLE_SLAB);
        offerTilesRecipes(exporter, ACACIA_TILES, ACACIA_PLANKS, ACACIA_SLAB);
        offerTilesRecipes(exporter, CRIMSON_TILES, CRIMSON_PLANKS, CRIMSON_SLAB);
        offerTilesRecipes(exporter, WARPED_TILES, WARPED_PLANKS, WARPED_SLAB);
        offerTilesRecipes(exporter, MANGROVE_TILES, MANGROVE_PLANKS, MANGROVE_SLAB);
        offerTilesRecipes(exporter, BAMBOO_TILES, BAMBOO_PLANKS, BAMBOO_SLAB);
        offerTilesRecipes(exporter, CHERRY_TILES, CHERRY_PLANKS, CHERRY_SLAB);
        offerTilesRecipes(exporter, CACTUS_TILES, Item.fromBlock(CACTUS_PLANKS), Item.fromBlock(CACTUS_SLAB));
        offerTilesRecipes(exporter, AZALEA_TILES, Item.fromBlock(AZALEA_PLANKS), Item.fromBlock(AZALEA_SLAB));
        offerTilesRecipes(exporter, BLOOMING_AZALEA_TILES, Item.fromBlock(BLOOMING_AZALEA_PLANKS), Item.fromBlock(BLOOMING_AZALEA_SLAB));

        //Cedar woodset


        //Cactus woodset
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_BUNDLE, 4)
                .pattern("   ")
                .pattern("## ")
                .pattern("## ")
                .input('#', CACTUS).criterion(FabricRecipeProvider.hasItem(CACTUS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("cellulose:cactus_wood").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_BUNDLE)));
        offerPlanksRecipe(CACTUS_BUNDLE);
        offerPlanksRecipe(CACTUS_CROWN);
        offerPlanksRecipe(STRIPPED_CACTUS);
        offerPlanksRecipe(STRIPPED_CACTUS_BUNDLE);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, CACTUS_SLAB, CACTUS_PLANKS);
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(PLANKS))
                .group("minecraft:wooden_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_STAIRS)));
        offerBarkBlockRecipe(exporter, CACTUS_CROWN, CACTUS_BUNDLE);
        offerBarkBlockRecipe(exporter, STRIPPED_CACTUS_BUNDLE, CACTUS_BUNDLE);
        offerVerticalPlanksRecipe(exporter, VERTICAL_CACTUS_PLANKS, CACTUS_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, CACTUS_PLANKS, VERTICAL_CACTUS_PLANKS);
        offerMosaicRecipe(exporter, BUILDING_BLOCKS, CACTUS_MOSAIC, CACTUS_SLAB);
        offerSlabRecipe(exporter, BUILDING_BLOCKS, CACTUS_MOSAIC_SLABS, CACTUS_MOSAIC);
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', CACTUS_MOSAIC).criterion(FabricRecipeProvider.hasItem(CACTUS_MOSAIC), FabricRecipeProvider.conditionsFromItem(CACTUS_MOSAIC))
                .group("cellulose:wooden_mosaic_stairs").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_MOSAIC_STAIRS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, CACTUS_BUTTON, 2)
                .input(CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_BUTTONS))
                .group("minecraft:wooden_buttons").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_BUTTON)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_PRESSURE_PLATE, 2)
                .pattern("## ")
                .input('#', CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_PRESSURE_PLATES))
                .group("minecraft:wooden_pressure_plates").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_TRAPDOOR, 2)
                .pattern("## ")
                .input('#', CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_TRAPDOORS))
                .group("minecraft:wooden_trapdoors").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_DOOR, 2)
                .pattern("## ")
                .pattern("## ")
                .pattern("## ")
                .input('#', CACTUS_PLANKS).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_DOORS))
                .group("minecraft:wooden_doors").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_DOOR)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_PRESSURE_PLATE, 2)
                .pattern("   ")
                .pattern("#A#")
                .pattern("#A#")
                .input('#', CACTUS_PLANKS).input('A', STICK).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_FENCES))
                .group("minecraft:wooden_fences").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_FENCE)));
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, CACTUS_PRESSURE_PLATE, 2)
                .pattern("   ")
                .pattern("A#A")
                .pattern("A#A")
                .input('#', CACTUS_PLANKS).input('A', STICK).criterion(FabricRecipeProvider.hasItem(CACTUS_PLANKS), FabricRecipeProvider.conditionsFromTag(WOODEN_FENCES))
                .group("minecraft:wooden_fences").offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CACTUS_FENCE_GATE)));



        //Pavements
        offerPavementRecipe(exporter, OAK_PLANK_PAVEMENT, OAK_PLANKS);
        offerPavementRecipe(exporter, BIRCH_PLANK_PAVEMENT, BIRCH_PLANKS);
        offerPavementRecipe(exporter, SPRUCE_PLANK_PAVEMENT, SPRUCE_PLANKS);
        offerPavementRecipe(exporter, DARK_OAK_PLANK_PAVEMENT, DARK_OAK_PLANKS);
        offerPavementRecipe(exporter, JUNGLE_PLANK_PAVEMENT, JUNGLE_PLANKS);
        offerPavementRecipe(exporter, ACACIA_PLANK_PAVEMENT, ACACIA_PLANKS);
        offerPavementRecipe(exporter, CRIMSON_PLANK_PAVEMENT, CRIMSON_PLANKS);
        offerPavementRecipe(exporter, WARPED_PLANK_PAVEMENT, WARPED_PLANKS);
        offerPavementRecipe(exporter, MANGROVE_PLANK_PAVEMENT, MANGROVE_PLANKS);
        offerPavementRecipe(exporter, BAMBOO_PLANK_PAVEMENT, BAMBOO_PLANKS);
        offerPavementRecipe(exporter, CHERRY_PLANK_PAVEMENT, CHERRY_PLANKS);
        offerPavementRecipe(exporter, CACTUS_PLANK_PAVEMENT, CACTUS_PLANKS);
        offerPavementRecipe(exporter, AZALEA_PLANK_PAVEMENT, AZALEA_PLANKS);
        offerPavementRecipe(exporter, BLOOMING_AZALEA_PLANK_PAVEMENT, BLOOMING_AZALEA_PLANKS);

        //Bookshelves
        offerBookShelvesRecipe(exporter, BOOKSHELF, CelluloseTags.Items.OAK_PLANKS);
        offerBookShelvesRecipe(exporter, BIRCH_BOOKSHELF, CelluloseTags.Items.BIRCH_PLANKS);
        offerBookShelvesRecipe(exporter, SPRUCE_BOOKSHELF, CelluloseTags.Items.SPRUCE_PLANKS);
        offerBookShelvesRecipe(exporter, DARK_OAK_BOOKSHELF, CelluloseTags.Items.DARK_OAK_PLANKS);
        offerBookShelvesRecipe(exporter, JUNGLE_BOOKSHELF, CelluloseTags.Items.JUNGLE_PLANKS);
        offerBookShelvesRecipe(exporter, ACACIA_BOOKSHELF, CelluloseTags.Items.ACACIA_PLANKS);
        offerBookShelvesRecipe(exporter, CRIMSON_BOOKSHELF, CelluloseTags.Items.CRIMSON_PLANKS);
        offerBookShelvesRecipe(exporter, WARPED_BOOKSHELF, CelluloseTags.Items.WARPED_PLANKS);
        offerBookShelvesRecipe(exporter, MANGROVE_BOOKSHELF, CelluloseTags.Items.MANGROVE_PLANKS);
        offerBookShelvesRecipe(exporter, BAMBOO_BOOKSHELF, CelluloseTags.Items.BAMBOO_PLANKS);
        offerBookShelvesRecipe(exporter, CHERRY_BOOKSHELF, CelluloseTags.Items.CHERRY_PLANKS);
        offerBookShelvesRecipe(exporter, CACTUS_BOOKSHELF, CelluloseTags.Items.CACTUS_PLANKS);
        offerBookShelvesRecipe(exporter, AZALEA_BOOKSHELF, CelluloseTags.Items.AZALEA_PLANKS);

        //Chiseled Bookshelves
        offerChiseledBookShelvesRecipe(exporter, CHISELED_BOOKSHELF, CelluloseTags.Items.OAK_PLANKS, CelluloseTags.Items.OAK_SLABS);
        offerChiseledBookShelvesRecipe(exporter, BIRCH_CHISELED_BOOKSHELF, CelluloseTags.Items.BIRCH_PLANKS, CelluloseTags.Items.BIRCH_SLABS);
        offerChiseledBookShelvesRecipe(exporter, SPRUCE_CHISELED_BOOKSHELF, CelluloseTags.Items.SPRUCE_PLANKS, CelluloseTags.Items.SPRUCE_SLABS);
        offerChiseledBookShelvesRecipe(exporter, DARK_OAK_CHISELED_BOOKSHELF, CelluloseTags.Items.DARK_OAK_PLANKS, CelluloseTags.Items.DARK_OAK_PLANKS);
        offerChiseledBookShelvesRecipe(exporter, JUNGLE_CHISELED_BOOKSHELF, CelluloseTags.Items.JUNGLE_PLANKS, CelluloseTags.Items.JUNGLE_PLANKS);
        offerChiseledBookShelvesRecipe(exporter, ACACIA_CHISELED_BOOKSHELF, CelluloseTags.Items.ACACIA_PLANKS, CelluloseTags.Items.ACACIA_SLABS);
        offerChiseledBookShelvesRecipe(exporter, CRIMSON_CHISELED_BOOKSHELF, CelluloseTags.Items.CRIMSON_PLANKS, CelluloseTags.Items.CRIMSON_SLABS);
        offerChiseledBookShelvesRecipe(exporter, WARPED_CHISELED_BOOKSHELF, CelluloseTags.Items.WARPED_PLANKS, CelluloseTags.Items.WARPED_PLANKS);
        offerChiseledBookShelvesRecipe(exporter, MANGROVE_CHISELED_BOOKSHELF, CelluloseTags.Items.MANGROVE_PLANKS, CelluloseTags.Items.MANGROVE_PLANKS);
        offerChiseledBookShelvesRecipe(exporter, BAMBOO_CHISELED_BOOKSHELF, CelluloseTags.Items.BAMBOO_PLANKS, CelluloseTags.Items.BAMBOO_SLABS);
        offerChiseledBookShelvesRecipe(exporter, CHERRY_CHISELED_BOOKSHELF, CelluloseTags.Items.CHERRY_PLANKS, CelluloseTags.Items.CHERRY_SLABS);
        offerChiseledBookShelvesRecipe(exporter, CACTUS_CHISELED_BOOKSHELF, CelluloseTags.Items.CACTUS_PLANKS, CelluloseTags.Items.CACTUS_SLABS);
        offerChiseledBookShelvesRecipe(exporter, AZALEA_CHISELED_BOOKSHELF, CelluloseTags.Items.AZALEA_PLANKS, CelluloseTags.Items.AZALEA_SLABS);
        offerChiseledBookShelvesRecipe(exporter, BLOOMING_AZALEA_CHISELED_BOOKSHELF, CelluloseTags.Items.BLOOMING_AZALEA_PLANKS, CelluloseTags.Items.BLOOMING_AZALEA_SLABS);


        //Potion rack
        ShapedRecipeJsonBuilder.create(DECORATIONS, POTION_RACK)
                .pattern("###")
                .pattern("X X")
                .pattern("###")
                .input('#', WOODEN_SLABS).input('X', STICK).criterion("has_wooden_slabs", RecipeProvider.conditionsFromTag(WOODEN_SLABS)).criterion("has_stick", RecipeProvider.conditionsFromItem(STICK)).offerTo(exporter);

        //Paper blocks
        //Normal
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, PAPER_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', PAPER).criterion("has_paper", RecipeProvider.conditionsFromItem(PAPER)).offerTo(exporter);
        //Dyed



        /*
         * Sawmilling recipes
         */

        //Oak
        ///Log
        offerSawmillingRecipe(exporter, OAK_WOOD, OAK_LOG);
        offerSawmillingRecipe(exporter, STRIPPED_OAK_LOG, OAK_LOG);
        offerSawmillingRecipe(exporter, STRIPPED_OAK_WOOD, OAK_LOG);
        offerSawmillingRecipe(exporter, OAK_PLANKS, OAK_LOG, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, OAK_LOG, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, OAK_LOG, 4);
        offerSawmillingRecipe(exporter, STICK, OAK_LOG, 16);
        offerSawmillingRecipe(exporter, PAINTING, OAK_LOG, 32);

        ///Wood
        offerSawmillingRecipe(exporter, OAK_PLANKS, OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, OAK_WOOD, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, STICK, OAK_WOOD, 16);
        offerSawmillingRecipe(exporter, PAINTING, OAK_WOOD, 32);

        ///Stripped Log
        offerSawmillingRecipe(exporter, OAK_PLANKS, STRIPPED_OAK_LOG, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, STRIPPED_OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, STRIPPED_OAK_LOG, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, STRIPPED_OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, STRIPPED_OAK_LOG, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, STRIPPED_OAK_LOG, 4);
        offerSawmillingRecipe(exporter, STICK, STRIPPED_OAK_LOG, 16);
        offerSawmillingRecipe(exporter, PAINTING, STRIPPED_OAK_LOG, 32);

        ///Stripped Wood
        offerSawmillingRecipe(exporter, OAK_PLANKS, STRIPPED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, STRIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, STRIPPED_OAK_WOOD, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, STRIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, STRIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, STRIPPED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, STICK, STRIPPED_OAK_WOOD, 16);
        offerSawmillingRecipe(exporter, PAINTING, STRIPPED_OAK_WOOD, 32);

        ///Engraved Log
        offerSawmillingRecipe(exporter, OAK_PLANKS, ENGRAVED_OAK, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, ENGRAVED_OAK, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, ENGRAVED_OAK, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, ENGRAVED_OAK, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, ENGRAVED_OAK, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, ENGRAVED_OAK, 4);
        offerSawmillingRecipe(exporter, STICK, ENGRAVED_OAK, 16);
        offerSawmillingRecipe(exporter, PAINTING, ENGRAVED_OAK, 32);

        ///Engraved Wood
        offerSawmillingRecipe(exporter, OAK_PLANKS, ENGRAVED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, OAK_SLAB, ENGRAVED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_STAIRS, ENGRAVED_OAK_WOOD, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, ENGRAVED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, ENGRAVED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, ENGRAVED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, STICK, ENGRAVED_OAK_WOOD, 16);
        offerSawmillingRecipe(exporter, PAINTING, ENGRAVED_OAK_WOOD, 32);

        ///Chipped Log
        offerSawmillingRecipe(exporter, CHIPPED_OAK_PLANKS, CHIPPED_OAK, 4);
        offerSawmillingRecipe(exporter, CHIPPED_OAK_SLAB, CHIPPED_OAK, 8);
        offerSawmillingRecipe(exporter, CHIPPED_OAK_STAIRS, CHIPPED_OAK, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, CHIPPED_OAK, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, CHIPPED_OAK, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, CHIPPED_OAK, 4);
        offerSawmillingRecipe(exporter, STICK, CHIPPED_OAK, 16);
        offerSawmillingRecipe(exporter, PAINTING, CHIPPED_OAK, 32);

        ///Chipped Wood
        offerSawmillingRecipe(exporter, CHIPPED_OAK_PLANKS, CHIPPED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, CHIPPED_OAK_SLAB, CHIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, CHIPPED_OAK_STAIRS, CHIPPED_OAK_WOOD, 5);
        offerSawmillingRecipe(exporter, OAK_FENCE, CHIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_FENCE_GATE, CHIPPED_OAK_WOOD, 8);
        offerSawmillingRecipe(exporter, OAK_BOAT, CHIPPED_OAK_WOOD, 4);
        offerSawmillingRecipe(exporter, STICK, CHIPPED_OAK_WOOD, 16);
        offerSawmillingRecipe(exporter, PAINTING, CHIPPED_OAK_WOOD, 32);

        ///Planks

        ///Slabs

        ///Stairs

        ///Misc
        offerSawmillingRecipe(exporter, PAINTING, OAK_PLANKS, 8);

        //Birch

        //Spruce

        //Dark Oak

        //Jungle

        //Acacia

        //Crimson

        //Warped

        //Mangrove

        //Bamboo
        offerSawmillingRecipe(exporter, BAMBOO, BAMBOO_BLOCK, 9);

        //Cherry

        //Cactus

        //Azalea

        //Brown Mushroom

        //Red Mushroom

        //Petrified wood


        final List<ItemConvertible> PAPER_SMELTING = Util.make(Lists.newArrayList(), list -> list.add(SOAKED_PAPER_BLOCK));

        offerSmelting(exporter, PAPER_SMELTING, MISC, PAPER_BLOCK, 0.15F, 200, "misc");
    }

    private void offerPlanksRecipe(Block strippedCactusBundle) {
    }

    public static void offerPlanks(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, output, 4).input('#', input).group("planks").criterion("has_logs", RecipeProvider.conditionsFromTag(LOGS)).offerTo(exporter);
    }

    private void createStairsRecipe(Block Stairs, Block block) {
    }


    //Custom recipe generators

    public static void offerVerticalPlanksRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, output, 3).input('#', input).pattern("#").pattern("#").pattern("#").group("cellulose:verticalPlanks").criterion("has_planks", RecipeProvider.conditionsFromTag(CelluloseTags.Items.VERTICAL_PLANKS)).offerTo(exporter);
    }

    public static void offerReverseVerticalPlanksRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, output, 3).input('#', input).pattern("###").group("planks").criterion("has_vertical_planks", RecipeProvider.conditionsFromTag(PLANKS)).offerTo(exporter);
    }

    public static void offerPavementRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, output, 5).input('#', input).pattern("#  ").pattern("#  ").pattern("###").group("cellulose:pavements").criterion("has_planks", RecipeProvider.conditionsFromTag(PLANKS)).offerTo(exporter);
    }

    public static void offerBookShelvesRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, TagKey<Item> input) {
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, output, 3).group("cellulose:bookshelves").input('#', input).input('X', BOOK).pattern("###").pattern("XXX").pattern("###").criterion("has_planks", RecipeProvider.conditionsFromTag(PLANKS)).criterion("has_book", RecipeProvider.conditionsFromItem(BOOK)).offerTo(exporter);
    }

    public static void offerChiseledBookShelvesRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, TagKey<Item> input, TagKey<Item> input1) {
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, output, 1).group("cellulose:Cbookshelves").input('#', input).input('X', input1).pattern("###").criterion("has_planks", RecipeProvider.conditionsFromTag(PLANKS)).pattern("XXX").criterion("has_slabs", RecipeProvider.conditionsFromTag(WOODEN_SLABS)).pattern("###").offerTo(exporter);
    }

    public static void offerFrameRecipes(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, TagKey<Item> input) {
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, output, 5).group("cellulose:frames").input('#', input).input('X', STICK).pattern("X X").pattern(" # ").pattern("X X").criterion("has_planks", RecipeProvider.conditionsFromTag(PLANKS)).criterion("has_sticks", RecipeProvider.conditionsFromItem(STICK)).offerTo(exporter);
    }

    public static void offerLintelsRecipes(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, Block input) {
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, output, 12).group("cellulose:lintels").input('#', input).pattern("###").pattern("###").criterion("has_frame_blocks", RecipeProvider.conditionsFromTag(CelluloseTags.Items.WOODEN_FRAMES)).offerTo(exporter);
    }

    public static void offerTilesRecipes(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, Item input, Item input1) {
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, output, 3).group("cellulose:tiles").input('#', input).input('X', input1).pattern("#X").pattern("X#").criterion("has_planks", RecipeProvider.conditionsFromTag(PLANKS)).criterion("has_slabs", RecipeProvider.conditionsFromTag(WOODEN_SLABS)).offerTo(exporter);
    }

    public static void offerWallPaperRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, Item input) {
        ShapedRecipeJsonBuilder.create(BUILDING_BLOCKS, output, 1).group("cellulose:wallpaper").input('#', PAPER_BLOCK).input('X', input).pattern("#").pattern("X").criterion("has_paper_block", RecipeProvider.conditionsFromItem(PAPER_BLOCK)).offerTo(exporter);
    }

    ////Sawmilling

    public static SingleItemRecipeJsonBuilder createSawmilling(Ingredient input, ItemConvertible output, int count) {
        return new SingleItemRecipeJsonBuilder(RecipeCategory.BUILDING_BLOCKS, SawmillingRecipe.Serializer.INSTANCE, input, output, count);
    }

    public static void offerSawmillingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        offerSawmillingRecipe(exporter, output, input, 1);
    }

    public static void offerSawmillingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input, int count) {
        createSawmilling(Ingredient.ofItems(input), output, count).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter, RecipeProvider.convertBetween(output, input) + "_sawmilling");
    }

}
