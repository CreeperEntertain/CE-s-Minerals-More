package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FireshadeCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FireshadeCrownLayer0Procedure.execute(world, x, y, z);
		FireshadeCrownLayer1Procedure.execute(world, x, (y + 1), z);
	}
}
