
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class LargeCrimsonPlankSlabBlock extends SlabBlock {
	public LargeCrimsonPlankSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STEM).strength(2f, 3f).dynamicShape());
	}
}
