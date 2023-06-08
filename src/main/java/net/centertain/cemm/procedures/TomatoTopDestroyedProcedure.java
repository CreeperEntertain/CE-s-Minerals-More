package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TomatoTopDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _pos = new BlockPos(x, y - 1, z);
			Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y - 1, z), null);
			world.destroyBlock(_pos, false);
		}
	}
}
