package fr.silenthill99.codelyokomod.data.models;

import fr.silenthill99.codelyokomod.Main;
import fr.silenthill99.codelyokomod.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

import java.util.Locale;

public class ItemModelGenerator extends ItemModelProvider {
    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        spawnEgg(ModItems.AELITA_SCHAEFFER_SPAWN_EGG);
        customItem(ModItems.COURT, GeneratedOrHandheld.GENERATED);
        spawnEgg(ModItems.JEREMY_BELPOIS_SPAWN_EGG);
        spawnEgg(ModItems.JIM_MORALES_SPAWN_EGG);
        customItem(ModItems.LONGUE, GeneratedOrHandheld.GENERATED);
        customItem(ModItems.LYOKO_GUERRIER_BOOTS, GeneratedOrHandheld.GENERATED);
        customItem(ModItems.LYOKO_GUERRIER_CHESTPLATE, GeneratedOrHandheld.GENERATED);
        customItem(ModItems.LYOKO_GUERRIER_HELMET, GeneratedOrHandheld.GENERATED);
        customItem(ModItems.LYOKO_GUERRIER_LEGGINGS, GeneratedOrHandheld.GENERATED);
        spawnEgg(ModItems.ODD_DELLA_ROBBIA_SPAWN_EGG);
        spawnEgg(ModItems.ULRICH_STERN_SPAWN_ITEM);
        spawnEgg(ModItems.WILLIAM_DUNBAR_SPAWN_EGG);
        spawnEgg(ModItems.YUMI_ISHIYAMA_SPAWN_EGG);
    }

    private void customItem(RegistryObject<Item> item, GeneratedOrHandheld generatedOrHandheld) {
        withExistingParent(item.getId().getPath(), new ResourceLocation("item/" + generatedOrHandheld.name().toLowerCase(Locale.ROOT)))
                .texture("parent", new ResourceLocation(Main.MODID, "item/" + item.getId().getPath()));
    }

    private void spawnEgg(RegistryObject<ForgeSpawnEggItem> item) {
        withExistingParent(item.getId().getPath(), new ResourceLocation("item/template_spawn_egg"));
    }

    public enum GeneratedOrHandheld {
        GENERATED,
        HANDHELD
    }
}
