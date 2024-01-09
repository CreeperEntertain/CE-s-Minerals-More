package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RawKyanitePillarUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_kyanite_pillar")))
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_kyanite_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_KYANITE_PILLAR_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_kyanite_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_KYANITE_PILLAR_BOTTOM.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:raw_kyanite_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_KYANITE_PILLAR_TOP.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RAW_KYANITE_PILLAR.get().defaultBlockState(), 3);
		}
	}
}
