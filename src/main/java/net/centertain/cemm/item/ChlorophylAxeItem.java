
package net.centertain.cemm.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.centertain.cemm.init.CemmModItems;

public class ChlorophylAxeItem extends AxeItem {
	public ChlorophylAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3121;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CemmModItems.CHLOROPHYL_INGOT.get()), new ItemStack(CemmModItems.GALVANIZED_STEEL_INGOT.get()));
			}
		}, 1, -3.2f, new Item.Properties());
	}
}
