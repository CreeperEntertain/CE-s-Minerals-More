package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RawCitrinePillarUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_citrine_pillar")))
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_citrine_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_CITRINE_PILLAR_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_citrine_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_CITRINE_PILLAR_BOTTOM.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_citrine_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_CITRINE_PILLAR_TOP.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_CITRINE_PILLAR.get().defaultBlockState(), 3);
		}
	}
}
