package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GrassblockGrassRegrowthProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		String TallFlower = "";
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:grassblocks"))) && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= 7) {
			RAND = Mth.nextInt(RandomSource.create(), 1, 2150);
			if (RAND == 1) {
				if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR) {
					TallFlower = ForgeRegistries.BLOCKS.getKey((ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("minecraft:tall_flowers"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR))).toString();
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((TallFlower).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), "half", "lower")), 3);
					world.setBlock(BlockPos.containing(x, y + 2, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((TallFlower).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), "half", "upper")), 3);
				}
			} else if (RAND >= 2 && RAND <= 3) {
				world.setBlock(BlockPos.containing(x, y + 1, z),
						(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("minecraft:small_flowers"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
			} else if (RAND >= 4 && RAND <= 8) {
				if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(Blocks.LARGE_FERN.defaultBlockState(), "half", "lower")), 3);
					world.setBlock(BlockPos.containing(x, y + 2, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(Blocks.LARGE_FERN.defaultBlockState(), "half", "upper")), 3);
				}
			} else if (RAND >= 9 && RAND <= 13) {
				if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(Blocks.TALL_GRASS.defaultBlockState(), "half", "lower")), 3);
					world.setBlock(BlockPos.containing(x, y + 2, z), (new Object() {
						public BlockState with(BlockState _bs, String _property, String _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
						}
					}.with(Blocks.TALL_GRASS.defaultBlockState(), "half", "upper")), 3);
				}
			} else if (RAND >= 14 && RAND <= 28) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.FERN.defaultBlockState(), 3);
			} else if (RAND >= 29 && RAND <= 43) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.GRASS.defaultBlockState(), 3);
			}
		}
	}
}
