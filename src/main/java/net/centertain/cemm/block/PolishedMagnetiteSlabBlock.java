
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedMagnetiteSlabBlock extends SlabBlock {
	public PolishedMagnetiteSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.POLISHED_DEEPSLATE).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
