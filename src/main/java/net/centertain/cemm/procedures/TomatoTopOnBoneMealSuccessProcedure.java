package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class TomatoTopOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		TomatoPlantTickUpdateProcedure.execute(world, x, (y - 1), z);
		if (Math.random() <= 0.5) {
			TomatoPlantTickUpdateProcedure.execute(world, x, (y - 1), z);
		}
	}
}
