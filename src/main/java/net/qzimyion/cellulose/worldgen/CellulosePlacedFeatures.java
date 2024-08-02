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

import java.util.List;

public class CellulosePlacedFeatures {

    public static final RegistryKey<PlacedFeature> DARK_OAK_ROOFED_PLACED = registerKey("dark");


    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, DARK_OAK_ROOFED_PLACED,
                configuredFeatureRegistryEntryLookup.getOrThrow(CelluloseConfiguredFeatures.SMALL_DARK_OAK),
                VegetationPlacedFeatures.
                        treeModifiersWithWouldSurvive
                                (PlacedFeatures.createCountExtraModifier(2, 0.5f, 2),
                                        Blocks.DARK_OAK_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Cellulose.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
