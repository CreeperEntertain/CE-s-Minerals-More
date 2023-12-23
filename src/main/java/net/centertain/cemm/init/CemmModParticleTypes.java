
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.centertain.cemm.CemmMod;

public class CemmModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CemmMod.MODID);
	public static final RegistryObject<SimpleParticleType> CHLOROPHYL_SPORE = REGISTRY.register("chlorophyl_spore", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> ANTI_GRAVITY_PARTICLE = REGISTRY.register("anti_gravity_particle", () -> new SimpleParticleType(true));
}
