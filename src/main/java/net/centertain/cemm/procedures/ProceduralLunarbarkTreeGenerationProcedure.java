package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralLunarbarkTreeGenerationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double XMain = 0;
		double YMain = 0;
		double ZMain = 0;
		double REP = 0;
		double MainRand = 0;
		double XBranch = 0;
		double YBranch = 0;
		double ZBranch = 0;
		double BranchREP = 0;
		double BranchRand = 0;
		XMain = x;
		YMain = y;
		ZMain = z;
		REP = Math.round(Math.random() * 15 + 5);
		world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), 3);
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.NYLINE.get()) {
			world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.META_CARBONITE.get().defaultBlockState(), 3);
		}
		for (int index0 = 0; index0 < (int) REP; index0++) {
			if (Math.random() > 0.3) {
				if ((world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
						|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
						|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
						|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
						|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
						|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
						|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
						|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
						|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
					world.setBlock(BlockPos.containing(XMain, YMain + 1, ZMain), CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), 3);
					YMain = YMain + 1;
				}
			} else {
				MainRand = Math.random();
				if (MainRand >= 0 && MainRand < 0.25) {
					if ((world.getBlockState(BlockPos.containing(XMain + 1, YMain + 1, ZMain))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(XMain + 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
							|| (world.getBlockState(BlockPos.containing(XMain + 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
							|| (world.getBlockState(BlockPos.containing(XMain + 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
							|| (world.getBlockState(BlockPos.containing(XMain + 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
							|| (world.getBlockState(BlockPos.containing(XMain + 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
							|| (world.getBlockState(BlockPos.containing(XMain + 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
							|| (world.getBlockState(BlockPos.containing(XMain + 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
							|| (world.getBlockState(BlockPos.containing(XMain + 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
							|| (world.getBlockState(BlockPos.containing(XMain + 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
						world.setBlock(BlockPos.containing(XMain + 1, YMain + 1, ZMain), CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), 3);
						XMain = XMain + 1;
						YMain = YMain + 1;
					}
				} else if (MainRand >= 0.25 && MainRand < 0.5) {
					if ((world.getBlockState(BlockPos.containing(XMain - 1, YMain + 1, ZMain))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(XMain - 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
							|| (world.getBlockState(BlockPos.containing(XMain - 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
							|| (world.getBlockState(BlockPos.containing(XMain - 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
							|| (world.getBlockState(BlockPos.containing(XMain - 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
							|| (world.getBlockState(BlockPos.containing(XMain - 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
							|| (world.getBlockState(BlockPos.containing(XMain - 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
							|| (world.getBlockState(BlockPos.containing(XMain - 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
							|| (world.getBlockState(BlockPos.containing(XMain - 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
							|| (world.getBlockState(BlockPos.containing(XMain - 1, YMain + 1, ZMain))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
						world.setBlock(BlockPos.containing(XMain - 1, YMain + 1, ZMain), CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), 3);
						XMain = XMain - 1;
						YMain = YMain + 1;
					}
				} else if (MainRand >= 0.5 && MainRand < 0.75) {
					if ((world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain + 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain + 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
						world.setBlock(BlockPos.containing(XMain, YMain + 1, ZMain + 1), CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), 3);
						YMain = YMain + 1;
						ZMain = ZMain + 1;
					}
				} else if (MainRand >= 0.75 && MainRand < 1) {
					if ((world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain - 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain - 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
							|| (world.getBlockState(BlockPos.containing(XMain, YMain + 1, ZMain - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
						world.setBlock(BlockPos.containing(XMain, YMain + 1, ZMain - 1), CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), 3);
						YMain = YMain + 1;
						ZMain = ZMain - 1;
					}
				}
				if (Math.random() <= 0.1) {
					if (Math.random() <= 0.5) {
						CrownShape1Procedure.execute(world, XMain, YMain, ZMain);
					} else {
						CrownShape3Procedure.execute(world, XMain, YMain, ZMain);
					}
				}
			}
			BranchRand = Math.random();
			if (BranchRand >= 0.75) {
				BranchRand = Math.random();
				if (BranchRand >= 0 && BranchRand < 0.25) {
					XBranch = XMain;
					YBranch = YMain;
					ZBranch = ZMain;
					BranchREP = Math.round(Math.random() * 4 + 3);
					for (int index1 = 0; index1 < (int) BranchREP; index1++) {
						BranchRand = Math.random();
						if (BranchRand >= 0 && BranchRand < 0.25) {
							if ((world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch + 1, YBranch, ZBranch), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.WEST)), 3);
								XBranch = XBranch + 1;
							}
						} else if (BranchRand >= 0.25 && BranchRand < 0.5) {
							if ((world.getBlockState(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch + 1, YBranch + 1, ZBranch), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.WEST)), 3);
								XBranch = XBranch + 1;
								YBranch = YBranch + 1;
							}
						} else if (BranchRand >= 0.5 && BranchRand < 0.75) {
							if ((world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.WEST)), 3);
								XBranch = XBranch + 1;
								ZBranch = ZBranch + 1;
							}
						} else if (BranchRand >= 0.75 && BranchRand < 1) {
							if ((world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.WEST)), 3);
								XBranch = XBranch + 1;
								ZBranch = ZBranch - 1;
							}
						}
						if (Math.random() <= 0.2) {
							CrownShape2Procedure.execute(world, XBranch, YBranch, ZBranch);
						}
					}
				} else if (BranchRand >= 0.25 && BranchRand < 0.5) {
					XBranch = XMain;
					YBranch = YMain;
					ZBranch = ZMain;
					BranchREP = Math.round(Math.random() * 4 + 3);
					for (int index2 = 0; index2 < (int) BranchREP; index2++) {
						BranchRand = Math.random();
						if (BranchRand >= 0 && BranchRand < 0.25) {
							if ((world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch - 1, YBranch, ZBranch), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.WEST)), 3);
								XBranch = XBranch - 1;
							}
						} else if (BranchRand >= 0.25 && BranchRand < 0.5) {
							if ((world.getBlockState(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch - 1, YBranch + 1, ZBranch), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.WEST)), 3);
								XBranch = XBranch - 1;
								YBranch = YBranch + 1;
							}
						} else if (BranchRand >= 0.5 && BranchRand < 0.75) {
							if ((world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.WEST)), 3);
								XBranch = XBranch - 1;
								ZBranch = ZBranch + 1;
							}
						} else if (BranchRand >= 0.75 && BranchRand < 1) {
							if ((world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.WEST)), 3);
								XBranch = XBranch - 1;
								ZBranch = ZBranch - 1;
							}
						}
						if (Math.random() <= 0.2) {
							CrownShape2Procedure.execute(world, XBranch, YBranch, ZBranch);
						}
					}
				} else if (BranchRand >= 0.5 && BranchRand < 0.75) {
					XBranch = XMain;
					YBranch = YMain;
					ZBranch = ZMain;
					BranchREP = Math.round(Math.random() * 4 + 3);
					for (int index3 = 0; index3 < (int) BranchREP; index3++) {
						BranchRand = Math.random();
						if (BranchRand >= 0 && BranchRand < 0.25) {
							if ((world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch + 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch, YBranch, ZBranch + 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.NORTH)), 3);
								ZBranch = ZBranch + 1;
							}
						} else if (BranchRand >= 0.25 && BranchRand < 0.5) {
							if ((world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch, YBranch + 1, ZBranch + 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.NORTH)), 3);
								ZBranch = ZBranch + 1;
								YBranch = YBranch + 1;
							}
						} else if (BranchRand >= 0.5 && BranchRand < 0.75) {
							if ((world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch + 1, YBranch, ZBranch + 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.NORTH)), 3);
								ZBranch = ZBranch + 1;
								XBranch = XBranch + 1;
							}
						} else if (BranchRand >= 0.75 && BranchRand < 1) {
							if ((world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch - 1, YBranch, ZBranch + 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.NORTH)), 3);
								ZBranch = ZBranch + 1;
								XBranch = XBranch - 1;
							}
						}
						if (Math.random() <= 0.2) {
							CrownShape2Procedure.execute(world, XBranch, YBranch, ZBranch);
						}
					}
				} else if (BranchRand >= 0.75 && BranchRand < 1) {
					XBranch = XMain;
					YBranch = YMain;
					ZBranch = ZMain;
					BranchREP = Math.round(Math.random() * 4 + 3);
					for (int index4 = 0; index4 < (int) BranchREP; index4++) {
						BranchRand = Math.random();
						if (BranchRand >= 0 && BranchRand < 0.25) {
							if ((world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch - 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch, YBranch, ZBranch - 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.NORTH)), 3);
								ZBranch = ZBranch - 1;
							}
						} else if (BranchRand >= 0.25 && BranchRand < 0.5) {
							if ((world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch, YBranch + 1, ZBranch - 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.NORTH)), 3);
								ZBranch = ZBranch - 1;
								YBranch = YBranch + 1;
							}
						} else if (BranchRand >= 0.5 && BranchRand < 0.75) {
							if ((world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch + 1, YBranch, ZBranch - 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.NORTH)), 3);
								ZBranch = ZBranch - 1;
								XBranch = XBranch + 1;
							}
						} else if (BranchRand >= 0.75 && BranchRand < 1) {
							if ((world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.LUNARBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_1.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_2.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_3.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_4.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_5.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_6.get()
									|| (world.getBlockState(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1))).getBlock() == CemmModBlocks.NIGHTBARK_LEAVES_7.get()) {
								world.setBlock(BlockPos.containing(XBranch - 1, YBranch, ZBranch - 1), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LUNARBARK_STEM.get().defaultBlockState(), Direction.NORTH)), 3);
								ZBranch = ZBranch - 1;
								XBranch = XBranch - 1;
							}
						}
						if (Math.random() <= 0.2) {
							CrownShape2Procedure.execute(world, XBranch, YBranch, ZBranch);
						}
					}
				}
			}
		}
	}
}
