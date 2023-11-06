package net.qzimyion.cellulose.blocks.customBlocks.CauldronStuff;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.qzimyion.cellulose.util.CelluloseCauldronBehavior;

@SuppressWarnings("deprecation")
public class DissolvedBambooCauldronBlock extends AbstractCauldronBlock {

    public DissolvedBambooCauldronBlock(Settings settings) {
        super(settings, CelluloseCauldronBehavior.DISSOVLED_BAMBOO_CAULDRON_BEHAVIOR);
    }

    @Override
    protected double getFluidHeight(BlockState state) {
        return 0.900;
    }

    @Override
    public boolean isFull(BlockState state) {
        return true;
    }

    @Override public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(Blocks.CAULDRON);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (this.isEntityTouchingFluid(state, pos, entity)) {
            if (entity instanceof LivingEntity){
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS));
            }
        }
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return 4;
    }
}
