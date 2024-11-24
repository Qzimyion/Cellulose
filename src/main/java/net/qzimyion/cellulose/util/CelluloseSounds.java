package net.qzimyion.cellulose.util;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseSounds
{
    public static final SoundEvent UI_SAWMILL_TAKE_RESULT = registerSounds("sawmilling_take_result");

    public static final SoundType SAWMILL = new SoundType(1f, 1f, CelluloseSounds.UI_SAWMILL_TAKE_RESULT, CelluloseSounds.UI_SAWMILL_TAKE_RESULT, CelluloseSounds.UI_SAWMILL_TAKE_RESULT, CelluloseSounds.UI_SAWMILL_TAKE_RESULT, CelluloseSounds.UI_SAWMILL_TAKE_RESULT);


    public static SoundEvent registerSounds(String name)
    {
        ResourceLocation id = new ResourceLocation(Cellulose.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }
}
