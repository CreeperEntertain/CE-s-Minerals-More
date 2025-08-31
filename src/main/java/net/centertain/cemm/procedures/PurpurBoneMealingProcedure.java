package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class PurpurBoneMealingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.35) {
			ProceduralPurpurTrunkProcedure.execute(world, x, y, z);
		}
	}
}
