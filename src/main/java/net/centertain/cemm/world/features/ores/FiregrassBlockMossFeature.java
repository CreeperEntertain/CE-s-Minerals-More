
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
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.centertain.cemm.init.CemmModBlocks;

import java.util.Set;
import java.util.List;

public class FiregrassBlockMossFeature extends OreFeature {
	public static FiregrassBlockMossFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new FiregrassBlockMossFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("cemm:firegrass_block_moss", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get().defaultBlockState()), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get().defaultBlockState()), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState()), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get().defaultBlockState()), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get().defaultBlockState()), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get().defaultBlockState()), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get().defaultBlockState()), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get().defaultBlockState()), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState())), 64));
		PLACED_FEATURE = PlacementUtils.register("cemm:firegrass_block_moss", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(7), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(128)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public FiregrassBlockMossFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
