package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class HorizontalChiseledBronzeUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_TOP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_BOTTOM.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_TOP_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_TOP_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_BOTTOM_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_BOTTOM_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_HORIZONTAL.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_VERTICAL.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_HORIZONTAL_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_HORIZONTAL_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_VERTICAL_TOP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE_VERTICAL_BOTTOM.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHISELED_BRONZE.get().defaultBlockState(), 3);
		}
	}
}
