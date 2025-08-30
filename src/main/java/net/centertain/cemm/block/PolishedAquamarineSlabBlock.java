
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedAquamarineSlabBlock extends SlabBlock {
	public PolishedAquamarineSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DRIPSTONE_BLOCK).strength(1.5f).requiresCorrectToolForDrops().dynamicShape());
	}
}
