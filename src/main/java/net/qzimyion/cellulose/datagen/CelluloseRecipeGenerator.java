package net.qzimyion.cellulose.datagen;

import com.google.common.collect.Lists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.Util;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.qzimyion.cellulose.items.CelluloseItems;
import net.qzimyion.cellulose.recipe.SawmillingRecipe;
import net.qzimyion.cellulose.util.CelluloseTags;

import java.util.List;
import java.util.function.Consumer;

import static net.minecraft.world.item.Items.*;
import static net.minecraft.data.recipes.RecipeCategory.*;
import static net.minecraft.tags.ItemTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

@SuppressWarnings("deprecation")
public class CelluloseRecipeGenerator extends FabricRecipeProvider {
    public CelluloseRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter)
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

        slab(exporter, BUILDING_BLOCKS, VERTICAL_OAK_SLAB, VERTICAL_OAK_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_BIRCH_SLAB, VERTICAL_BIRCH_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_SPRUCE_SLAB, VERTICAL_SPRUCE_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_DARK_OAK_SLAB, VERTICAL_DARK_OAK_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_JUNGLE_SLAB, VERTICAL_JUNGLE_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_ACACIA_SLAB, VERTICAL_ACACIA_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_CRIMSON_SLAB, VERTICAL_CRIMSON_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_WARPED_SLAB, VERTICAL_WARPED_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_MANGROVE_SLAB, VERTICAL_MANGROVE_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_BAMBOO_SLAB, VERTICAL_BAMBOO_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_CHERRY_SLAB, VERTICAL_CHERRY_PLANKS);
        slab(exporter, BUILDING_BLOCKS, VERTICAL_CACTUS_SLAB, VERTICAL_CACTUS_PLANKS);

        //This section adds vertical plank recipes (STAIRS)
        

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_BIRCH_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_BIRCH_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_BIRCH_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_BIRCH_STAIR)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_OAK_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_OAK_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_OAK_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_OAK_STAIR)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_SPRUCE_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_SPRUCE_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_SPRUCE_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_SPRUCE_STAIR)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_DARK_OAK_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_DARK_OAK_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_DARK_OAK_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_DARK_OAK_STAIR)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_JUNGLE_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_JUNGLE_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_JUNGLE_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_JUNGLE_STAIR)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_ACACIA_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_ACACIA_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_ACACIA_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_ACACIA_STAIR)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_CRIMSON_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_CRIMSON_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_CRIMSON_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_CRIMSON_STAIR)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_WARPED_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_WARPED_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_WARPED_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_WARPED_STAIR)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_MANGROVE_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_MANGROVE_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_MANGROVE_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_MANGROVE_STAIR)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_BAMBOO_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_BAMBOO_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_BAMBOO_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_BAMBOO_STAIR)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, VERTICAL_CHERRY_STAIR, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', VERTICAL_CHERRY_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(VERTICAL_CHERRY_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(VERTICAL_CHERRY_STAIR)));


        // This section adds wooden mosaics recipes (Block)

        mosaicBuilder(exporter, BUILDING_BLOCKS,OAK_MOSAIC, OAK_SLAB);
        mosaicBuilder(exporter, BUILDING_BLOCKS,BIRCH_MOSAIC, BIRCH_SLAB);
        mosaicBuilder(exporter, BUILDING_BLOCKS,SPRUCE_MOSAIC, SPRUCE_SLAB);
        mosaicBuilder(exporter, BUILDING_BLOCKS,DARK_OAK_MOSAIC, DARK_OAK_SLAB);
        mosaicBuilder(exporter, BUILDING_BLOCKS,JUNGLE_MOSAIC, JUNGLE_SLAB);
        mosaicBuilder(exporter, BUILDING_BLOCKS,ACACIA_MOSAIC, ACACIA_SLAB);
        mosaicBuilder(exporter, BUILDING_BLOCKS,CRIMSON_MOSAIC, CRIMSON_SLAB);
        mosaicBuilder(exporter, BUILDING_BLOCKS,WARPED_MOSAIC, WARPED_SLAB);
        mosaicBuilder(exporter, BUILDING_BLOCKS,MANGROVE_MOSAIC, MANGROVE_SLAB);
        mosaicBuilder(exporter, BUILDING_BLOCKS,CHERRY_MOSAIC, CHERRY_SLAB);

        //This section adds mosaic recipes (SLAB)

        slab(exporter, BUILDING_BLOCKS,OAK_MOSAIC_SLABS, OAK_MOSAIC);
        slab(exporter, BUILDING_BLOCKS,BIRCH_MOSAIC_SLABS, BIRCH_MOSAIC);
        slab(exporter, BUILDING_BLOCKS,SPRUCE_MOSAIC_SLABS, SPRUCE_MOSAIC);
        slab(exporter, BUILDING_BLOCKS,DARK_OAK_MOSAIC_SLABS, DARK_OAK_MOSAIC);
        slab(exporter, BUILDING_BLOCKS,JUNGLE_MOSAIC_SLABS, JUNGLE_MOSAIC);
        slab(exporter, BUILDING_BLOCKS,ACACIA_MOSAIC_SLABS, ACACIA_MOSAIC);
        slab(exporter, BUILDING_BLOCKS,CRIMSON_MOSAIC_SLABS, CRIMSON_MOSAIC);
        slab(exporter, BUILDING_BLOCKS,WARPED_MOSAIC_SLABS, WARPED_MOSAIC);
        slab(exporter, BUILDING_BLOCKS,MANGROVE_MOSAIC_SLABS, MANGROVE_MOSAIC);
        slab(exporter, BUILDING_BLOCKS,CHERRY_MOSAIC_SLABS, CHERRY_MOSAIC);

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


        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, BIRCH_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', BIRCH_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(BIRCH_MOSAIC), FabricRecipeProvider.has(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(BIRCH_MOSAIC_STAIRS)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, OAK_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', OAK_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(OAK_MOSAIC), FabricRecipeProvider.has(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(OAK_MOSAIC_STAIRS)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, SPRUCE_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', SPRUCE_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(SPRUCE_MOSAIC), FabricRecipeProvider.has(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(SPRUCE_MOSAIC_STAIRS)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, DARK_OAK_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', DARK_OAK_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(DARK_OAK_MOSAIC), FabricRecipeProvider.has(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(DARK_OAK_MOSAIC_STAIRS)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, JUNGLE_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', JUNGLE_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(JUNGLE_MOSAIC), FabricRecipeProvider.has(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(JUNGLE_MOSAIC_STAIRS)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ACACIA_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ACACIA_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(ACACIA_MOSAIC), FabricRecipeProvider.has(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(ACACIA_MOSAIC_STAIRS)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CRIMSON_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', CRIMSON_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(CRIMSON_MOSAIC), FabricRecipeProvider.has(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CRIMSON_MOSAIC_STAIRS)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, WARPED_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', WARPED_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(WARPED_MOSAIC), FabricRecipeProvider.has(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(WARPED_MOSAIC_STAIRS)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, MANGROVE_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', MANGROVE_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(MANGROVE_MOSAIC), FabricRecipeProvider.has(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(MANGROVE_MOSAIC_STAIRS)));

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CHERRY_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', CHERRY_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(CHERRY_MOSAIC), FabricRecipeProvider.has(CelluloseTags.Items.WOODEN_MOSAICS))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CHERRY_MOSAIC_STAIRS)));

        //Sawmill recipe
        ShapedRecipeBuilder.shaped(DECORATIONS, SAWMILL, 1)
                .pattern(" # ")
                .pattern("AAA").define('#', IRON_INGOT).define('A', PLANKS).unlockedBy(FabricRecipeProvider.getHasName(OAK_PLANKS), FabricRecipeProvider.has(PLANKS))
                .save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(SAWMILL)));

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
        offerTilesRecipes(exporter, CACTUS_TILES, Item.byBlock(CACTUS_PLANKS), Item.byBlock(CACTUS_SLAB));
        offerTilesRecipes(exporter, AZALEA_TILES, Item.byBlock(AZALEA_PLANKS), Item.byBlock(AZALEA_SLAB));
        offerTilesRecipes(exporter, BLOOMING_AZALEA_TILES, Item.byBlock(BLOOMING_AZALEA_PLANKS), Item.byBlock(BLOOMING_AZALEA_SLAB));

        //Cedar woodset


        //Cactus woodset
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CACTUS_BUNDLE, 4)
                .pattern("   ")
                .pattern("## ")
                .pattern("## ")
                .define('#', CACTUS).unlockedBy(FabricRecipeProvider.getHasName(CACTUS), FabricRecipeProvider.has(PLANKS))
                .group("cellulose:cactus_wood").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CACTUS_BUNDLE)));
        offerPlanksRecipe(CACTUS_BUNDLE);
        offerPlanksRecipe(CACTUS_CROWN);
        offerPlanksRecipe(STRIPPED_CACTUS);
        offerPlanksRecipe(STRIPPED_CACTUS_BUNDLE);
        slab(exporter, BUILDING_BLOCKS, CACTUS_SLAB, CACTUS_PLANKS);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CACTUS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', CACTUS_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(CACTUS_PLANKS), FabricRecipeProvider.has(PLANKS))
                .group("minecraft:wooden_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CACTUS_STAIRS)));
        woodFromLogs(exporter, CACTUS_CROWN, CACTUS_BUNDLE);
        woodFromLogs(exporter, STRIPPED_CACTUS_BUNDLE, CACTUS_BUNDLE);
        offerVerticalPlanksRecipe(exporter, VERTICAL_CACTUS_PLANKS, CACTUS_PLANKS);
        offerReverseVerticalPlanksRecipe(exporter, CACTUS_PLANKS, VERTICAL_CACTUS_PLANKS);
        mosaicBuilder(exporter, BUILDING_BLOCKS, CACTUS_MOSAIC, CACTUS_SLAB);
        slab(exporter, BUILDING_BLOCKS, CACTUS_MOSAIC_SLABS, CACTUS_MOSAIC);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CACTUS_MOSAIC_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', CACTUS_MOSAIC).unlockedBy(FabricRecipeProvider.getHasName(CACTUS_MOSAIC), FabricRecipeProvider.has(CACTUS_MOSAIC))
                .group("cellulose:wooden_mosaic_stairs").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CACTUS_MOSAIC_STAIRS)));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, CACTUS_BUTTON, 2)
                .requires(CACTUS_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(CACTUS_PLANKS), FabricRecipeProvider.has(WOODEN_BUTTONS))
                .group("minecraft:wooden_buttons").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CACTUS_BUTTON)));
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CACTUS_PRESSURE_PLATE, 2)
                .pattern("## ")
                .define('#', CACTUS_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(CACTUS_PLANKS), FabricRecipeProvider.has(WOODEN_PRESSURE_PLATES))
                .group("minecraft:wooden_pressure_plates").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CACTUS_PRESSURE_PLATE)));
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CACTUS_TRAPDOOR, 2)
                .pattern("## ")
                .define('#', CACTUS_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(CACTUS_PLANKS), FabricRecipeProvider.has(WOODEN_TRAPDOORS))
                .group("minecraft:wooden_trapdoors").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CACTUS_TRAPDOOR)));
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CACTUS_DOOR, 2)
                .pattern("## ")
                .pattern("## ")
                .pattern("## ")
                .define('#', CACTUS_PLANKS).unlockedBy(FabricRecipeProvider.getHasName(CACTUS_PLANKS), FabricRecipeProvider.has(WOODEN_DOORS))
                .group("minecraft:wooden_doors").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CACTUS_DOOR)));
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CACTUS_PRESSURE_PLATE, 2)
                .pattern("   ")
                .pattern("#A#")
                .pattern("#A#")
                .define('#', CACTUS_PLANKS).define('A', STICK).unlockedBy(FabricRecipeProvider.getHasName(CACTUS_PLANKS), FabricRecipeProvider.has(WOODEN_FENCES))
                .group("minecraft:wooden_fences").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CACTUS_FENCE)));
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CACTUS_PRESSURE_PLATE, 2)
                .pattern("   ")
                .pattern("A#A")
                .pattern("A#A")
                .define('#', CACTUS_PLANKS).define('A', STICK).unlockedBy(FabricRecipeProvider.getHasName(CACTUS_PLANKS), FabricRecipeProvider.has(WOODEN_FENCES))
                .group("minecraft:wooden_fences").save(exporter, new ResourceLocation(FabricRecipeProvider.getSimpleRecipeName(CACTUS_FENCE_GATE)));



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
        ShapedRecipeBuilder.shaped(DECORATIONS, POTION_RACK)
                .pattern("###")
                .pattern("X X")
                .pattern("###")
                .define('#', WOODEN_SLABS).define('X', STICK).unlockedBy("has_wooden_slabs", RecipeProvider.has(WOODEN_SLABS)).unlockedBy("has_stick", RecipeProvider.has(STICK)).save(exporter);

        //Paper blocks
        //Normal
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, PAPER_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', PAPER).unlockedBy("has_paper", RecipeProvider.has(PAPER)).save(exporter);
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


        final List<ItemLike> PAPER_SMELTING = Util.make(Lists.newArrayList(), list -> list.add(SOAKED_PAPER_BLOCK));

        oreSmelting(exporter, PAPER_SMELTING, MISC, PAPER_BLOCK, 0.15F, 200, "misc");
    }

    private void offerPlanksRecipe(Block strippedCactusBundle) {
    }

    public static void offerPlanks(Consumer<FinishedRecipe> exporter, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, output, 4).define('#', input).group("planks").unlockedBy("has_logs", RecipeProvider.has(LOGS)).save(exporter);
    }

    private void createStairsRecipe(Block Stairs, Block block) {
    }


    //Custom recipe generators

    public static void offerVerticalPlanksRecipe(Consumer<FinishedRecipe> exporter, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, output, 3).define('#', input).pattern("#").pattern("#").pattern("#").group("cellulose:verticalPlanks").unlockedBy("has_planks", RecipeProvider.has(CelluloseTags.Items.VERTICAL_PLANKS)).save(exporter);
    }

    public static void offerReverseVerticalPlanksRecipe(Consumer<FinishedRecipe> exporter, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, output, 3).define('#', input).pattern("###").group("planks").unlockedBy("has_vertical_planks", RecipeProvider.has(PLANKS)).save(exporter);
    }

    public static void offerPavementRecipe(Consumer<FinishedRecipe> exporter, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, output, 5).define('#', input).pattern("#  ").pattern("#  ").pattern("###").group("cellulose:pavements").unlockedBy("has_planks", RecipeProvider.has(PLANKS)).save(exporter);
    }

    public static void offerBookShelvesRecipe(Consumer<FinishedRecipe> exporter, ItemLike output, TagKey<Item> input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, output, 3).group("cellulose:bookshelves").define('#', input).define('X', BOOK).pattern("###").pattern("XXX").pattern("###").unlockedBy("has_planks", RecipeProvider.has(PLANKS)).unlockedBy("has_book", RecipeProvider.has(BOOK)).save(exporter);
    }

    public static void offerChiseledBookShelvesRecipe(Consumer<FinishedRecipe> exporter, ItemLike output, TagKey<Item> input, TagKey<Item> input1) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, output, 1).group("cellulose:Cbookshelves").define('#', input).define('X', input1).pattern("###").unlockedBy("has_planks", RecipeProvider.has(PLANKS)).pattern("XXX").unlockedBy("has_slabs", RecipeProvider.has(WOODEN_SLABS)).pattern("###").save(exporter);
    }

    public static void offerFrameRecipes(Consumer<FinishedRecipe> exporter, ItemLike output, TagKey<Item> input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, output, 5).group("cellulose:frames").define('#', input).define('X', STICK).pattern("X X").pattern(" # ").pattern("X X").unlockedBy("has_planks", RecipeProvider.has(PLANKS)).unlockedBy("has_sticks", RecipeProvider.has(STICK)).save(exporter);
    }

    public static void offerLintelsRecipes(Consumer<FinishedRecipe> exporter, ItemLike output, Block input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, output, 12).group("cellulose:lintels").define('#', input).pattern("###").pattern("###").unlockedBy("has_frame_blocks", RecipeProvider.has(CelluloseTags.Items.WOODEN_FRAMES)).save(exporter);
    }

    public static void offerTilesRecipes(Consumer<FinishedRecipe> exporter, ItemLike output, Item input, Item input1) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, output, 3).group("cellulose:tiles").define('#', input).define('X', input1).pattern("#X").pattern("X#").unlockedBy("has_planks", RecipeProvider.has(PLANKS)).unlockedBy("has_slabs", RecipeProvider.has(WOODEN_SLABS)).save(exporter);
    }

    public static void offerWallPaperRecipe(Consumer<FinishedRecipe> exporter, ItemLike output, Item input) {
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, output, 1).group("cellulose:wallpaper").define('#', PAPER_BLOCK).define('X', input).pattern("#").pattern("X").unlockedBy("has_paper_block", RecipeProvider.has(PAPER_BLOCK)).save(exporter);
    }

    ////Sawmilling

    public static SingleItemRecipeBuilder createSawmilling(Ingredient input, ItemLike output, int count) {
        return new SingleItemRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, SawmillingRecipe.Serializer.INSTANCE, input, output, count);
    }

    public static void offerSawmillingRecipe(Consumer<FinishedRecipe> exporter, ItemLike output, ItemLike input) {
        offerSawmillingRecipe(exporter, output, input, 1);
    }

    public static void offerSawmillingRecipe(Consumer<FinishedRecipe> exporter, ItemLike output, ItemLike input, int count) {
        createSawmilling(Ingredient.of(input), output, count).unlockedBy(RecipeProvider.getHasName(input), RecipeProvider.has(input)).save(exporter, RecipeProvider.getConversionRecipeName(output, input) + "_sawmilling");
    }

}
