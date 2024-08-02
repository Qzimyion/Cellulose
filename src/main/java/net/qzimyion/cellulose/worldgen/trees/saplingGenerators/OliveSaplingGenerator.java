package net.qzimyion.cellulose.worldgen.trees.saplingGenerators;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.qzimyion.cellulose.worldgen.CelluloseConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class OliveSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return CelluloseConfiguredFeatures.OLIVE_TREE;
    }
}
