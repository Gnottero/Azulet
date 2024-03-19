package com.gnottero.blocks;

import com.gnottero.Azulet;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final TestBlock TEST_BLOCK = registerBlock(
            "test_block",
            new TestBlock(FabricBlockSettings.create().hardness(2.0f), Blocks.BARRIER)
    );

    private static <T extends Block> T registerBlock(String name, T block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Azulet.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Azulet.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        Azulet.LOGGER.info("Registering ModBlocks for " + Azulet.MODID);
    }

}
