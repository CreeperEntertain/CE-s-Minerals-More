
package net.centertain.cemm.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.procedures.MeteoriteTickUpdateProcedure;
import net.centertain.cemm.procedures.MeteoriteEntityWalksOnProcedure;
import net.centertain.cemm.procedures.MeteoriteBlockAddedProcedure;

public class MeteoriteBlock extends Block {
	public MeteoriteBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.ANCIENT_DEBRIS).strength(80f, 1200f).lightLevel(s -> 10).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 4);
		MeteoriteBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		MeteoriteTickUpdateProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 4);
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		MeteoriteEntityWalksOnProcedure.execute(world, entity);
	}
}
