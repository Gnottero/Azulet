package com.gnottero;

import com.gnottero.blocks.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Azulet implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MODID = "azulet";

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}