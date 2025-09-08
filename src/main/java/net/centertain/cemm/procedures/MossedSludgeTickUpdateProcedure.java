package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class MossedSludgeTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.DOWN)) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SLUDGE.get().defaultBlockState(), 3);
		} else {
			if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) > 4) {
				if (Math.random() < 0.25) {
					SludgeSpreadTestProcedure.execute(world, (x - 1), y, z);
				}
				if (Math.random() < 0.25) {
					SludgeSpreadTestProcedure.execute(world, (x + 1), y, z);
				}
				if (Math.random() < 0.25) {
					SludgeSpreadTestProcedure.execute(world, x, y, (z - 1));
				}
				if (Math.random() < 0.25) {
					SludgeSpreadTestProcedure.execute(world, x, y, (z + 1));
				}
			}
		}
	}
}
