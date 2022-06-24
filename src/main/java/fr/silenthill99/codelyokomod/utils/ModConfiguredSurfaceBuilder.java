package fr.silenthill99.codelyokomod.utils;

import fr.silenthill99.codelyokomod.Main;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class ModConfiguredSurfaceBuilder
{

    public static ConfiguredSurfaceBuilder<?> BANQUISE = register("banquise", SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
            Blocks.SNOW_BLOCK.defaultBlockState(),
            Blocks.PACKED_ICE.defaultBlockState(),
            Blocks.SNOW.defaultBlockState()
    )));

    private static <SC extends ISurfaceBuilderConfig>ConfiguredSurfaceBuilder<SC> register(String name, ConfiguredSurfaceBuilder<SC> csf)
    {
        return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(Main.MODID, name), csf);
    }
}
