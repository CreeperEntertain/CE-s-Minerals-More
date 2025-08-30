package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ChlorophylOreTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Rand = 0;
		if (Math.random() >= 0.01
				&& (world.getMaxLocalRawBrightness(BlockPos.containing(x - 1, y, z)) >= 10 || world.getMaxLocalRawBrightness(BlockPos.containing(x + 1, y, z)) >= 10 || world.getMaxLocalRawBrightness(BlockPos.containing(x, y - 1, z)) >= 10
						|| world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= 10 || world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z - 1)) >= 10 || world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z + 1)) >= 10)) {
			Rand = Mth.nextInt(RandomSource.create(), 1, 6);
			if (Rand == 1) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.STONE) {
					world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.DEEPSLATE) {
					world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.DEEPSLATE_CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				}
			} else if (Rand == 2) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.STONE) {
					world.setBlock(BlockPos.containing(x + 1, y, z), CemmModBlocks.CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.DEEPSLATE) {
					world.setBlock(BlockPos.containing(x + 1, y, z), CemmModBlocks.DEEPSLATE_CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				}
			} else if (Rand == 3) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.STONE) {
					world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE) {
					world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.DEEPSLATE_CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				}
			} else if (Rand == 4) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.STONE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.DEEPSLATE_CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				}
			} else if (Rand == 5) {
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.STONE) {
					world.setBlock(BlockPos.containing(x, y, z - 1), CemmModBlocks.CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.DEEPSLATE) {
					world.setBlock(BlockPos.containing(x, y, z - 1), CemmModBlocks.DEEPSLATE_CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				}
			} else {
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.STONE) {
					world.setBlock(BlockPos.containing(x, y, z + 1), CemmModBlocks.CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.DEEPSLATE) {
					world.setBlock(BlockPos.containing(x, y, z + 1), CemmModBlocks.DEEPSLATE_CHLOROPHYL_ORE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
