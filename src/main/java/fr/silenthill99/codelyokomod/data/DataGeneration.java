package fr.silenthill99.codelyokomod.data;

import fr.silenthill99.codelyokomod.Main;
import fr.silenthill99.codelyokomod.data.loot_tables.LootTableGenerator;
import fr.silenthill99.codelyokomod.data.models.BlockStateGenerator;
import fr.silenthill99.codelyokomod.data.models.ItemModelGenerator;
import fr.silenthill99.codelyokomod.data.recipes.RecipeGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration
{
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeClient()) {
            generator.addProvider(new BlockStateGenerator(generator, helper));
            generator.addProvider(new ItemModelGenerator(generator, helper));
        }

        if (event.includeServer()) {
            generator.addProvider(new RecipeGenerator(generator));
            generator.addProvider(new LootTableGenerator(generator));
        }
    }
}
