package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WindsweptCrownLayer0Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		WindsweptLeavesPlacementProcedure.execute(world, (x - 1), y, z);
		WindsweptLeavesPlacementProcedure.execute(world, (x + 1), y, z);
		WindsweptLeavesPlacementProcedure.execute(world, x, y, (z - 1));
		WindsweptLeavesPlacementProcedure.execute(world, x, y, (z + 1));
	}
}
