package net.qzimyion.cellulose.worldgen;

import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.mixin.TrunkPlacerTypeInvoker;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.SmallDarkOakTrunkPlacer;

public class WorldGenRegistry {

    //TrunkPlacer
    public static final TrunkPlacerType<SmallDarkOakTrunkPlacer> SMALL_DARK_OAK_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("small_dark_oak_placer", SmallDarkOakTrunkPlacer.CODEC);


    public static void registerFeatures()
    {
        Cellulose.LOGGER.info("Registering Mod Features");
    }
}
