package net.qzimyion.cellulose.client;

import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.qzimyion.cellulose.entity.BlockEntity.PotionRackBlockEntity;
import org.jetbrains.annotations.Nullable;

public class PotionRackBlockColor implements BlockColor {
    @Override
    public int getColor(BlockState blockState, @Nullable BlockAndTintGetter blockAndTintGetter, @Nullable BlockPos blockPos, int tintIndex) {
        if (tintIndex < 0 || tintIndex > 6) return -1;
        if (blockAndTintGetter != null && blockPos != null) {
            var blockEntity = blockAndTintGetter.getBlockEntity(blockPos);
            if (blockEntity instanceof PotionRackBlockEntity rackEntity) {
                ItemStack item = rackEntity.getItem(tintIndex-1);
                if (!item.isEmpty() && item.hasTag()) {
                    return PotionUtils.getColor(item);
                }
                else {
                    return -1;
                }
            }
        }
        return 0xffffff;
    }
}
