package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class EbonyTrunkPlacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		EbonyCrownLayer0Procedure.execute(world, x, y, z);
		EbonyCrownLayer0Procedure.execute(world, x, (y + 1), z);
		EbonyCrownLayer1Procedure.execute(world, x, (y + 2), z);
	}
}
