package net.qzimyion.cellulose.mixin;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(TreeDecoratorType.class)
public interface TreeDecoratorInvoker {

    @Invoker
    static <P extends TreeDecorator> TreeDecoratorType<P> callRegister(String id, Codec<P> codec) {
        throw new IllegalStateException();
    }
}
