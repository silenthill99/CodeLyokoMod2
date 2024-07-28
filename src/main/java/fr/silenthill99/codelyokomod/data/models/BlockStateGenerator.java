package fr.silenthill99.codelyokomod.data.models;

import fr.silenthill99.codelyokomod.Main;
import fr.silenthill99.codelyokomod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStateGenerator extends BlockStateProvider {


    public BlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Main.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.ENTRY_BLOCK.get(), cubeAll(Blocks.BLACK_WOOL));
        horizontalBlock(ModBlocks.SUPER_CALCULATEUR.get(), new ModelFile.UncheckedModelFile(modLoc("block/supercalculateur")));
    }

    @Override
    public void simpleBlock(Block block, ModelFile model) {
        super.simpleBlock(block, model);
        simpleBlockItem(block, model);
    }

    @Override
    public void horizontalBlock(Block block, ModelFile model) {
        super.horizontalBlock(block, model);
        simpleBlockItem(block, model);
    }
}
