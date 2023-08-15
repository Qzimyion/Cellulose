package net.qzimyion.cellulose.registry;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseSounds
{
    public static final SoundEvent UI_SAWMILL_TAKE_RESULT = registerSounds("sawmilling_take_result");

    public static final BlockSoundGroup SAWMILL = new BlockSoundGroup(1f, 1f, CelluloseSounds.UI_SAWMILL_TAKE_RESULT, CelluloseSounds.UI_SAWMILL_TAKE_RESULT, CelluloseSounds.UI_SAWMILL_TAKE_RESULT, CelluloseSounds.UI_SAWMILL_TAKE_RESULT, CelluloseSounds.UI_SAWMILL_TAKE_RESULT);


    public static SoundEvent registerSounds(String name)
    {
        Identifier id = new Identifier(Cellulose.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
