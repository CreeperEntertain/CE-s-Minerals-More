package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.centertain.cemm.network.CemmModVariables;
import net.centertain.cemm.init.CemmModMobEffects;

public class BleedingOnTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).bleedingDamageCooldown <= 0) {
			{
				double _setval = Math.pow(2, (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CemmModMobEffects.BLEEDING.get()) ? _livEnt.getEffect(CemmModMobEffects.BLEEDING.get()).getAmplifier() : 0) * (-0.5)) * 600;
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.bleedingDamageCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DRY_OUT)),
					(float) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CemmModMobEffects.BLEEDING.get()) ? _livEnt.getEffect(CemmModMobEffects.BLEEDING.get()).getAmplifier() : 0) * 0.75 + 0.5));
			{
				double _setval = (entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).bleedingIncreaseDuration - 1;
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.bleedingIncreaseDuration = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				double _setval = (entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).bleedingDamageCooldown - 1;
				entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.bleedingDamageCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).bleedingIncreaseDuration <= 0) {
				{
					double _setval = 5;
					entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bleedingIncreaseDuration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(CemmModMobEffects.BLEEDING.get(), 10000000,
							(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CemmModMobEffects.BLEEDING.get()) ? _livEnt.getEffect(CemmModMobEffects.BLEEDING.get()).getAmplifier() : 0) + 1), false, true));
			}
		}
	}
}
