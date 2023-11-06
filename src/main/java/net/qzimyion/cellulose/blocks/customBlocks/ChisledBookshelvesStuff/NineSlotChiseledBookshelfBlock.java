package net.qzimyion.cellulose.blocks.customBlocks.ChisledBookshelvesStuff;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.qzimyion.cellulose.blocks.ModBlockProperties;
import net.qzimyion.cellulose.entity.BlockEntity.CustomBookshelves.NineSlotBookshelfBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("deprecation")
public class NineSlotChiseledBookshelfBlock extends BlockWithEntity {
    public static final List<BooleanProperty> SLOT_OCCUPIED_PROPERTIES = List.of(Properties.SLOT_0_OCCUPIED, Properties.SLOT_1_OCCUPIED, Properties.SLOT_2_OCCUPIED, Properties.SLOT_3_OCCUPIED, Properties.SLOT_4_OCCUPIED, Properties.SLOT_5_OCCUPIED, ModBlockProperties.SLOT_6_OCCUPIED, ModBlockProperties.SLOT_7_OCCUPIED, ModBlockProperties.SLOT_8_OCCUPIED);

    public NineSlotChiseledBookshelfBlock(Settings settings) {
        super(settings);
        BlockState blockState = this.stateManager.getDefaultState().with(HorizontalFacingBlock.FACING, Direction.NORTH);
        for (BooleanProperty booleanProperty : SLOT_OCCUPIED_PROPERTIES) {
            blockState = blockState.with(booleanProperty, false);
        }
        this.setDefaultState(blockState);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new NineSlotBookshelfBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public static Optional<Vec2f> getHitPos(BlockHitResult hit, Direction facing) {
        Direction direction = hit.getSide();
        if (facing != direction) {
            return Optional.empty();
        }
        BlockPos blockPos = hit.getBlockPos().offset(direction);
        Vec3d vec3d = hit.getPos().subtract(blockPos.getX(), blockPos.getY(), blockPos.getZ());
        double x = vec3d.getX();
        double y = vec3d.getY();
        double z = vec3d.getZ();
        return switch (direction) {
            case NORTH -> Optional.of(new Vec2f((float)(1 - x), (float)y));
            case SOUTH -> Optional.of(new Vec2f((float)x, (float)y));
            case WEST -> Optional.of(new Vec2f((float)z, (float)y));
            case EAST -> Optional.of(new Vec2f((float)(1 - z), (float)y));
            case DOWN, UP -> Optional.empty();
        };
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (!(blockEntity instanceof NineSlotBookshelfBlockEntity nineSlotBookshelfBlockEntity)){
            return ActionResult.PASS;
        }
        Optional<Vec2f> optional = NineSlotChiseledBookshelfBlock.getHitPos(hit, state.get(HorizontalFacingBlock.FACING));
        if (optional.isEmpty()) {
            return ActionResult.PASS;
        }
        int i = NineSlotChiseledBookshelfBlock.getSlotForHitPos(optional.get());
        if (state.get(SLOT_OCCUPIED_PROPERTIES.get(i))) {
            NineSlotChiseledBookshelfBlock.tryRemoveBook(world, pos, player, nineSlotBookshelfBlockEntity, i);
            return ActionResult.success(world.isClient);
        }
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isIn(ItemTags.BOOKSHELF_BOOKS)) {
            NineSlotChiseledBookshelfBlock.tryAddBook(world, pos, player, nineSlotBookshelfBlockEntity, itemStack, i);
            return ActionResult.success(world.isClient);
        }
        return ActionResult.CONSUME;
    }

    public static int getSlotForHitPos(Vec2f hitPos) {
        int i = (int) (Math.floor(3 * hitPos.x) % 3);
        int j = (int) Math.floor(3 * hitPos.y);
        return i + 3 * j;
    }

    private static void tryAddBook(World world, BlockPos pos, PlayerEntity player, NineSlotBookshelfBlockEntity blockEntity, ItemStack stack, int slot){
        if (world.isClient) {
            return;
        }
        player.incrementStat(Stats.USED.getOrCreateStat(stack.getItem()));
        SoundEvent soundEvent = stack.isOf(Items.ENCHANTED_BOOK) ? SoundEvents.BLOCK_CHISELED_BOOKSHELF_INSERT_ENCHANTED : SoundEvents.BLOCK_CHISELED_BOOKSHELF_INSERT;
        blockEntity.setStack(slot, stack.split(1));
        world.playSound(null, pos, soundEvent, SoundCategory.BLOCKS, 1.0f, 1.0f);
        if (player.isCreative()) {
            stack.increment(1);
        }
        world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
    }

    private static void tryRemoveBook(World world, BlockPos pos, PlayerEntity player, NineSlotBookshelfBlockEntity blockEntity, int slot){
        if (world.isClient) {
            return;
        }
        ItemStack itemStack = blockEntity.removeStack(slot, 1);
        SoundEvent soundEvent = itemStack.isOf(Items.ENCHANTED_BOOK) ? SoundEvents.BLOCK_CHISELED_BOOKSHELF_PICKUP_ENCHANTED : SoundEvents.BLOCK_CHISELED_BOOKSHELF_PICKUP;
        world.playSound(null, pos, soundEvent, SoundCategory.BLOCKS, 1.0f, 1.0f);
        if (!player.getInventory().insertStack(itemStack)) {
            player.dropItem(itemStack, false);
        }
        world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HorizontalFacingBlock.FACING);
        SLOT_OCCUPIED_PROPERTIES.forEach(builder::add);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved){
        NineSlotBookshelfBlockEntity nineSlotBookshelfBlockEntity;
        if (state.isOf(newState.getBlock())) {
            return;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof NineSlotBookshelfBlockEntity && !(nineSlotBookshelfBlockEntity = (NineSlotBookshelfBlockEntity) blockEntity).isEmpty()){
            for (int i = 0; i < 4; ++i){
                ItemStack itemStack = nineSlotBookshelfBlockEntity.getStack(i);
                if (itemStack.isEmpty()) continue;
                ItemScatterer.spawn(world, pos.getX(), pos.getY(), pos.getZ(), itemStack);
            }
            nineSlotBookshelfBlockEntity.clear();
            world.updateComparators(pos, this);
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(HorizontalFacingBlock.FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(HorizontalFacingBlock.FACING, rotation.rotate(state.get(HorizontalFacingBlock.FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(HorizontalFacingBlock.FACING)));
    }

    @Override
    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos){
        if (world.isClient()) {
            return 0;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof NineSlotBookshelfBlockEntity nineSlotBookshelfBlockEntity){
            return nineSlotBookshelfBlockEntity.getLastInteractedSlot() +1;
        }
        return 0;
    }
}
