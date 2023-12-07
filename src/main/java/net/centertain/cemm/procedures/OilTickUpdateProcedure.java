package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class OilTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		OilBurningProcedure.execute(world, x, y, z);
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getFluidState().isSource()) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:oil_solidifier")))
					|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:oil_solidifier")))
					|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:oil_solidifier")))
					|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:oil_solidifier")))
					|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:oil_solidifier")))
					|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:oil_solidifier")))
					|| (world.getFluidState(BlockPos.containing(x + 1, y, z)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:water")))
					|| (world.getFluidState(BlockPos.containing(x - 1, y, z)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:water")))
					|| (world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:water")))
					|| (world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:water")))
					|| (world.getFluidState(BlockPos.containing(x, y, z + 1)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:water")))
					|| (world.getFluidState(BlockPos.containing(x, y, z - 1)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:water")))) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SOLIDIFIED_OIL.get().defaultBlockState(), 3);
			}
		}
	}
}
