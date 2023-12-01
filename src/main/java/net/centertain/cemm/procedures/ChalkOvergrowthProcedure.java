package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ChalkOvergrowthProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 7 && (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER)) {
			RAND = Mth.nextInt(RandomSource.create(), 0, 3);
			if (RAND == 0) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))) {
					ChalkLimestoneOvergrowingProcedure.execute(world, x, y, z);
				}
			} else if (RAND == 1) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x + 1, y + 2, z))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))) {
					ChalkLimestoneOvergrowingProcedure.execute(world, x, y, z);
				}
			} else if (RAND == 2) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x, y + 2, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))) {
					ChalkLimestoneOvergrowingProcedure.execute(world, x, y, z);
				}
			} else {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))
						|| (world.getBlockState(BlockPos.containing(x, y + 2, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:chalk_limestone_overgrowth")))) {
					ChalkLimestoneOvergrowingProcedure.execute(world, x, y, z);
				}
			}
		}
	}
}
