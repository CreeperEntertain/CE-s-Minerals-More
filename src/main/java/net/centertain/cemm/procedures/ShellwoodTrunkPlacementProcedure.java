package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ShellwoodTrunkPlacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ShellwoodCrownLayer0Procedure.execute(world, x, y, z);
		ShellwoodCrownLayer0Procedure.execute(world, x, (y + 1), z);
		ShellwoodCrownLayer1Procedure.execute(world, x, (y + 2), z);
	}
}
