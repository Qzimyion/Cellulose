package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.mixin.TrunkPlacerTypeInvoker;

public class CelluloseTrunkPlacerTypes {

    public static final TrunkPlacerType<JuniperTrunkPlacer> JUNIPER_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("juniper_trunk_placer", JuniperTrunkPlacer.CODEC);
    public static final TrunkPlacerType<SmallDarkOakTrunkPlacer> SMALL_DARK_OAK_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("small_dark_oak_trunk_placer", SmallDarkOakTrunkPlacer.CODEC);

    public static void registerTrunkPlacers()
    {
        Cellulose.LOGGER.info("Registering Mod Trunk Placers");
    }
}
