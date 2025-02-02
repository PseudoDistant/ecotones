package supercoder79.ecotones.world.layers.util;

import net.minecraft.world.biome.layer.type.MergingLayer;
import net.minecraft.world.biome.layer.util.IdentityCoordinateTransformer;
import net.minecraft.world.biome.layer.util.LayerRandomnessSource;
import net.minecraft.world.biome.layer.util.LayerSampler;

public enum SpecialBiomeMerger implements MergingLayer, IdentityCoordinateTransformer {
    INSTANCE;

    @Override
    public int sample(LayerRandomnessSource context, LayerSampler sampler1, LayerSampler sampler2, int x, int z) {
        int specialSample = sampler2.sample(x, z);
        
        if (specialSample != 1) {
            return specialSample;
        }

        return sampler1.sample(x, z);
    }
}
