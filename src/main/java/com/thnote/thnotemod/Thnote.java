package com.thnote.thnotemod;

import com.thnote.thnotemod.block.ModBlocks;
import com.thnote.thnotemod.block.entity.ModBlockEntities;
import com.thnote.thnotemod.item.ModItemGroup;
import com.thnote.thnotemod.item.ModItems;
import com.thnote.thnotemod.recipe.ModRecipes;
import com.thnote.thnotemod.screens.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thnote implements ModInitializer {
	public static final String MOD_ID = "thnote";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerBlocks();
		ModItems.registerModItems();
		ModItemGroup.registerItemGroup();
		ModBlockEntities.registerBlockEntities();
		ModRecipes.registerRecipes();
		ModScreenHandlers.registerScreenHandlers();
	}
}