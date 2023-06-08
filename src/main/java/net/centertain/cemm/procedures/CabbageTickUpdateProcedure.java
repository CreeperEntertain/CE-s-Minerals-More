package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class CabbageTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CABBAGE_00.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.CABBAGE_01.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CABBAGE_01.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.CABBAGE_02.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.CABBAGE_02.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.CABBAGE_03.get().defaultBlockState(), 3);
			}
		}
	}
}
