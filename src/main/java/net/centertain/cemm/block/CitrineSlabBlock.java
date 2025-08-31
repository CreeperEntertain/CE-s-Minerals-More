
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CitrineSlabBlock extends SlabBlock {
	public CitrineSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANCIENT_DEBRIS).strength(4f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
