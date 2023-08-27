package net.qzimyion.cellulose.particles;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.qzimyion.cellulose.Cellulose;

public class Celluloseparticles {

    public static final DefaultParticleType OAK_FALLING_LEAF = FabricParticleTypes.simple(true);

    public static void registerParticles(){
        
        Cellulose.LOGGER.info("Registering particles for" + Cellulose.MOD_ID);
    }
}
