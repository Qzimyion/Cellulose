package net.qzimyion.cellulose.mixin.snowing;


import net.minecraft.client.color.block.BlockColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.qzimyion.cellulose.util.TintManager;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockColors.class)
public class LeafRender {

    @Unique
    private int adjustColor(int baseColor, float gradient) {
        int red = (baseColor >> 16) & 0xFF;
        int green = (baseColor >> 8) & 0xFF;
        int blue = baseColor & 0xFF;

        red += (int) (gradient * (255 - red));
        green += (int) (gradient * (255 - green));
        blue += (int) (gradient * (255 - blue));

        return (red << 16) | (green << 8) | blue;
    }

    @Inject(
            method = "getColor(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;I)I",
            at = @At("RETURN"),
            cancellable = true
    )
    public void getColor(
            BlockState state,
            net.minecraft.world.level.BlockAndTintGetter tintGetter,
            BlockPos pos,
            int tintIndex,
            CallbackInfoReturnable<Integer> cir
    ) {
        if (pos == null || !(state.getBlock() instanceof LeavesBlock)) return;

        int baseColor = cir.getReturnValue();
        float gradient = TintManager.getGradient();
        cir.setReturnValue(adjustColor(baseColor, gradient));
    }
}
