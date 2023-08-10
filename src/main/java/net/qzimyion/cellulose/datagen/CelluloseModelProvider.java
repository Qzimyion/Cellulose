package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.qzimyion.cellulose.registry.CelluloseBlocks;
import net.qzimyion.cellulose.registry.CelluloseItems;

import static net.qzimyion.cellulose.registry.CelluloseBlocks.*;

public class CelluloseModelProvider extends FabricModelProvider {
    public CelluloseModelProvider(FabricDataOutput output)
    {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Blocks
        blockStateModelGenerator.registerSimpleCubeAll(CHIPPED_OAK);

        //Panes
        blockStateModelGenerator.registerGlassPane(OAK_FRAME, OAK_LINTELS);
        blockStateModelGenerator.registerGlassPane(BIRCH_FRAME, BIRCH_LINTELS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {

    }
}
