package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.centertain.cemm.init.CemmModParticleTypes;

public class AntiGravityFieldParticleSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CemmModParticleTypes.ANTI_GRAVITY_PARTICLE.get()), (x + 0.5), (y + 0.5), (z + 0.5), 1, 0.25, 0.25, 0.25, 0);
	}
}
