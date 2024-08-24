package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class VerticalChiseledBronzeUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_chiseled_bronze")))
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_CHISELED_BRONZE_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_CHISELED_BRONZE_TOP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_chiseled_bronze")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_CHISELED_BRONZE_BOTTOM.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_CHISELED_BRONZE.get().defaultBlockState(), 3);
		}
	}
}
