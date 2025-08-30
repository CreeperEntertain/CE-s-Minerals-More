package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WinterOakCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		WinterOakCrownLayer0Procedure.execute(world, x, (y - 3), z);
		WinterOakCrownLayer0Procedure.execute(world, x, (y - 2), z);
		WinterOakCrownLayer1Procedure.execute(world, x, (y - 1), z);
		WinterOakCrownLayer2Procedure.execute(world, x, y, z);
	}
}
