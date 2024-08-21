package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class PlaceChlorowoodCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CTCrownLayer0Procedure.execute(world, x, (y + 0), z);
		CTCrownLayer1Procedure.execute(world, x, (y + 1), z);
		CTCrownLayer2Procedure.execute(world, x, (y + 2), z);
		CTCrownLayer3Procedure.execute(world, x, (y + 3), z);
	}
}
