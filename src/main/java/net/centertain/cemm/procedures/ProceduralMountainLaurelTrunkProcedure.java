package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralMountainLaurelTrunkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		double PosX = 0;
		double PosY = 0;
		double PosZ = 0;
		double RAND2 = 0;
		double TempX = 0;
		double TempY = 0;
		double TempZ = 0;
		RAND = Mth.nextInt(RandomSource.create(), 3, 7);
		PosX = x;
		PosY = y;
		PosZ = z;
		world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.MOUNTAIN_LAUREL_STEM.get().defaultBlockState(), 3);
		for (int index0 = 0; index0 < (int) RAND; index0++) {
			PosY = PosY + 1;
			if ((world.getBlockState(BlockPos.containing(PosX, PosY, PosZ))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(PosX, PosY, PosZ))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
				world.setBlock(BlockPos.containing(PosX, PosY, PosZ), CemmModBlocks.MOUNTAIN_LAUREL_STEM.get().defaultBlockState(), 3);
			}
			if (Math.random() <= 0.5) {
				RAND2 = Mth.nextInt(RandomSource.create(), 1, 4);
				if (RAND2 == 1) {
					TempX = PosX - 1;
					TempY = PosY;
					TempZ = PosZ;
				} else if (RAND2 == 2) {
					TempX = PosX + 1;
					TempY = PosY;
					TempZ = PosZ;
				} else if (RAND2 == 3) {
					TempX = PosX;
					TempY = PosY;
					TempZ = PosZ - 1;
				} else {
					TempX = PosX;
					TempY = PosY;
					TempZ = PosZ + 1;
				}
				if (!(world.getBlockState(BlockPos.containing(TempX, TempY, TempZ))).is(BlockTags.create(new ResourceLocation("cemm:mountain_laurel_stem")))) {
					if ((world.getBlockState(BlockPos.containing(TempX, TempY, TempZ))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(TempX, TempY, TempZ))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
						if (RAND2 == 4) {
							world.setBlock(BlockPos.containing(PosX, PosY, PosZ), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.MOUNTAIN_LAUREL_STEM_T.get().defaultBlockState(), Direction.NORTH)), 3);
							world.setBlock(BlockPos.containing(TempX, TempY, TempZ), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.MOUNTAIN_LAUREL_STEM_L.get().defaultBlockState(), Direction.SOUTH)), 3);
						} else if (RAND2 == 3) {
							world.setBlock(BlockPos.containing(PosX, PosY, PosZ), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.MOUNTAIN_LAUREL_STEM_T.get().defaultBlockState(), Direction.SOUTH)), 3);
							world.setBlock(BlockPos.containing(TempX, TempY, TempZ), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.MOUNTAIN_LAUREL_STEM_L.get().defaultBlockState(), Direction.NORTH)), 3);
						} else if (RAND2 == 1) {
							world.setBlock(BlockPos.containing(PosX, PosY, PosZ), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.MOUNTAIN_LAUREL_STEM_T.get().defaultBlockState(), Direction.EAST)), 3);
							world.setBlock(BlockPos.containing(TempX, TempY, TempZ), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.MOUNTAIN_LAUREL_STEM_L.get().defaultBlockState(), Direction.WEST)), 3);
						} else if (RAND2 == 2) {
							world.setBlock(BlockPos.containing(PosX, PosY, PosZ), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.MOUNTAIN_LAUREL_STEM_T.get().defaultBlockState(), Direction.WEST)), 3);
							world.setBlock(BlockPos.containing(TempX, TempY, TempZ), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.MOUNTAIN_LAUREL_STEM_L.get().defaultBlockState(), Direction.EAST)), 3);
						}
					}
					RAND2 = Mth.nextInt(RandomSource.create(), 2, 4);
					for (int index1 = 0; index1 < (int) RAND2; index1++) {
						TempY = TempY + 1;
						if ((world.getBlockState(BlockPos.containing(TempX, TempY, TempZ))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(TempX, TempY, TempZ))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
							world.setBlock(BlockPos.containing(TempX, TempY, TempZ), CemmModBlocks.MOUNTAIN_LAUREL_STEM.get().defaultBlockState(), 3);
						}
						if (TempY >= y + RAND + (Math.random() - 0.5) * 2) {
							break;
						}
					}
				}
			}
		}
		MountainLaurelCrownProcedure.execute(world, PosX, (PosY + 1), PosZ);
	}
}
