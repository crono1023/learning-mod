package com.tourian.learning.items;

import com.tourian.learning.LearningMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ItemFoodBase extends Item {
    public ItemFoodBase(Food food) {
        super(new Properties().group(LearningMod.TAB).food(food));
    }
}
