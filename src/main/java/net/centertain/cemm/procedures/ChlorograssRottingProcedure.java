package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class ChlorograssRottingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String RegistryKey = "";
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			RegistryKey = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
			RegistryKey = RegistryKey.replace("cemm:chlorograss_block_", "");
			RegistryKey = "minecraft:" + RegistryKey;
			try {
				if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((RegistryKey).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation((RegistryKey).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			} catch (Exception e) {
			}
		}
	}
}
