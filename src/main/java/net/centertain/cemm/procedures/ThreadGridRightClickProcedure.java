package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;

import net.centertain.cemm.init.CemmModItems;
import net.centertain.cemm.init.CemmModBlocks;

import javax.annotation.Nullable;

import java.util.Optional;
import java.util.Map;

@Mod.EventBusSubscriber
public class ThreadGridRightClickProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.THREAD_GRID.get()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CemmModItems.CUCUMBER_SEEDS.get()) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() > 1) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(CemmModItems.CUCUMBER_SEEDS.get());
								_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = CemmModBlocks.CUCUMBER_GRID_00.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof ServerLevel _level && _level.getServer() != null) {
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("cemm:harvesting_sound"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CemmModItems.GRAPE_SEEDS.get()) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() > 1) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(CemmModItems.GRAPE_SEEDS.get());
								_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = CemmModBlocks.GRAPE_GRID_00.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof ServerLevel _level && _level.getServer() != null) {
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("cemm:harvesting_sound"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CemmModItems.CUCUMBER_SEEDS.get()) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() > 1) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(CemmModItems.CUCUMBER_SEEDS.get());
								_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = CemmModBlocks.CUCUMBER_GRID_00.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof ServerLevel _level && _level.getServer() != null) {
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("cemm:harvesting_sound"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CemmModItems.GRAPE_SEEDS.get()) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() > 1) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(CemmModItems.GRAPE_SEEDS.get());
								_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = CemmModBlocks.GRAPE_GRID_00.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof ServerLevel _level && _level.getServer() != null) {
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("cemm:harvesting_sound"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:thread_grids")))) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CemmModBlocks.THREAD_GRID.get().asItem()) {
					if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() > 1) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(CemmModBlocks.THREAD_GRID.get());
									_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							} else {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(Blocks.AIR);
									_setstack.setCount(1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
						}
						world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.THREAD_GRID.get().defaultBlockState(), 3);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x + 0.5, y + 1.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound((x + 0.5), (y + 1.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.BLOCKS, 1, 1, false);
							}
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CemmModBlocks.THREAD_GRID.get().asItem()) {
					if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() > 1) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(CemmModBlocks.THREAD_GRID.get());
									_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							} else {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(Blocks.AIR);
									_setstack.setCount(1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
						}
						world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.THREAD_GRID.get().defaultBlockState(), 3);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x + 0.5, y + 1.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound((x + 0.5), (y + 1.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.BLOCKS, 1, 1, false);
							}
						}
					}
				}
			}
		}
	}
}
