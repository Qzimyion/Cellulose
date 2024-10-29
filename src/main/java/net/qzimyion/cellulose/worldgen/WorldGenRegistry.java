package net.qzimyion.cellulose.worldgen;

import com.mojang.serialization.Codec;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.mixin.TrunkPlacerTypeInvoker;
import net.qzimyion.cellulose.worldgen.trees.foliagePlacers.PineFoliagePlacer;
import net.qzimyion.cellulose.worldgen.trees.trunkPlacers.SmallDarkOakTrunkPlacer;

import static net.qzimyion.cellulose.Cellulose.MOD_ID;

public class WorldGenRegistry {

    //TrunkPlacer
    public static final TrunkPlacerType<SmallDarkOakTrunkPlacer> SMALL_DARK_OAK_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("small_dark_oak_placer", SmallDarkOakTrunkPlacer.CODEC);

    //FoliagePlacer
    public static final FoliagePlacerType<PineFoliagePlacer> PINE_FOLIAGE_PLACER = registerFoliagePlacer("pine_foliage_placer", PineFoliagePlacer.CODEC);

    private static <P extends FoliagePlacer> FoliagePlacerType<P> registerFoliagePlacer(String id, Codec<P> codec) {
        return (FoliagePlacerType) Registry.register(Registries.FOLIAGE_PLACER_TYPE, new Identifier(MOD_ID, id), new FoliagePlacerType(codec));
    }

    public static void registerFeatures()
    {
        Cellulose.LOGGER.info("Registering Mod Features");
    }
}
