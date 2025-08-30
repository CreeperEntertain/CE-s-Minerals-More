package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class MossedSludgeBoneMealedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 4); index0++) {
			RAND = Mth.nextInt(RandomSource.create(), 1, 4);
			if (RAND == 1) {
				SludgeSpreadTestProcedure.execute(world, (x - 1), y, z);
			}
			if (RAND == 2) {
				SludgeSpreadTestProcedure.execute(world, (x + 1), y, z);
			}
			if (RAND == 3) {
				SludgeSpreadTestProcedure.execute(world, x, y, (z - 1));
			}
			if (RAND == 4) {
				SludgeSpreadTestProcedure.execute(world, x, y, (z + 1));
			}
		}
	}
}
