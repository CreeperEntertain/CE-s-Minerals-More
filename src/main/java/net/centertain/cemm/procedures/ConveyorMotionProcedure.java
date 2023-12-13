package net.centertain.cemm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;
import net.centertain.cemm.CemmMod;

public class ConveyorMotionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_BOTTOM.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_TOP.get()) {
			if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (-0.2)));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getZ()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getZ() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entity.getX()), (entity.getY() + 0.5), z);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.5), z, _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (-0.2)));
							}
						});
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), 0.2));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getZ()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getZ() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entity.getX()), (entity.getY() + 0.5), (z + 1));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.5), (z + 1), _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), 0.2));
							}
						});
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3((-0.2), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getX()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getX() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo(x, (entity.getY() + 0.5), (entity.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(x, (entity.getY() + 0.5), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3((-0.2), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
							}
						});
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3(0.2, (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getX()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getX() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo((x + 1), (entity.getY() + 0.5), (entity.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((x + 1), (entity.getY() + 0.5), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3(0.2, (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
							}
						});
					}
				});
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_IMPROVED_BOTTOM.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_IMPROVED_TOP.get()) {
			if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (-0.4)));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getZ()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getZ() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entity.getX()), (entity.getY() + 0.5), z);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.5), z, _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (-0.4)));
							}
						});
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), 0.4));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getZ()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getZ() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entity.getX()), (entity.getY() + 0.5), (z + 1));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.5), (z + 1), _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), 0.4));
							}
						});
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3((-0.4), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getX()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getX() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo(x, (entity.getY() + 0.5), (entity.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(x, (entity.getY() + 0.5), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3((-0.4), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
							}
						});
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3(0.4, (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getX()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getX() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo((x + 1), (entity.getY() + 0.5), (entity.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((x + 1), (entity.getY() + 0.5), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3(0.4, (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
							}
						});
					}
				});
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_ADVANCED_BOTTOM.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.CONVEYOR_ADVANCED_TOP.get()) {
			if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (-0.8)));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getZ()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getZ() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entity.getX()), (entity.getY() + 0.5), z);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.5), z, _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (-0.8)));
							}
						});
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), 0.8));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getZ()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getZ() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo((entity.getX()), (entity.getY() + 0.5), (z + 1));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.5), (z + 1), _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), 0.8));
							}
						});
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3((-0.8), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getX()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getX() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo(x, (entity.getY() + 0.5), (entity.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(x, (entity.getY() + 0.5), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3((-0.8), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
							}
						});
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
				CemmMod.queueServerWork(1, () -> {
					entity.setDeltaMovement(new Vec3(0.8, (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
					if (entity instanceof ItemEntity) {
						entity.getPersistentData().putDouble("tickPosDistance", (entity.getX()));
						CemmMod.queueServerWork(1, () -> {
							if (entity.getX() == entity.getPersistentData().getDouble("tickPosDistance")) {
								{
									Entity _ent = entity;
									_ent.teleportTo((x + 1), (entity.getY() + 0.5), (entity.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((x + 1), (entity.getY() + 0.5), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3(0.8, (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
							}
						});
					}
				});
			}
		}
	}
}
