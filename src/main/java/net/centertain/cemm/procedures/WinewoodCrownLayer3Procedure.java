package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WinewoodCrownLayer3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		WinewoodLeavesPlacementProcedure.execute(world, (x - 1), y, (z - 2));
		WinewoodLeavesPlacementProcedure.execute(world, x, y, (z - 2));
		WinewoodLeavesPlacementProcedure.execute(world, (x + 1), y, (z - 2));
		WinewoodLeavesPlacementProcedure.execute(world, (x - 2), y, (z - 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x - 1), y, (z - 1));
		WinewoodLeavesPlacementProcedure.execute(world, x, y, (z - 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x + 1), y, (z - 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x + 2), y, (z - 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x - 2), y, z);
		WinewoodLeavesPlacementProcedure.execute(world, (x - 1), y, z);
		WinewoodLeavesPlacementProcedure.execute(world, x, y, z);
		WinewoodLeavesPlacementProcedure.execute(world, (x + 1), y, z);
		WinewoodLeavesPlacementProcedure.execute(world, (x + 2), y, z);
		WinewoodLeavesPlacementProcedure.execute(world, (x - 2), y, (z + 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x - 1), y, (z + 1));
		WinewoodLeavesPlacementProcedure.execute(world, x, y, (z + 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x + 1), y, (z + 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x + 2), y, (z + 1));
		WinewoodLeavesPlacementProcedure.execute(world, (x - 1), y, (z + 2));
		WinewoodLeavesPlacementProcedure.execute(world, x, y, (z + 2));
		WinewoodLeavesPlacementProcedure.execute(world, (x + 1), y, (z + 2));
	}
}
