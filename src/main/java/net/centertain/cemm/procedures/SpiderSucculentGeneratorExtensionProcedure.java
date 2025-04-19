package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class SpiderSucculentGeneratorExtensionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		double Y = 0;
		RAND = Mth.nextInt(RandomSource.create(), 1, 3);
		Y = y;
		if (Math.random() >= 0.25) {
			for (int index0 = 0; index0 < (int) RAND; index0++) {
				if (!world.getBlockState(BlockPos.containing(x, Y, z)).canOcclude()) {
					world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.SPIDER_SUCCULENT.get().defaultBlockState(), 3);
					Y = Y + 1;
				} else {
					break;
				}
			}
			if (!world.getBlockState(BlockPos.containing(x, Y, z)).canOcclude()) {
				world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.SPIDER_SUCCULENT_BULB.get().defaultBlockState(), 3);
				Y = Y + 1;
			}
			if (!world.getBlockState(BlockPos.containing(x, Y, z)).canOcclude()) {
				if (Math.random() > 0.5) {
					world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.SPIDER_SUCCULENT_BLADES.get().defaultBlockState(), 3);
				} else {
					if (Math.random() > 0.25) {
						world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.SPIDER_EGG.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.CRACKED_SPIDER_EGG.get().defaultBlockState(), 3);
					}
				}
			}
		} else {
			for (int index1 = 0; index1 < (int) RAND; index1++) {
				if (!world.getBlockState(BlockPos.containing(x, Y, z)).canOcclude()) {
					world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.DEAD_SPIDER_SUCCULENT.get().defaultBlockState(), 3);
					Y = Y + 1;
				} else {
					break;
				}
			}
			if (!world.getBlockState(BlockPos.containing(x, Y, z)).canOcclude()) {
				world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.DEAD_SPIDER_SUCCULENT_BULB.get().defaultBlockState(), 3);
				Y = Y + 1;
			}
			if (!world.getBlockState(BlockPos.containing(x, Y, z)).canOcclude()) {
				if (Math.random() > 0.75) {
					world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.DEAD_SPIDER_SUCCULENT_BLADES.get().defaultBlockState(), 3);
				}
			}
		}
		return true;
	}
}
