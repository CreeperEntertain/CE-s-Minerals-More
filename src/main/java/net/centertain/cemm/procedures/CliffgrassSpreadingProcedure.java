package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class CliffgrassSpreadingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.25) {
			if (world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.DOWN)) {
				CliffgrassDyingProcedure.execute(world, x, y, z);
			} else {
				if (Math.random() < 0.25) {
					CliffgrassSpreadBlockTestProcedure.execute(world, (x - 1), y, z);
				}
				if (Math.random() < 0.25) {
					CliffgrassSpreadBlockTestProcedure.execute(world, (x + 1), y, z);
				}
				if (Math.random() < 0.25) {
					CliffgrassSpreadBlockTestProcedure.execute(world, x, y, (z - 1));
				}
				if (Math.random() < 0.25) {
					CliffgrassSpreadBlockTestProcedure.execute(world, x, y, (z + 1));
				}
			}
		}
	}
}
