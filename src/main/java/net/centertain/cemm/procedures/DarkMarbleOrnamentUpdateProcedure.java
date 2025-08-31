package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class DarkMarbleOrnamentUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_TOP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_BOTTOM.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARKMARBLE_ORNAMENT_TOP_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_TOP_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_BOTTOM_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_BOTTOM_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_HORIZONTAL.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_VERTICAL.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_HORIZONTAL_LEFT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_HORIZONTAL_RIGHT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_VERTICAL_TOP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:horizontal_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT_VERTICAL_BOTTOM.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_MARBLE_ORNAMENT.get().defaultBlockState(), 3);
		}
	}
}
