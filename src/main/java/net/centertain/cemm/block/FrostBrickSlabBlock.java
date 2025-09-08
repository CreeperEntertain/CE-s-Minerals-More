
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class FrostBrickSlabBlock extends SlabBlock {
	public FrostBrickSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS).strength(1.5f, 0.5f).requiresCorrectToolForDrops().friction(0.75f).dynamicShape());
	}
}
