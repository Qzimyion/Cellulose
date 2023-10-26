package net.qzimyion.cellulose.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChiseledBookshelfBlockEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.entity.BlockEntity.CustomBookshelves.FourSlotBookshelfBlockEntity;
import net.qzimyion.cellulose.entity.BlockEntity.PotionRackBlockEntity;

public class CelluloseEntities {

    //Potion racks
    public static final BlockEntityType<PotionRackBlockEntity> POTION_RACK_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Cellulose.MOD_ID, "potion_rack_block_entity"),
            FabricBlockEntityTypeBuilder.create(PotionRackBlockEntity::new, CelluloseBlocks.POTION_RACK).build()
    );

    //Chiseled bookshelf variants
    public static final BlockEntityType<ChiseledBookshelfBlockEntity> BIRCH_CHISELED_BOOKSHELF = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Cellulose.MOD_ID, "birch_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(ChiseledBookshelfBlockEntity::new, CelluloseBlocks.BIRCH_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<ChiseledBookshelfBlockEntity> SPRUCE_CHISELED_BOOKSHELF = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Cellulose.MOD_ID, "spruce_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(ChiseledBookshelfBlockEntity::new, CelluloseBlocks.SPRUCE_CHISELED_BOOKSHELF).build()
    );

    public static final BlockEntityType<FourSlotBookshelfBlockEntity> DARK_OAK_CHISELED_BOOKSHELF = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Cellulose.MOD_ID, "dark_oak_chiseled_bookshelf"),
            FabricBlockEntityTypeBuilder.create(FourSlotBookshelfBlockEntity::new, CelluloseBlocks.DARK_OAK_CHISELED_BOOKSHELF).build()
    );


    public static void registerEntities(){

        Cellulose.LOGGER.info("Registering Mod entities");
    }
}
