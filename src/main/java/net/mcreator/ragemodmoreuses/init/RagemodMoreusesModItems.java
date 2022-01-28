
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemodmoreuses.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodMoreusesModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item LEVITATION_BLOCK = register(RagemodMoreusesModBlocks.LEVITATION_BLOCK,
			RagemodMoreusesModTabs.TAB_RAGE_MOD_MORE_USES_TAB);
	public static final Item LEVITATION_BLOCK_PLUS = register(RagemodMoreusesModBlocks.LEVITATION_BLOCK_PLUS,
			RagemodMoreusesModTabs.TAB_RAGE_MOD_MORE_USES_TAB);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
