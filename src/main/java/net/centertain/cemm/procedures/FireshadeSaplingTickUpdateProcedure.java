package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FireshadeSaplingTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.1) {
			ProceduralFireshadeTrunkProcedure.execute(world, x, y, z);
		}
	}
}
