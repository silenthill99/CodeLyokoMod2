package fr.silenthill99.codelyokomod.init.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class SuperCalculateur extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.box(11, 2, 4, 12, 10, 7),
            Block.box(0, 0, 0, 2, 1, 3),
            Block.box(5, 0, 0, 11, 1, 3),
            Block.box(6, 0, 6, 10, 1, 10),
            Block.box(7, 1, 7, 9, 3, 9),
            Block.box(0.5, 0, 3, 1.5, 1, 8.5),
            Block.box(0.5, 0, 7.5, 6, 1, 8.5),
            Block.box(7.5, 0, 3, 8.5, 1, 6),
            Block.box(5, 3, 5, 11, 9, 11),
            Block.box(4, 2, 4, 12, 3, 7),
            Block.box(4, 9, 4, 12, 10, 7),
            Block.box(4, 2, 4, 5, 10, 7)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.box(4, 2, 9, 5, 10, 12),
            Block.box(14, 0, 13, 16, 1, 16),
            Block.box(5, 0, 13, 11, 1, 16),
            Block.box(6, 0, 6, 10, 1, 10),
            Block.box(7, 1, 7, 9, 3, 9),
            Block.box(14.5, 0, 7.5, 15.5, 1, 13),
            Block.box(10, 0, 7.5, 15.5, 1, 8.5),
            Block.box(7.5, 0, 10, 8.5, 1, 13),
            Block.box(5, 3, 5, 11, 9, 11),
            Block.box(4, 2, 9, 12, 3, 12),
            Block.box(4, 9, 9, 12, 10, 12),
            Block.box(11, 2, 9, 12, 10, 12)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.box(9, 2, 11, 12, 10, 12),
            Block.box(13, 0, 0, 16, 1, 2),
            Block.box(13, 0, 5, 16, 1, 11),
            Block.box(6, 0, 6, 10, 1, 10),
            Block.box(7, 1, 7, 9, 3, 9),
            Block.box(7.5, 0, 0.5, 13, 1, 1.5),
            Block.box(7.5, 0, 0.5, 8.5, 1, 6),
            Block.box(10, 0, 7.5, 13, 1, 8.5),
            Block.box(5, 3, 5, 11, 9, 11),
            Block.box(9, 2, 4, 12, 3, 12),
            Block.box(9, 9, 4, 12, 10, 12),
            Block.box(9, 2, 4, 12, 10, 5)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    public static final VoxelShape SHAPE_O = Stream.of(
            Block.box(4, 2, 4, 7, 10, 5),
            Block.box(0, 0, 14, 3, 1, 16),
            Block.box(0, 0, 5, 3, 1, 11),
            Block.box(6, 0, 6, 10, 1, 10),
            Block.box(7, 1, 7, 9, 3, 9),
            Block.box(3, 0, 14.5, 8.5, 1, 15.5),
            Block.box(7.5, 0, 10, 8.5, 1, 15.5),
            Block.box(3, 0, 7.5, 6, 1, 8.5),
            Block.box(5, 3, 5, 11, 9, 11),
            Block.box(4, 2, 4, 7, 3, 12),
            Block.box(4, 9, 4, 7, 10, 12),
            Block.box(4, 2, 11, 7, 10, 12)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn_, BlockPos pos, ISelectionContext context) {
        switch (state.getValue(FACING)) {
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_O;
            default:
                return SHAPE_N;
        }
    }

    public SuperCalculateur() {
        super(AbstractBlock.Properties.of(Material.STONE));

        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return state.setValue(FACING, direction.rotate(state.getValue(FACING)));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }

}
