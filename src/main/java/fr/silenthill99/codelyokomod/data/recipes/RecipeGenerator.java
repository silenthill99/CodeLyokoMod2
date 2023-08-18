package fr.silenthill99.codelyokomod.data.recipes;

import fr.silenthill99.codelyokomod.Main;
import fr.silenthill99.codelyokomod.init.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider
{
    public RecipeGenerator(DataGenerator p_i48262_1_)
    {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer)
    {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.IRON_HELMET), ModItems.LYOKO_GUERRIER_HELMET.get())
                .unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_HELMET))
                .save(consumer, new ResourceLocation(Main.MODID, "lyoko_guerrier_helmet"));
    }
}
