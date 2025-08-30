
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;

public class FrostBrickFenceBlock extends FenceBlock {
	public FrostBrickFenceBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS).strength(1.5f, 0.5f).requiresCorrectToolForDrops().friction(0.75f).dynamicShape().forceSolidOn());
	}
}
