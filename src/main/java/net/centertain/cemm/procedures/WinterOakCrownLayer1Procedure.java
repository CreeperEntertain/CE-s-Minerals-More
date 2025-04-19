package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WinterOakCrownLayer1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		WinterOakLeavesPlacementProcedure.execute(world, (x - 1), y, (z - 1));
		WinterOakLeavesPlacementProcedure.execute(world, x, y, (z - 1));
		WinterOakLeavesPlacementProcedure.execute(world, (x + 1), y, (z - 1));
		WinterOakLeavesPlacementProcedure.execute(world, (x - 1), y, z);
		WinterOakLeavesPlacementProcedure.execute(world, (x + 1), y, z);
		WinterOakLeavesPlacementProcedure.execute(world, (x - 1), y, (z + 1));
		WinterOakLeavesPlacementProcedure.execute(world, x, y, (z + 1));
		WinterOakLeavesPlacementProcedure.execute(world, (x + 1), y, (z + 1));
	}
}
