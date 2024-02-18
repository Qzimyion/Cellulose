package net.qzimyion.cellulose.mixin.TallDoorsCompatibilityMixins;

import net.minecraft.entity.ai.goal.MoveThroughVillageGoal;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;

@Debug(export = true)
@Mixin(MoveThroughVillageGoal.class)
public class VillagerGoalMixin {
}
