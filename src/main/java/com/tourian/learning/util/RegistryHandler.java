package com.tourian.learning.util;

import com.tourian.learning.block.BlackGold;
import com.tourian.learning.block.BlockItemBase;
import com.tourian.learning.block.LearningBlock;
import com.tourian.learning.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.tourian.learning.LearningMod.MOD_ID;

public class RegistryHandler {

    // Create deferred register
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> MYSTERIOUS_ARTIFACT = ITEMS.register("mysterious_artifact", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> LEARNING_BLOCK = BLOCKS.register("learning_block", LearningBlock::new);
    public static final RegistryObject<Block> BLACK_GOLD_BLOCK = BLOCKS.register("black_gold", BlackGold::new);

    // Block Items
    public static final RegistryObject<Item> LEARNING_BLOCK_ITEM;
    public static final RegistryObject<Item> BLACK_GOLD_ITEM;

    static {
        LEARNING_BLOCK_ITEM = ITEMS.register("learning_block", () -> new BlockItemBase(LEARNING_BLOCK.get()));
        BLACK_GOLD_ITEM = ITEMS.register("black_gold", () -> new BlockItemBase(BLACK_GOLD_BLOCK.get()));
    }


}
