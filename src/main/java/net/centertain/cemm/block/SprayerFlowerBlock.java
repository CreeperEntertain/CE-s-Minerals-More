
package net.centertain.cemm.block;

import net.minecraftforge.common.PlantType;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
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

public class SprayerFlowerBlock extends FlowerBlock {
	public SprayerFlowerBlock() {
		super(() -> MobEffects.MOVEMENT_SLOWDOWN, 100, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 20;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(CemmModBlocks.ASH.get()) || groundState.is(CemmModBlocks.HARDENED_ASH.get()) || groundState.is(Blocks.TUFF) || groundState.is(Blocks.BASALT) || groundState.is(Blocks.POLISHED_BASALT)
				|| groundState.is(Blocks.SMOOTH_BASALT) || groundState.is(CemmModBlocks.SOUL_GOLD_ORE.get()) || groundState.is(CemmModBlocks.SOUL_IRON_ORE.get()) || groundState.is(CemmModBlocks.SOUL_QUARTZ_ORE.get())
				|| groundState.is(Blocks.SOUL_SAND) || groundState.is(Blocks.SOUL_SOIL) || groundState.is(CemmModBlocks.BLACKSTONE_BRIMSTONE_DEPOSIT.get()) || groundState.is(CemmModBlocks.BLACKSTONE_GOLD_ORE.get())
				|| groundState.is(CemmModBlocks.BLACKSTONE_IRON_ORE.get()) || groundState.is(CemmModBlocks.BLACKSTONE_QUARTZ_ORE.get()) || groundState.is(Blocks.BLACKSTONE) || groundState.is(Blocks.POLISHED_BLACKSTONE)
				|| groundState.is(Blocks.POLISHED_BLACKSTONE_BRICKS) || groundState.is(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS) || groundState.is(Blocks.CHISELED_POLISHED_BLACKSTONE) || groundState.is(Blocks.GILDED_BLACKSTONE);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.NETHER;
	}
}
