package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class CliffgrassReplacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassed_cliffdirt")))) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW_BLOCK
					|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.POWDER_SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.ICY_SNOW.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SNOWED_GRASSED_CLIFFDIRT.get().defaultBlockState(), 3);
			} else {
				if (TestForSnowyCliffgrassProcedure.execute(world, x, y, z) || y >= 128 && world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f < 15) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SNOWY_GRASSED_CLIFFDIRT.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRASSED_CLIFFDIRT.get().defaultBlockState(), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassed_cliffpeat")))) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW_BLOCK
					|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.POWDER_SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.ICY_SNOW.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SNOWED_GRASSED_CLIFFPEAT.get().defaultBlockState(), 3);
			} else {
				if (TestForSnowyCliffgrassProcedure.execute(world, x, y, z) || y >= 128 && world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f < 15) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SNOWY_GRASSED_CLIFFPEAT.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRASSED_CLIFFPEAT.get().defaultBlockState(), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassed_cliffstone")))) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW_BLOCK
					|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.POWDER_SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.ICY_SNOW.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SNOWED_GRASSED_CLIFFSTONE.get().defaultBlockState(), 3);
			} else {
				if (TestForSnowyCliffgrassProcedure.execute(world, x, y, z) || y >= 128 && world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f < 15) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SNOWY_GRASSED_CLIFFSTONE.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRASSED_CLIFFSTONE.get().defaultBlockState(), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassed_cliffcobbles")))) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW_BLOCK
					|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.POWDER_SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.ICY_SNOW.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SNOWED_GRASSED_CLIFFCOBBLES.get().defaultBlockState(), 3);
			} else {
				if (TestForSnowyCliffgrassProcedure.execute(world, x, y, z) || y >= 128 && world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f < 15) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SNOWY_GRASSED_CLIFFCOBBLES.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRASSED_CLIFFCOBBLES.get().defaultBlockState(), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassed_dark_andesite")))) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SNOW_BLOCK
					|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.POWDER_SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.ICY_SNOW.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SNOWED_CLIFFGRASSED_DARK_ANDESITE.get().defaultBlockState(), 3);
			} else {
				if (TestForSnowyCliffgrassProcedure.execute(world, x, y, z) || y >= 128 && world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f < 15) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SNOWY_CLIFFGRASSED_DARK_ANDESITE.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CLIFFGRASSED_DARK_ANDESITE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
