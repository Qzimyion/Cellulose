package net.qzimyion.cellulose.worldgen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.mixin.FoliagePlacerTypeInvoker;
import net.qzimyion.cellulose.mixin.TrunkPlacerTypeInvoker;
import net.qzimyion.cellulose.worldgen.trees.foliagePlacers.CederFoliagePlacer;
import net.qzimyion.cellulose.worldgen.trees.foliagePlacers.OliveFoliagePlacer;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.SmallDarkOakTrunkPlacer;

import static net.qzimyion.cellulose.Cellulose.MOD_ID;

public class WorldGenRegistry {

    //TrunkPlacer
    public static final TrunkPlacerType<SmallDarkOakTrunkPlacer> SMALL_DARK_OAK_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("small_dark_oak_placer", SmallDarkOakTrunkPlacer.CODEC);

    //FoliagePlacer
    public static final FoliagePlacerType<CederFoliagePlacer> CEDAR_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("cedar_foliage_placer", CederFoliagePlacer.CODEC);
    public static final FoliagePlacerType<OliveFoliagePlacer> OLIVE_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("olive_foliage_placer", OliveFoliagePlacer.CODEC);

    //Other features
    public static final Feature<DefaultFeatureConfig> OLIVE_TREE_FEATURE = Registry.register(Registries.FEATURE,
            new Identifier(MOD_ID, "olive_tree"), new OliveTreeFeature(DefaultFeatureConfig.CODEC)
    );
    public static void registerFeatures()
    {
        Cellulose.LOGGER.info("Registering Mod Features");
    }
}
