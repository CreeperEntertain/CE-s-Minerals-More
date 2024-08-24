
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class DecorativeBronzeSlabBlock extends SlabBlock {
	public DecorativeBronzeSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.COPPER).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
