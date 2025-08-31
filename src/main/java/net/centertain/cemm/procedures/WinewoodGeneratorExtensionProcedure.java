package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WinewoodGeneratorExtensionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ProceduralWinewoodTreeProcedure.execute(world, x, y, z);
		return true;
	}
}
