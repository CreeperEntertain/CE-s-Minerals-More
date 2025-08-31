package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class SmolderbarkLeavesPlacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
			if (Math.random() <= 0.85) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SMOLDERBARK_LEAVES.get().defaultBlockState(), 3);
			}
		}
	}
}
