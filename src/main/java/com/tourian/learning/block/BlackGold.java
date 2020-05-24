package com.tourian.learning.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlackGold extends Block {

    public BlackGold() {
        super(Block.Properties.create(Material.EARTH)
                .lightValue(12)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f,6.0f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
