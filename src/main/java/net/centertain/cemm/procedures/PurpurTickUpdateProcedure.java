package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class PurpurTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.15) {
			ProceduralPurpurTrunkProcedure.execute(world, x, y, z);
		}
	}
}
