package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ShiverwoodTrunkPlacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ShiverwoodCrownLayer0Procedure.execute(world, x, y, z);
		ShiverwoodCrownLayer0Procedure.execute(world, x, (y + 1), z);
		ShiverwoodCrownLayer1Procedure.execute(world, x, (y + 2), z);
	}
}
