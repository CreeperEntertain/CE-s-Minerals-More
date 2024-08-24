package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class PurpurCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		PurpurCrownLayer0Procedure.execute(world, x, y, z);
		PurpurCrownLayer1Procedure.execute(world, x, (y + 1), z);
	}
}
