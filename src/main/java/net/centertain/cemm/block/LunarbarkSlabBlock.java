
package net.centertain.cemm.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class LunarbarkSlabBlock extends SlabBlock {
	public LunarbarkSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STEM).strength(26f, 6f).lightLevel(s -> 5).dynamicShape());
	}
}
