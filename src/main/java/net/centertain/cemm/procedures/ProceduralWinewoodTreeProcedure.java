package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralWinewoodTreeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double DIR = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double Xb = 0;
		double Yb = 0;
		double Zb = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		DIR = Mth.nextInt(RandomSource.create(), 1, 4);
		X = x;
		Y = y;
		Z = z;
		Xb = X + 1;
		Yb = Y + Mth.nextInt(RandomSource.create(), 0, 1);
		Zb = Z;
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 2, 5); index0++) {
			if ((world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
				world.setBlock(BlockPos.containing(Xb, Yb, Zb), CemmModBlocks.WINEWOOD_LOG.get().defaultBlockState(), 3);
			}
			Yb = Yb - 1;
			if (!((world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
				break;
			}
		}
		Xb = X - 1;
		Yb = Y + Mth.nextInt(RandomSource.create(), 0, 1);
		for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 2, 5); index1++) {
			if ((world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
				world.setBlock(BlockPos.containing(Xb, Yb, Zb), CemmModBlocks.WINEWOOD_LOG.get().defaultBlockState(), 3);
			}
			Yb = Yb - 1;
			if (!((world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
				break;
			}
		}
		Xb = X;
		Yb = Y + Mth.nextInt(RandomSource.create(), 0, 1);
		Zb = Zb + 1;
		for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 2, 5); index2++) {
			if ((world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
				world.setBlock(BlockPos.containing(Xb, Yb, Zb), CemmModBlocks.WINEWOOD_LOG.get().defaultBlockState(), 3);
			}
			Yb = Yb - 1;
			if (!((world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
				break;
			}
		}
		Yb = Y + Mth.nextInt(RandomSource.create(), 0, 1);
		Zb = Zb - 1;
		for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 2, 5); index3++) {
			if ((world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
				world.setBlock(BlockPos.containing(Xb, Yb, Zb), CemmModBlocks.WINEWOOD_LOG.get().defaultBlockState(), 3);
			}
			Yb = Yb - 1;
			if (!((world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(Xb, Yb, Zb))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
				break;
			}
		}
		for (int index4 = 0; index4 < Mth.nextInt(RandomSource.create(), 2, 3); index4++) {
			WinewoodTrunkLayerProcedure.execute(world, X, Y, Z);
			Y = Y + 1;
			if (DIR == 1) {
				X = X + 1;
			} else if (DIR == 2) {
				X = X - 1;
			} else if (DIR == 3) {
				Z = Z + 1;
			} else {
				Z = Z - 1;
			}
		}
		for (int index5 = 0; index5 < Mth.nextInt(RandomSource.create(), 1, 2); index5++) {
			WinewoodTrunkLayerProcedure.execute(world, X, Y, Z);
			Y = Y + 1;
			WinewoodTrunkLayerProcedure.execute(world, X, Y, Z);
			Y = Y + 1;
			if (DIR == 1) {
				X = X + 1;
			} else if (DIR == 2) {
				X = X - 1;
			} else if (DIR == 3) {
				Z = Z + 1;
			} else {
				Z = Z - 1;
			}
			if (!((world.getBlockState(BlockPos.containing(X, Y, Z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(X, Y, Z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
				break;
			}
		}
		if (DIR == 1) {
			WinewoodCrownProcedure.execute(world, (X - 1), (Y - 1), Z);
		} else if (DIR == 2) {
			WinewoodCrownProcedure.execute(world, (X + 1), (Y - 1), Z);
		} else if (DIR == 3) {
			WinewoodCrownProcedure.execute(world, X, (Y - 1), (Z - 1));
		} else {
			WinewoodCrownProcedure.execute(world, X, (Y - 1), (Z + 1));
		}
	}
}
