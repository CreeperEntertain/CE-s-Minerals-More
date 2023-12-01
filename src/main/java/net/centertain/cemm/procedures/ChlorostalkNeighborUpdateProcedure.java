package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ChlorostalkNeighborUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROSTALK.get())
				&& !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get())) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROSTALK_PLANT.get().defaultBlockState(), 3);
		} else if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROSTALK.get())
				&& !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CHLOROSTALK.get())) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROSTALK.get().defaultBlockState(), 3);
		}
	}
}
