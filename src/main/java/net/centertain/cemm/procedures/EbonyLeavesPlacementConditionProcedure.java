package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class EbonyLeavesPlacementConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y, z), CemmModBlocks.EBONY_LEAVES_0.get().defaultBlockState(), 3);
		}
	}
}
