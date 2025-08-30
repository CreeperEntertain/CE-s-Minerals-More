
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class NetherrackTileWallBlock extends WallBlock {
	public NetherrackTileWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.NETHERRACK).strength(0.4f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
