package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class EndSpruceCrownLayer1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RandomEndSpruceLeavesProcedure.execute(world, (x - 1), y, (z - 2));
		RandomEndSpruceLeavesProcedure.execute(world, x, y, (z - 2));
		RandomEndSpruceLeavesProcedure.execute(world, (x + 1), y, (z - 2));
		RandomEndSpruceLeavesProcedure.execute(world, (x - 2), y, (z - 1));
		RandomEndSpruceLeavesProcedure.execute(world, (x - 1), y, (z - 1));
		RandomEndSpruceLeavesProcedure.execute(world, x, y, (z - 1));
		RandomEndSpruceLeavesProcedure.execute(world, (x + 1), y, (z - 1));
		RandomEndSpruceLeavesProcedure.execute(world, (x + 2), y, (z - 1));
		RandomEndSpruceLeavesProcedure.execute(world, (x - 2), y, z);
		RandomEndSpruceLeavesProcedure.execute(world, (x - 1), y, z);
		RandomEndSpruceLeavesProcedure.execute(world, x, y, z);
		RandomEndSpruceLeavesProcedure.execute(world, (x + 1), y, z);
		RandomEndSpruceLeavesProcedure.execute(world, (x + 2), y, z);
		RandomEndSpruceLeavesProcedure.execute(world, (x - 2), y, (z + 1));
		RandomEndSpruceLeavesProcedure.execute(world, (x - 1), y, (z + 1));
		RandomEndSpruceLeavesProcedure.execute(world, x, y, (z + 1));
		RandomEndSpruceLeavesProcedure.execute(world, (x + 1), y, (z + 1));
		RandomEndSpruceLeavesProcedure.execute(world, (x + 2), y, (z + 1));
		RandomEndSpruceLeavesProcedure.execute(world, (x - 1), y, (z + 2));
		RandomEndSpruceLeavesProcedure.execute(world, x, y, (z + 2));
		RandomEndSpruceLeavesProcedure.execute(world, (x + 1), y, (z + 2));
	}
}
