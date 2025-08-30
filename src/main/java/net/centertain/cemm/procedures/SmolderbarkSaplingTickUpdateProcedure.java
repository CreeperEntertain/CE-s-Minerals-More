package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class SmolderbarkSaplingTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.1) {
			ProceduralSmolderbarkTrunkProcedure.execute(world, x, y, z);
		}
	}
}
