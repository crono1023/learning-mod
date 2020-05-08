package com.tourian.learning.items;

import com.tourian.learning.LearningMod;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(LearningMod.TAB));
    }
}
