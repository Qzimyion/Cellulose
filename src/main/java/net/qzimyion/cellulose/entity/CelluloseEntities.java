package net.qzimyion.cellulose.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.entity.BlockEntity.PotionRackBlockEntity;

public class CelluloseEntities {


    public static final BlockEntityType<PotionRackBlockEntity> POTION_RACK_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Cellulose.MOD_ID, "potion_rack_block_entity"),
            FabricBlockEntityTypeBuilder.create(PotionRackBlockEntity::new, CelluloseBlocks.POTION_RACK).build()
    );


    public static void registerEntities(){

        Cellulose.LOGGER.info("Registering Mod entities");
    }
}
