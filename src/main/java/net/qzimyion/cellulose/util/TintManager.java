package net.qzimyion.cellulose.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.ViewArea;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import net.minecraft.util.Mth;
import net.qzimyion.cellulose.mixin.LevelRendererAccessor;

import java.util.Objects;

public class TintManager {
    private static float gradient = 0;
    private static long lastUpdateTime = 0;

    private static void updateAllChunks() {
        Minecraft minecraft = Minecraft.getInstance();
        ClientLevel world = minecraft.level;
        LevelRenderer levelRenderer = minecraft.levelRenderer;
        if (world != null) {
            ViewArea chunkMap = ((LevelRendererAccessor) levelRenderer).viewArea();
            if (chunkMap != null) {
                for (ChunkRenderDispatcher.RenderChunk chunk : chunkMap.chunks) {
                    if (chunk != null) {
                        chunk.setDirty(true);
                    }
                }
            }
        }
    }

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
        updateAllChunks();
    }

    public static float getGradient() {
        return gradient;
    }
}
