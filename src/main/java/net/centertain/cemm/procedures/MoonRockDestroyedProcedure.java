package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class MoonRockDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == CemmModBlocks.ICARON_PORTAL.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == CemmModBlocks.ICARON_PORTAL_INACTIVE.get()) {
			world.setBlock(BlockPos.containing(x - 1, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == CemmModBlocks.ICARON_PORTAL.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == CemmModBlocks.ICARON_PORTAL_INACTIVE.get()) {
			world.setBlock(BlockPos.containing(x - 1, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == CemmModBlocks.ICARON_PORTAL.get() || (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == CemmModBlocks.ICARON_PORTAL_INACTIVE.get()) {
			world.setBlock(BlockPos.containing(x + 1, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == CemmModBlocks.ICARON_PORTAL.get() || (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == CemmModBlocks.ICARON_PORTAL_INACTIVE.get()) {
			world.setBlock(BlockPos.containing(x + 1, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
