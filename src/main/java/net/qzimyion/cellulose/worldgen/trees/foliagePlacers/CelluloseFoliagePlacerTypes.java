package net.qzimyion.cellulose.worldgen.trees.foliagePlacers;

import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.mixin.FoliagePlacerTypeInvoker;

public class CelluloseFoliagePlacerTypes {

    public static final FoliagePlacerType <CederFoliagePlacer> CEDAR_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("cedar_foliage_placer", CederFoliagePlacer.CODEC);
    public static final FoliagePlacerType <SmallDarkOakFoliagePlacer> SMALL_DARK_OAK_FOLIAGE = FoliagePlacerTypeInvoker.callRegister("small_dark_oak_placer", SmallDarkOakFoliagePlacer.CODEC);

    public static void registerFoliagePlacers()
    {
        Cellulose.LOGGER.info("Registering Mod Foliage Placers");
    }
}
