
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class KeroliteSlabBlock extends SlabBlock {
	public KeroliteSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
