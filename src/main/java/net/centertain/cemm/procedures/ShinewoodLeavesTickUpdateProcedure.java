package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ShinewoodLeavesTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
		{
			BlockPos _pos = BlockPos.containing(x, y, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 0.5), null);
			world.destroyBlock(_pos, false);
		}
	}
}
