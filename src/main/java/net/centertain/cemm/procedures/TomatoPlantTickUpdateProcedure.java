package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class TomatoPlantTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_00_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_01_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_01_TOP.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_01_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_02_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_02_TOP.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_02_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_03_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_03_TOP.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_03_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_04_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_04_TOP.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_04_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_05_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_05_TOP.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_05_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_06_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_06_TOP.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_06_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_07_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_07_TOP.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_07_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_08_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_08_TOP.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_08_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_09_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_09_TOP.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_09_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_10_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_10_TOP.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CemmModBlocks.TOMATO_10_BOTTOM.get()) {
				world.setBlock(new BlockPos(x, y, z), CemmModBlocks.TOMATO_11_BOTTOM.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), CemmModBlocks.TOMATO_11_TOP.get().defaultBlockState(), 3);
			}
		}
	}
}
