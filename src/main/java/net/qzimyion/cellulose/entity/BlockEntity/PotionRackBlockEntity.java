package net.qzimyion.cellulose.entity.BlockEntity;

import com.mojang.logging.LogUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.qzimyion.cellulose.blocks.custom_blocks.PotionRackBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.qzimyion.cellulose.entity.CelluloseEntities;
import net.qzimyion.cellulose.util.CelluloseTags;
import org.slf4j.Logger;

import java.util.Objects;
import java.util.function.Predicate;

@SuppressWarnings("unused")
public class PotionRackBlockEntity extends BlockEntity implements Inventory {
    private static final Logger LOGGER = LogUtils.getLogger();
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(6, ItemStack.EMPTY);
    private int lastInteractedSlot = -1;
    public PotionRackBlockEntity(BlockPos pos, BlockState state) {
        super(CelluloseEntities.POTION_RACK_BLOCK_ENTITY, pos, state);
    }

    private void updateState(int interactedSlot){
        if (interactedSlot < 0 || interactedSlot >= 6) {
            LOGGER.error("Expected slot 0-5, got {}", interactedSlot);
            return;
        }
        this.lastInteractedSlot = interactedSlot;
        BlockState blockState = this.getCachedState();
        for (int i = 0; i < PotionRackBlock.SLOT_OCCUPIED_PROPERTIES.size(); ++i){
            boolean bl = !this.getStack(i).isEmpty();
            BooleanProperty booleanProperty = PotionRackBlock.SLOT_OCCUPIED_PROPERTIES.get(i);
            blockState = blockState.with(booleanProperty, bl);
        }
        Objects.requireNonNull(this.world).setBlockState(this.pos, blockState, Block.NOTIFY_ALL);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        this.inventory.clear();
        Inventories.readNbt(nbt, this.inventory);
        this.lastInteractedSlot = nbt.getInt("last_interacted_slot");
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, this.inventory, true);
        nbt.putInt("last_interacted_slot", this.lastInteractedSlot);
    }

    public int getOpenSlotCount() {
        return (int)this.inventory.stream().filter(Predicate.not(ItemStack::isEmpty)).count();
    }

    @Override
    public int size() {
        return 6;
    }

    @Override
    public boolean isEmpty() {
        return this.inventory.stream().allMatch(ItemStack::isEmpty);
    }

    @Override
    public ItemStack getStack(int slot) {
        return this.inventory.get(slot);
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        ItemStack itemStack = Objects.requireNonNullElse(this.inventory.get(slot), ItemStack.EMPTY);
        this.inventory.set(slot, ItemStack.EMPTY);
        if (!itemStack.isEmpty()) {
            this.updateState(slot);
        }
        return itemStack;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return this.removeStack(slot, 1);
    }

    @Override
    public void setStack(int slot, ItemStack stack) {
        if (stack.isIn(CelluloseTags.Items.POTION_RACK_POTIONS)) {
            this.inventory.set(slot, stack);
            this.updateState(slot);
        }

    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return Inventory.canPlayerUse(this, player);
    }

    @Override
    public boolean isValid(int slot, ItemStack stack) {
        return stack.isIn(CelluloseTags.Items.POTION_RACK_POTIONS) && this.getStack(slot).isEmpty();
    }

    @Override
    public boolean canTransferTo(Inventory hopperInventory, int slot, ItemStack stack) {
        return hopperInventory.containsAny((ItemStack itemStack2) -> {
            if (itemStack2.isEmpty()) {
                return true;
            }
            return ItemStack.canCombine(stack, itemStack2) && itemStack2.getCount() + stack.getCount() <= Math.min(itemStack2.getMaxCount(), hopperInventory.getMaxCountPerStack());
        });
    }

    @Override
    public int getMaxCountPerStack() {
        return 1;
    }

    public int getLastInteractedSlot() {
        return this.lastInteractedSlot;
    }

    @Override
    public void clear() {
        this.inventory.clear();
    }
}
