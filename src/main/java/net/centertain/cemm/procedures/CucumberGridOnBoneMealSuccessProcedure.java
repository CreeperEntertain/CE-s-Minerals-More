package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CucumberGridOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CucumberGridTickUpdateProcedure.execute(world, x, y, z);
		if (Math.random() <= 0.5) {
			CucumberGridTickUpdateProcedure.execute(world, x, y, z);
		}
	}
}
