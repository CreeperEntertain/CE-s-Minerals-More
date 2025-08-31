package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class GrapeGridOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		GrapeGridTickUpdateProcedure.execute(world, x, y, z);
		if (Math.random() <= 0.5) {
			GrapeGridTickUpdateProcedure.execute(world, x, y, z);
		}
	}
}
