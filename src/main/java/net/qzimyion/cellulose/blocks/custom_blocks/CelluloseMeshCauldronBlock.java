package net.qzimyion.cellulose.blocks.custom_blocks;

import net.minecraft.block.*;
import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import java.util.Map;
import java.util.function.Predicate;

public class CelluloseMeshCauldronBlock extends LeveledCauldronBlock {


    public CelluloseMeshCauldronBlock(Settings settings, Predicate<Biome.Precipitation> precipitationPredicate, Map<Item, CauldronBehavior> behaviorMap) {
        super(settings, precipitationPredicate, behaviorMap);
    }

    @Override
    protected double getFluidHeight(BlockState state) {
        return 0.8;
    }

    @Override
    public boolean isFull(BlockState state) {
        return state.get(LEVEL) == 4;
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
    protected void onFireCollision(BlockState state, World world, BlockPos pos) {
        CelluloseMeshCauldronBlock.decrementFluidLevel(Blocks.WATER_CAULDRON.getDefaultState().with(LEVEL, state.get(LEVEL)), world, pos);
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return 3;
    }
}
