package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class HorizontalChiseledBrassUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_TOP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_BOTTOM.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_TOP_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_TOP_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_BOTTOM_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_BOTTOM_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_HORIZONTAL.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_VERTIAL.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_HORIZONTAL_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_HORIZONTAL_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_VERTICAL_TOP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_brass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS_VERTICAL_BOTTOM.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRASS.get().defaultBlockState(), 3);
		}
	}
}
