package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class EndSpruceGeneratorExtensionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ProceduralEndSpruceTrunkProcedure.execute(world, x, y, z);
		return true;
	}
}
