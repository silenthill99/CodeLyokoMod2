package fr.silenthill99.codelyokomod.data.models;

import fr.silenthill99.codelyokomod.Main;
import fr.silenthill99.codelyokomod.init.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockstateGenerator extends BlockStateProvider {


    public BlockstateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Main.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.ENTRY_BLOCK.get(), cubeAll(Blocks.BLACK_WOOL));
        simpleBlockItem(ModBlocks.ENTRY_BLOCK.get(), cubeAll(Blocks.BLACK_WOOL));
    }
}
