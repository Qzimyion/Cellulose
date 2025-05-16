package net.qzimyion.cellulose.worldgen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.worldgen.trees.foliagePlacers.CPineFoliagePlacer;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.HorizontalStraightTrunkPlacer;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.SmallDarkOakTrunkPlacer;

import java.util.OptionalInt;

import static net.minecraft.world.level.block.Blocks.*;

public class CelluloseConfiguredFeatures {

    //Fallen logs
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_OAK_LOG = registerKey("fallen_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_LUSH_OAK_LOG = registerKey("fallen_lush_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_BIRCH_LOG = registerKey("fallen_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_SPRUCE_LOG = registerKey("fallen_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_JUNGLE_LOG = registerKey("fallen_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_ACACIA_LOG = registerKey("fallen_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_CRIMSON_LOG = registerKey("fallen_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_WARPED_LOG = registerKey("fallen_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_MANGROVE_LOG = registerKey("fallen_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_CHERRY_LOG = registerKey("fallen_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_AZALEA_LOG = registerKey("fallen_oak_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_PINE_LOG = registerKey("fallen_oak_log");

    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_HOLLOW_OAK_LOG = registerKey("fallen_hollow_oak_log");

    //Trees
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_DARK_OAK = registerKey("small_dark_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_TREE = registerKey("pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_TREE_B = registerKey("pine_tree_b");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_PINE_TREE = registerKey("big_pine_tree");

    //Vanilla improvements
    public static final ResourceKey<ConfiguredFeature<?, ?>> BETTER_PALE_OAK = registerKey("better_pale_oak");

    public static void boostrap(BootstapContext<ConfiguredFeature<?, ?>> context){

        //Fallen logs
        register(context, FALLEN_OAK_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(OAK_LOG),
                new HorizontalStraightTrunkPlacer(3, 1, 2,  0.5F, 0.8F),BlockStateProvider.simple(OAK_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), 0),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, FALLEN_HOLLOW_OAK_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(CelluloseBlocks.HOLLOW_OAK_LOG),
                new HorizontalStraightTrunkPlacer(3, 1, 2,  0.5F, 0.8F),BlockStateProvider.simple(OAK_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), 0),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, FALLEN_LUSH_OAK_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(OAK_LOG),
                new HorizontalStraightTrunkPlacer(3, 1, 2,  0.5F, 0.8F),BlockStateProvider.simple(OAK_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), 0),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        //==Trees==//
        //Vanilla
        register(context, SMALL_DARK_OAK, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(DARK_OAK_LOG),
                new SmallDarkOakTrunkPlacer(4, 1, 2, UniformInt.of(4, 6), .95F,
                        UniformInt.of(4, 6), BuiltInRegistries.BLOCK.getOrCreateTag(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                BlockStateProvider.simple(DARK_OAK_LEAVES),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(3, 1, 2, OptionalInt.of(3))
        ).ignoreVines().build());

        //Modded
        //Pine tree (small) for taiga and pine woods biome
        register(context, PINE_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(CelluloseBlocks.PINE_LOG),
                new StraightTrunkPlacer(10, 1, 2),
                BlockStateProvider.simple(CelluloseBlocks.PINE_LEAVES),
                new CPineFoliagePlacer(UniformInt.of(2, 2), UniformInt.of(2, 3), UniformInt.of(2, 12)),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Cellulose.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature,
                                                                                   FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
