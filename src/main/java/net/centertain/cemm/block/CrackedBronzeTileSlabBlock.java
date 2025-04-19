
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CrackedBronzeTileSlabBlock extends SlabBlock {
	public CrackedBronzeTileSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.COPPER).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
