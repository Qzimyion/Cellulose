package net.qzimyion.cellulose.registry;

import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseSounds
{
    public static final Identifier UI_SAWMILL_TAKE_RESULT = new Identifier("cellulose:sawmilling");

    public static void registerSounds()
    {
        Cellulose.LOGGER.info("Registering sounds for " + Cellulose.MOD_ID);
    }
}
