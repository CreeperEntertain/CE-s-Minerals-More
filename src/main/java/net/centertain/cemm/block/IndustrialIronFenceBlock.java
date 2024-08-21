
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;

public class IndustrialIronFenceBlock extends FenceBlock {
	public IndustrialIronFenceBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(5f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
