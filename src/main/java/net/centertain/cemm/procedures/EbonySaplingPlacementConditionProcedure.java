package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class EbonySaplingPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:dirt"))) || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.ZIRCON_SAND.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.MONAZITE_SAND.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SAND
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.RED_SAND || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.JASPILITE.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.SMOOTH_JASPILITE.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.SCORIA.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.RED_SHALE.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CemmModBlocks.ORPIMENT.get()) {
			return true;
		}
		return false;
	}
}
