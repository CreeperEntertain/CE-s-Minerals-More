package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class CliffgrassDyingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassed_cliffcobbles")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CLIFFCOBBLES.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassed_cliffdirt")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CLIFFDIRT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassed_cliffpeat")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CLIFFPEAT.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassed_cliffstone")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CLIFFSTONE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassed_dark_andesite")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DARK_ANDESITE.get().defaultBlockState(), 3);
		}
	}
}
