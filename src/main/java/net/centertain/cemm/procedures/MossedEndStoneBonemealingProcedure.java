package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class MossedEndStoneBonemealingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String SourceBlock = "";
		SourceBlock = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
		EndStoneMossingProcedure.execute(world, (x - 1), (y - 1), z, SourceBlock);
		EndStoneMossingProcedure.execute(world, (x - 1), y, z, SourceBlock);
		EndStoneMossingProcedure.execute(world, (x - 1), (y + 1), z, SourceBlock);
		EndStoneMossingProcedure.execute(world, (x + 1), (y - 1), z, SourceBlock);
		EndStoneMossingProcedure.execute(world, (x + 1), y, z, SourceBlock);
		EndStoneMossingProcedure.execute(world, (x + 1), (y + 1), z, SourceBlock);
		EndStoneMossingProcedure.execute(world, x, (y - 1), (z - 1), SourceBlock);
		EndStoneMossingProcedure.execute(world, x, y, (z - 1), SourceBlock);
		EndStoneMossingProcedure.execute(world, x, (y + 1), (z - 1), SourceBlock);
		EndStoneMossingProcedure.execute(world, x, (y - 1), (z + 1), SourceBlock);
		EndStoneMossingProcedure.execute(world, x, y, (z + 1), SourceBlock);
		EndStoneMossingProcedure.execute(world, x, (y + 1), (z + 1), SourceBlock);
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			if (ForgeRegistries.BLOCKS.getValue(new ResourceLocation((SourceBlock).toLowerCase(java.util.Locale.ENGLISH))) == CemmModBlocks.MOSSED_END_STONE.get()) {
				world.setBlock(BlockPos.containing(x, y + 1, z),
						(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("cemm:end_vegetation"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
			} else if (ForgeRegistries.BLOCKS.getValue(new ResourceLocation((SourceBlock).toLowerCase(java.util.Locale.ENGLISH))) == CemmModBlocks.PURPUR_MOSSED_END_STONE.get()) {
				world.setBlock(BlockPos.containing(x, y + 1, z),
						(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("cemm:purpur_vegetation"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
			}
		}
	}
}
