package net.qzimyion.cellulose.client;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.ViewArea;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import net.qzimyion.cellulose.mixin.LevelRendererAccessor;
import net.qzimyion.cellulose.util.TintManager;

public class CelluloseClientEvents {

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

    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.level != null) {
                TintManager.updateTint();
                updateAllChunks();
            }
        });
    }
}
