package net.centertain.cemm.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.centertain.cemm.network.CemmModVariables;
import net.centertain.cemm.init.CemmModMobEffects;

public class AcheronNectarConsumedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(CemmModMobEffects.BLEEDING.get());
		{
			double _setval = 5;
			entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.bleedingIncreaseDuration = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CemmModMobEffects.BLEEDING.get(), 100000000, 0, false, true));
	}
}
