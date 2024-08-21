package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ChlorograssBlockConversionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String RegistryName = "";
		if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			if (Math.random() < 0.5) {
				RegistryName = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
				RegistryName = RegistryName.replace("minecraft:", "");
				RegistryName = RegistryName.replace("cemm:", "");
				RegistryName = "cemm:chlorograss_block_" + RegistryName;
				try {
					if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((RegistryName).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
						world.setBlock(BlockPos.containing(x, y, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation((RegistryName).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), 3);
					}
				} catch (Exception e) {
				}
			}
		}
	}
}
