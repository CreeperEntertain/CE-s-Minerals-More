package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RawRubyPillarUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_ruby_pillar")))
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_ruby_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_RUBY_PILLAR_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_ruby_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_RUBY_PILLAR_BOTTOM.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_ruby_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_RUBY_PILLAR_TOP.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_RUBY_PILLAR.get().defaultBlockState(), 3);
		}
	}
}
