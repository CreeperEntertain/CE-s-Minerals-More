package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class SwampflowerTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getLevelData().isRaining() || world.getLevelData().isThundering()) && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SWAMPFLOWER.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BLOOMING_SWAMPFLOWER.get().defaultBlockState(), 3);
		} else if (!(world.getLevelData().isRaining() || world.getLevelData().isThundering()) && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.BLOOMING_SWAMPFLOWER.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SWAMPFLOWER.get().defaultBlockState(), 3);
		}
	}
}
