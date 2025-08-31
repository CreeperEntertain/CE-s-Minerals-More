package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class MoutainLaurelPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double onSides = 0;
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.MOUNTAIN_LAUREL_STEM.get()) {
			onSides = onSides + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.MOUNTAIN_LAUREL_STEM.get()) {
			onSides = onSides + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.MOUNTAIN_LAUREL_STEM.get()) {
			onSides = onSides + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.MOUNTAIN_LAUREL_STEM.get()) {
			onSides = onSides + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.MOUNTAIN_LAUREL_STEM_T.get() && !((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:dirt")))
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:mountain_laurel_stem"))))) {
			return false;
		}
		if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:dirt")))
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:mountain_laurel_stem"))))
				&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.MOUNTAIN_LAUREL_STEM_HORIZONTAL.get()) || onSides == 1) {
			return true;
		}
		return false;
	}
}
