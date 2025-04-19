
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedPyroxmangiteSlabBlock extends SlabBlock {
	public PolishedPyroxmangiteSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
