package net.qzimyion.cellulose.worldgen;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

import java.util.List;

public class CellulosePlacedFeatures {

    public static final RegistryKey<PlacedFeature> CEDAR_PLACED_KEY = registerKey("cedar_placed");
    public static final RegistryKey<PlacedFeature> JUNIPER_PLACED_KEY = registerKey("juniper_placed");
    public static final RegistryKey<PlacedFeature> SMALL_DARK_OAK_PLACED_KEY = registerKey("small_dark_oak_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, CEDAR_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.CEDAR_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(5, 0.1f, 1),
                        CelluloseBlocks.CEDAR_SAPLING));

        register(context, JUNIPER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.JUNIPER_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.05f, 1),
                        CelluloseBlocks.JUNIPER_SAPLING));

        register(context, SMALL_DARK_OAK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.SMALL_DARK_OAK),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.05f, 1),
                        Blocks.DARK_OAK_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Cellulose.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
