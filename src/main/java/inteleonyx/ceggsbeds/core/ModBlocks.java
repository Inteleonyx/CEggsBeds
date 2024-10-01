package inteleonyx.ceggsbeds.core;

import inteleonyx.ceggsbeds.Client;
import inteleonyx.ceggsbeds.block.Bed;
import inteleonyx.ceggsbeds.util.ModCreativeModeTab;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCK =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Client.MOD_ID);

    public static final RegistryObject<Block> BED_1 = registerblock("bed_1", () ->
            new Bed(BlockBehaviour.Properties.of(Material.GLASS)), ModCreativeModeTab.CEGGSBEDS_TAB);
    public static final RegistryObject<Block> BED_2 = registerblock("bed_2",
            () -> new Bed(BlockBehaviour.Properties.copy(BED_1.get())), ModCreativeModeTab.CEGGSBEDS_TAB);

    public static final RegistryObject<Block> BED_3 = registerblock("bed_3",
            () -> new Bed(BlockBehaviour.Properties.copy(BED_1.get())), ModCreativeModeTab.CEGGSBEDS_TAB);

    public static final RegistryObject<Block> BED_4 = registerblock("bed_4",
            () -> new Bed(BlockBehaviour.Properties.copy(BED_1.get())), ModCreativeModeTab.CEGGSBEDS_TAB);

    public static final RegistryObject<Block> BED_5 = registerblock("bed_5",
            () -> new Bed(BlockBehaviour.Properties.copy(BED_1.get())), ModCreativeModeTab.CEGGSBEDS_TAB);

    public static final RegistryObject<Block> BED_6 = registerblock("bed_6",
            () -> new Bed(BlockBehaviour.Properties.copy(BED_1.get())), ModCreativeModeTab.CEGGSBEDS_TAB);

    public static final RegistryObject<Block> BED_7 = registerblock("bed_7",
            () -> new Bed(BlockBehaviour.Properties.copy(BED_1.get())), ModCreativeModeTab.CEGGSBEDS_TAB);

    public static final RegistryObject<Block> BED_8 = registerblock("bed_8",
            () -> new Bed(BlockBehaviour.Properties.copy(BED_1.get())), ModCreativeModeTab.CEGGSBEDS_TAB);

    public static final RegistryObject<Block> BED_9 = registerblock("bed_9",
            () -> new Bed(BlockBehaviour.Properties.copy(BED_1.get())), ModCreativeModeTab.CEGGSBEDS_TAB);

    private static <T extends Block> RegistryObject<T> registerblock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCK.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCK.register(eventBus);
    }
}
