package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class AlgaeSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			AlgaeSpreadTestProcedure.execute(world, (x - 1), y, z);
		}
		if (Math.random() < 0.5) {
			AlgaeSpreadTestProcedure.execute(world, (x + 1), y, z);
		}
		if (Math.random() < 0.5) {
			AlgaeSpreadTestProcedure.execute(world, x, y, (z - 1));
		}
		if (Math.random() < 0.5) {
			AlgaeSpreadTestProcedure.execute(world, x, y, (z + 1));
		}
		if (Math.random() < 0.25) {
			AlgaeSpreadTestProcedure.execute(world, (x - 1), y, (z - 1));
		}
		if (Math.random() < 0.25) {
			AlgaeSpreadTestProcedure.execute(world, (x - 1), y, (z + 1));
		}
		if (Math.random() < 0.25) {
			AlgaeSpreadTestProcedure.execute(world, (x + 1), y, (z - 1));
		}
		if (Math.random() < 0.25) {
			AlgaeSpreadTestProcedure.execute(world, (x + 1), y, (z + 1));
		}
	}
}
