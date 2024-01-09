package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SnowedBlockCreationProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		String registryName = "";
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SNOW && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("cemm:permafrost"))
				&& (world.getLevelData().isRaining() || world.getLevelData().isThundering())) {
			if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()).toString()).startsWith("minecraft:")
					|| (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()).toString()).startsWith("cemm:")) {
				registryName = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()).toString();
				registryName = registryName.replace("minecraft:", "");
				registryName = registryName.replace("cemm:", "");
				if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("cemm:snowed_" + registryName)).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					world.setBlock(BlockPos.containing(x, y - 1, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("cemm:snowed_" + registryName)).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), 3);
				}
			}
		}
	}
}
