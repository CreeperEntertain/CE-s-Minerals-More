package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class SmolderbarkCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		SmolderbarkCrownLayer0Procedure.execute(world, x, (y - 2), z);
		SmolderbarkCrownLayer0Procedure.execute(world, x, (y - 1), z);
		SmolderbarkCrownLayer1Procedure.execute(world, x, y, z);
		SmolderbarkCrownLayer2Procedure.execute(world, x, (y + 1), z);
	}
}
