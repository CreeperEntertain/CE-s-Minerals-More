package net.centertain.cemm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;

import net.centertain.cemm.init.CemmModItems;

import java.util.Optional;

public class EnchantedCoinCallPositionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("xTpPos") != 0 && itemstack.getOrCreateTag().getDouble("yTpPos") != 0 && itemstack.getOrCreateTag().getDouble("zTpPos") != 0) {
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CemmModItems.ENCHANTED_COIN.get())
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Only use in off-hand to duplicate location."), false);
			} else if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CemmModItems.ENCHANTED_COIN.get())
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
				if ((itemstack.getOrCreateTag().getString("TpDim")).equals("" + entity.level().dimension())) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("tp @p " + new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("xTpPos")) + " " + new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("yTpPos")) + " "
										+ new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("zTpPos"))));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Teleport!"), false);
					if (world instanceof ServerLevel _level && _level.getServer() != null) {
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("cemm:teleport_sound"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(),
									new CommandSourceStack(CommandSource.NULL, new Vec3((itemstack.getOrCreateTag().getDouble("xTpPos")), (itemstack.getOrCreateTag().getDouble("yTpPos")), (itemstack.getOrCreateTag().getDouble("zTpPos"))), Vec2.ZERO,
											_level, 4, "", Component.literal(""), _level.getServer(), null));
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Totem is set to different dimension."), false);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Only use in main hand to teleport."), false);
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("xTpPos") != 0
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("yTpPos") != 0
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("zTpPos") != 0) {
				itemstack.getOrCreateTag().putDouble("xTpPos", ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("xTpPos")));
				itemstack.getOrCreateTag().putDouble("yTpPos", ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("yTpPos")));
				itemstack.getOrCreateTag().putDouble("zTpPos", ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("zTpPos")));
				itemstack.getOrCreateTag().putString("TpDim", ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("TpDim")));
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Teleport location duplicated (" + new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("xTpPos")) + " "
							+ new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("yTpPos")) + " " + new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("zTpPos")) + ")")), false);
				itemstack.setHoverName(Component.literal("Totem of Teleportation"));
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("cemm:enchanting_sound"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			} else {
				itemstack.getOrCreateTag().putDouble("xTpPos", x);
				itemstack.getOrCreateTag().putDouble("yTpPos", y);
				itemstack.getOrCreateTag().putDouble("zTpPos", z);
				itemstack.getOrCreateTag().putString("TpDim", ("" + entity.level().dimension()));
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Teleport location set to " + new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("xTpPos")) + " "
							+ new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("yTpPos")) + " " + new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("zTpPos")))), false);
				itemstack.setHoverName(Component.literal("Totem of Teleportation"));
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("cemm:enchanting_sound"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
		}
	}
}
