package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class DarkBambooStemPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:dark_bamboo_base"))) || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.DARK_BAMBOO.get()) {
			return true;
		}
		return false;
	}
}
