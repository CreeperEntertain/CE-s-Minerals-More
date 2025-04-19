package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralAmberSentinelTrunkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double PosX = 0;
		double PosY = 0;
		double PosZ = 0;
		double RAND = 0;
		double TempX = 0;
		double TempY = 0;
		double TempZ = 0;
		double HighestY = 0;
		PosX = x;
		PosY = y;
		PosZ = z;
		RAND = Mth.nextInt(RandomSource.create(), 5, 10);
		world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.AMBER_SENTINEL_LOG.get().defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
		for (int index0 = 0; index0 < (int) RAND; index0++) {
			PosY = PosY + 1;
			if ((world.getBlockState(BlockPos.containing(PosX, PosY, PosZ))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(PosX, PosY, PosZ))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
				world.setBlock(BlockPos.containing(PosX, PosY, PosZ), CemmModBlocks.AMBER_SENTINEL_LOG.get().defaultBlockState(), 3);
			} else {
				break;
			}
		}
		HighestY = PosY;
		for (int index1 = 0; index1 < 2; index1++) {
			if (Math.random() <= 0.5) {
				TempX = PosX;
				TempY = PosY;
				TempZ = PosZ;
				RAND = Mth.nextInt(RandomSource.create(), 1, 4);
				if (RAND == 1) {
					TempX = TempX - 1;
				} else if (RAND == 2) {
					TempX = TempX + 1;
				} else if (RAND == 3) {
					TempZ = TempZ - 1;
				} else {
					TempZ = TempZ + 1;
				}
				TempY = TempY - Mth.nextInt(RandomSource.create(), 0, 2);
				if ((world.getBlockState(BlockPos.containing(TempX, TempY, TempZ))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(TempX, TempY, TempZ))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
					world.setBlock(BlockPos.containing(TempX, TempY, TempZ), CemmModBlocks.AMBER_SENTINEL_LOG.get().defaultBlockState(), 3);
				}
				for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 2, 4); index2++) {
					TempY = TempY + 1;
					if ((world.getBlockState(BlockPos.containing(TempX, TempY, TempZ))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(TempX, TempY, TempZ))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
						world.setBlock(BlockPos.containing(TempX, TempY, TempZ), CemmModBlocks.AMBER_SENTINEL_LOG.get().defaultBlockState(), 3);
					}
				}
				if (TempY > HighestY) {
					HighestY = TempY;
				}
			}
		}
		for (int index3 = 0; index3 < 3; index3++) {
			PosX = x;
			PosY = y;
			PosZ = z;
			RAND = Mth.nextInt(RandomSource.create(), 1, 4);
			if (RAND == 1) {
				PosX = PosX - 1;
			} else if (RAND == 2) {
				PosX = PosX + 1;
			} else if (RAND == 3) {
				PosZ = PosZ - 1;
			} else {
				PosZ = PosZ + 1;
			}
			RAND = 1;
			if (Math.random() <= 0.35) {
				RAND = 2;
			}
			for (int index4 = 0; index4 < (int) RAND; index4++) {
				if ((world.getBlockState(BlockPos.containing(PosX, PosY, PosZ))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(PosX, PosY, PosZ))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
					world.setBlock(BlockPos.containing(PosX, PosY, PosZ), CemmModBlocks.AMBER_SENTINEL_LOG.get().defaultBlockState(), 3);
				}
				PosY = PosY + 1;
			}
		}
		HighestY = HighestY - 0;
		AmberSentinelCrownProcedure.execute(world, x, HighestY, z);
	}
}
