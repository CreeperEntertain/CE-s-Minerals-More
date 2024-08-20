package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class CAFSxNegProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.DRIPSTONE_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.TUFF) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.FIREGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.DIORITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.GRANITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.ANDESITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.FIREGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.MOSS_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.STONE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.FIREGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.DIRT) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), CemmModBlocks.FIREGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.DRIPSTONE_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.TUFF) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.FIREGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.DIORITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.GRANITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.ANDESITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.FIREGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.MOSS_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.STONE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.FIREGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.DIRT) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.FIREGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.DRIPSTONE_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.TUFF) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.FIREGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.DIORITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.GRANITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.ANDESITE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.FIREGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.MOSS_BLOCK) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.STONE) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.FIREGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.DIRT) {
			if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 1) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			} else if (CheckIfChloroOrFireProcedure.execute(world, x, y, z) == 2) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), CemmModBlocks.FIREGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
			}
		}
	}
}
