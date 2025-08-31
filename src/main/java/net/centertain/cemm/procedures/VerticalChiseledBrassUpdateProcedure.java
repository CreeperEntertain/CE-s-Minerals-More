package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class VerticalChiseledBrassUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_CHISELED_BRASS_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_CHISELED_BRASS_TOP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_CHISELED_BRASS_BOTTOM.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_CHISELED_BRASS.get().defaultBlockState(), 3);
		}
	}
}
