package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class IcaronPortalPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:moon_rock")))
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:moon_rock")))
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:moon_rock")))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:moon_rock")))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:moon_rock")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:moon_rock")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:moon_rock")))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:moon_rock")))) {
			return true;
		}
		return false;
	}
}
