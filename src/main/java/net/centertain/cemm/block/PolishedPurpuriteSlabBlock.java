
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedPurpuriteSlabBlock extends SlabBlock {
	public PolishedPurpuriteSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
