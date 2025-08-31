
package net.centertain.cemm.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;

public class LunarbarkFenceGateBlock extends FenceGateBlock {
	public LunarbarkFenceGateBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STEM).strength(26f, 6f).lightLevel(s -> 5).dynamicShape().forceSolidOn(), WoodType.OAK);
	}
}
