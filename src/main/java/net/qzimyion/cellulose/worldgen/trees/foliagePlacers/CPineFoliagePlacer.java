package net.qzimyion.cellulose.worldgen.trees.foliagePlacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;

public class CPineFoliagePlacer extends FoliagePlacer {
    public static final Codec<CPineFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) -> foliagePlacerParts(instance).and(IntProvider.codec(0, 24)
            .fieldOf("trunk_height").forGetter((placer) -> placer.trunkHeight)).apply(instance, CPineFoliagePlacer::new));
    private final IntProvider trunkHeight;

    public CPineFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider trunkHeight) {
        super(radius, offset);
        this.trunkHeight = trunkHeight;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return WorldGenRegistry.PINE_FOLIAGE_PLACER;
    }

    //Modified code taken from here:https://github.com/Team-Hibiscus/NaturesSpirit/blob/dev/src/main/java/net/hibiscus/naturespirit/world/foliage_placer/FirFoliagePlacer.java

    @Override
    protected void createFoliage(LevelSimulatedReader world, FoliageSetter placer, RandomSource random, TreeConfiguration config, int trunkHeight, FoliageAttachment treeNode, int foliageHeight, int radius, int offset) {
        BlockPos blockPos = treeNode.pos();
        BlockPos.MutableBlockPos mutable = blockPos.mutable();
        boolean nextBoolean = random.nextBoolean();
        boolean nextBoolean2 = random.nextBoolean();

        for(int l = offset; l >= -foliageHeight - 2; --l) {
            if(l >= offset - 2) {
                mutable.setWithOffset(blockPos, 0, l, 0);
                if((nextBoolean && !nextBoolean2) && l == offset) {
                    tryPlaceLeaf(world, placer, random, config, mutable);
                }
                if((nextBoolean || nextBoolean2) && l == offset - 1) {
                    tryPlaceLeaf(world, placer, random, config, mutable);
                }
                if(l == offset - 2) {
                    tryPlaceLeaf(world, placer, random, config, mutable);
                }
            }
            else if(l == offset - 3) {
                mutable.setWithOffset(blockPos, 0, l, 0);
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.getRandom(random), 1).relative(Direction.getRandom(random), 1).above(1));
                }
                this.placeLeavesRow(world, placer, random, config, blockPos, 1, l, treeNode.doubleTrunk());
            }
            else if(l == offset - 4) {
                mutable.setWithOffset(blockPos, 0, l, 0);
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 1).relative(Direction.EAST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 1).relative(Direction.WEST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 1).relative(Direction.EAST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 1).relative(Direction.WEST, 1));
                }
                this.placeLeavesRow(world, placer, random, config, blockPos, 1, l, treeNode.doubleTrunk());
            }
            else if(l == offset - 5) {
                mutable.setWithOffset(blockPos, 0, l, 0);
                if(random.nextBoolean()) {
                    Direction m = random.nextBoolean() ? Direction.NORTH : Direction.SOUTH;
                    Direction n = random.nextBoolean() ? Direction.EAST : Direction.WEST;
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(m, 1).relative(n, 1));
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(m.getOpposite(), 1).relative(n.getOpposite(), 1));
                }
                if(random.nextBoolean()) {
                    Direction m = random.nextBoolean() ? Direction.NORTH : Direction.SOUTH;
                    Direction n = random.nextBoolean() ? Direction.EAST : Direction.WEST;
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(m, 1).relative(n, 1));
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(m.getOpposite(), 1).relative(n.getOpposite(), 1));
                }
            }
            else if(l == offset - 6) {
                mutable.setWithOffset(blockPos, 0, l, 0);
                if(random.nextBoolean()) {
                    Direction m = random.nextBoolean() ? Direction.NORTH : Direction.SOUTH;
                    Direction n = random.nextBoolean() ? Direction.EAST : Direction.WEST;
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(m, 1).relative(n, 1).above(1));
                }
                this.placeLeavesRow(world, placer, random, config, blockPos, 1, l, treeNode.doubleTrunk());
            }
            else if(l == offset - 7) {
                mutable.setWithOffset(blockPos, 0, l, 0);
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 1).relative(Direction.EAST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 1).relative(Direction.WEST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 1).relative(Direction.EAST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 1).relative(Direction.WEST, 1));
                }
                this.placeLeavesRow(world, placer, random, config, blockPos, 1, l, treeNode.doubleTrunk());
            }
            else if(l == offset - 8) {
                mutable.setWithOffset(blockPos, 0, l, 0);
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 1).relative(Direction.EAST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 1).relative(Direction.WEST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 1).relative(Direction.EAST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 1).relative(Direction.WEST, 1));
                }
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 2));
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.EAST, 2));
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 2));
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.WEST, 2));
                this.placeLeavesRow(world, placer, random, config, blockPos, 1, l, treeNode.doubleTrunk());
            }
            else if(l == offset - 9) {
                this.placeLeavesRow(world, placer, random, config, blockPos, 2, l, treeNode.doubleTrunk());
            }
            else if(l == offset - 10) {
                mutable.setWithOffset(blockPos, 0, l, 0);
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 1).relative(Direction.EAST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 1).relative(Direction.WEST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 1).relative(Direction.EAST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 1).relative(Direction.WEST, 1));
                }
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 2).relative(Direction.EAST, 1));
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 2).relative(Direction.WEST, 1));
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.EAST, 2).relative(Direction.NORTH, 1));
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.EAST, 2).relative(Direction.SOUTH, 1));
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 2).relative(Direction.EAST, 1));
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 2).relative(Direction.WEST, 1));
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.WEST, 2).relative(Direction.NORTH, 1));
                tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.WEST, 2).relative(Direction.SOUTH, 1));
                this.placeLeavesRow(world, placer, random, config, blockPos, 1, l, treeNode.doubleTrunk());
            }
            else if(l == offset - 11) {
                mutable.setWithOffset(blockPos, 0, l, 0);
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 1).relative(Direction.EAST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.NORTH, 1).relative(Direction.WEST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 1).relative(Direction.EAST, 1));
                }
                if(random.nextBoolean()) {
                    tryPlaceLeaf(world, placer, random, config, mutable.relative(Direction.SOUTH, 1).relative(Direction.WEST, 1));
                }
            }
        }
    }

    protected void placeLeavesRow(LevelSimulatedReader world, FoliageSetter placer, RandomSource random, TreeConfiguration config, BlockPos centerPos, int radius, int y, boolean giantTrunk) {
        int i = giantTrunk ? 1 : 0;
        BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos();

        for(int j = -radius; j <= radius + i; ++j) {
            for(int k = -radius; k <= radius + i; ++k) {
                if(!this.shouldSkipLocationSigned(random, j, y, k, radius, giantTrunk)) {
                    mutable.setWithOffset(centerPos, j, y, k);
                    tryPlaceLeaf(world, placer, random, config, mutable);
                }
            }
        }

    }

    @Override
    public int foliageHeight(RandomSource random, int trunkHeight, TreeConfiguration config) {
        return Math.max(8, trunkHeight - this.trunkHeight.sample(random));
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return dx == radius && dz == radius && radius > 0;
    }
}
