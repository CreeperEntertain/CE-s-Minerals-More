package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralWindsweptTrunkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double X = 0;
		double Y = 0;
		double Z = 0;
		double RAND = 0;
		if (true) {
			Z = z;
			X = x + 1;
			Y = y + Mth.nextInt(RandomSource.create(), 0, 1);
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 3, 5); index0++) {
				if (!((world.getBlockState(BlockPos.containing(X, Y, Z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(X, Y, Z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
					break;
				}
				world.setBlock(BlockPos.containing(X, Y, Z), CemmModBlocks.WINDSWEPT_LOG.get().defaultBlockState(), 3);
				Y = Y - 1;
			}
			X = x - 1;
			Y = y + Mth.nextInt(RandomSource.create(), 0, 1);
			for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 3, 5); index1++) {
				if (!((world.getBlockState(BlockPos.containing(X, Y, Z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(X, Y, Z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
					break;
				}
				world.setBlock(BlockPos.containing(X, Y, Z), CemmModBlocks.WINDSWEPT_LOG.get().defaultBlockState(), 3);
				Y = Y - 1;
			}
			X = x;
			Z = z + 1;
			Y = y + Mth.nextInt(RandomSource.create(), 0, 1);
			for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 3, 5); index2++) {
				if (!((world.getBlockState(BlockPos.containing(X, Y, Z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(X, Y, Z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
					break;
				}
				world.setBlock(BlockPos.containing(X, Y, Z), CemmModBlocks.WINDSWEPT_LOG.get().defaultBlockState(), 3);
				Y = Y - 1;
			}
			Z = z - 1;
			Y = y + Mth.nextInt(RandomSource.create(), 0, 1);
			for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 3, 5); index3++) {
				if (!((world.getBlockState(BlockPos.containing(X, Y, Z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(X, Y, Z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
					break;
				}
				world.setBlock(BlockPos.containing(X, Y, Z), CemmModBlocks.WINDSWEPT_LOG.get().defaultBlockState(), 3);
				Y = Y - 1;
			}
		}
		if (true) {
			X = x;
			Y = y;
			Z = z;
			RAND = Mth.nextInt(RandomSource.create(), 4, 7);
			for (int index4 = 0; index4 < (int) RAND; index4++) {
				world.setBlock(BlockPos.containing(X, Y, Z), CemmModBlocks.WINDSWEPT_LOG.get().defaultBlockState(), 3);
				Y = Y + 1;
				if (!((world.getBlockState(BlockPos.containing(X, Y, Z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(X, Y, Z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
					break;
				}
			}
		}
		WindsweptCrownProcedure.execute(world, X, Y, Z);
	}
}
