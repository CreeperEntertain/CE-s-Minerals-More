package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class PurpurTreeGeneratorExtensionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ProceduralPurpurTrunkProcedure.execute(world, x, y, z);
		return true;
	}
}
