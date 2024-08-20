package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class OvergrownChalkTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		String registryName = "";
		GrassRegrowthNoFlowersProcedure.execute(world, x, y, z);
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).startsWith("cemm:grassed_")) {
				registryName = (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("cemm:grassed_", "");
				if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("cemm:" + registryName)).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					registryName = "cemm:" + registryName;
				} else if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("minecraft:" + registryName)).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					registryName = "minecraft:" + registryName;
				}
				if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((registryName).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					world.setBlock(BlockPos.containing(x, y, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation((registryName).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), 3);
				}
			}
		}
	}
}
