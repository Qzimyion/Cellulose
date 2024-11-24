package net.qzimyion.cellulose.entity.BlockEntity.CustomBookshelves;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Clearable;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.qzimyion.cellulose.entity.CelluloseEntities;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Objects;

public class BambooChiseledBookshelfBlockEntity extends BlockEntity implements Clearable {
    private final Deque<ItemStack> books = new ArrayDeque<>(7);
    public BambooChiseledBookshelfBlockEntity(BlockPos pos, BlockState state) {
        super(CelluloseEntities.BAMBOO_CHISELED_BOOKSHELF,pos, state);
    }

    public ItemStack getLastBook() {
        return Objects.requireNonNullElse(this.books.poll(), ItemStack.EMPTY);
    }

    public void addBook(ItemStack stack) {
        if (stack.is(ItemTags.BOOKSHELF_BOOKS)) {
            this.books.addFirst(stack);
        }
    }

    @Override
    public void load(CompoundTag nbt) {
        NonNullList<ItemStack> defaultedList = NonNullList.withSize(7, ItemStack.EMPTY);
        ContainerHelper.loadAllItems(nbt, defaultedList);
        this.books.clear();
        for (ItemStack itemStack : defaultedList) {
            if (!itemStack.is(ItemTags.BOOKSHELF_BOOKS)) continue;
            this.books.add(itemStack);
        }
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        ContainerHelper.saveAllItems(nbt, getBooksAsList(this.books), true);
    }

    @NotNull
    private static NonNullList<ItemStack> getBooksAsList(Collection<ItemStack> books) {
        NonNullList<ItemStack> defaultedList = NonNullList.createWithCapacity(books.size());
        defaultedList.addAll(books);
        return defaultedList;
    }



    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag nbtCompound = new CompoundTag();
        ContainerHelper.saveAllItems(nbtCompound, getBooksAsList(this.books), true);
        return nbtCompound;
    }

    @Override
    public void clearContent() {
        this.books.clear();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public boolean isFull() {
        return this.getBookCount() == 7;
    }

    public boolean isEmpty() {
        return this.books.isEmpty();
    }
}
