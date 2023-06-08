package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralChlorowoodTrunkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double XPos = 0;
		double YPos = 0;
		double ZPos = 0;
		double REP = 0;
		double Rand = 0;
		double YPosCompare = 0;
		XPos = x;
		YPos = y;
		ZPos = z;
		YPosCompare = y;
		REP = Mth.nextDouble(RandomSource.create(), 3, 10);
		world.setBlock(new BlockPos(x, y, z), CemmModBlocks.CHLOROWOOD_LOG.get().defaultBlockState(), 3);
		for (int index0 = 0; index0 < (int) (REP); index0++) {
			if (Math.random() <= 0.75) {
				if ((world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES.get()
						|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_0.get()
						|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_1.get()
						|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_2.get()
						|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_3.get()
						|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_4.get()
						|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_5.get()
						|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_6.get()) {
					world.setBlock(new BlockPos(XPos, YPos + 1, ZPos), CemmModBlocks.CHLOROWOOD_LOG.get().defaultBlockState(), 3);
					YPos = YPos + 1;
				}
			} else {
				Rand = Math.random();
				if (Rand <= 0.25) {
					if ((world.getBlockState(new BlockPos(XPos + 1, YPos + 1, ZPos))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(XPos + 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES.get()
							|| (world.getBlockState(new BlockPos(XPos + 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_0.get()
							|| (world.getBlockState(new BlockPos(XPos + 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_1.get()
							|| (world.getBlockState(new BlockPos(XPos + 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_2.get()
							|| (world.getBlockState(new BlockPos(XPos + 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_3.get()
							|| (world.getBlockState(new BlockPos(XPos + 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_4.get()
							|| (world.getBlockState(new BlockPos(XPos + 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_5.get()
							|| (world.getBlockState(new BlockPos(XPos + 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_6.get()) {
						world.setBlock(new BlockPos(XPos + 1, YPos + 1, ZPos), CemmModBlocks.CHLOROWOOD_LOG.get().defaultBlockState(), 3);
						YPos = YPos + 1;
						XPos = XPos + 1;
					}
				} else if (Rand <= 0.5) {
					if ((world.getBlockState(new BlockPos(XPos - 1, YPos + 1, ZPos))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(XPos - 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES.get()
							|| (world.getBlockState(new BlockPos(XPos - 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_0.get()
							|| (world.getBlockState(new BlockPos(XPos - 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_1.get()
							|| (world.getBlockState(new BlockPos(XPos - 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_2.get()
							|| (world.getBlockState(new BlockPos(XPos - 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_3.get()
							|| (world.getBlockState(new BlockPos(XPos - 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_4.get()
							|| (world.getBlockState(new BlockPos(XPos - 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_5.get()
							|| (world.getBlockState(new BlockPos(XPos - 1, YPos + 1, ZPos))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_6.get()) {
						world.setBlock(new BlockPos(XPos - 1, YPos + 1, ZPos), CemmModBlocks.CHLOROWOOD_LOG.get().defaultBlockState(), 3);
						YPos = YPos + 1;
						XPos = XPos - 1;
					}
				} else if (Rand <= 0.75) {
					if ((world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos + 1))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos + 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos + 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_0.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos + 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_1.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos + 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_2.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos + 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_3.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos + 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_4.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos + 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_5.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos + 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_6.get()) {
						world.setBlock(new BlockPos(XPos, YPos + 1, ZPos + 1), CemmModBlocks.CHLOROWOOD_LOG.get().defaultBlockState(), 3);
						YPos = YPos + 1;
						ZPos = ZPos + 1;
					}
				} else {
					if ((world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos - 1))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos - 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos - 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_0.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos - 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_1.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos - 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_2.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos - 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_3.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos - 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_4.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos - 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_5.get()
							|| (world.getBlockState(new BlockPos(XPos, YPos + 1, ZPos - 1))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_6.get()) {
						world.setBlock(new BlockPos(XPos, YPos + 1, ZPos - 1), CemmModBlocks.CHLOROWOOD_LOG.get().defaultBlockState(), 3);
						YPos = YPos + 1;
						ZPos = ZPos - 1;
					}
				}
			}
			if (YPos - YPosCompare >= REP - 2) {
				PlaceChlorowoodCrownProcedure.execute(world, XPos, YPos, ZPos);
			}
		}
	}
}
