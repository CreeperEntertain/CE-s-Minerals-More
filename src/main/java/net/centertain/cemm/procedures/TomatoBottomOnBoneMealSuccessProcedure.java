package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class TomatoBottomOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		TomatoPlantTickUpdateProcedure.execute(world, x, y, z);
		if (Math.random() <= 0.5) {
			TomatoPlantTickUpdateProcedure.execute(world, x, y, z);
		}
	}
}
