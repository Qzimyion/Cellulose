package net.qzimyion.cellulose.worldgen;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

import java.util.List;

import static net.minecraft.world.Heightmap.Type.MOTION_BLOCKING_NO_LEAVES;

public class CellulosePlacedFeatures {

    //Trees
    public static final RegistryKey<PlacedFeature> DARK_OAK_ROOFED_PLACED = registerKey("dark_oak_roofed");
    public static final RegistryKey<PlacedFeature> PINE_TREE_PLACED = registerKey("pine_tree");

    //Fallen logs
    public static final RegistryKey<PlacedFeature> FALLEN_OAK_LOG_PLACED = registerKey("fallen_oak_log");


    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        //Trees
        registerKey(context, DARK_OAK_ROOFED_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.SMALL_DARK_OAK),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.5f, 2),
                        Blocks.DARK_OAK_SAPLING));

        registerKey(context, PINE_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.PINE_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(5, 0.1f, 1),
                        CelluloseBlocks.PINE_SAPLING));

        //Fallen logs
        registerKey(context, FALLEN_OAK_LOG_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.FALLEN_OAK_LOG),
                HeightmapPlacementModifier.of(MOTION_BLOCKING_NO_LEAVES),
                RarityFilterPlacementModifier.of(3)
        );
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Cellulose.MOD_ID, name));
    }

    private static void registerKey(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                    List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void registerKey(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                      RegistryEntry<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        registerKey(context, key, configuration, List.of(modifiers));
    }
}
