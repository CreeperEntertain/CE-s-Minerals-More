
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class RawCopperBrickSlabBlock extends SlabBlock {
	public RawCopperBrickSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS).strength(2f, 3f).requiresCorrectToolForDrops().dynamicShape());
	}
}
