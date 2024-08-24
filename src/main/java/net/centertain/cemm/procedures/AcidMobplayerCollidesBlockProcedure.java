package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.centertain.cemm.init.CemmModEnchantments;

public class AcidMobplayerCollidesBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double pitchVariation = 0;
		if (!entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("cemm:acid_resistant")))) {
			pitchVariation = 0.1;
			if (!(EnchantmentHelper.getItemEnchantmentLevel(CemmModEnchantments.ACID_RESISTANCE.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)) != 0
					|| EnchantmentHelper.getItemEnchantmentLevel(CemmModEnchantments.ACID_RESISTANCE.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)) != 0
					|| EnchantmentHelper.getItemEnchantmentLevel(CemmModEnchantments.ACID_RESISTANCE.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) != 0
					|| EnchantmentHelper.getItemEnchantmentLevel(CemmModEnchantments.ACID_RESISTANCE.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)) != 0)) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.WITHER)), 4);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(CemmModEnchantments.ACID_RESISTANCE.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)) != 0
					&& EnchantmentHelper.getItemEnchantmentLevel(CemmModEnchantments.ACID_RESISTANCE.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)) != 0
					&& EnchantmentHelper.getItemEnchantmentLevel(CemmModEnchantments.ACID_RESISTANCE.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) != 0
					&& EnchantmentHelper.getItemEnchantmentLevel(CemmModEnchantments.ACID_RESISTANCE.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)) != 0)) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								("playsound " + "minecraft:block.redstone_torch.burnout " + "master " + "@a " + "~0 " + "~0.5 " + "~0 " + "0.2 " + (1 - pitchVariation + Math.random() * 2 * pitchVariation) + " 0"));
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
								("particle " + "minecraft:dust " + "1 " + "1 " + "1 " + "1 " + "~0 " + "~1 " + "~0 " + "0.25 " + "0.5 " + "0.25 " + "1 " + "20 " + "normal"));
					}
				}
			}
		}
	}
}
