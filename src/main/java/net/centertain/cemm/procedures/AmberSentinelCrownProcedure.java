package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class AmberSentinelCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		AmberSentinelCrownL0Procedure.execute(world, x, (y - 1), z);
		AmberSentinelCrownL1Procedure.execute(world, x, y, z);
		AmberSentinelCrownL2Procedure.execute(world, x, (y + 1), z);
	}
}
