package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class VerticalDarkMarbleOrnamentUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_dark_marble_ornament")))
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_DARK_MARBLE_ORNAMENT_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_DARK_MARBLE_ORNAMENT_TOP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:vertical_dark_marble_ornament")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_DARK_MARBLE_ORNAMENT_BOTTOM.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.VERTICAL_DARK_MARBLE_ORNAMENT.get().defaultBlockState(), 3);
		}
	}
}
