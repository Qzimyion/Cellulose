package net.qzimyion.cellulose.worldgen.trees.saplingGenerators;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.qzimyion.cellulose.worldgen.CelluloseConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class PineSaplingGenerator extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean bees) {
        return CelluloseConfiguredFeatures.PINE_TREE;
    }
}
