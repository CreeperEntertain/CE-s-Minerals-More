
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

public class HyaloclastiteFeature extends OreFeature {
	public static HyaloclastiteFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new HyaloclastiteFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("cemm:hyaloclastite", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.DIRT.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.COARSE_DIRT.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.PODZOL.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.ROOTED_DIRT.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRASS_BLOCK.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.MOSS_BLOCK.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.SAND.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRAVEL.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.PRISMARINE.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.PRISMARINE_BRICKS.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DARK_PRISMARINE.defaultBlockState()), CemmModBlocks.HYALOCLASTITE.get().defaultBlockState())), 20));
		PLACED_FEATURE = PlacementUtils.register("cemm:hyaloclastite", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(25), InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.absolute(32), VerticalAnchor.absolute(48)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public HyaloclastiteFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
