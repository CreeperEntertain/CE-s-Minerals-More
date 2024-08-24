package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class MountainLaurelLeavesPlacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
			RAND = Mth.nextInt(RandomSource.create(), 1, 10);
			if (RAND <= 1) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.FLOWERING_MOUNTAIN_LAUREL_LEAVES_0.get().defaultBlockState(), 3);
			} else if (RAND <= 8) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.MOUNTAIN_LAUREL_LEAVES_0.get().defaultBlockState(), 3);
			}
		}
	}
}
