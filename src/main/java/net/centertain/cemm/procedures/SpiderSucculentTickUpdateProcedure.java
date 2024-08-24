package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class SpiderSucculentTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:spider_succulent")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DEAD_SPIDER_SUCCULENT_BULB.get().defaultBlockState(), 3);
		}
	}
}
