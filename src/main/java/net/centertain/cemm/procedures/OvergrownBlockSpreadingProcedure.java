package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class OvergrownBlockSpreadingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String registryName = "";
		if (Math.random() <= 0.02 && ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).startsWith("minecraft:")
				|| (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).startsWith("cemm:"))) {
			if ((!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
					|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:moss_blocks"))))
					&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER)) {
				if ((world.getLevelData().isRaining() || world.getLevelData().isThundering()) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:water")))) {
					registryName = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
					registryName = registryName.replace("cemm:", "");
					registryName = registryName.replace("minecraft:", "");
					if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("cemm:overgrown_" + registryName)).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
						world.setBlock(BlockPos.containing(x, y, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("cemm:overgrown_" + registryName)).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
