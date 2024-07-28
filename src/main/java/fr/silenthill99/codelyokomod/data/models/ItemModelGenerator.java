package fr.silenthill99.codelyokomod.data.models;

import fr.silenthill99.codelyokomod.Main;
import fr.silenthill99.codelyokomod.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.data.ExistingFileHelper;

@SuppressWarnings("DataFlowIssue")
public class ItemModelGenerator extends ItemModelProvider {
    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MODID, existingFileHelper);
    }

    ResourceLocation path;

    @Override
    protected void registerModels() {
        spawnEgg(ModItems.AELITA_SCHAEFFER_SPAWN_EGG.get());
        customItem(ModItems.COURT.get());
        spawnEgg(ModItems.JEREMY_BELPOIS_SPAWN_EGG.get());
        spawnEgg(ModItems.JIM_MORALES_SPAWN_EGG.get());
        customItem(ModItems.LONGUE.get());
        customItem(ModItems.LYOKO_GUERRIER_BOOTS.get());
        customItem(ModItems.LYOKO_GUERRIER_CHESTPLATE.get());
        customItem(ModItems.LYOKO_GUERRIER_HELMET.get());
        customItem(ModItems.LYOKO_GUERRIER_LEGGINGS.get());
        spawnEgg(ModItems.ODD_DELLA_ROBBIA_SPAWN_EGG.get());
        spawnEgg(ModItems.ULRICH_STERN_SPAWN_ITEM.get());
        spawnEgg(ModItems.WILLIAM_DUNBAR_SPAWN_EGG.get());
        spawnEgg(ModItems.YUMI_ISHIYAMA_SPAWN_EGG.get());
    }

    private void customItem(Item item) {
        path = item.getRegistryName();
        withExistingParent(path.getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Main.MODID, "item/" + path.getPath()));
    }

    private void spawnEgg(ForgeSpawnEggItem item) {
        path = item.getRegistryName();
        withExistingParent(path.getPath(), new ResourceLocation("item/template_spawn_egg"));
    }

}
