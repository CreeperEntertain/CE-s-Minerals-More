
package net.centertain.cemm.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.procedures.OvergrownBlockUpdateTickProcedure;

public class OvergrownCoarseSandBlock extends FallingBlock {
	public OvergrownCoarseSandBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.SNARE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea.fall"))))
				.strength(0.5f).randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		OvergrownBlockUpdateTickProcedure.execute(world, x, y, z);
	}
}
