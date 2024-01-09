package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class MountainLaurelCrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		int horizontalRadiusSphere = (int) 4 - 1;
		int verticalRadiusSphere = (int) 3.5 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						if (Math.random() <= 0.8) {
							if ((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR) {
								if (Math.random() <= 0.1) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CemmModBlocks.FLOWERING_MOUNTAIN_LAUREL_LEAVES_0.get().defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CemmModBlocks.MOUNTAIN_LAUREL_LEAVES_0.get().defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
		}
	}
}
