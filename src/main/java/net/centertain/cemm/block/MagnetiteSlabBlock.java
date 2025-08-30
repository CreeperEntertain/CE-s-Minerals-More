
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MagnetiteSlabBlock extends SlabBlock {
	public MagnetiteSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.POLISHED_DEEPSLATE).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
