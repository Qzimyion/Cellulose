package net.qzimyion.cellulose.particles;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;

@Environment(value= EnvType.CLIENT)
public class AppleLeavesParticle extends TextureSheetParticle {
    public float field_43369;
    public final float field_43370;
    public final float field_43371;
    public AppleLeavesParticle(ClientLevel world, double x, double y, double z, SpriteSet spriteProvider) {
        super(world, x, y, z);
        float f;
        this.setSprite(spriteProvider.get(this.random.nextInt(12), 12));
        this.field_43369 = (float)Math.toRadians(this.random.nextBoolean() ? -30.0 : 30.0);
        this.field_43370 = this.random.nextFloat();
        this.field_43371 = (float)Math.toRadians(this.random.nextBoolean() ? -5.0 : 5.0);
        this.lifetime = 300;
        this.gravity = 7.5E-4f;
        this.quadSize = f = this.random.nextBoolean() ? 0.05f : 0.075f;
        this.setSize(f, f);
        this.friction = 1.0f;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.lifetime-- <= 0) {
            this.remove();
        }
        if (this.removed) {
            return;
        }
        float f = 300 - this.lifetime;
        float g = Math.min(f / 300.0f, 1.0f);
        double d = Math.cos(Math.toRadians(this.field_43370 * 60.0f)) * 2.0 * Math.pow(g, 1.25);
        double e = Math.sin(Math.toRadians(this.field_43370 * 60.0f)) * 2.0 * Math.pow(g, 1.25);
        this.xd += d * (double)0.0025f;
        this.zd += e * (double)0.0025f;
        this.yd -= this.gravity;
        this.field_43369 += this.field_43371 / 20.0f;
        this.oRoll = this.roll;
        this.roll += this.field_43369 / 20.0f;
        this.move(this.xd, this.yd, this.zd);
        if (this.onGround || this.lifetime < 299 && (this.xd == 0.0 || this.zd == 0.0)) {
            this.remove();
        }
        if (this.removed) {
            return;
        }
        this.xd *= this.friction;
        this.yd *= this.friction;
        this.zd *= this.friction;
    }
}
