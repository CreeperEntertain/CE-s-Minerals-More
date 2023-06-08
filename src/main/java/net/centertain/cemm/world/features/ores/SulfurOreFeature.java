
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

public class SulfurOreFeature extends OreFeature {
	public static SulfurOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SulfurOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("cemm:sulfur_ore", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.LIMESTONE.get().defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.CLAYSTONE.get().defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRANITE.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIORITE.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.ANDESITE.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DRIPSTONE_BLOCK.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.COBBLESTONE.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.SANDSTONE.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.RED_SANDSTONE.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.MONAZITE_SAND.get().defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(CemmModBlocks.ZIRCON_SAND.get().defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.SAND.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.RED_SAND.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.WHITE_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.ORANGE_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.MAGENTA_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.YELLOW_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.LIME_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.PINK_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRAY_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.CYAN_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.PURPLE_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.BLUE_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.BROWN_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GREEN_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.RED_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.BLACK_TERRACOTTA.defaultBlockState()), CemmModBlocks.SULFUR_ORE.get().defaultBlockState())), 12));
		PLACED_FEATURE = PlacementUtils.register("cemm:sulfur_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(256)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public SulfurOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
