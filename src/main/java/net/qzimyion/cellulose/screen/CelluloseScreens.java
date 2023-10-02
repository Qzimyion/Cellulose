package net.qzimyion.cellulose.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.screen.sawmill.SawmillScreenHandler;

public class CelluloseScreens
{
    public static ScreenHandlerType<SawmillScreenHandler> SAWMILL_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Cellulose.MOD_ID,
                    "sawmill"), SawmillScreenHandler::new);

    public static void registerScreens() {
        Cellulose.LOGGER.info("Registering Mod screens");
    }
}
