
package net.centertain.cemm.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.centertain.cemm.init.CemmModItems;

public class SteelHoeItem extends HoeItem {
	public SteelHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CemmModItems.GALVANIZED_STEEL_INGOT.get()), new ItemStack(CemmModItems.STEEL_INGOT.get()), new ItemStack(Items.IRON_INGOT));
			}
		}, 0, 0f, new Item.Properties());
	}
}
