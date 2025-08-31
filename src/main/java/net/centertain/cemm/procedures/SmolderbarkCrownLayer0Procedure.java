package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class SmolderbarkCrownLayer0Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		SmolderbarkLeavesPlacementProcedure.execute(world, (x - 2), y, (z - 2));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x - 1), y, (z - 2));
		SmolderbarkLeavesPlacementProcedure.execute(world, x, y, (z - 2));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x + 1), y, (z - 2));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x + 2), y, (z - 2));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x - 2), y, (z - 1));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x - 1), y, (z - 1));
		SmolderbarkLeavesPlacementProcedure.execute(world, x, y, (z - 1));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x + 1), y, (z - 1));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x + 2), y, (z - 1));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x - 2), y, z);
		SmolderbarkLeavesPlacementProcedure.execute(world, (x - 1), y, z);
		SmolderbarkLeavesPlacementProcedure.execute(world, x, y, z);
		SmolderbarkLeavesPlacementProcedure.execute(world, (x + 1), y, z);
		SmolderbarkLeavesPlacementProcedure.execute(world, (x + 2), y, z);
		SmolderbarkLeavesPlacementProcedure.execute(world, (x - 2), y, (z + 1));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x - 1), y, (z + 1));
		SmolderbarkLeavesPlacementProcedure.execute(world, x, y, (z + 1));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x + 1), y, (z + 1));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x + 2), y, (z + 1));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x - 2), y, (z + 2));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x - 1), y, (z + 2));
		SmolderbarkLeavesPlacementProcedure.execute(world, x, y, (z + 2));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x + 1), y, (z + 2));
		SmolderbarkLeavesPlacementProcedure.execute(world, (x + 2), y, (z + 2));
	}
}
