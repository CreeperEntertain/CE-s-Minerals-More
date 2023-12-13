
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.centertain.cemm.potion.GravityMobEffect;
import net.centertain.cemm.potion.BleedingMobEffect;
import net.centertain.cemm.CemmMod;

public class CemmModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CemmMod.MODID);
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
	public static final RegistryObject<MobEffect> GRAVITY = REGISTRY.register("gravity", () -> new GravityMobEffect());
}
