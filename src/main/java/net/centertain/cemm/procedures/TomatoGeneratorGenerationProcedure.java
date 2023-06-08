package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class TomatoGeneratorGenerationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_11_BOTTOM.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 2, z), CemmModBlocks.TOMATO_11_TOP.get().defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_10_BOTTOM.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 2, z), CemmModBlocks.TOMATO_10_TOP.get().defaultBlockState(), 3);
		}
	}
}
