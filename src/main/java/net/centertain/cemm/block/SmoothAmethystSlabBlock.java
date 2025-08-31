
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class SmoothAmethystSlabBlock extends SlabBlock {
	public SmoothAmethystSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.AMETHYST).strength(1.5f).requiresCorrectToolForDrops().dynamicShape());
	}
}
