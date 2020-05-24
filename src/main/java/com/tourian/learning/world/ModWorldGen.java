package com.tourian.learning.world;

import com.tourian.learning.util.RegistryHandler;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ModWorldGen {
    /*
    public static void generateOre() {
        for(Biome biome : ForgeRegistries.BIOMES) {

            ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(100, 0, 0, 256));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.BLACK_GOLD_BLOCK.get().getDefaultState(), 33)).withPlacement(customConfig));

             */

    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.BLACK_GOLD_BLOCK.get().getDefaultState(), 33)).withPlacement(customConfig));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.LEARNING_BLOCK.get().getDefaultState(), 33)).withPlacement(customConfig));
        }

    }
}
