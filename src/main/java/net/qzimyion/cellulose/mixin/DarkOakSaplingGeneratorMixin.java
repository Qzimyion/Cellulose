package net.qzimyion.cellulose.mixin;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.DarkOakTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.qzimyion.cellulose.worldgen.CelluloseConfiguredFeatures;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DarkOakTreeGrower.class)
public class DarkOakSaplingGeneratorMixin {

    @Inject(at = @At("RETURN"), method = "getConfiguredFeature", cancellable = true)
    protected void getTreeFeature(RandomSource random, boolean bees, CallbackInfoReturnable<@Nullable ResourceKey<ConfiguredFeature<?, ?>>> cir){
        cir.setReturnValue(CelluloseConfiguredFeatures.SMALL_DARK_OAK);
    }

}
