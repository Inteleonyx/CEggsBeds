package inteleonyx.ceggsbeds.util;

import inteleonyx.ceggsbeds.core.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CEGGSBEDS_TAB = new CreativeModeTab("ceggsbedtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BED_1.get());
        }
    };

}