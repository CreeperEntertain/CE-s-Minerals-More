package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class SludgeSpreadTestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(BlockPos.containing(x, y + 2, z)).isFaceSturdy(world, BlockPos.containing(x, y + 2, z), Direction.DOWN) && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.SLUDGE.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.MOSSED_SLUDGE.get().defaultBlockState(), 3);
		} else if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.DOWN) && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SLUDGE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.MOSSED_SLUDGE.get().defaultBlockState(), 3);
		} else if (!world.getBlockState(BlockPos.containing(x, y, z)).isFaceSturdy(world, BlockPos.containing(x, y, z), Direction.DOWN) && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.SLUDGE.get()) {
			world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.MOSSED_SLUDGE.get().defaultBlockState(), 3);
		}
	}
}
