package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WinewoodSaplingTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.2) {
			ProceduralWinewoodTreeProcedure.execute(world, x, y, z);
		}
	}
}
