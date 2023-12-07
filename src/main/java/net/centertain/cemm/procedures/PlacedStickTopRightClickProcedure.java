package net.centertain.cemm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
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

@Mod.EventBusSubscriber
public class PlacedStickTopRightClickProcedure {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.PLACED_STICK_TOP.get()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CemmModItems.TOMATO_SEEDS.get()) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() > 1) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(CemmModItems.TOMATO_SEEDS.get());
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
					world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.TOMATO_00_BOTTOM.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.TOMATO_00_TOP.get().defaultBlockState(), 3);
					if (world instanceof ServerLevel _level && _level.getServer() != null) {
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("cemm:harvesting_sound"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CemmModItems.TOMATO_SEEDS.get()) {
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() > 1) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(CemmModItems.TOMATO_SEEDS.get());
								_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() - 1));
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
					world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.TOMATO_00_BOTTOM.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.TOMATO_00_TOP.get().defaultBlockState(), 3);
					if (world instanceof ServerLevel _level && _level.getServer() != null) {
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("cemm:harvesting_sound"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
					}
				}
			}
		}
	}
}
