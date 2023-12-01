package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ChlorostalkTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get())
				|| !((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get()) || !((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get())
				|| !((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get()) || !((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get())
				|| !((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get()) || !((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get())
				|| !((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get()) || !((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get())
				|| !((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get()) || !((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get())
				|| !((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get()) || !((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get())
				|| !((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get()) || !((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get())
				|| !((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == CemmModBlocks.CHLOROSTALK_PLANT.get()))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.CHLOROSTALK.get().defaultBlockState(), 3);
		}
	}
}
