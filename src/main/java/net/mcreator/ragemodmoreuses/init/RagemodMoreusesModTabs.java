
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemodmoreuses.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RagemodMoreusesModTabs {
	public static CreativeModeTab TAB_RAGE_MOD_MORE_USES_TAB;

	public static void load() {
		TAB_RAGE_MOD_MORE_USES_TAB = new CreativeModeTab("tabrage_mod_more_uses_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RagemodMoreusesModBlocks.LEVITATION_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
