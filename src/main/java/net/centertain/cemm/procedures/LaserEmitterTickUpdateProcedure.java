package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class LaserEmitterTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DetermineActiveStateProcedure.execute(world, x, y, z);
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "active")) == true) {
			LaserTickUpdateProcedure.execute(world, x, y, z);
			if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.UP) {
				if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
					world.setBlock(new BlockPos(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
					if ((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
						world.setBlock(new BlockPos(x, y + 2, z), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
						if ((world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
							world.setBlock(new BlockPos(x, y + 3, z), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
							if ((world.getBlockState(new BlockPos(x, y + 4, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 4, z))).getBlock() == (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
								world.setBlock(new BlockPos(x, y + 4, z), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
								if ((world.getBlockState(new BlockPos(x, y + 5, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 5, z))).getBlock() == (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
									world.setBlock(new BlockPos(x, y + 5, z), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
									if ((world.getBlockState(new BlockPos(x, y + 6, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 6, z))).getBlock() == (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
										world.setBlock(new BlockPos(x, y + 6, z), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
										if ((world.getBlockState(new BlockPos(x, y + 7, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 7, z))).getBlock() == (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
											world.setBlock(new BlockPos(x, y + 7, z), (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
											if ((world.getBlockState(new BlockPos(x, y + 8, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 8, z))).getBlock() == (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
												world.setBlock(new BlockPos(x, y + 8, z), (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
												if ((world.getBlockState(new BlockPos(x, y + 9, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 9, z))).getBlock() == (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
													world.setBlock(new BlockPos(x, y + 9, z), (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
													if ((world.getBlockState(new BlockPos(x, y + 10, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 10, z))).getBlock() == (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
														world.setBlock(new BlockPos(x, y + 10, z), (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
														if ((world.getBlockState(new BlockPos(x, y + 11, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 11, z))).getBlock() == (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
															world.setBlock(new BlockPos(x, y + 11, z), (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
															if ((world.getBlockState(new BlockPos(x, y + 12, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 12, z))).getBlock() == (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
																world.setBlock(new BlockPos(x, y + 12, z), (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
																if ((world.getBlockState(new BlockPos(x, y + 13, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 13, z))).getBlock() == (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
																	world.setBlock(new BlockPos(x, y + 13, z), (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
																	if ((world.getBlockState(new BlockPos(x, y + 14, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 14, z))).getBlock() == (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
																		world.setBlock(new BlockPos(x, y + 14, z), (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
																		if ((world.getBlockState(new BlockPos(x, y + 15, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 15, z))).getBlock() == (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
																			world.setBlock(new BlockPos(x, y + 15, z), (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
																			if ((world.getBlockState(new BlockPos(x, y + 16, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 16, z))).getBlock() == (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
																				world.setBlock(new BlockPos(x, y + 16, z), (new Object() {
																					public BlockState with(BlockState _bs, Direction newValue) {
																						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																							return _bs.setValue(_dp, newValue);
																						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																					}
																				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)), 3);
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.DOWN) {
				if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
					world.setBlock(new BlockPos(x, y - 1, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
					if ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
						world.setBlock(new BlockPos(x, y - 2, z), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
						if ((world.getBlockState(new BlockPos(x, y - 3, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 3, z))).getBlock() == (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
							world.setBlock(new BlockPos(x, y - 3, z), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
							if ((world.getBlockState(new BlockPos(x, y - 4, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 4, z))).getBlock() == (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
								world.setBlock(new BlockPos(x, y - 4, z), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
								if ((world.getBlockState(new BlockPos(x, y - 5, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 5, z))).getBlock() == (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
									world.setBlock(new BlockPos(x, y - 5, z), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
									if ((world.getBlockState(new BlockPos(x, y - 6, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 6, z))).getBlock() == (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
										world.setBlock(new BlockPos(x, y - 6, z), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
										if ((world.getBlockState(new BlockPos(x, y - 7, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 7, z))).getBlock() == (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
											world.setBlock(new BlockPos(x, y - 7, z), (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
											if ((world.getBlockState(new BlockPos(x, y - 8, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 8, z))).getBlock() == (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
												world.setBlock(new BlockPos(x, y - 8, z), (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
												if ((world.getBlockState(new BlockPos(x, y - 9, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 9, z))).getBlock() == (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
													world.setBlock(new BlockPos(x, y - 9, z), (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
													if ((world.getBlockState(new BlockPos(x, y - 10, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 10, z))).getBlock() == (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
														world.setBlock(new BlockPos(x, y - 10, z), (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
														if ((world.getBlockState(new BlockPos(x, y - 11, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 11, z))).getBlock() == (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
															world.setBlock(new BlockPos(x, y - 11, z), (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
															if ((world.getBlockState(new BlockPos(x, y - 12, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 12, z))).getBlock() == (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
																world.setBlock(new BlockPos(x, y - 12, z), (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
																if ((world.getBlockState(new BlockPos(x, y - 13, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 13, z))).getBlock() == (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
																	world.setBlock(new BlockPos(x, y - 13, z), (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
																	if ((world.getBlockState(new BlockPos(x, y - 14, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 14, z))).getBlock() == (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
																		world.setBlock(new BlockPos(x, y - 14, z), (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
																		if ((world.getBlockState(new BlockPos(x, y - 15, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 15, z))).getBlock() == (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
																			world.setBlock(new BlockPos(x, y - 15, z), (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
																			if ((world.getBlockState(new BlockPos(x, y - 16, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 16, z))).getBlock() == (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
																				world.setBlock(new BlockPos(x, y - 16, z), (new Object() {
																					public BlockState with(BlockState _bs, Direction newValue) {
																						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																							return _bs.setValue(_dp, newValue);
																						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																					}
																				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)), 3);
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.NORTH) {
				if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
					world.setBlock(new BlockPos(x, y, z - 1), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
					if ((world.getBlockState(new BlockPos(x, y, z - 2))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 2))).getBlock() == (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
						world.setBlock(new BlockPos(x, y, z - 2), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
						if ((world.getBlockState(new BlockPos(x, y, z - 3))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 3))).getBlock() == (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
							world.setBlock(new BlockPos(x, y, z - 3), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
							if ((world.getBlockState(new BlockPos(x, y, z - 4))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 4))).getBlock() == (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
								world.setBlock(new BlockPos(x, y, z - 4), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
								if ((world.getBlockState(new BlockPos(x, y, z - 5))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 5))).getBlock() == (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
									world.setBlock(new BlockPos(x, y, z - 5), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
									if ((world.getBlockState(new BlockPos(x, y, z - 6))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 6))).getBlock() == (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
										world.setBlock(new BlockPos(x, y, z - 6), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
										if ((world.getBlockState(new BlockPos(x, y, z - 7))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 7))).getBlock() == (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
											world.setBlock(new BlockPos(x, y, z - 7), (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
											if ((world.getBlockState(new BlockPos(x, y, z - 8))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 8))).getBlock() == (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
												world.setBlock(new BlockPos(x, y, z - 8), (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
												if ((world.getBlockState(new BlockPos(x, y, z - 9))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 9))).getBlock() == (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
													world.setBlock(new BlockPos(x, y, z - 9), (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
													if ((world.getBlockState(new BlockPos(x, y, z - 10))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 10))).getBlock() == (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
														world.setBlock(new BlockPos(x, y, z - 10), (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
														if ((world.getBlockState(new BlockPos(x, y, z - 11))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 11))).getBlock() == (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
															world.setBlock(new BlockPos(x, y, z - 11), (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
															if ((world.getBlockState(new BlockPos(x, y, z - 12))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 12))).getBlock() == (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
																world.setBlock(new BlockPos(x, y, z - 12), (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
																if ((world.getBlockState(new BlockPos(x, y, z - 13))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 13))).getBlock() == (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
																	world.setBlock(new BlockPos(x, y, z - 13), (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
																	if ((world.getBlockState(new BlockPos(x, y, z - 14))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 14))).getBlock() == (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
																		world.setBlock(new BlockPos(x, y, z - 14), (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
																		if ((world.getBlockState(new BlockPos(x, y, z - 15))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 15))).getBlock() == (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
																			world.setBlock(new BlockPos(x, y, z - 15), (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
																			if ((world.getBlockState(new BlockPos(x, y, z - 16))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 16))).getBlock() == (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
																				world.setBlock(new BlockPos(x, y, z - 16), (new Object() {
																					public BlockState with(BlockState _bs, Direction newValue) {
																						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																							return _bs.setValue(_dp, newValue);
																						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																					}
																				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)), 3);
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.SOUTH) {
				if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
					world.setBlock(new BlockPos(x, y, z + 1), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
					if ((world.getBlockState(new BlockPos(x, y, z + 2))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 2))).getBlock() == (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
						world.setBlock(new BlockPos(x, y, z + 2), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
						if ((world.getBlockState(new BlockPos(x, y, z + 3))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 3))).getBlock() == (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
							world.setBlock(new BlockPos(x, y, z + 3), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
							if ((world.getBlockState(new BlockPos(x, y, z + 4))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 4))).getBlock() == (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
								world.setBlock(new BlockPos(x, y, z + 4), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
								if ((world.getBlockState(new BlockPos(x, y, z + 5))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 5))).getBlock() == (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
									world.setBlock(new BlockPos(x, y, z + 5), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
									if ((world.getBlockState(new BlockPos(x, y, z + 6))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 6))).getBlock() == (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
										world.setBlock(new BlockPos(x, y, z + 6), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
										if ((world.getBlockState(new BlockPos(x, y, z + 7))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 7))).getBlock() == (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
											world.setBlock(new BlockPos(x, y, z + 7), (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
											if ((world.getBlockState(new BlockPos(x, y, z + 8))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 8))).getBlock() == (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
												world.setBlock(new BlockPos(x, y, z + 8), (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
												if ((world.getBlockState(new BlockPos(x, y, z + 9))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 9))).getBlock() == (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
													world.setBlock(new BlockPos(x, y, z + 9), (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
													if ((world.getBlockState(new BlockPos(x, y, z + 10))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 10))).getBlock() == (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
														world.setBlock(new BlockPos(x, y, z + 10), (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
														if ((world.getBlockState(new BlockPos(x, y, z + 11))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 11))).getBlock() == (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
															world.setBlock(new BlockPos(x, y, z + 11), (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
															if ((world.getBlockState(new BlockPos(x, y, z + 12))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 12))).getBlock() == (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
																world.setBlock(new BlockPos(x, y, z + 12), (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
																if ((world.getBlockState(new BlockPos(x, y, z + 13))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 13))).getBlock() == (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
																	world.setBlock(new BlockPos(x, y, z + 13), (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
																	if ((world.getBlockState(new BlockPos(x, y, z + 14))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 14))).getBlock() == (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
																		world.setBlock(new BlockPos(x, y, z + 14), (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
																		if ((world.getBlockState(new BlockPos(x, y, z + 15))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 15))).getBlock() == (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
																			world.setBlock(new BlockPos(x, y, z + 15), (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
																			if ((world.getBlockState(new BlockPos(x, y, z + 16))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 16))).getBlock() == (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
																				world.setBlock(new BlockPos(x, y, z + 16), (new Object() {
																					public BlockState with(BlockState _bs, Direction newValue) {
																						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																							return _bs.setValue(_dp, newValue);
																						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																					}
																				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.WEST) {
				if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
					world.setBlock(new BlockPos(x - 1, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
					if ((world.getBlockState(new BlockPos(x - 2, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 2, y, z))).getBlock() == (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
						world.setBlock(new BlockPos(x - 2, y, z), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
						if ((world.getBlockState(new BlockPos(x - 3, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 3, y, z))).getBlock() == (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
							world.setBlock(new BlockPos(x - 3, y, z), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
							if ((world.getBlockState(new BlockPos(x - 4, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 4, y, z))).getBlock() == (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
								world.setBlock(new BlockPos(x - 4, y, z), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
								if ((world.getBlockState(new BlockPos(x - 5, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 5, y, z))).getBlock() == (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
									world.setBlock(new BlockPos(x - 5, y, z), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
									if ((world.getBlockState(new BlockPos(x - 6, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 6, y, z))).getBlock() == (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
										world.setBlock(new BlockPos(x - 6, y, z), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
										if ((world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
											world.setBlock(new BlockPos(x - 7, y, z), (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
											if ((world.getBlockState(new BlockPos(x - 8, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 8, y, z))).getBlock() == (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
												world.setBlock(new BlockPos(x - 8, y, z), (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
												if ((world.getBlockState(new BlockPos(x - 9, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 9, y, z))).getBlock() == (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
													world.setBlock(new BlockPos(x - 9, y, z), (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
													if ((world.getBlockState(new BlockPos(x - 10, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 10, y, z))).getBlock() == (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
														world.setBlock(new BlockPos(x - 10, y, z), (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
														if ((world.getBlockState(new BlockPos(x - 11, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 11, y, z))).getBlock() == (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
															world.setBlock(new BlockPos(x - 11, y, z), (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
															if ((world.getBlockState(new BlockPos(x - 12, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 12, y, z))).getBlock() == (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
																world.setBlock(new BlockPos(x - 12, y, z), (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
																if ((world.getBlockState(new BlockPos(x - 13, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 13, y, z))).getBlock() == (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
																	world.setBlock(new BlockPos(x - 13, y, z), (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
																	if ((world.getBlockState(new BlockPos(x - 14, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 14, y, z))).getBlock() == (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
																		world.setBlock(new BlockPos(x - 14, y, z), (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
																		if ((world.getBlockState(new BlockPos(x - 15, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 15, y, z))).getBlock() == (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
																			world.setBlock(new BlockPos(x - 15, y, z), (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
																			if ((world.getBlockState(new BlockPos(x - 16, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 16, y, z))).getBlock() == (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
																				world.setBlock(new BlockPos(x - 16, y, z), (new Object() {
																					public BlockState with(BlockState _bs, Direction newValue) {
																						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																							return _bs.setValue(_dp, newValue);
																						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																					}
																				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)), 3);
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.EAST) {
				if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
					world.setBlock(new BlockPos(x + 1, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
					if ((world.getBlockState(new BlockPos(x + 2, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 2, y, z))).getBlock() == (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
						world.setBlock(new BlockPos(x + 2, y, z), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
						if ((world.getBlockState(new BlockPos(x + 3, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 3, y, z))).getBlock() == (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
							world.setBlock(new BlockPos(x + 3, y, z), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
							if ((world.getBlockState(new BlockPos(x + 4, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 4, y, z))).getBlock() == (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
								world.setBlock(new BlockPos(x + 4, y, z), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
								if ((world.getBlockState(new BlockPos(x + 5, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 5, y, z))).getBlock() == (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
									world.setBlock(new BlockPos(x + 5, y, z), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
									if ((world.getBlockState(new BlockPos(x + 6, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 6, y, z))).getBlock() == (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
										world.setBlock(new BlockPos(x + 6, y, z), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
										if ((world.getBlockState(new BlockPos(x + 7, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 7, y, z))).getBlock() == (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
											world.setBlock(new BlockPos(x + 7, y, z), (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
											if ((world.getBlockState(new BlockPos(x + 8, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 8, y, z))).getBlock() == (new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
												world.setBlock(new BlockPos(x + 8, y, z), (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
												if ((world.getBlockState(new BlockPos(x + 9, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 9, y, z))).getBlock() == (new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
													world.setBlock(new BlockPos(x + 9, y, z), (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
													if ((world.getBlockState(new BlockPos(x + 10, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 10, y, z))).getBlock() == (new Object() {
														public BlockState with(BlockState _bs, Direction newValue) {
															Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																return _bs.setValue(_dp, newValue);
															_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
															return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
														}
													}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
														world.setBlock(new BlockPos(x + 10, y, z), (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
														if ((world.getBlockState(new BlockPos(x + 11, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 11, y, z))).getBlock() == (new Object() {
															public BlockState with(BlockState _bs, Direction newValue) {
																Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																	return _bs.setValue(_dp, newValue);
																_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
															}
														}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
															world.setBlock(new BlockPos(x + 11, y, z), (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
															if ((world.getBlockState(new BlockPos(x + 12, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 12, y, z))).getBlock() == (new Object() {
																public BlockState with(BlockState _bs, Direction newValue) {
																	Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																	if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																		return _bs.setValue(_dp, newValue);
																	_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																	return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																}
															}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
																world.setBlock(new BlockPos(x + 12, y, z), (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
																if ((world.getBlockState(new BlockPos(x + 13, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 13, y, z))).getBlock() == (new Object() {
																	public BlockState with(BlockState _bs, Direction newValue) {
																		Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																		if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																			return _bs.setValue(_dp, newValue);
																		_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																		return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																	}
																}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
																	world.setBlock(new BlockPos(x + 13, y, z), (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
																	if ((world.getBlockState(new BlockPos(x + 14, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 14, y, z))).getBlock() == (new Object() {
																		public BlockState with(BlockState _bs, Direction newValue) {
																			Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																			if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																				return _bs.setValue(_dp, newValue);
																			_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																			return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																		}
																	}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
																		world.setBlock(new BlockPos(x + 14, y, z), (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
																		if ((world.getBlockState(new BlockPos(x + 15, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 15, y, z))).getBlock() == (new Object() {
																			public BlockState with(BlockState _bs, Direction newValue) {
																				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																					return _bs.setValue(_dp, newValue);
																				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																			}
																		}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
																			world.setBlock(new BlockPos(x + 15, y, z), (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
																			if ((world.getBlockState(new BlockPos(x + 16, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 16, y, z))).getBlock() == (new Object() {
																				public BlockState with(BlockState _bs, Direction newValue) {
																					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																						return _bs.setValue(_dp, newValue);
																					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																				}
																			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
																				world.setBlock(new BlockPos(x + 16, y, z), (new Object() {
																					public BlockState with(BlockState _bs, Direction newValue) {
																						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
																						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
																							return _bs.setValue(_dp, newValue);
																						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
																						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
																					}
																				}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)), 3);
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
			if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.UP && (new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y + 1, z))) == Direction.UP && (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.UP)).getBlock()) {
				world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.DOWN && (new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y - 1, z))) == Direction.DOWN && (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.DOWN)).getBlock()) {
				world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.NORTH && (new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z - 1))) == Direction.NORTH && (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.NORTH)).getBlock()) {
				world.setBlock(new BlockPos(x, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.SOUTH && (new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z + 1))) == Direction.SOUTH && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.SOUTH)).getBlock()) {
				world.setBlock(new BlockPos(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.WEST && (new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x - 1, y, z))) == Direction.WEST && (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.WEST)).getBlock()) {
				world.setBlock(new BlockPos(x - 1, y, z), Blocks.AIR.defaultBlockState(), 3);
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.EAST && (new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x + 1, y, z))) == Direction.EAST && (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == (new Object() {
				public BlockState with(BlockState _bs, Direction newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
						return _bs.setValue(_dp, newValue);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
				}
			}.with(CemmModBlocks.LASER.get().defaultBlockState(), Direction.EAST)).getBlock()) {
				world.setBlock(new BlockPos(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("miningProgress", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
