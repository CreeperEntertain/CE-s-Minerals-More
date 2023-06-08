
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

public class KremersiteFeature extends OreFeature {
	public static KremersiteFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new KremersiteFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("cemm:kremersite", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.DEEPSLATE.defaultBlockState()), CemmModBlocks.KREMERSITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.NETHERRACK.defaultBlockState()), CemmModBlocks.KREMERSITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.WARPED_NYLIUM.defaultBlockState()), CemmModBlocks.KREMERSITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.CRIMSON_NYLIUM.defaultBlockState()), CemmModBlocks.KREMERSITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState()), CemmModBlocks.KREMERSITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState()), CemmModBlocks.KREMERSITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.NETHER_BRICKS.defaultBlockState()), CemmModBlocks.KREMERSITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.CRACKED_NETHER_BRICKS.defaultBlockState()), CemmModBlocks.KREMERSITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.RED_NETHER_BRICKS.defaultBlockState()), CemmModBlocks.KREMERSITE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.BLACKSTONE.defaultBlockState()), CemmModBlocks.KREMERSITE.get().defaultBlockState())), 24));
		PLACED_FEATURE = PlacementUtils.register("cemm:kremersite", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(6), InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(128)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD, Level.NETHER);

	public KremersiteFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
