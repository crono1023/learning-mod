package com.tourian.learning.util;

import com.tourian.learning.LearningMod;
import com.tourian.learning.block.BlackGold;
import com.tourian.learning.block.BlockItemBase;
import com.tourian.learning.block.LearningBlock;
import com.tourian.learning.items.ItemBase;
import com.tourian.learning.items.ItemFoodBase;
import net.minecraft.block.Block;
import net.minecraft.item.Food;
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


    //Initialize Objects

    //Food
    public static final Food TEST_FOOD;

    // Items
    public static final RegistryObject<Item> RUBY;
    public static final RegistryObject<Item> MYSTERIOUS_ARTIFACT;
    public static final RegistryObject<Item> HEART;
    public static final RegistryObject<Item> TEST_FOOD_ITEM;
    public static final RegistryObject<Item> TULIP;


    // Blocks
    public static final RegistryObject<Block> LEARNING_BLOCK;
    public static final RegistryObject<Block> BLACK_GOLD_BLOCK;

    // Block Items
    public static final RegistryObject<Item> LEARNING_BLOCK_ITEM;
    public static final RegistryObject<Item> BLACK_GOLD_ITEM;

    // Instantiate objects
    static {

        // Instantiate food items
        TEST_FOOD = new Food.Builder().hunger(5).saturation(0.6f).build();

        // Instantiate items
        TEST_FOOD_ITEM = ITEMS.register("test_food", ItemFoodBase::new);
        RUBY = ITEMS.register("ruby", ItemBase::new);
        HEART = ITEMS.register("heart", ItemBase::new);
        MYSTERIOUS_ARTIFACT = ITEMS.register("mysterious_artifact",
                ItemBase::new);
        TULIP = ITEMS.register("tulip", ItemBase::new);


        // Instantiate blocks (with their corresponding block items.
        BLACK_GOLD_BLOCK = BLOCKS.register("black_gold", BlackGold::new);
        LEARNING_BLOCK = BLOCKS.register("learning_block", LearningBlock::new);
        LEARNING_BLOCK_ITEM = ITEMS.register("learning_block", () -> new BlockItemBase(LEARNING_BLOCK.get()));
        BLACK_GOLD_ITEM = ITEMS.register("black_gold", () -> new BlockItemBase(BLACK_GOLD_BLOCK.get()));
    }


}
