
package net.centertain.cemm.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.centertain.cemm.procedures.BleedingOnTickProcedure;

public class BleedingMobEffect extends MobEffect {
	public BleedingMobEffect() {
		super(MobEffectCategory.HARMFUL, -12512493);
	}

	@Override
	public String getDescriptionId() {
		return "effect.cemm.bleeding";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BleedingOnTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
