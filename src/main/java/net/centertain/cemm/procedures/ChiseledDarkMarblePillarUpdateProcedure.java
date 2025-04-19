package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ChiseledDarkMarblePillarUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:chiseled_dark_marble_pillar")))
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:chiseled_dark_marble_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_DARK_MARBLE_PILLAR_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:chiseled_dark_marble_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_DARK_MARBLE_PILLAR_TOP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:chiseled_dark_marble_pillar")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_DARK_MARBLE_PILLAR_BOTTOM.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_DARK_MARBLE_PILLAR.get().defaultBlockState(), 3);
		}
	}
}
