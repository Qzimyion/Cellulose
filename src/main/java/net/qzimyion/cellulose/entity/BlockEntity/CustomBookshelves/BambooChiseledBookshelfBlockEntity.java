package net.qzimyion.cellulose.entity.BlockEntity.CustomBookshelves;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Clearable;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
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
        if (stack.isIn(ItemTags.BOOKSHELF_BOOKS)) {
            this.books.addFirst(stack);
        }
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        DefaultedList<ItemStack> defaultedList = DefaultedList.ofSize(7, ItemStack.EMPTY);
        Inventories.readNbt(nbt, defaultedList);
        this.books.clear();
        for (ItemStack itemStack : defaultedList) {
            if (!itemStack.isIn(ItemTags.BOOKSHELF_BOOKS)) continue;
            this.books.add(itemStack);
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, getBooksAsList(this.books), true);
    }

    @NotNull
    private static DefaultedList<ItemStack> getBooksAsList(Collection<ItemStack> books) {
        DefaultedList<ItemStack> defaultedList = DefaultedList.ofSize(books.size());
        defaultedList.addAll(books);
        return defaultedList;
    }



    @Override
    public NbtCompound toInitialChunkDataNbt() {
        NbtCompound nbtCompound = new NbtCompound();
        Inventories.writeNbt(nbtCompound, getBooksAsList(this.books), true);
        return nbtCompound;
    }

    @Override
    public void clear() {
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
