package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.centertain.cemm.init.CemmModItems;
import net.centertain.cemm.init.CemmModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerRightClicksWithItemProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
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
		if ((world.getBlockState(
				new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX(),
						entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY(),
						entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ())))
				.getBlock() == CemmModBlocks.BLOOD.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GLASS_BOTTLE) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bottle.fill")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bottle.fill")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (!(new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity))) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(CemmModItems.BLOOD_BOTTLE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
						_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else {
					if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CemmModItems.BLOOD_BOTTLE.get())) : false)) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(CemmModItems.BLOOD_BOTTLE.get()).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.GLASS_BOTTLE) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bottle.fill")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bottle.fill")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (!(new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity))) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(CemmModItems.BLOOD_BOTTLE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).copy();
						_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else {
					if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CemmModItems.BLOOD_BOTTLE.get())) : false)) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(CemmModItems.BLOOD_BOTTLE.get()).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
			}
		}
	}
}
