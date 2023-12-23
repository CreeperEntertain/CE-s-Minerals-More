package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ScaffoldingUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:scaffolding")))
				|| world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.UP)
				|| world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.UP)
						&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:scaffolding")))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:solid_scaffolding")))) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SOLID_IRON_SCAFFOLDING.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.IRON_SCAFFOLDING.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SOLID_COPPER_SCAFFOLDING.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.COPPER_SCAFFOLDING.get().defaultBlockState(), 3);
				}
			}
		} else {
			if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:solid_scaffolding")))) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.IRON_SCAFFOLDING.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SOLID_IRON_SCAFFOLDING.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.COPPER_SCAFFOLDING.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SOLID_COPPER_SCAFFOLDING.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
