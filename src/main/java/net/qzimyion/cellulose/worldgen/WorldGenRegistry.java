package net.qzimyion.cellulose.worldgen;

import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.mixin.FoliagePlacerTypeInvoker;
import net.qzimyion.cellulose.mixin.TreeDecoratorInvoker;
import net.qzimyion.cellulose.mixin.TrunkPlacerTypeInvoker;
import net.qzimyion.cellulose.worldgen.trees.foliagePlacers.CPineFoliagePlacer;
import net.qzimyion.cellulose.worldgen.trees.treeDecorators.MossCarpetDecorator;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.HorizontalStraightTrunkPlacer;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.SmallDarkOakTrunkPlacer;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.SnappedBigTrunkPlacer;

public class WorldGenRegistry {

    //TrunkPlacer
    public static final TrunkPlacerType<SmallDarkOakTrunkPlacer> SMALL_DARK_OAK_TRUNK_PLACER =
            TrunkPlacerTypeInvoker.callRegister("small_dark_oak_placer", SmallDarkOakTrunkPlacer.CODEC);

    public static final TrunkPlacerType<HorizontalStraightTrunkPlacer> HORIZONTAL_STRAIGHT_TRUNK_PLACER =
            TrunkPlacerTypeInvoker.callRegister("horizontal_straight_trunk_placer", HorizontalStraightTrunkPlacer.CODEC);

    public static final TrunkPlacerType<SnappedBigTrunkPlacer> SNAPPED_BIG_TRUNK_PLACER =
            TrunkPlacerTypeInvoker.callRegister("snapped_big_trunk_placer", SnappedBigTrunkPlacer.CODEC);

    //FoliagePlacer
    public static final FoliagePlacerType<CPineFoliagePlacer> PINE_FOLIAGE_PLACER =
            FoliagePlacerTypeInvoker.callRegister("frosty_pine_foliage_placer", CPineFoliagePlacer.CODEC);

    //Tree Decorator
    public static final TreeDecoratorType<MossCarpetDecorator> MOSS_CARPET_DECORATOR =
            TreeDecoratorInvoker.callRegister("moss_carpet_decorator", MossCarpetDecorator.CODEC);

    public static void registerFeatures()
    {
        Cellulose.LOGGER.info("Registering Mod Features");
    }
}
