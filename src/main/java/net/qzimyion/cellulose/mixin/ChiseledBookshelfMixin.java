package net.qzimyion.cellulose.mixin;

import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.ChiseledBookShelfBlock;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ChiseledBookShelfBlock.class)
public abstract class ChiseledBookshelfMixin extends BaseEntityBlock {
    protected ChiseledBookshelfMixin(Properties settings) {
        super(settings);
    }
}
