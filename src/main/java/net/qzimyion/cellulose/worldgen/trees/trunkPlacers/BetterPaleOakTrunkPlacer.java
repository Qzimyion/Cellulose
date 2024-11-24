package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

public class BetterPaleOakTrunkPlacer extends TrunkPlacer {
    public static final Codec<BetterPaleOakTrunkPlacer> CODEC = RecordCodecBuilder.create((instance) ->
            trunkPlacerParts(instance).apply(instance, BetterPaleOakTrunkPlacer::new));

    public BetterPaleOakTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return null;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, int height, BlockPos startPos, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> list = Lists.newArrayList();
        BlockPos blockPos = startPos.below();
        setDirtAt(world, replacer, random, blockPos, config);

        setDirtAt(world, replacer, random, blockPos.east(), config);
        setDirtAt(world, replacer, random, blockPos.south(), config);
        setDirtAt(world, replacer, random, blockPos.south().east(), config);

        Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(random);
        int trunkHeight = height - random.nextInt(4);
        int branchSpacing = 2 - random.nextInt(3);
        int trunkX = startPos.getX();
        int trunkY = startPos.getY();
        int trunkZ = startPos.getZ();
        int currentX = trunkX;
        int currentZ = trunkZ;
        int trunkTopY = trunkY + height - 1;
        for (int y = 0; y < height; y++) {
            if (y >= trunkHeight && branchSpacing > 0) {
                currentX += direction.getStepX();
                currentZ += direction.getStepZ();
                --branchSpacing;
            }

            int currentY = trunkY + y;
            BlockPos trunkPos = new BlockPos(currentX, currentY, currentZ);
            if (TreeFeature.isAirOrLeaves(world, trunkPos)) {
                this.placeLog(world, replacer, random, trunkPos, config);
                this.placeLog(world, replacer, random, trunkPos.east(), config);
                this.placeLog(world, replacer, random, trunkPos.south(), config);
                this.placeLog(world, replacer, random, trunkPos.east().south(), config);
            }
        }

        createTwistedBranches(world, replacer, random, trunkY + height - 1, currentX, currentZ, config);
        list.add(new FoliagePlacer.FoliageAttachment(new BlockPos(currentX, trunkTopY, currentZ), 0, true));
        return list;
    }

    private void createTwistedBranches(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, int startY, int startX, int startZ, TreeConfiguration config) {
        for (int i = 0; i < 4; i++) {
            int branchLength = random.nextInt(5) + 3;
            int branchDirectionX = random.nextInt(3) - 1;
            int branchDirectionZ = random.nextInt(3) - 1;
            int branchY = startY;

            for (int j = 0; j < branchLength; j++) {
                branchY += random.nextInt(2) - 1;
                startX += branchDirectionX;
                startZ += branchDirectionZ;

                BlockPos branchPos = new BlockPos(startX, branchY, startZ);
                if (TreeFeature.isAirOrLeaves(world, branchPos)) {
                    this.placeLog(world, replacer, random, branchPos, config);
                }
            }
        }
    }
}
