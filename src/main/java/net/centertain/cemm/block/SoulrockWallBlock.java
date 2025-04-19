
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class SoulrockWallBlock extends WallBlock {
	public SoulrockWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
