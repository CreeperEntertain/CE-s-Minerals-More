package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class BordeaucBlockBoneMealingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BordeauxBlockSpreadingProcedure.execute(world, (x - 1), y, z);
		BordeauxBlockSpreadingProcedure.execute(world, (x + 1), y, z);
		BordeauxBlockSpreadingProcedure.execute(world, x, y, (z - 1));
		BordeauxBlockSpreadingProcedure.execute(world, x, y, (z + 1));
		BordeauxBlockSpreadingProcedure.execute(world, (x - 1), (y - 1), z);
		BordeauxBlockSpreadingProcedure.execute(world, (x - 1), (y + 1), z);
		BordeauxBlockSpreadingProcedure.execute(world, (x + 1), (y - 1), z);
		BordeauxBlockSpreadingProcedure.execute(world, (x + 1), (y + 1), z);
		BordeauxBlockSpreadingProcedure.execute(world, x, (y - 1), (z - 1));
		BordeauxBlockSpreadingProcedure.execute(world, x, (y + 1), (z - 1));
		BordeauxBlockSpreadingProcedure.execute(world, x, (y - 1), (z + 1));
		BordeauxBlockSpreadingProcedure.execute(world, x, (y + 1), (z + 1));
	}
}
