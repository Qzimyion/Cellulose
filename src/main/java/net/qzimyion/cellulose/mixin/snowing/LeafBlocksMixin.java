package net.qzimyion.cellulose.mixin.snowing;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.levelgen.Heightmap;
import net.qzimyion.cellulose.util.ISnow;
import net.qzimyion.cellulose.util.TintManager;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LeavesBlock.class)
public class LeafBlocksMixin extends Block implements ISnow {

    @Shadow
    @Final
    public static BooleanProperty PERSISTENT;

    @Unique
    private boolean isSnowing = false;
    @Unique
    private long lastUpdateTime = 0;

    public LeafBlocksMixin(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isSnowy(Level level, BlockPos pos) {
        return updateSnow(level, pos);
    }

    @Unique
    private boolean updateSnow(Level level, BlockPos pos) {
        if (level.getBiome(pos).value().warmEnoughToRain(pos)) return false;

        int topY = level.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, pos).getY();
        if (topY > pos.getY()) {
            BlockPos checkPos = pos.above();
            for (int i = 0; i < topY - pos.getY(); i++) {
                if (level.getBrightness(LightLayer.SKY, checkPos) == 15) return true;

                Block block = level.getBlockState(checkPos).getBlock();
                if (!(block instanceof LeavesBlock) && !block.equals(Blocks.AIR) && !block.equals(Blocks.SNOW) && !block.equals(Blocks.SNOW_BLOCK)) {
                    return false;
                }
                checkPos = checkPos.above();
            }
        }
        return true;
    }

    @Inject(method = "animateTick", at = @At("HEAD"))
    public void animateTick(
            BlockState state,
            Level level,
            BlockPos pos,
            RandomSource random,
            CallbackInfo ci
    ) {
        if (level.getBiome(pos).value().warmEnoughToRain(pos)) return;

        boolean isCurrentlySnowing = level.isRaining();
        if (isCurrentlySnowing != isSnowing) {
            isSnowing = isCurrentlySnowing;
            lastUpdateTime = level.getGameTime();
            TintManager.updateTint();
        }

        if (level.getGameTime() - lastUpdateTime > 400) return;

        boolean persistent = state.getValue(PERSISTENT);
//        if (persistent != isSnowing) {
//            level.setBlock(pos, state.setValue(PERSISTENT, isSnowing), 2);
//        }
        level.setBlockAndUpdate(pos, state.setValue(PERSISTENT, !persistent));
        level.setBlockAndUpdate(pos, state.setValue(PERSISTENT, persistent));
    }

}
