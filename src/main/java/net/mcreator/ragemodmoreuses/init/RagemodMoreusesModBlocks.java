
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemodmoreuses.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.ragemodmoreuses.block.LevitationBlockPlusBlock;
import net.mcreator.ragemodmoreuses.block.LevitationBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodMoreusesModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block LEVITATION_BLOCK = register(new LevitationBlockBlock());
	public static final Block LEVITATION_BLOCK_PLUS = register(new LevitationBlockPlusBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
