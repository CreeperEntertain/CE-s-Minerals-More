package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class NightbarkLeavesNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CemmModBlocks.LUNARBARK_STEM.get() || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CemmModBlocks.LUNARBARK_STEM.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.LUNARBARK_STEM.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.LUNARBARK_STEM.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CemmModBlocks.LUNARBARK_STEM.get() || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CemmModBlocks.LUNARBARK_STEM.get()) {
			world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NIGHTBARK_LEAVES.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get() || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get() || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()) {
			world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NIGHTBARK_LEAVES_1.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get() || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get() || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()) {
			world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NIGHTBARK_LEAVES_2.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get() || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get() || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()) {
			world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NIGHTBARK_LEAVES_3.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get() || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get() || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()) {
			world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NIGHTBARK_LEAVES_4.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get() || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get() || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()) {
			world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NIGHTBARK_LEAVES_5.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get() || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get() || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()) {
			world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NIGHTBARK_LEAVES_6.get().defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y, z), CemmModBlocks.NIGHTBARK_LEAVES_7.get().defaultBlockState(), 3);
		}
	}
}
