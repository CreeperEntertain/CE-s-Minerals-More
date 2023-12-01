package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralRedCactusProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		RAND = Mth.nextInt(RandomSource.create(), 1, 3);
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RED_CACTUS.get().defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR && RAND >= 1) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.RED_CACTUS.get().defaultBlockState(), 3);
				if ((world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR && RAND >= 2) {
					world.setBlock(BlockPos.containing(x, y + 2, z), CemmModBlocks.RED_CACTUS.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
