package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class WinterOakLeavesPlacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
			if (Math.random() >= 0.02) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.WINTER_OAK_LEAVES.get().defaultBlockState(), 3);
			}
		}
	}
}
