package com.tourian.learning.util;

import com.tourian.learning.LearningMod;
import com.tourian.learning.block.BlackGold;
import com.tourian.learning.block.BlockItemBase;
import com.tourian.learning.block.LearningBlock;
import com.tourian.learning.block.LearningCropsBlock;
import com.tourian.learning.items.ItemBase;
import com.tourian.learning.items.ItemFoodBase;
import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.tourian.learning.LearningMod.MOD_ID;
import static com.tourian.learning.LearningMod.TAB;

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
    public static final Food DONUT_FOOD;
    public static final Food PRETZEL_FOOD;
    public static final Food COOKED_HAMBURGER_PATTY;
    public static final Food CHEESE;
    public static final Food CHEESEBURGER;

    // Items
    public static final RegistryObject<Item> RUBY;
    public static final RegistryObject<Item> MYSTERIOUS_ARTIFACT;
    public static final RegistryObject<Item> HEART;
    public static final RegistryObject<Item> TEST_FOOD_ITEM;
    public static final RegistryObject<Item> TULIP;
    public static final RegistryObject<Item> DONUT_ITEM;
    public static final RegistryObject<Item> PRETZEL_ITEM;
    public static final RegistryObject<Item> RAW_GROUND_BEEF;
    public static final RegistryObject<Item> RAW_HAMBURGER_PATTY;
    public static final RegistryObject<Item> COOKED_HAMBURGER_PATTY_ITEM;
    public static final RegistryObject<Item> CHEESE_ITEM;
    public static final RegistryObject<Item> CHEESEBURGER_ITEM;
    public static final RegistryObject<Item> TOMATO_SEEDS;
    public static final RegistryObject<Item> TOMATO;



    // Blocks
    public static final RegistryObject<Block> LEARNING_BLOCK;
    public static final RegistryObject<Block> BLACK_GOLD_BLOCK;
    public static final RegistryObject<Block> TOMATO_CROP;

    // Block Items
    public static final RegistryObject<Item> LEARNING_BLOCK_ITEM;
    public static final RegistryObject<Item> BLACK_GOLD_ITEM;

    // Instantiate objects
    static {

        // Instantiate food items
        TEST_FOOD = new Food.Builder().hunger(5).saturation(0.6f).build();
        DONUT_FOOD = new Food.Builder().hunger(8).saturation(0.3f).build();
        PRETZEL_FOOD = new Food.Builder().hunger(8).saturation(0.4f).build();
        COOKED_HAMBURGER_PATTY = new Food.Builder().hunger(8).saturation(0.8f).build();
        CHEESE = new Food.Builder().hunger(3).saturation(0.3f).build();
        CHEESEBURGER = new Food.Builder().hunger(10).saturation(1.0f).build();

        // Instantiate items
        TEST_FOOD_ITEM = ITEMS.register("test_food", () -> new ItemFoodBase(TEST_FOOD));
        DONUT_ITEM = ITEMS.register("donut", () -> new ItemFoodBase(DONUT_FOOD));
        PRETZEL_ITEM = ITEMS.register("pretzel", () -> new ItemFoodBase(PRETZEL_FOOD));
        RUBY = ITEMS.register("ruby", ItemBase::new);
        HEART = ITEMS.register("heart", ItemBase::new);
        MYSTERIOUS_ARTIFACT = ITEMS.register("mysterious_artifact",
                ItemBase::new);
        TULIP = ITEMS.register("tulip", ItemBase::new);
        RAW_GROUND_BEEF = ITEMS.register("raw_ground_beef", ItemBase::new);
        RAW_HAMBURGER_PATTY = ITEMS.register("raw_hamburger_patty", ItemBase::new);
        COOKED_HAMBURGER_PATTY_ITEM = ITEMS.register("cooked_hamburger_patty", () -> new ItemFoodBase(COOKED_HAMBURGER_PATTY));
        CHEESE_ITEM = ITEMS.register("cheese", () -> new ItemFoodBase(CHEESE));
        CHEESEBURGER_ITEM = ITEMS.register("cheeseburger", () -> new ItemFoodBase(CHEESEBURGER));
        TOMATO = ITEMS.register("tomato", ItemBase::new);


        // Instantiate blocks (with their corresponding block items.
        BLACK_GOLD_BLOCK = BLOCKS.register("black_gold", BlackGold::new);
        LEARNING_BLOCK = BLOCKS.register("learning_block", LearningBlock::new);
        LEARNING_BLOCK_ITEM = ITEMS.register("learning_block", () -> new BlockItemBase(LEARNING_BLOCK.get()));
        BLACK_GOLD_ITEM = ITEMS.register("black_gold", () -> new BlockItemBase(BLACK_GOLD_BLOCK.get()));

        // Test Crop
        TOMATO_CROP = BLOCKS.register("tomato", () -> new LearningCropsBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));

        TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new BlockNamedItem(TOMATO_CROP.get(), (new Item.Properties()).group(TAB)));
    }


}
