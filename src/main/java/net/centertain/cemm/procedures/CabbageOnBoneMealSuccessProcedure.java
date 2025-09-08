package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CabbageOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CabbageTickUpdateProcedure.execute(world, x, y, z);
		if (Math.random() <= 0.5) {
			CabbageTickUpdateProcedure.execute(world, x, y, z);
		}
	}
}
