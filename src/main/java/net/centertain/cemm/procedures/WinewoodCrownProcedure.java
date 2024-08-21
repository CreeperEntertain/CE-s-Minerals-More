package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WinewoodCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		WinewoodCrownlayer0Procedure.execute(world, x, (y - 2), z);
		WinewoodCrownLayer1Procedure.execute(world, x, (y - 1), z);
		WinewoodCrownLayer2Procedure.execute(world, x, y, z);
		WinewoodCrownLayer3Procedure.execute(world, x, (y + 1), z);
	}
}
