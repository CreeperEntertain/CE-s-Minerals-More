package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RRedGlassReplacementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:t_reinforced_purple_glass")))
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:t_reinforced_purple_glass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.REINFORCED_PURPLE_STAINED_GLASS_MIDDLE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:t_reinforced_purple_glass")))
				&& !(world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:t_reinforced_purple_glass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.REINFORCED_PURPLE_STAINED_GLASS_BOTTOM.get().defaultBlockState(), 3);
		} else if (!(world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:t_reinforced_purple_glass")))
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:t_reinforced_purple_glass")))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.REINFORCED_PURPLE_STAINED_GLASS_TOP.get().defaultBlockState(), 3);
		} else {
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.REINFORCED_PURPLE_STAINED_GLASS.get())) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.REINFORCED_PURPLE_STAINED_GLASS.get().defaultBlockState(), 3);
			}
		}
	}
}
