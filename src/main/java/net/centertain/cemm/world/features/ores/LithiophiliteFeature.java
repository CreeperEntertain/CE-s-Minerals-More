
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

public class LithiophiliteFeature extends OreFeature {
	public static LithiophiliteFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new LithiophiliteFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("cemm:lithiophilite", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), CemmModBlocks.LITHIOPHILITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRANITE.defaultBlockState()), CemmModBlocks.LITHIOPHILITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIORITE.defaultBlockState()), CemmModBlocks.LITHIOPHILITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DRIPSTONE_BLOCK.defaultBlockState()), CemmModBlocks.LITHIOPHILITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.COBBLESTONE.defaultBlockState()), CemmModBlocks.LITHIOPHILITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.LIMESTONE.get().defaultBlockState()), CemmModBlocks.LITHIOPHILITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.MARBLE.get().defaultBlockState()), CemmModBlocks.LITHIOPHILITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DEEPSLATE.defaultBlockState()), CemmModBlocks.LITHIOPHILITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.MOSSY_COBBLESTONE.defaultBlockState()), CemmModBlocks.LITHIOPHILITE.get().defaultBlockState())), 16));
		PLACED_FEATURE = PlacementUtils.register("cemm:lithiophilite", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public LithiophiliteFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
