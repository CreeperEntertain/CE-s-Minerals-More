package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ShinewoodTrunkPlacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ShinewoodCrownLayer0Procedure.execute(world, x, y, z);
		ShinewoodCrownLayer0Procedure.execute(world, x, (y + 1), z);
		ShinewoodCrownLayer1Procedure.execute(world, x, (y + 2), z);
	}
}
