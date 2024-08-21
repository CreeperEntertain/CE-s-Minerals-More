package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class EndStoneMossingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, String SourceBlock) {
		if (SourceBlock == null)
			return;
		if (Math.random() >= 0.35 && (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:base_end_stone")))
				&& (!world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.DOWN)
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:moss_blocks"))))) {
			if (ForgeRegistries.BLOCKS.getValue(new ResourceLocation((SourceBlock).toLowerCase(java.util.Locale.ENGLISH))) == CemmModBlocks.MOSSED_END_STONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.MOSSED_END_STONE.get().defaultBlockState(), 3);
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && Math.random() >= 0.5) {
					world.setBlock(BlockPos.containing(x, y + 1, z),
							(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("cemm:end_vegetation"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
				}
			} else if (ForgeRegistries.BLOCKS.getValue(new ResourceLocation((SourceBlock).toLowerCase(java.util.Locale.ENGLISH))) == CemmModBlocks.PURPUR_MOSSED_END_STONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.PURPUR_MOSSED_END_STONE.get().defaultBlockState(), 3);
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && Math.random() >= 0.5) {
					world.setBlock(BlockPos.containing(x, y + 1, z),
							(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("cemm:purpur_vegetation"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
				}
			}
		}
	}
}
