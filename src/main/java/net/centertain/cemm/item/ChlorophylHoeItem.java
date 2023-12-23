
package net.centertain.cemm.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.centertain.cemm.init.CemmModItems;

public class ChlorophylHoeItem extends HoeItem {
	public ChlorophylHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3121;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CemmModItems.GALVANIZED_STEEL_INGOT.get()), new ItemStack(CemmModItems.CHLOROPHYL_INGOT.get()));
			}
		}, 0, 0f, new Item.Properties());
	}
}
