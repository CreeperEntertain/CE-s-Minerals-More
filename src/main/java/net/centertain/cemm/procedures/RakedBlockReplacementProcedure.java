package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RakedBlockReplacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.RAKED_SAND.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.SAND.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.RAKED_GRAVEL.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.GRAVEL.defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.RED_SAND.defaultBlockState(), 3);
			}
		}
	}
}
