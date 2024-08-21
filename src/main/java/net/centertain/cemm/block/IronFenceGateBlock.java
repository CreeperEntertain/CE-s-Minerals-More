
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;

public class IronFenceGateBlock extends FenceGateBlock {
	public IronFenceGateBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(5f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn(), WoodType.OAK);
	}
}
