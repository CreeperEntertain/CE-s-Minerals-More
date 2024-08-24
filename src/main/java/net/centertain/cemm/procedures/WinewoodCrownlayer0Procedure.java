package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WinewoodCrownlayer0Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		WinewoodLeavesPlacementProcedure.execute(world, (x - 1), y, (z - 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x + 1), y, (z - 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x - 1), y, (z + 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x + 1), y, (z + 1));
	}
}
