
package net.centertain.cemm.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;

public class LunarbarkTrapdoorBlock extends TrapDoorBlock {
	public LunarbarkTrapdoorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STEM).strength(26f, 6f).lightLevel(s -> 5).dynamicShape(), BlockSetType.STONE);
	}
}
