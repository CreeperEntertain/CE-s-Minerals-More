package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class EbonySaplingOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.25) {
			EbonyTrunkPlacementProcedure.execute(world, x, y, z);
		}
	}
}
