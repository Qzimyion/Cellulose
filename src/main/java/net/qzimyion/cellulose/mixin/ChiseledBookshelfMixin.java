package net.qzimyion.cellulose.mixin;

import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.ChiseledBookshelfBlock;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ChiseledBookshelfBlock.class)
public abstract class ChiseledBookshelfMixin extends BlockWithEntity {
    protected ChiseledBookshelfMixin(Settings settings) {
        super(settings);
    }
}
