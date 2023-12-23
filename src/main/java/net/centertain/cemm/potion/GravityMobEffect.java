
package net.centertain.cemm.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class GravityMobEffect extends MobEffect {
	public GravityMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10066330);
	}

	@Override
	public String getDescriptionId() {
		return "effect.cemm.gravity";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
