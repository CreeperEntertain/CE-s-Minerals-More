
package net.centertain.cemm.block;

import net.minecraftforge.common.PlantType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

import java.util.List;
import java.util.Collections;

public class DesertPrimroseBlock extends FlowerBlock {
	public DesertPrimroseBlock() {
		super(MobEffects.MOVEMENT_SPEED, 100, BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).instabreak().noCollission());
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(5.5, 0, 5.5, 10.5, 8, 10.5).move(offset.x, offset.y, offset.z);
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get()) || groundState.is(CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get()) || groundState.is(CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get())
				|| groundState.is(CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get()) || groundState.is(CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get()) || groundState.is(CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get())
				|| groundState.is(CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get()) || groundState.is(CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get()) || groundState.is(CemmModBlocks.FIREGRASS_BLOCK_ANDESITE.get())
				|| groundState.is(CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get()) || groundState.is(CemmModBlocks.FIREGRASS_BLOCK_DIRT.get()) || groundState.is(CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get())
				|| groundState.is(CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get()) || groundState.is(CemmModBlocks.FIREGRASS_BLOCK_MOSS.get()) || groundState.is(CemmModBlocks.FIREGRASS_BLOCK_STONE.get())
				|| groundState.is(CemmModBlocks.FIREGRASS_BLOCK_TUFF.get()) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.DIRT) || groundState.is(Blocks.COARSE_DIRT) || groundState.is(Blocks.PODZOL)
				|| groundState.is(Blocks.ROOTED_DIRT) || groundState.is(Blocks.MYCELIUM) || groundState.is(CemmModBlocks.MONAZITE_SAND.get()) || groundState.is(CemmModBlocks.ZIRCON_SAND.get()) || groundState.is(Blocks.SAND)
				|| groundState.is(Blocks.RED_SAND) || groundState.is(Blocks.MOSS_BLOCK) || groundState.is(Blocks.MUD) || groundState.is(CemmModBlocks.JASPILITE.get()) || groundState.is(CemmModBlocks.SCORIA.get())
				|| groundState.is(CemmModBlocks.RED_SHALE.get()) || groundState.is(CemmModBlocks.ORPIMENT.get()) || groundState.is(Blocks.SANDSTONE) || groundState.is(Blocks.CHISELED_SANDSTONE) || groundState.is(Blocks.CUT_SANDSTONE)
				|| groundState.is(Blocks.SMOOTH_SANDSTONE) || groundState.is(Blocks.RED_SANDSTONE) || groundState.is(Blocks.CHISELED_RED_SANDSTONE) || groundState.is(Blocks.CUT_RED_SANDSTONE) || groundState.is(Blocks.SMOOTH_RED_SANDSTONE)
				|| groundState.is(Blocks.GRAVEL);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.DESERT;
	}
}
