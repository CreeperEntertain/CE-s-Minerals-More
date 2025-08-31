package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class EndSpruceBoneMealingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.35) {
			ProceduralEndSpruceTrunkProcedure.execute(world, x, y, z);
		}
	}
}
