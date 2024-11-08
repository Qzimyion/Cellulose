package net.qzimyion.cellulose.worldgen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.PineFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.SmallDarkOakTrunkPlacer;

import java.util.OptionalInt;

import static net.minecraft.block.Blocks.DARK_OAK_LEAVES;
import static net.minecraft.block.Blocks.DARK_OAK_LOG;

public class CelluloseConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SMALL_DARK_OAK = registerKey("small_dark_oak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_TREE = registerKey("pine_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_TREE_B = registerKey("pine_tree_b");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BIG_PINE_TREE = registerKey("big_pine_tree");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context){

        register(context, SMALL_DARK_OAK, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(DARK_OAK_LOG),
                new SmallDarkOakTrunkPlacer(4, 1, 2, UniformIntProvider.create(4, 6), .95F,
                        UniformIntProvider.create(4, 6), Registries.BLOCK.getOrCreateEntryList(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                BlockStateProvider.of(DARK_OAK_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(3, 1, 2, OptionalInt.of(3))
        ).ignoreVines().build());

        //Pine tree (small) for taiga and pine woods biome
        register(context, PINE_TREE, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(CelluloseBlocks.PINE_LOG),
                new StraightTrunkPlacer(10, 1, 2),
                BlockStateProvider.of(CelluloseBlocks.PINE_LEAVES),
                new PineFoliagePlacer(UniformIntProvider.create(2, 2), UniformIntProvider.create(2, 3), UniformIntProvider.create(2, 12)),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Cellulose.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register
            (Registerable<ConfiguredFeature<?, ?>> context,
             RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));

    }
}
