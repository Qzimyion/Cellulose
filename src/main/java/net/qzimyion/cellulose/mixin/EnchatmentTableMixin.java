package net.qzimyion.cellulose.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EnchantmentTableBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChiseledBookShelfBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.entity.BlockEntity.CustomBookshelves.AzaleaChiseldBookshelfBlockEntity;
import net.qzimyion.cellulose.entity.BlockEntity.CustomBookshelves.BambooChiseledBookshelfBlockEntity;
import net.qzimyion.cellulose.util.CelluloseTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentTableBlock.class)
public class EnchatmentTableMixin {

    @Unique
    private static boolean isValidFacing(BlockPos tablePos, BlockPos chiseledBookshelfPos, Direction facing) {
        int deltaZ = chiseledBookshelfPos.getZ() - tablePos.getZ();
        int deltaX = chiseledBookshelfPos.getX() - tablePos.getX();
        int deltaY = chiseledBookshelfPos.getY() - tablePos.getY();
        return switch (facing) {
            case DOWN, UP -> false;
            case NORTH -> deltaZ == 2 && Math.abs(deltaX) <= 1;
            case SOUTH -> deltaZ == -2 && Math.abs(deltaX) <= 1;
            case EAST -> deltaX == -2 && Math.abs(deltaZ) <= 1;
            case WEST -> deltaX == 2 && Math.abs(deltaZ) <= 1;
        } && deltaY <= 1 && deltaY >= 0;
    }

    @Inject(method = "isValidBookShelf", at = @At("RETURN"), cancellable = true)
    private static void canAccessBookshelf(Level world, BlockPos tablePos, BlockPos bookshelfOffset, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValueZ()) return;
        BlockState blockState = world.getBlockState(tablePos.offset(bookshelfOffset));
        boolean isChiseledBookshelf = blockState.is(CelluloseTags.Blocks.CHISELED_BOOKSHELVES) && world.isEmptyBlock(tablePos.offset(bookshelfOffset.getX() / 2, bookshelfOffset.getY(), bookshelfOffset.getZ() / 2));
        if (isChiseledBookshelf) {
            Direction facing = blockState.getValue(BlockStateProperties.HORIZONTAL_FACING);
            BlockPos chiseledBookshelfPos = tablePos.offset(bookshelfOffset);
            boolean validFacing = isValidFacing(tablePos, chiseledBookshelfPos, facing);
            BlockEntity blockEntity = world.getBlockEntity(chiseledBookshelfPos);
            if (blockEntity instanceof ChiseledBookShelfBlockEntity chiseledBookshelfBlockEntity) {
                int numBooks = chiseledBookshelfBlockEntity.count();
                int enchantingTableBookRequirementForSixSlottedShelves = chiseledBookshelfBlockEntity.count() / 2;
                boolean hasEnoughBooks = numBooks >= enchantingTableBookRequirementForSixSlottedShelves;
                cir.setReturnValue(validFacing && hasEnoughBooks);
            }
            if (blockEntity instanceof AzaleaChiseldBookshelfBlockEntity chiseledBookshelfBlockEntity) {
                int numBooks = chiseledBookshelfBlockEntity.getOpenSlotCount();
                int enchantingTableBookRequirementForSixSlottedShelves = chiseledBookshelfBlockEntity.getOpenSlotCount() / 2;
                boolean hasEnoughBooks = numBooks >= enchantingTableBookRequirementForSixSlottedShelves;
                cir.setReturnValue(validFacing && hasEnoughBooks);
            }
            if (blockEntity instanceof BambooChiseledBookshelfBlockEntity chiseledBookshelfBlockEntity) {
                int numBooks = chiseledBookshelfBlockEntity.getBookCount();
                int enchantingTableBookRequirementForSixSlottedShelves = chiseledBookshelfBlockEntity.getBookCount() / 2;
                boolean hasEnoughBooks = numBooks >= enchantingTableBookRequirementForSixSlottedShelves;
                cir.setReturnValue(validFacing && hasEnoughBooks);
            }
        }
    }
}
