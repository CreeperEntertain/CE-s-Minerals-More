package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class MetaCarboniteStructureLimitationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!(y <= 24 || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.ACID.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
			return true;
		}
		return false;
	}
}
