
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedLithiophiliteSlabBlock extends SlabBlock {
	public PolishedLithiophiliteSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
