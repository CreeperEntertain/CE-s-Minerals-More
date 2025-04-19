package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WindsweptCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		WindsweptCrownLayer0Procedure.execute(world, x, (y - 2), z);
		WindsweptCrownLayer1Procedure.execute(world, x, (y - 1), z);
		WindsweptCrownLayer2Procedure.execute(world, x, y, z);
	}
}
