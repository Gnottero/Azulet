package com.gnottero.blocks;

import eu.pb4.polymer.core.api.block.SimplePolymerBlock;
import eu.pb4.polymer.core.api.utils.PolymerClientDecoded;
import eu.pb4.polymer.core.api.utils.PolymerKeepModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class TestBlock extends SimplePolymerBlock implements PolymerClientDecoded, PolymerKeepModel {

    private final Block polymerBlock;
    public TestBlock(Settings settings, Block polymerBlock) {
        super(settings, polymerBlock);
        this.polymerBlock = polymerBlock;
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return this.polymerBlock;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return this.polymerBlock.getDefaultState();
    }
}