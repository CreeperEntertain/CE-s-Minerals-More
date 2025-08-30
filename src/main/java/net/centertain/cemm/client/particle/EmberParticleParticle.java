
package net.centertain.cemm.client.particle;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;

@OnlyIn(Dist.CLIENT)
public class EmberParticleParticle extends TextureSheetParticle {
	public static EmberParticleParticleProvider provider(SpriteSet spriteSet) {
		return new EmberParticleParticleProvider(spriteSet);
	}

	public static class EmberParticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public EmberParticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new EmberParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected EmberParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.1f, 0.4f);
		this.quadSize *= 0.2f;
		this.lifetime = (int) Math.max(1, 125 + (this.random.nextInt(100) - 50));
		this.gravity = -0.1f;
		this.hasPhysics = false;
		this.xd = vx * 2;
		this.yd = vy * 2;
		this.zd = vz * 2;
		this.pickSprite(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public void tick() {
		super.tick();
	}
}
