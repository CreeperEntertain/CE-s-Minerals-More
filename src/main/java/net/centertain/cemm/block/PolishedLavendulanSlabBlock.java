
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedLavendulanSlabBlock extends SlabBlock {
	public PolishedLavendulanSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANCIENT_DEBRIS).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
