package net.qzimyion.cellulose.particles;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class Celluloseparticles {

    public static final DefaultParticleType FLOWERING_PALO_VERDE_FLOWERS = FabricParticleTypes.simple(true);

    public static void registerParticles(){

        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Cellulose.MOD_ID, "flowering_palo_verde_flowers"), FLOWERING_PALO_VERDE_FLOWERS);

        Cellulose.LOGGER.info("Registering particles for" + Cellulose.MOD_ID);
    }
}
