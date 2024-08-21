package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class TestForSnowyCliffgrassProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double PhaseX = 0;
		double REP = 0;
		double REP2 = 0;
		double PhaseY = 0;
		REP = 1;
		for (int index0 = 0; index0 < 5; index0++) {
			if (REP == 1 || REP == 5) {
				REP2 = 3;
				PhaseX = -1;
			} else {
				REP2 = 5;
				PhaseX = -2;
			}
			for (int index1 = 0; index1 < (int) REP2; index1++) {
				PhaseY = -1;
				for (int index2 = 0; index2 < 3; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + PhaseX, y + PhaseY, z + REP - 3))).is(BlockTags.create(new ResourceLocation("cemm:snowy_cliffgrass")))) {
						found = true;
					}
					PhaseY = PhaseY + 1;
				}
				PhaseX = PhaseX + 1;
			}
			REP = REP + 1;
		}
		if (found == true) {
			return true;
		}
		return false;
	}
}
