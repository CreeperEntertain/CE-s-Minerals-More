package net.centertain.cemm.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.centertain.cemm.init.CemmModMobEffects;

public class SmokelingPollenEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CemmModMobEffects.GRAVITY.get(), 3600, 0));
	}
}
