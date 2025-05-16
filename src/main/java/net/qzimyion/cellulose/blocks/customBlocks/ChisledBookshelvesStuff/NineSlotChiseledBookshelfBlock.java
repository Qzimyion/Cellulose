package net.qzimyion.cellulose.blocks.customBlocks.ChisledBookshelvesStuff;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.qzimyion.cellulose.blocks.ModBlockProperties;
import net.qzimyion.cellulose.blocks.BlockEntity.CustomBookshelves.NineSlotBookshelfBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("deprecation")
public class NineSlotChiseledBookshelfBlock extends BaseEntityBlock {
    public static final List<BooleanProperty> SLOT_OCCUPIED_PROPERTIES = List.of(BlockStateProperties.CHISELED_BOOKSHELF_SLOT_0_OCCUPIED, BlockStateProperties.CHISELED_BOOKSHELF_SLOT_1_OCCUPIED, BlockStateProperties.CHISELED_BOOKSHELF_SLOT_2_OCCUPIED, BlockStateProperties.CHISELED_BOOKSHELF_SLOT_3_OCCUPIED, BlockStateProperties.CHISELED_BOOKSHELF_SLOT_4_OCCUPIED, BlockStateProperties.CHISELED_BOOKSHELF_SLOT_5_OCCUPIED, ModBlockProperties.SLOT_6_OCCUPIED, ModBlockProperties.SLOT_7_OCCUPIED, ModBlockProperties.SLOT_8_OCCUPIED);

    public NineSlotChiseledBookshelfBlock(Properties settings) {
        super(settings);
        BlockState blockState = this.stateDefinition.any().setValue(HorizontalDirectionalBlock.FACING, Direction.NORTH);
        for (BooleanProperty booleanProperty : SLOT_OCCUPIED_PROPERTIES) {
            blockState = blockState.setValue(booleanProperty, false);
        }
        this.registerDefaultState(blockState);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new NineSlotBookshelfBlockEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    public static Optional<Vec2> getHitPos(BlockHitResult hit, Direction facing) {
        Direction direction = hit.getDirection();
        if (facing != direction) {
            return Optional.empty();
        }
        BlockPos blockPos = hit.getBlockPos().relative(direction);
        Vec3 vec3d = hit.getLocation().subtract(blockPos.getX(), blockPos.getY(), blockPos.getZ());
        double x = vec3d.x();
        double y = vec3d.y();
        double z = vec3d.z();
        return switch (direction) {
            case NORTH -> Optional.of(new Vec2((float)(1 - x), (float)y));
            case SOUTH -> Optional.of(new Vec2((float)x, (float)y));
            case WEST -> Optional.of(new Vec2((float)z, (float)y));
            case EAST -> Optional.of(new Vec2((float)(1 - z), (float)y));
            case DOWN, UP -> Optional.empty();
        };
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (!(blockEntity instanceof NineSlotBookshelfBlockEntity nineSlotBookshelfBlockEntity)){
            return InteractionResult.PASS;
        }
        Optional<Vec2> optional = NineSlotChiseledBookshelfBlock.getHitPos(hit, state.getValue(HorizontalDirectionalBlock.FACING));
        if (optional.isEmpty()) {
            return InteractionResult.PASS;
        }
        int i = NineSlotChiseledBookshelfBlock.getSlotForHitPos(optional.get());
        if (state.getValue(SLOT_OCCUPIED_PROPERTIES.get(i))) {
            NineSlotChiseledBookshelfBlock.tryRemoveBook(world, pos, player, nineSlotBookshelfBlockEntity, i);
            return InteractionResult.sidedSuccess(world.isClientSide);
        }
        ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.is(ItemTags.BOOKSHELF_BOOKS)) {
            NineSlotChiseledBookshelfBlock.tryAddBook(world, pos, player, nineSlotBookshelfBlockEntity, itemStack, i);
            return InteractionResult.sidedSuccess(world.isClientSide);
        }
        return InteractionResult.CONSUME;
    }

    public static int getSlotForHitPos(Vec2 hitPos) {
        int i = (int) (Math.floor(3 * hitPos.x) % 3);
        int j = (int) Math.floor(3 * hitPos.y);
        return i + 3 * j;
    }

    private static void tryAddBook(Level world, BlockPos pos, Player player, NineSlotBookshelfBlockEntity blockEntity, ItemStack stack, int slot){
        if (world.isClientSide) {
            return;
        }
        player.awardStat(Stats.ITEM_USED.get(stack.getItem()));
        SoundEvent soundEvent = stack.is(Items.ENCHANTED_BOOK) ? SoundEvents.CHISELED_BOOKSHELF_INSERT_ENCHANTED : SoundEvents.CHISELED_BOOKSHELF_INSERT;
        blockEntity.setItem(slot, stack.split(1));
        world.playSound(null, pos, soundEvent, SoundSource.BLOCKS, 1.0f, 1.0f);
        if (player.isCreative()) {
            stack.grow(1);
        }
        world.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
    }

    private static void tryRemoveBook(Level world, BlockPos pos, Player player, NineSlotBookshelfBlockEntity blockEntity, int slot){
        if (world.isClientSide) {
            return;
        }
        ItemStack itemStack = blockEntity.removeItem(slot, 1);
        SoundEvent soundEvent = itemStack.is(Items.ENCHANTED_BOOK) ? SoundEvents.CHISELED_BOOKSHELF_PICKUP_ENCHANTED : SoundEvents.CHISELED_BOOKSHELF_PICKUP;
        world.playSound(null, pos, soundEvent, SoundSource.BLOCKS, 1.0f, 1.0f);
        if (!player.getInventory().add(itemStack)) {
            player.drop(itemStack, false);
        }
        world.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HorizontalDirectionalBlock.FACING);
        SLOT_OCCUPIED_PROPERTIES.forEach(builder::add);
    }

    @Override
    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean moved){
        NineSlotBookshelfBlockEntity nineSlotBookshelfBlockEntity;
        if (state.is(newState.getBlock())) {
            return;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof NineSlotBookshelfBlockEntity && !(nineSlotBookshelfBlockEntity = (NineSlotBookshelfBlockEntity) blockEntity).isEmpty()){
            for (int i = 0; i < 4; ++i){
                ItemStack itemStack = nineSlotBookshelfBlockEntity.getItem(i);
                if (itemStack.isEmpty()) continue;
                Containers.dropItemStack(world, pos.getX(), pos.getY(), pos.getZ(), itemStack);
            }
            nineSlotBookshelfBlockEntity.clearContent();
            world.updateNeighbourForOutputSignal(pos, this);
        }
        super.onRemove(state, world, pos, newState, moved);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(HorizontalDirectionalBlock.FACING, rotation.rotate(state.getValue(HorizontalDirectionalBlock.FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(HorizontalDirectionalBlock.FACING)));
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    @Override
    public int getAnalogOutputSignal(BlockState state, Level world, BlockPos pos){
        if (world.isClientSide()) {
            return 0;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof NineSlotBookshelfBlockEntity nineSlotBookshelfBlockEntity){
            return nineSlotBookshelfBlockEntity.getLastInteractedSlot() +1;
        }
        return 0;
    }
}
