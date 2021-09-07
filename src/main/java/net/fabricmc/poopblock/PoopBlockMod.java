package net.fabricmc.poopblock;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class PoopBlockMod implements ModInitializer {

	public static final String MOD_ID = "samkoccinos";
	public static final String BLOCK_TAG = "poop_block";
	public static final float POOP_BLOCK_STRENGTH = 2.0f;
	public static final Block POOP_BLOCK = new Block(
			FabricBlockSettings.of(Material.SOIL).strength(POOP_BLOCK_STRENGTH));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, BLOCK_TAG), POOP_BLOCK);
	}
}
