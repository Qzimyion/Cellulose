package net.qzimyion.cellulose.mixin;

import net.minecraft.block.sapling.DarkOakSaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.qzimyion.cellulose.worldgen.CelluloseConfiguredFeatures;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DarkOakSaplingGenerator.class)
public class DarkOakSaplingGeneratorMixin {

    @Inject(at = @At("RETURN"), method = "getTreeFeature", cancellable = true)
    protected void getTreeFeature(Random random, boolean bees, CallbackInfoReturnable<@Nullable RegistryKey<ConfiguredFeature<?, ?>>> cir){
        cir.setReturnValue(CelluloseConfiguredFeatures.SMALL_DARK_OAK);
    }

}
