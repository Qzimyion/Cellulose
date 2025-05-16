package net.qzimyion.cellulose.client;

import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.qzimyion.cellulose.blocks.BlockEntity.PotionRackBlockEntity;
import org.jetbrains.annotations.Nullable;

public class PotionRackBlockColor implements BlockColor {
    @Override
    public int getColor(BlockState state, @Nullable BlockAndTintGetter world, @Nullable BlockPos pos, int tint) {
        if (tint < 1 || tint > 6) return -1;
        if (world != null && pos != null) {
            BlockEntity te = world.getBlockEntity(pos);
            if (te instanceof PotionRackBlockEntity br) {
                ItemStack item = br.getItem(tint-1);
                if (!item.isEmpty()) {
                    return PotionUtils.getColor(item);
                }
            }
        }
        return 0xffffff;
    }
}
