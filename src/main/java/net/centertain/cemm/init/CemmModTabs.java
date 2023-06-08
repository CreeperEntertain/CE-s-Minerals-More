
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CemmModTabs {
	public static CreativeModeTab TAB_TECHNICAL_BLOCKS;
	public static CreativeModeTab TAB_ORES_AND_DEPOSITS;
	public static CreativeModeTab TAB_MATERIALS;
	public static CreativeModeTab TAB_ROCKS_AND_MINERALS;
	public static CreativeModeTab TAB_CRAFTED_BLOCKS;
	public static CreativeModeTab TAB_VOID_ITEMS_AND_BLOCKS;
	public static CreativeModeTab TAB_CHLOROPHYL_ITEMS_AND_BLOCKS;
	public static CreativeModeTab TAB_ARCHITECTURE;
	public static CreativeModeTab TAB_SCAFFOLDING;

	public static void load() {
		TAB_TECHNICAL_BLOCKS = new CreativeModeTab("tabtechnical_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CemmModItems.MOBILE_BATTERY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ORES_AND_DEPOSITS = new CreativeModeTab("tabores_and_deposits") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CemmModBlocks.SULFUR_ORE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MATERIALS = new CreativeModeTab("tabmaterials") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CemmModItems.FLUORITE_CRYSTAL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ROCKS_AND_MINERALS = new CreativeModeTab("tabrocks_and_minerals") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CemmModBlocks.TRONDHJEMITE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CRAFTED_BLOCKS = new CreativeModeTab("tabcrafted_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CemmModBlocks.POLISHED_AEGIRINE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_VOID_ITEMS_AND_BLOCKS = new CreativeModeTab("tabvoid_items_and_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CemmModBlocks.LUNARBARK_STEM.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CHLOROPHYL_ITEMS_AND_BLOCKS = new CreativeModeTab("tabchlorophyl_items_and_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CemmModBlocks.DEEPSLATE_CHLOROPHYL_ORE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ARCHITECTURE = new CreativeModeTab("tabarchitecture") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CemmModBlocks.POLISHED_ARGILITE_STAIRS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SCAFFOLDING = new CreativeModeTab("tabscaffolding") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CemmModBlocks.ALUMINUM_SCAFFOLDING.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
