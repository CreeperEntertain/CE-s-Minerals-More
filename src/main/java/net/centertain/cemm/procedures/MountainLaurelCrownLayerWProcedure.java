package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MountainLaurelCrownLayerWProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MountainLaurelLeavesPlacementProcedure.execute(world, (x - 1), y, (z - 2));
		MountainLaurelLeavesPlacementProcedure.execute(world, x, y, (z - 2));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x + 1), y, (z - 2));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x - 2), y, (z - 1));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x - 1), y, (z - 1));
		MountainLaurelLeavesPlacementProcedure.execute(world, x, y, (z - 1));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x + 1), y, (z - 1));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x + 2), y, (z - 1));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x - 2), y, z);
		MountainLaurelLeavesPlacementProcedure.execute(world, (x - 1), y, z);
		MountainLaurelLeavesPlacementProcedure.execute(world, x, y, z);
		MountainLaurelLeavesPlacementProcedure.execute(world, (x + 1), y, z);
		MountainLaurelLeavesPlacementProcedure.execute(world, (x + 2), y, z);
		MountainLaurelLeavesPlacementProcedure.execute(world, (x - 2), y, (z + 1));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x - 1), y, (z + 1));
		MountainLaurelLeavesPlacementProcedure.execute(world, x, y, (z + 1));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x + 1), y, (z + 1));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x + 2), y, (z + 1));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x - 1), y, (z + 2));
		MountainLaurelLeavesPlacementProcedure.execute(world, x, y, (z + 2));
		MountainLaurelLeavesPlacementProcedure.execute(world, (x + 1), y, (z + 2));
	}
}
