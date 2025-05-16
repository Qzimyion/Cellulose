package net.qzimyion.cellulose.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.HeightmapPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

import java.util.List;

import static net.minecraft.world.level.levelgen.Heightmap.Types.MOTION_BLOCKING_NO_LEAVES;

public class CellulosePlacedFeatures {

    //Trees
    public static final ResourceKey<PlacedFeature> DARK_OAK_ROOFED_PLACED = registerKey("dark_oak_roofed");
    public static final ResourceKey<PlacedFeature> PINE_TREE_PLACED = registerKey("pine_tree");

    //Fallen logs
    public static final ResourceKey<PlacedFeature> FALLEN_OAK_LOG_PLACED = registerKey("fallen_oak_log");
    public static final ResourceKey<PlacedFeature> FALLEN_HOLLOW_OAK_LOG_PLACED = registerKey("fallen_hollow_oak_log");


    public static void boostrap(BootstapContext<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> reg = configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.FALLEN_OAK_LOG);

        //Trees
        registerKey(context, DARK_OAK_ROOFED_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.SMALL_DARK_OAK),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.5f, 2),
                        Blocks.DARK_OAK_SAPLING));

        registerKey(context, PINE_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.PINE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(5, 0.1f, 1),
                        CelluloseBlocks.PINE_SAPLING));

        //Fallen logs
        registerKey(context, FALLEN_OAK_LOG_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.FALLEN_OAK_LOG),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1), Blocks.OAK_SAPLING));

        registerKey(context, FALLEN_HOLLOW_OAK_LOG_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.FALLEN_HOLLOW_OAK_LOG),
                RarityFilter.onAverageOnceEvery(5));
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.tryBuild(Cellulose.MOD_ID, name));
    }

    private static void registerKey(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                    List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void registerKey(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                                                                      Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        registerKey(context, key, configuration, List.of(modifiers));
    }
}
