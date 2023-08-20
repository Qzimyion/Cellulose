package net.qzimyion.cellulose.Util;

import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseStats extends Stats
{
    public static final Identifier INTERACT_WITH_SAWMILL = new Identifier(Cellulose.MOD_ID,"interact_with_sawmill");

    public static void registerStats() {
        Cellulose.LOGGER.info("Registering stats for " + Cellulose.MOD_ID);
    }
}
