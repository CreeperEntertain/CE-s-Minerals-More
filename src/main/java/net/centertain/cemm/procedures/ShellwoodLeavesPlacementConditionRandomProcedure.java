package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ShellwoodLeavesPlacementConditionRandomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR && Math.random() <= 0.3) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SHELLWOOD_LEAVES_1.get().defaultBlockState(), 3);
		}
	}
}
