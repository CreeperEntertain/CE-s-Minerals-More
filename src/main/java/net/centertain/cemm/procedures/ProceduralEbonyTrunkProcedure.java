package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralEbonyTrunkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double XPos = 0;
		double YPos = 0;
		double ZPos = 0;
		double Height = 0;
		double XPos2 = 0;
		double YPos2 = 0;
		double ZPos3 = 0;
		double HeightLocal = 0;
		XPos = x;
		YPos = y;
		ZPos = z;
		Height = Mth.nextDouble(RandomSource.create(), 4, 10);
		HeightLocal = Height + YPos;
		world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.EBONY_LOG.get().defaultBlockState(), 3);
		XPos2 = XPos;
		YPos2 = YPos;
		ZPos3 = ZPos;
		for (int index0 = 0; index0 < (int) Height; index0++) {
			if ((world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).is(BlockTags.create(new ResourceLocation("minecraft:leave_blocks"))) || (world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(XPos2, YPos2, ZPos3), CemmModBlocks.EBONY_LOG.get().defaultBlockState(), 3);
			}
			YPos2 = YPos2 + 1;
		}
		XPos2 = XPos + 1;
		YPos2 = YPos;
		if (Math.random() <= 0.75) {
			for (int index1 = 0; index1 < (int) (Height / 3 + Mth.nextDouble(RandomSource.create(), 0, Height / 4)); index1++) {
				if ((world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).is(BlockTags.create(new ResourceLocation("minecraft:leave_blocks"))) || (world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(XPos2, YPos2, ZPos3), CemmModBlocks.EBONY_LOG.get().defaultBlockState(), 3);
				}
				YPos2 = YPos2 + 1;
			}
		}
		XPos2 = XPos - 1;
		YPos2 = YPos;
		if (Math.random() <= 0.75) {
			for (int index2 = 0; index2 < (int) (Height / 3 + Mth.nextDouble(RandomSource.create(), 0, Height / 4)); index2++) {
				if ((world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).is(BlockTags.create(new ResourceLocation("minecraft:leave_blocks"))) || (world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(XPos2, YPos2, ZPos3), CemmModBlocks.EBONY_LOG.get().defaultBlockState(), 3);
				}
				YPos2 = YPos2 + 1;
			}
		}
		XPos2 = XPos;
		ZPos3 = ZPos + 1;
		YPos2 = YPos;
		if (Math.random() <= 0.75) {
			for (int index3 = 0; index3 < (int) (Height / 3 + Mth.nextDouble(RandomSource.create(), 0, Height / 4)); index3++) {
				if ((world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).is(BlockTags.create(new ResourceLocation("minecraft:leave_blocks"))) || (world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(XPos2, YPos2, ZPos3), CemmModBlocks.EBONY_LOG.get().defaultBlockState(), 3);
				}
				YPos2 = YPos2 + 1;
			}
		}
		ZPos3 = ZPos - 1;
		YPos2 = YPos;
		if (Math.random() <= 0.75) {
			for (int index4 = 0; index4 < (int) (Height / 3 + Mth.nextDouble(RandomSource.create(), 0, Height / 4)); index4++) {
				if ((world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).is(BlockTags.create(new ResourceLocation("minecraft:leave_blocks"))) || (world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(XPos2, YPos2, ZPos3), CemmModBlocks.EBONY_LOG.get().defaultBlockState(), 3);
				}
				YPos2 = YPos2 + 1;
			}
		}
		ZPos3 = ZPos;
		XPos2 = XPos + 1;
		YPos2 = HeightLocal;
		if (Math.random() <= 0.25) {
			for (int index5 = 0; index5 < (int) (Height / 4 + Mth.nextDouble(RandomSource.create(), 0, Height / 6)); index5++) {
				if ((world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).is(BlockTags.create(new ResourceLocation("minecraft:leave_blocks"))) || (world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(XPos2, YPos2, ZPos3), CemmModBlocks.EBONY_LOG.get().defaultBlockState(), 3);
				}
				YPos2 = YPos2 - 1;
			}
		}
		XPos2 = XPos - 1;
		YPos2 = HeightLocal;
		if (Math.random() <= 0.25) {
			for (int index6 = 0; index6 < (int) (Height / 4 + Mth.nextDouble(RandomSource.create(), 0, Height / 6)); index6++) {
				if ((world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).is(BlockTags.create(new ResourceLocation("minecraft:leave_blocks"))) || (world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(XPos2, YPos2, ZPos3), CemmModBlocks.EBONY_LOG.get().defaultBlockState(), 3);
				}
				YPos2 = YPos2 - 1;
			}
		}
		XPos2 = XPos;
		ZPos3 = ZPos + 1;
		YPos2 = HeightLocal;
		if (Math.random() <= 0.25) {
			for (int index7 = 0; index7 < (int) (Height / 4 + Mth.nextDouble(RandomSource.create(), 0, Height / 6)); index7++) {
				if ((world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).is(BlockTags.create(new ResourceLocation("minecraft:leave_blocks"))) || (world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(XPos2, YPos2, ZPos3), CemmModBlocks.EBONY_LOG.get().defaultBlockState(), 3);
				}
				YPos2 = YPos2 - 1;
			}
		}
		ZPos3 = ZPos - 1;
		YPos2 = HeightLocal;
		if (Math.random() <= 0.25) {
			for (int index8 = 0; index8 < (int) (Height / 4 + Mth.nextDouble(RandomSource.create(), 0, Height / 6)); index8++) {
				if ((world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).is(BlockTags.create(new ResourceLocation("minecraft:leave_blocks"))) || (world.getBlockState(BlockPos.containing(XPos2, YPos2, ZPos3))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(XPos2, YPos2, ZPos3), CemmModBlocks.EBONY_LOG.get().defaultBlockState(), 3);
				}
				YPos2 = YPos2 - 1;
			}
		}
		YPos2 = HeightLocal;
		ZPos3 = ZPos;
		XPos2 = XPos;
		EbonyTrunkPlacementProcedure.execute(world, XPos2, (HeightLocal - 1), ZPos3);
	}
}
