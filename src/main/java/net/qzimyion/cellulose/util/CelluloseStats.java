package net.qzimyion.cellulose.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.Stats;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseStats extends Stats
{
    public static final ResourceLocation INTERACT_WITH_SAWMILL = new ResourceLocation(Cellulose.MOD_ID,"interact_with_sawmill");

    public static void registerStats() {
        Cellulose.LOGGER.info("Registering Mod Stats");
    }
}
