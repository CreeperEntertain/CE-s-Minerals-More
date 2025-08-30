
package net.centertain.cemm.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.centertain.cemm.procedures.AmbrosiaConsumedProcedure;

public class AmbrosiaItem extends Item {
	public AmbrosiaItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(12).saturationMod(20f).alwaysEat().meat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		AmbrosiaConsumedProcedure.execute(entity);
		return retval;
	}
}
