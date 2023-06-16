package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class TeaOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		TeaTickUpdateProcedure.execute(world, x, y, z);
		if (Math.random() <= 0.5) {
			TeaTickUpdateProcedure.execute(world, x, y, z);
		}
	}
}
