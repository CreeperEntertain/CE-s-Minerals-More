
package net.centertain.cemm.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.centertain.cemm.init.CemmModBlocks;

import java.util.Set;
import java.util.List;

public class FluorescenceFeature extends OreFeature {
	public static FluorescenceFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new FluorescenceFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("cemm:fluorescence", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.MOSS_BLOCK.defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.FAKE_ANDESITE.get().defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.FAKE_DIORITE.get().defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.FAKE_GRANITE.get().defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRANITE.defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIORITE.defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.ANDESITE.defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DEEPSLATE.defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.TUFF.defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DRIPSTONE_BLOCK.defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIRT.defaultBlockState()), CemmModBlocks.FLUORESCENCE.get().defaultBlockState())), 8));
		PLACED_FEATURE = PlacementUtils.register("cemm:fluorescence", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(64), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(128)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public FluorescenceFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
