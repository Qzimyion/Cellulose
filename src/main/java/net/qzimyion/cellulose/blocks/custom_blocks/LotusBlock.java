package net.qzimyion.cellulose.blocks.custom_blocks;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.*;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.qzimyion.cellulose.blocks.ModBlockProperties;

@SuppressWarnings("ALL")
public class LotusBlock extends PlantBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 15.0, 1.5, 15.0);
    public static final BooleanProperty FLUID = ModBlockProperties.FLUID_FILLED;

    public LotusBlock(Settings settings) {
        super(settings);
        this.setDefaultState(getDefaultState().with(FLUID, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FLUID);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onEntityCollision(state, world, pos, entity);
        if (world instanceof ServerWorld && entity instanceof BoatEntity) {
            world.breakBlock(new BlockPos(pos), true, entity);
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        FluidState fluidState = world.getFluidState(pos);
        FluidState fluidState2 = world.getFluidState(pos.up());
        return (fluidState.isIn(FluidTags.WATER) || floor.getBlock() instanceof IceBlock) && fluidState2.getFluid() == Fluids.EMPTY;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getStackInHand(hand);

        if (heldItem.getItem() == Items.POTION) {
            player.playSound(SoundEvents.ENTITY_PLAYER_SPLASH, 1, 1);
            ParticleUtil.spawnParticle(world, pos, ParticleTypes.SPLASH, UniformIntProvider.create(3, 5));
            if (player instanceof ServerPlayerEntity) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, pos, heldItem);
                if (player instanceof PlayerEntity && !((PlayerEntity)player).getAbilities().creativeMode) {
                    ItemStack itemStack = new ItemStack(Items.GLASS_BOTTLE);
                    PlayerEntity playerEntity = (PlayerEntity)player;
                    if (!playerEntity.getInventory().insertStack(itemStack)) {
                        playerEntity.dropItem(itemStack, false);
                    }
                }
                world.setBlockState(pos, state.with(FLUID, true));
            }
        }
        if (heldItem.getItem() == Items.GLASS_BOTTLE) {
            player.playSound(SoundEvents.ENTITY_PLAYER_SPLASH, 1, 1);
            ParticleUtil.spawnParticle(world, pos, ParticleTypes.SPLASH, UniformIntProvider.create(3, 5));
            if (player instanceof ServerPlayerEntity) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, pos, heldItem);
                if (player instanceof PlayerEntity && !((PlayerEntity)player).getAbilities().creativeMode) {
                    ItemStack itemStack = new ItemStack(Items.POTION);
                    PlayerEntity playerEntity = (PlayerEntity)player;
                    if (!playerEntity.getInventory().insertStack(itemStack)) {
                        playerEntity.dropItem(itemStack, false);
                    }
                }
                world.setBlockState(pos, state.with(FLUID, false));
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}
