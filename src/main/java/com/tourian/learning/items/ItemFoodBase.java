package com.tourian.learning.items;

import com.tourian.learning.LearningMod;
import com.tourian.learning.util.RegistryHandler;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;

public class ItemFoodBase extends Item {
    public ItemFoodBase() {
        super(new Properties().group(LearningMod.TAB).food(RegistryHandler.TEST_FOOD));
    }
}
