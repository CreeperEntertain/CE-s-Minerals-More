
package net.centertain.cemm.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.centertain.cemm.procedures.ChlorophylKeyRightclickProcedure;

public class ChlorophylKeyItem extends Item {
	public ChlorophylKeyItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ChlorophylKeyRightclickProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
