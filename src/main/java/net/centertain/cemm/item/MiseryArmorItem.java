
package net.centertain.cemm.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.centertain.cemm.init.CemmModTabs;
import net.centertain.cemm.init.CemmModItems;

public abstract class MiseryArmorItem extends ArmorItem {
	public MiseryArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 7, 10, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 30;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_turtle"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CemmModItems.XANTHANIUM_INGOT.get()));
			}

			@Override
			public String getName() {
				return "misery_armor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.19999999999999998f;
			}
		}, slot, properties);
	}

	public static class Helmet extends MiseryArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CemmModTabs.TAB_VOID_ITEMS_AND_BLOCKS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cemm:textures/models/armor/xanthanium__layer_1.png";
		}
	}

	public static class Chestplate extends MiseryArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CemmModTabs.TAB_VOID_ITEMS_AND_BLOCKS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cemm:textures/models/armor/xanthanium__layer_1.png";
		}
	}

	public static class Leggings extends MiseryArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CemmModTabs.TAB_VOID_ITEMS_AND_BLOCKS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cemm:textures/models/armor/xanthanium__layer_2.png";
		}
	}

	public static class Boots extends MiseryArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CemmModTabs.TAB_VOID_ITEMS_AND_BLOCKS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cemm:textures/models/armor/xanthanium__layer_1.png";
		}
	}
}
