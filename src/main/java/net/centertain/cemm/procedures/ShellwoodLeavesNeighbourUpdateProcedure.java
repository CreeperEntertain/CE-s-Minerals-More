package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ShellwoodLeavesNeighbourUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LOG.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LOG.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LOG.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LOG.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.SHELLWOOD_LOG.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.SHELLWOOD_LOG.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SHELLWOOD_LEAVES_1.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_1.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_1.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_1.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_1.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_1.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_1.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SHELLWOOD_LEAVES_2.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_2.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_2.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_2.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_2.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_2.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_2.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SHELLWOOD_LEAVES_3.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_3.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_3.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_3.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_3.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_3.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_3.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SHELLWOOD_LEAVES_4.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_4.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_4.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_4.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_4.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_4.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_4.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SHELLWOOD_LEAVES_5.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_5.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_5.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_5.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_5.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_5.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_5.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SHELLWOOD_LEAVES_6.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_6.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_6.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_6.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_6.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_6.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.SHELLWOOD_LEAVES_6.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SHELLWOOD_LEAVES_7.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SHELLWOOD_LEAVES_8.get().defaultBlockState(), 3);
		}
	}
}