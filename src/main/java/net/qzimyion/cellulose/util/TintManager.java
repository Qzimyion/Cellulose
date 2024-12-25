package net.qzimyion.cellulose.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.util.Mth;

import java.util.Objects;

public class TintManager {
    private static float gradient = 0;
    private static long lastUpdateTime = 0;

    public static void updateTint() {
        Minecraft client = Minecraft.getInstance();
        ClientLevel clientLevel = client.level;
        if (clientLevel == null) return;

        long currentTime = clientLevel.getGameTime();
        boolean isSnowing = clientLevel.isRaining() &&
                !clientLevel.getBiome(Objects.requireNonNull(client.player).blockPosition())
                        .value()
                        .warmEnoughToRain(client.player.blockPosition());

        if (isSnowing) {
            gradient += (currentTime - lastUpdateTime) / 300.0f;
        } else {
            gradient -= (currentTime - lastUpdateTime) / 300.0f;
        }

        gradient = Mth.clamp(gradient, 0, 1);
        lastUpdateTime = currentTime;
        updateChunks(clientLevel);
    }

    public static void updateChunks(ClientLevel level) {
        if (level != null) {
            Minecraft.getInstance().levelRenderer.allChanged();
        }
    }

    public static float getGradient() {
        return gradient;
    }
}
