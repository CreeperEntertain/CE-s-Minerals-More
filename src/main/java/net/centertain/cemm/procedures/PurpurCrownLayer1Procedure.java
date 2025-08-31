package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class PurpurCrownLayer1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RandomPurpurLeavesProcedure.execute(world, (x - 1), y, (z - 2));
		RandomPurpurLeavesProcedure.execute(world, x, y, (z - 2));
		RandomPurpurLeavesProcedure.execute(world, (x + 1), y, (z - 2));
		RandomPurpurLeavesProcedure.execute(world, (x - 2), y, (z - 1));
		RandomPurpurLeavesProcedure.execute(world, (x - 1), y, (z - 1));
		RandomPurpurLeavesProcedure.execute(world, x, y, (z - 1));
		RandomPurpurLeavesProcedure.execute(world, (x + 1), y, (z - 1));
		RandomPurpurLeavesProcedure.execute(world, (x + 2), y, (z - 1));
		RandomPurpurLeavesProcedure.execute(world, (x - 2), y, z);
		RandomPurpurLeavesProcedure.execute(world, (x - 1), y, z);
		RandomPurpurLeavesProcedure.execute(world, x, y, z);
		RandomPurpurLeavesProcedure.execute(world, (x + 1), y, z);
		RandomPurpurLeavesProcedure.execute(world, (x + 2), y, z);
		RandomPurpurLeavesProcedure.execute(world, (x - 2), y, (z + 1));
		RandomPurpurLeavesProcedure.execute(world, (x - 1), y, (z + 1));
		RandomPurpurLeavesProcedure.execute(world, x, y, (z + 1));
		RandomPurpurLeavesProcedure.execute(world, (x + 1), y, (z + 1));
		RandomPurpurLeavesProcedure.execute(world, (x + 2), y, (z + 1));
		RandomPurpurLeavesProcedure.execute(world, (x - 1), y, (z + 2));
		RandomPurpurLeavesProcedure.execute(world, x, y, (z + 2));
		RandomPurpurLeavesProcedure.execute(world, (x + 1), y, (z + 2));
	}
}
