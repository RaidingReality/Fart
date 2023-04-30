
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.epicmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.epicmod.block.PoopBlock;
import net.mcreator.epicmod.EpicmodMod;

public class EpicmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EpicmodMod.MODID);
	public static final RegistryObject<Block> POOP = REGISTRY.register("poop", () -> new PoopBlock());
}
