package net.qzimyion.cellulose.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.MenuType;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.screen.sawmill.SawmillScreenHandler;

@SuppressWarnings("deprecation")
public class CelluloseScreens
{
    public static MenuType<SawmillScreenHandler> SAWMILL_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new ResourceLocation(Cellulose.MOD_ID,
                    "sawmill"), SawmillScreenHandler::new);

    public static void registerScreens() {
        Cellulose.LOGGER.info("Registering Mod screens");
    }
}
