package net.qzimyion.cellulose.util;

import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.items.CelluloseItems;

import java.util.Map;

public class CelluloseCauldronBehavior {
    public static final Map<Item, CauldronBehavior> DISSOVLED_BAMBOO_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> PAPER_MESH_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final CauldronBehavior FILL_WITH_MESH = (state, world, pos, player, hand, stack) -> CauldronBehavior.fillCauldron(world, pos, player, hand, stack, CelluloseBlocks.PAPER_MESH_CAULDRON_BLOCK.getDefaultState(), SoundEvents.ITEM_BUCKET_EMPTY_LAVA);

    public static void registerBehavior(){

        //Empty
        PAPER_MESH_CAULDRON_BEHAVIOR.put(Items.BUCKET, (state, world, pos, player, hand, stack) -> CauldronBehavior.emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(CelluloseItems.PAPER_MESH_BUCKET), statex -> true, SoundEvents.ITEM_BUCKET_FILL_LAVA));
        registerBucketBehavior(PAPER_MESH_CAULDRON_BEHAVIOR);

    }

    public static void registerBucketBehavior(Map<Item, CauldronBehavior> behavior){
        behavior.put(CelluloseItems.PAPER_MESH_BUCKET, FILL_WITH_MESH);
    }

    public static void registerBucketBehavior(Item paperMeshBucket, CauldronBehavior fillWithMesh) {
    }
}
