
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.centertain.cemm.client.particle.ChlorophylSporeParticleParticle;
import net.centertain.cemm.client.particle.AntiGravityParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CemmModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CemmModParticleTypes.CHLOROPHYL_SPORE.get(), ChlorophylSporeParticleParticle::provider);
		event.registerSpriteSet(CemmModParticleTypes.ANTI_GRAVITY_PARTICLE.get(), AntiGravityParticleParticle::provider);
	}
}
