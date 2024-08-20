
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class GypsumSlabBlock extends SlabBlock {
	public GypsumSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.TUFF).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
