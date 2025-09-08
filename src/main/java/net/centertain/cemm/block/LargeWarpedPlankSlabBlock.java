
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class LargeWarpedPlankSlabBlock extends SlabBlock {
	public LargeWarpedPlankSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STEM).strength(2f, 3f).dynamicShape());
	}
}
