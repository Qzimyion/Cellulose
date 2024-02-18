package net.qzimyion.cellulose.worldgen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.worldgen.trees.foliagePlacers.CederFoliagePlacer;
import net.qzimyion.cellulose.worldgen.trees.foliagePlacers.SmallDarkOakFoliagePlacer;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.JuniperTrunkPlacer;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.SmallDarkOakTrunkPlacer;

import java.util.OptionalInt;

import static net.minecraft.block.Blocks.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.CEDAR_LEAVES;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.CEDAR_LOG;

public class CelluloseConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> CEDAR_TREE = registerKey("cedar_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNIPER_TREE = registerKey("juniper_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SMALL_DARK_OAK = registerKey("small_dark_oak");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context){
        register(context, CEDAR_TREE, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(CEDAR_LOG),
                new StraightTrunkPlacer(10, 1, 2),
                BlockStateProvider.of(CEDAR_LEAVES),
                new CederFoliagePlacer(UniformIntProvider.create(2, 2), UniformIntProvider.create(2, 3), UniformIntProvider.create(2, 12)),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build());

        register(context, JUNIPER_TREE, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(ACACIA_LOG),
                new JuniperTrunkPlacer(4, 1, 2, UniformIntProvider.create(4, 6), .95F,
                        UniformIntProvider.create(4, 6), Registries.BLOCK.getOrCreateEntryList(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                BlockStateProvider.of(MANGROVE_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(3, 1, 2, OptionalInt.of(3))
        ).ignoreVines().build());

        register(context, SMALL_DARK_OAK, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(DARK_OAK_LOG),
                new SmallDarkOakTrunkPlacer(4, 2, 0),
                BlockStateProvider.of(DARK_OAK_LEAVES),
                new SmallDarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
                .ignoreVines().build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Cellulose.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
