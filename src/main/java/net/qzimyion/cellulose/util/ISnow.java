package net.qzimyion.cellulose.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public interface ISnow {
    boolean isSnowy(Level level, BlockPos pos);
}
