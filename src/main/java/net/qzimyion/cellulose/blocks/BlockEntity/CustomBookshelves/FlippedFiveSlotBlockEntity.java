package net.qzimyion.cellulose.blocks.BlockEntity.CustomBookshelves;

import com.mojang.logging.LogUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.qzimyion.cellulose.blocks.customBlocks.ChisledBookshelvesStuff.FlippedFiveSlotChiseledBookshelf;
import net.qzimyion.cellulose.entity.CelluloseEntities;
import org.slf4j.Logger;

import java.util.Objects;
import java.util.function.Predicate;

public class FlippedFiveSlotBlockEntity extends BlockEntity implements Container {
    private static final Logger LOGGER = LogUtils.getLogger();
    private final NonNullList<ItemStack> inventory = NonNullList.withSize(5, ItemStack.EMPTY);
    private int lastInteractedSlot = -1;
    public FlippedFiveSlotBlockEntity(BlockPos pos, BlockState state) {
        super(CelluloseEntities.CEDAR_CHISELED_BOOKSHELF, pos, state);
    }

    private void updateState(int interactedSlot){
        if (interactedSlot < 0 || interactedSlot >= 5) {
            LOGGER.error("Expected slot 0-4, got {}", interactedSlot);
            return;
        }
        this.lastInteractedSlot = interactedSlot;
        BlockState blockState = this.getBlockState();
        for (int i = 0; i < FlippedFiveSlotChiseledBookshelf.SLOT_OCCUPIED_PROPERTIES.size(); ++i) {
            boolean bl = !this.getItem(i).isEmpty();
            BooleanProperty booleanProperty = FlippedFiveSlotChiseledBookshelf.SLOT_OCCUPIED_PROPERTIES.get(i);
            blockState = blockState.setValue(booleanProperty, bl);
        }
        Objects.requireNonNull(this.level).setBlock(this.worldPosition, blockState, Block.UPDATE_ALL);
    }

    @Override
    public void load(CompoundTag nbt) {
        this.inventory.clear();
        ContainerHelper.loadAllItems(nbt, this.inventory);
        this.lastInteractedSlot = nbt.getInt("last_interacted_slot");
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        ContainerHelper.saveAllItems(nbt, this.inventory, true);
        nbt.putInt("last_interacted_slot", this.lastInteractedSlot);
    }

    public int getOpenSlotCount() {
        return (int)this.inventory.stream().filter(Predicate.not(ItemStack::isEmpty)).count();
    }

    @Override
    public int getContainerSize() {
        return 5;
    }

    @Override
    public boolean isEmpty() {
        return this.inventory.stream().allMatch(ItemStack::isEmpty);
    }

    @Override
    public ItemStack getItem(int slot) {
        return this.inventory.get(slot);
    }

    @Override
    public ItemStack removeItem(int slot, int amount) {
        ItemStack itemStack = Objects.requireNonNullElse(this.inventory.get(slot), ItemStack.EMPTY);
        this.inventory.set(slot, ItemStack.EMPTY);
        if (!itemStack.isEmpty()) {
            this.updateState(slot);
        }
        return itemStack;
    }

    @Override
    public ItemStack removeItemNoUpdate(int slot) {
        return this.removeItem(slot, 1);
    }

    @Override
    public void setItem(int slot, ItemStack stack) {
        if (stack.is(ItemTags.BOOKSHELF_BOOKS)) {
            this.inventory.set(slot, stack);
            this.updateState(slot);
        }
    }

    @Override
    public boolean canTakeItem(Container hopperInventory, int slot, ItemStack stack) {
        return hopperInventory.hasAnyMatching((ItemStack itemStack2) -> {
            if (itemStack2.isEmpty()) {
                return true;
            }
            return ItemStack.isSameItemSameTags(stack, itemStack2) && itemStack2.getCount() + stack.getCount() <= Math.min(itemStack2.getMaxStackSize(), hopperInventory.getMaxStackSize());
        });
    }

    @Override
    public int getMaxStackSize() {
        return 1;
    }

    @Override
    public boolean stillValid(Player player) {
        return Container.stillValidBlockEntity(this, player);
    }

    @Override
    public boolean canPlaceItem(int slot, ItemStack stack) {
        return stack.is(ItemTags.BOOKSHELF_BOOKS) && this.getItem(slot).isEmpty();
    }

    public int getLastInteractedSlot() {
        return this.lastInteractedSlot;
    }

    @Override
    public void clearContent() {
        this.inventory.clear();
    }
}
