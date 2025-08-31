
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MetatorberniteSlabBlock extends SlabBlock {
	public MetatorberniteSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DRIPSTONE_BLOCK).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
