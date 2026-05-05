package com.stonytark.usefultoolsmod.item;

import com.stonytark.usefultoolsmod.UsefultoolsMod;
import com.stonytark.usefultoolsmod.entity.ModEntities;
import com.stonytark.usefultoolsmod.item.custom.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item RGOLD;
    public static Item RAW_RGOLD;
    public static Item OBSHARD;
    public static Item SEM;
    public static Item OBINGOT;
    public static Item GRENADE;
    public static Item HRED;
    public static Item HGLOW;
    public static Item RLAPIS;
    public static Item DYNAMITE;
    public static Item REMERALD_SWORD;
    public static Item REMERALD_PICKAXE;
    public static Item REMERALD_SHOVEL;
    public static Item REMERALD_AXE;
    public static Item REMERALD_HOE;
    public static Item PEMERALD_SWORD;
    public static Item PEMERALD_PICKAXE;
    public static Item PEMERALD_SHOVEL;
    public static Item PEMERALD_AXE;
    public static Item PEMERALD_HOE;
    public static Item ROBSIDIAN_SWORD;
    public static Item ROBSIDIAN_PICKAXE;
    public static Item ROBSIDIAN_SHOVEL;
    public static Item ROBSIDIAN_AXE;
    public static Item ROBSIDIAN_HOE;
    public static Item POBSIDIAN_SWORD;
    public static Item POBSIDIAN_PICKAXE;
    public static Item POBSIDIAN_SHOVEL;
    public static Item POBSIDIAN_AXE;
    public static Item POBSIDIAN_HOE;
    public static Item OVERPOWER_SWORD;
    public static Item OVERPOWER_PICKAXE;
    public static Item OVERPOWER_SHOVEL;
    public static Item OVERPOWER_AXE;
    public static Item HREDSTONE_SWORD;
    public static Item HREDSTONE_PICKAXE;
    public static Item HREDSTONE_SHOVEL;
    public static Item HREDSTONE_AXE;
    public static Item HREDSTONE_HOE;
    public static Item HGLOWSTONE_SWORD;
    public static Item HGLOWSTONE_PICKAXE;
    public static Item HGLOWSTONE_SHOVEL;
    public static Item HGLOWSTONE_AXE;
    public static Item HGLOWSTONE_HOE;
    public static Item RGOLD_SWORD;
    public static Item RGOLD_PICKAXE;
    public static Item RGOLD_SHOVEL;
    public static Item RGOLD_AXE;
    public static Item RGOLD_HOE;
    public static Item RLAPIS_SWORD;
    public static Item RLAPIS_PICKAXE;
    public static Item RLAPIS_SHOVEL;
    public static Item RLAPIS_AXE;
    public static Item RLAPIS_HOE;
    public static Item EMERALD_HELMET;
    public static Item EMERALD_CHESTPLATE;
    public static Item EMERALD_LEGGINGS;
    public static Item EMERALD_BOOTS;
    public static Item HRED_HELMET;
    public static Item HRED_CHESTPLATE;
    public static Item HRED_LEGGINGS;
    public static Item HRED_BOOTS;
    public static Item HGLOW_HELMET;
    public static Item HGLOW_CHESTPLATE;
    public static Item HGLOW_LEGGINGS;
    public static Item HGLOW_BOOTS;
    public static Item OBSIDIAN_HELMET;
    public static Item OBSIDIAN_CHESTPLATE;
    public static Item OBSIDIAN_LEGGINGS;
    public static Item OBSIDIAN_BOOTS;
    public static Item RGOLD_HELMET;
    public static Item RGOLD_CHESTPLATE;
    public static Item RGOLD_LEGGINGS;
    public static Item RGOLD_BOOTS;
    public static Item RLAPIS_HELMET;
    public static Item RLAPIS_CHESTPLATE;
    public static Item RLAPIS_LEGGINGS;
    public static Item RLAPIS_BOOTS;
    public static Item OVERPOWER_HELMET;
    public static Item OVERPOWER_CHESTPLATE;
    public static Item OVERPOWER_LEGGINGS;
    public static Item OVERPOWER_BOOTS;
    public static Item GHOST_SPAWN_EGG;
    public static Item ECTOPLASM;
    public static Item RECTO_SWORD;
    public static Item RECTO_PICKAXE;
    public static Item RECTO_SHOVEL;
    public static Item RECTO_AXE;
    public static Item RECTO_HOE;
    public static Item REFINED_ECTOPLASM;
    public static Item ECTO_SWORD;
    public static Item ECTO_PICKAXE;
    public static Item ECTO_SHOVEL;
    public static Item ECTO_AXE;
    public static Item ECTO_HOE;
    public static Item ECTO_HELMET;
    public static Item ECTO_CHESTPLATE;
    public static Item ECTO_LEGGINGS;
    public static Item ECTO_BOOTS;
    public static Item COAL_DUST;
    public static Item HARDENED_COAL;
    public static Item COAL_SWORD;
    public static Item COAL_PICKAXE;
    public static Item COAL_SHOVEL;
    public static Item COAL_AXE;
    public static Item COAL_HOE;
    public static Item COAL_HELMET;
    public static Item COAL_CHESTPLATE;
    public static Item COAL_LEGGINGS;
    public static Item COAL_BOOTS;
    public static Item RRAW_GOLD_SWORD;
    public static Item RRAW_GOLD_PICKAXE;
    public static Item RRAW_GOLD_SHOVEL;
    public static Item RRAW_GOLD_AXE;
    public static Item RRAW_GOLD_HOE;
    public static Item RRAW_COPPER_SWORD;
    public static Item RRAW_COPPER_PICKAXE;
    public static Item RRAW_COPPER_SHOVEL;
    public static Item RRAW_COPPER_AXE;
    public static Item RRAW_COPPER_HOE;
    public static Item RRAW_IRON_SWORD;
    public static Item RRAW_IRON_PICKAXE;
    public static Item RRAW_IRON_SHOVEL;
    public static Item RRAW_IRON_AXE;
    public static Item RRAW_IRON_HOE;
    public static Item RRAW_RGOLD_SWORD;
    public static Item RRAW_RGOLD_PICKAXE;
    public static Item RRAW_RGOLD_SHOVEL;
    public static Item RRAW_RGOLD_AXE;
    public static Item RRAW_RGOLD_HOE;
    public static Item RSCRAP_SWORD;
    public static Item RSCRAP_PICKAXE;
    public static Item RSCRAP_SHOVEL;
    public static Item RSCRAP_AXE;
    public static Item RSCRAP_HOE;
    public static Item CALCIFIED_AMETHYST;
    public static Item GLACIAL_SHARD;
    public static Item POLISHED_QUARTZ;
    public static Item POLISHED_PRISMARINE;
    public static Item RAMETHYST_SWORD;
    public static Item RAMETHYST_PICKAXE;
    public static Item RAMETHYST_SHOVEL;
    public static Item RAMETHYST_AXE;
    public static Item RAMETHYST_HOE;
    public static Item SNOW_SWORD;
    public static Item SNOW_PICKAXE;
    public static Item SNOW_SHOVEL;
    public static Item SNOW_AXE;
    public static Item SNOW_HOE;
    public static Item RQUARTZ_SWORD;
    public static Item RQUARTZ_PICKAXE;
    public static Item RQUARTZ_SHOVEL;
    public static Item RQUARTZ_AXE;
    public static Item RQUARTZ_HOE;
    public static Item RPRISM_SWORD;
    public static Item RPRISM_PICKAXE;
    public static Item RPRISM_SHOVEL;
    public static Item RPRISM_AXE;
    public static Item RPRISM_HOE;
    public static Item CAMETHYST_SWORD;
    public static Item CAMETHYST_PICKAXE;
    public static Item CAMETHYST_SHOVEL;
    public static Item CAMETHYST_AXE;
    public static Item CAMETHYST_HOE;
    public static Item CAMETHYST_HELMET;
    public static Item CAMETHYST_CHESTPLATE;
    public static Item CAMETHYST_LEGGINGS;
    public static Item CAMETHYST_BOOTS;
    public static Item ICE_SWORD;
    public static Item ICE_PICKAXE;
    public static Item ICE_SHOVEL;
    public static Item ICE_AXE;
    public static Item ICE_HOE;
    public static Item ICE_HELMET;
    public static Item ICE_CHESTPLATE;
    public static Item ICE_LEGGINGS;
    public static Item ICE_BOOTS;
    public static Item PQUARTZ_SWORD;
    public static Item PQUARTZ_PICKAXE;
    public static Item PQUARTZ_SHOVEL;
    public static Item PQUARTZ_AXE;
    public static Item PQUARTZ_HOE;
    public static Item PQUARTZ_HELMET;
    public static Item PQUARTZ_CHESTPLATE;
    public static Item PQUARTZ_LEGGINGS;
    public static Item PQUARTZ_BOOTS;
    public static Item PPRISM_SWORD;
    public static Item PPRISM_PICKAXE;
    public static Item PPRISM_SHOVEL;
    public static Item PPRISM_AXE;
    public static Item PPRISM_HOE;
    public static Item PPRISM_HELMET;
    public static Item PPRISM_CHESTPLATE;
    public static Item PPRISM_LEGGINGS;
    public static Item PPRISM_BOOTS;
    public static Item RFLINT_SWORD;
    public static Item RFLINT_PICKAXE;
    public static Item RFLINT_SHOVEL;
    public static Item RFLINT_AXE;
    public static Item RFLINT_HOE;
    public static Item FNI_SWORD;
    public static Item FNI_PICKAXE;
    public static Item FNI_SHOVEL;
    public static Item FNI_AXE;
    public static Item FNI_HOE;
    public static Item FNI_HELMET;
    public static Item FNI_CHESTPLATE;
    public static Item FNI_LEGGINGS;
    public static Item FNI_BOOTS;
    public static Item ANDESITE_SWORD;
    public static Item ANDESITE_PICKAXE;
    public static Item ANDESITE_SHOVEL;
    public static Item ANDESITE_AXE;
    public static Item ANDESITE_HOE;
    public static Item BASALT_SWORD;
    public static Item BASALT_PICKAXE;
    public static Item BASALT_SHOVEL;
    public static Item BASALT_AXE;
    public static Item BASALT_HOE;
    public static Item BLACKSTONE_SWORD;
    public static Item BLACKSTONE_PICKAXE;
    public static Item BLACKSTONE_SHOVEL;
    public static Item BLACKSTONE_AXE;
    public static Item BLACKSTONE_HOE;
    public static Item CALCITE_SWORD;
    public static Item CALCITE_PICKAXE;
    public static Item CALCITE_SHOVEL;
    public static Item CALCITE_AXE;
    public static Item CALCITE_HOE;
    public static Item DEEPSLATE_SWORD;
    public static Item DEEPSLATE_PICKAXE;
    public static Item DEEPSLATE_SHOVEL;
    public static Item DEEPSLATE_AXE;
    public static Item DEEPSLATE_HOE;
    public static Item DIORITE_SWORD;
    public static Item DIORITE_PICKAXE;
    public static Item DIORITE_SHOVEL;
    public static Item DIORITE_AXE;
    public static Item DIORITE_HOE;
    public static Item END_STONE_SWORD;
    public static Item END_STONE_PICKAXE;
    public static Item END_STONE_SHOVEL;
    public static Item END_STONE_AXE;
    public static Item END_STONE_HOE;
    public static Item GRANITE_SWORD;
    public static Item GRANITE_PICKAXE;
    public static Item GRANITE_SHOVEL;
    public static Item GRANITE_AXE;
    public static Item GRANITE_HOE;
    public static Item NETHERRACK_SWORD;
    public static Item NETHERRACK_PICKAXE;
    public static Item NETHERRACK_SHOVEL;
    public static Item NETHERRACK_AXE;
    public static Item NETHERRACK_HOE;
    public static Item SANDSTONE_SWORD;
    public static Item SANDSTONE_PICKAXE;
    public static Item SANDSTONE_SHOVEL;
    public static Item SANDSTONE_AXE;
    public static Item SANDSTONE_HOE;
    public static Item SMOOTH_BASALT_SWORD;
    public static Item SMOOTH_BASALT_PICKAXE;
    public static Item SMOOTH_BASALT_SHOVEL;
    public static Item SMOOTH_BASALT_AXE;
    public static Item SMOOTH_BASALT_HOE;
    public static Item TERRACOTTA_SWORD;
    public static Item TERRACOTTA_PICKAXE;
    public static Item TERRACOTTA_SHOVEL;
    public static Item TERRACOTTA_AXE;
    public static Item TERRACOTTA_HOE;
    public static Item TUFF_SWORD;
    public static Item TUFF_PICKAXE;
    public static Item TUFF_SHOVEL;
    public static Item TUFF_AXE;
    public static Item TUFF_HOE;
    public static Item OAK_SWORD;
    public static Item OAK_PICKAXE;
    public static Item OAK_SHOVEL;
    public static Item OAK_AXE;
    public static Item OAK_HOE;
    public static Item SPRUCE_SWORD;
    public static Item SPRUCE_PICKAXE;
    public static Item SPRUCE_SHOVEL;
    public static Item SPRUCE_AXE;
    public static Item SPRUCE_HOE;
    public static Item BIRCH_SWORD;
    public static Item BIRCH_PICKAXE;
    public static Item BIRCH_SHOVEL;
    public static Item BIRCH_AXE;
    public static Item BIRCH_HOE;
    public static Item JUNGLE_SWORD;
    public static Item JUNGLE_PICKAXE;
    public static Item JUNGLE_SHOVEL;
    public static Item JUNGLE_AXE;
    public static Item JUNGLE_HOE;
    public static Item ACACIA_SWORD;
    public static Item ACACIA_PICKAXE;
    public static Item ACACIA_SHOVEL;
    public static Item ACACIA_AXE;
    public static Item ACACIA_HOE;
    public static Item DARK_OAK_SWORD;
    public static Item DARK_OAK_PICKAXE;
    public static Item DARK_OAK_SHOVEL;
    public static Item DARK_OAK_AXE;
    public static Item DARK_OAK_HOE;
    public static Item MANGROVE_SWORD;
    public static Item MANGROVE_PICKAXE;
    public static Item MANGROVE_SHOVEL;
    public static Item MANGROVE_AXE;
    public static Item MANGROVE_HOE;
    public static Item CHERRY_SWORD;
    public static Item CHERRY_PICKAXE;
    public static Item CHERRY_SHOVEL;
    public static Item CHERRY_AXE;
    public static Item CHERRY_HOE;
    public static Item BAMBOO_SWORD;
    public static Item BAMBOO_PICKAXE;
    public static Item BAMBOO_SHOVEL;
    public static Item BAMBOO_AXE;
    public static Item BAMBOO_HOE;
    public static Item CRIMSON_SWORD;
    public static Item CRIMSON_PICKAXE;
    public static Item CRIMSON_SHOVEL;
    public static Item CRIMSON_AXE;
    public static Item CRIMSON_HOE;
    public static Item WARPED_SWORD;
    public static Item WARPED_PICKAXE;
    public static Item WARPED_SHOVEL;
    public static Item WARPED_AXE;
    public static Item WARPED_HOE;
    public static Item LEATHER_SWORD;
    public static Item LEATHER_PICKAXE;
    public static Item LEATHER_SHOVEL;
    public static Item LEATHER_AXE;
    public static Item LEATHER_HOE;
    public static Item PAPER_SWORD;
    public static Item PAPER_PICKAXE;
    public static Item PAPER_SHOVEL;
    public static Item PAPER_AXE;
    public static Item PAPER_HOE;
    public static Item FEATHER_SWORD;
    public static Item FEATHER_PICKAXE;
    public static Item FEATHER_SHOVEL;
    public static Item FEATHER_AXE;
    public static Item FEATHER_HOE;
    public static Item GLASS_SWORD;
    public static Item GLASS_PICKAXE;
    public static Item GLASS_SHOVEL;
    public static Item GLASS_AXE;
    public static Item GLASS_HOE;
    public static Item RABBIT_HIDE_HELMET;
    public static Item RABBIT_HIDE_CHESTPLATE;
    public static Item RABBIT_HIDE_LEGGINGS;
    public static Item RABBIT_HIDE_BOOTS;
    public static Item CACTUS_SWORD;
    public static Item CACTUS_PICKAXE;
    public static Item CACTUS_SHOVEL;
    public static Item CACTUS_AXE;
    public static Item CACTUS_HOE;
    public static Item CACTUS_HELMET;
    public static Item CACTUS_CHESTPLATE;
    public static Item CACTUS_LEGGINGS;
    public static Item CACTUS_BOOTS;
    public static Item SPONGE_SWORD;
    public static Item SPONGE_PICKAXE;
    public static Item SPONGE_SHOVEL;
    public static Item SPONGE_AXE;
    public static Item SPONGE_HOE;
    public static Item BONE_SWORD;
    public static Item BONE_PICKAXE;
    public static Item BONE_SHOVEL;
    public static Item BONE_AXE;
    public static Item BONE_HOE;
    public static Item BONE_HELMET;
    public static Item BONE_CHESTPLATE;
    public static Item BONE_LEGGINGS;
    public static Item BONE_BOOTS;
    public static Item CLAY_SWORD;
    public static Item CLAY_PICKAXE;
    public static Item CLAY_SHOVEL;
    public static Item CLAY_AXE;
    public static Item CLAY_HOE;
    public static Item CLAY_HELMET;
    public static Item CLAY_CHESTPLATE;
    public static Item CLAY_LEGGINGS;
    public static Item CLAY_BOOTS;
    public static Item NETHER_WART_SWORD;
    public static Item NETHER_WART_PICKAXE;
    public static Item NETHER_WART_SHOVEL;
    public static Item NETHER_WART_AXE;
    public static Item NETHER_WART_HOE;
    public static Item BRICK_SWORD;
    public static Item BRICK_PICKAXE;
    public static Item BRICK_SHOVEL;
    public static Item BRICK_AXE;
    public static Item BRICK_HOE;
    public static Item BRICK_HELMET;
    public static Item BRICK_CHESTPLATE;
    public static Item BRICK_LEGGINGS;
    public static Item BRICK_BOOTS;
    public static Item NETHER_BRICK_SWORD;
    public static Item NETHER_BRICK_PICKAXE;
    public static Item NETHER_BRICK_SHOVEL;
    public static Item NETHER_BRICK_AXE;
    public static Item NETHER_BRICK_HOE;
    public static Item NETHER_BRICK_HELMET;
    public static Item NETHER_BRICK_CHESTPLATE;
    public static Item NETHER_BRICK_LEGGINGS;
    public static Item NETHER_BRICK_BOOTS;
    public static Item POINTED_DRIPSTONE_SWORD;
    public static Item POINTED_DRIPSTONE_PICKAXE;
    public static Item POINTED_DRIPSTONE_SHOVEL;
    public static Item POINTED_DRIPSTONE_AXE;
    public static Item POINTED_DRIPSTONE_HOE;
    public static Item COPPER_SWORD;
    public static Item COPPER_PICKAXE;
    public static Item COPPER_SHOVEL;
    public static Item COPPER_AXE;
    public static Item COPPER_HOE;
    public static Item COPPER_HELMET;
    public static Item COPPER_CHESTPLATE;
    public static Item COPPER_LEGGINGS;
    public static Item COPPER_BOOTS;
    public static Item PHANTOM_SWORD;
    public static Item PHANTOM_PICKAXE;
    public static Item PHANTOM_SHOVEL;
    public static Item PHANTOM_AXE;
    public static Item PHANTOM_HOE;
    public static Item PHANTOM_HELMET;
    public static Item PHANTOM_CHESTPLATE;
    public static Item PHANTOM_LEGGINGS;
    public static Item PHANTOM_BOOTS;
    public static Item MAGMA_CREAM_SWORD;
    public static Item MAGMA_CREAM_PICKAXE;
    public static Item MAGMA_CREAM_SHOVEL;
    public static Item MAGMA_CREAM_AXE;
    public static Item MAGMA_CREAM_HOE;
    public static Item MAGMA_CREAM_HELMET;
    public static Item MAGMA_CREAM_CHESTPLATE;
    public static Item MAGMA_CREAM_LEGGINGS;
    public static Item MAGMA_CREAM_BOOTS;
    public static Item SLIME_SWORD;
    public static Item SLIME_PICKAXE;
    public static Item SLIME_SHOVEL;
    public static Item SLIME_AXE;
    public static Item SLIME_HOE;
    public static Item SLIME_HELMET;
    public static Item SLIME_CHESTPLATE;
    public static Item SLIME_LEGGINGS;
    public static Item SLIME_BOOTS;
    public static Item BLAZE_SWORD;
    public static Item BLAZE_PICKAXE;
    public static Item BLAZE_SHOVEL;
    public static Item BLAZE_AXE;
    public static Item BLAZE_HOE;
    public static Item BLAZE_HELMET;
    public static Item BLAZE_CHESTPLATE;
    public static Item BLAZE_LEGGINGS;
    public static Item BLAZE_BOOTS;
    public static Item NAUTILUS_SWORD;
    public static Item NAUTILUS_PICKAXE;
    public static Item NAUTILUS_SHOVEL;
    public static Item NAUTILUS_AXE;
    public static Item NAUTILUS_HOE;
    public static Item NAUTILUS_HELMET;
    public static Item NAUTILUS_CHESTPLATE;
    public static Item NAUTILUS_LEGGINGS;
    public static Item NAUTILUS_BOOTS;
    public static Item PURPUR_SWORD;
    public static Item PURPUR_PICKAXE;
    public static Item PURPUR_SHOVEL;
    public static Item PURPUR_AXE;
    public static Item PURPUR_HOE;
    public static Item PURPUR_HELMET;
    public static Item PURPUR_CHESTPLATE;
    public static Item PURPUR_LEGGINGS;
    public static Item PURPUR_BOOTS;
    public static Item GHAST_TEAR_SWORD;
    public static Item GHAST_TEAR_PICKAXE;
    public static Item GHAST_TEAR_SHOVEL;
    public static Item GHAST_TEAR_AXE;
    public static Item GHAST_TEAR_HOE;
    public static Item GHAST_TEAR_HELMET;
    public static Item GHAST_TEAR_CHESTPLATE;
    public static Item GHAST_TEAR_LEGGINGS;
    public static Item GHAST_TEAR_BOOTS;
    public static Item EYE_OF_ENDER_SWORD;
    public static Item EYE_OF_ENDER_PICKAXE;
    public static Item EYE_OF_ENDER_SHOVEL;
    public static Item EYE_OF_ENDER_AXE;
    public static Item EYE_OF_ENDER_HOE;
    public static Item EYE_OF_ENDER_HELMET;
    public static Item EYE_OF_ENDER_CHESTPLATE;
    public static Item EYE_OF_ENDER_LEGGINGS;
    public static Item EYE_OF_ENDER_BOOTS;
    public static Item SHULKER_SWORD;
    public static Item SHULKER_PICKAXE;
    public static Item SHULKER_SHOVEL;
    public static Item SHULKER_AXE;
    public static Item SHULKER_HOE;
    public static Item SHULKER_HELMET;
    public static Item SHULKER_CHESTPLATE;
    public static Item SHULKER_LEGGINGS;
    public static Item SHULKER_BOOTS;
    public static Item TURTLE_SCUTE_HELMET;
    public static Item TURTLE_SCUTE_CHESTPLATE;
    public static Item TURTLE_SCUTE_LEGGINGS;
    public static Item TURTLE_SCUTE_BOOTS;
    public static Item ECHO_SHARD_SWORD;
    public static Item ECHO_SHARD_PICKAXE;
    public static Item ECHO_SHARD_SHOVEL;
    public static Item ECHO_SHARD_AXE;
    public static Item ECHO_SHARD_HOE;
    public static Item ECHO_SHARD_HELMET;
    public static Item ECHO_SHARD_CHESTPLATE;
    public static Item ECHO_SHARD_LEGGINGS;
    public static Item ECHO_SHARD_BOOTS;
    public static Item DRAGON_BREATH_SWORD;
    public static Item DRAGON_BREATH_PICKAXE;
    public static Item DRAGON_BREATH_SHOVEL;
    public static Item DRAGON_BREATH_AXE;
    public static Item DRAGON_BREATH_HOE;
    public static Item DRAGON_BREATH_HELMET;
    public static Item DRAGON_BREATH_CHESTPLATE;
    public static Item DRAGON_BREATH_LEGGINGS;
    public static Item DRAGON_BREATH_BOOTS;
    public static Item CAKE_SWORD;
    public static Item CAKE_PICKAXE;
    public static Item CAKE_SHOVEL;
    public static Item CAKE_AXE;
    public static Item CAKE_HOE;
    public static Item CAKE_HELMET;
    public static Item CAKE_CHESTPLATE;
    public static Item CAKE_LEGGINGS;
    public static Item CAKE_BOOTS;
    public static Item BREAD_SWORD;
    public static Item BREAD_PICKAXE;
    public static Item BREAD_SHOVEL;
    public static Item BREAD_AXE;
    public static Item BREAD_HOE;
    public static Item BREAD_HELMET;
    public static Item BREAD_CHESTPLATE;
    public static Item BREAD_LEGGINGS;
    public static Item BREAD_BOOTS;
    public static Item DRIED_KELP_SWORD;
    public static Item DRIED_KELP_PICKAXE;
    public static Item DRIED_KELP_SHOVEL;
    public static Item DRIED_KELP_AXE;
    public static Item DRIED_KELP_HOE;
    public static Item DRIED_KELP_HELMET;
    public static Item DRIED_KELP_CHESTPLATE;
    public static Item DRIED_KELP_LEGGINGS;
    public static Item DRIED_KELP_BOOTS;
    public static Item ROTTEN_FLESH_SWORD;
    public static Item ROTTEN_FLESH_PICKAXE;
    public static Item ROTTEN_FLESH_SHOVEL;
    public static Item ROTTEN_FLESH_AXE;
    public static Item ROTTEN_FLESH_HOE;
    public static Item ROTTEN_FLESH_HELMET;
    public static Item ROTTEN_FLESH_CHESTPLATE;
    public static Item ROTTEN_FLESH_LEGGINGS;
    public static Item ROTTEN_FLESH_BOOTS;
    public static Item MELON_SWORD;
    public static Item MELON_PICKAXE;
    public static Item MELON_SHOVEL;
    public static Item MELON_AXE;
    public static Item MELON_HOE;
    public static Item MELON_HELMET;
    public static Item MELON_CHESTPLATE;
    public static Item MELON_LEGGINGS;
    public static Item MELON_BOOTS;
    public static Item SWEET_BERRY_SWORD;
    public static Item SWEET_BERRY_PICKAXE;
    public static Item SWEET_BERRY_SHOVEL;
    public static Item SWEET_BERRY_AXE;
    public static Item SWEET_BERRY_HOE;
    public static Item SWEET_BERRY_HELMET;
    public static Item SWEET_BERRY_CHESTPLATE;
    public static Item SWEET_BERRY_LEGGINGS;
    public static Item SWEET_BERRY_BOOTS;
    public static Item PUMPKIN_PIE_SWORD;
    public static Item PUMPKIN_PIE_PICKAXE;
    public static Item PUMPKIN_PIE_SHOVEL;
    public static Item PUMPKIN_PIE_AXE;
    public static Item PUMPKIN_PIE_HOE;
    public static Item PUMPKIN_PIE_HELMET;
    public static Item PUMPKIN_PIE_CHESTPLATE;
    public static Item PUMPKIN_PIE_LEGGINGS;
    public static Item PUMPKIN_PIE_BOOTS;
    public static Item MUSHROOM_SWORD;
    public static Item MUSHROOM_PICKAXE;
    public static Item MUSHROOM_SHOVEL;
    public static Item MUSHROOM_AXE;
    public static Item MUSHROOM_HOE;
    public static Item MUSHROOM_HELMET;
    public static Item MUSHROOM_CHESTPLATE;
    public static Item MUSHROOM_LEGGINGS;
    public static Item MUSHROOM_BOOTS;
    public static Item PUFFERFISH_SWORD;
    public static Item PUFFERFISH_PICKAXE;
    public static Item PUFFERFISH_SHOVEL;
    public static Item PUFFERFISH_AXE;
    public static Item PUFFERFISH_HOE;
    public static Item PUFFERFISH_HELMET;
    public static Item PUFFERFISH_CHESTPLATE;
    public static Item PUFFERFISH_LEGGINGS;
    public static Item PUFFERFISH_BOOTS;
    public static Item HONEY_SWORD;
    public static Item HONEY_PICKAXE;
    public static Item HONEY_SHOVEL;
    public static Item HONEY_AXE;
    public static Item HONEY_HOE;
    public static Item HONEY_HELMET;
    public static Item HONEY_CHESTPLATE;
    public static Item HONEY_LEGGINGS;
    public static Item HONEY_BOOTS;
    public static Item CHORUS_FRUIT_SWORD;
    public static Item CHORUS_FRUIT_PICKAXE;
    public static Item CHORUS_FRUIT_SHOVEL;
    public static Item CHORUS_FRUIT_AXE;
    public static Item CHORUS_FRUIT_HOE;
    public static Item CHORUS_FRUIT_HELMET;
    public static Item CHORUS_FRUIT_CHESTPLATE;
    public static Item CHORUS_FRUIT_LEGGINGS;
    public static Item CHORUS_FRUIT_BOOTS;
    public static Item GOLDEN_APPLE_SWORD;
    public static Item GOLDEN_APPLE_PICKAXE;
    public static Item GOLDEN_APPLE_SHOVEL;
    public static Item GOLDEN_APPLE_AXE;
    public static Item GOLDEN_APPLE_HOE;
    public static Item GOLDEN_APPLE_HELMET;
    public static Item GOLDEN_APPLE_CHESTPLATE;
    public static Item GOLDEN_APPLE_LEGGINGS;
    public static Item GOLDEN_APPLE_BOOTS;

    public static void register() {
        RGOLD = reg("rgold", new Item(new Item.Settings().maxCount(64)));
        RAW_RGOLD = reg("raw_rgold", new Item(new Item.Settings().maxCount(64)));
        OBSHARD = reg("obshard", new Item(new Item.Settings().maxCount(64)));
        SEM = reg("sem", new Item(new Item.Settings().maxCount(64)));
        OBINGOT = reg("obingot", new Item(new Item.Settings().maxCount(64)));
        GRENADE = reg("grenade", new Grenade(new Item.Settings().maxCount(16)));
        HRED = reg("hred", new Item(new Item.Settings().maxCount(64)));
        HGLOW = reg("hglow", new Item(new Item.Settings().maxCount(64)));
        RLAPIS = reg("rlapis", new Item(new Item.Settings().maxCount(64)));
        DYNAMITE = reg("dynamite", new Dynamite(new Item.Settings()
                            .maxCount(16)
                            .fireproof()  // optional
                    ));
        REMERALD_SWORD = reg("remerald_sword", new SwordItem(ModToolTiers.REMERALD, 3, -2.4f, new Item.Settings()));
        REMERALD_PICKAXE = reg("remerald_pickaxe", new PickaxeItem(ModToolTiers.REMERALD, 1, -2.8f, new Item.Settings()));
        REMERALD_SHOVEL = reg("remerald_shovel", new ShovelItem(ModToolTiers.REMERALD, 1.5f, -3f, new Item.Settings()));
        REMERALD_AXE = reg("remerald_axe", new AxeItem(ModToolTiers.REMERALD, 6, -3.2f, new Item.Settings()));
        REMERALD_HOE = reg("remerald_hoe", new HoeItem(ModToolTiers.REMERALD, 0, -3f, new Item.Settings()));
        PEMERALD_SWORD = reg("pemerald_sword", new SwordItem(ModToolTiers.PEMERALD, 3, -2.4f, new Item.Settings()));
        PEMERALD_PICKAXE = reg("pemerald_pickaxe", new PickaxeItem(ModToolTiers.PEMERALD, 1, -2.8f, new Item.Settings()));
        PEMERALD_SHOVEL = reg("pemerald_shovel", new ShovelItem(ModToolTiers.PEMERALD, 1.5f, -3f, new Item.Settings()));
        PEMERALD_AXE = reg("pemerald_axe", new AxeItem(ModToolTiers.PEMERALD, 6, -3.2f, new Item.Settings()));
        PEMERALD_HOE = reg("pemerald_hoe", new HoeItem(ModToolTiers.PEMERALD, 0, -3f, new Item.Settings()));
        ROBSIDIAN_SWORD = reg("robsidian_sword", new SwordItem(ModToolTiers.ROBSIDIAN, 3, -2.4f, new Item.Settings()));
        ROBSIDIAN_PICKAXE = reg("robsidian_pickaxe", new PickaxeItem(ModToolTiers.ROBSIDIAN, 1, -2.8f, new Item.Settings()));
        ROBSIDIAN_SHOVEL = reg("robsidian_shovel", new ShovelItem(ModToolTiers.ROBSIDIAN, 1.5f, -3f, new Item.Settings()));
        ROBSIDIAN_AXE = reg("robsidian_axe", new AxeItem(ModToolTiers.ROBSIDIAN, 6, -3.2f, new Item.Settings()));
        ROBSIDIAN_HOE = reg("robsidian_hoe", new HoeItem(ModToolTiers.ROBSIDIAN, 0, -3f, new Item.Settings()));
        POBSIDIAN_SWORD = reg("pobsidian_sword", new SwordItem(ModToolTiers.POBSIDIAN, 3, -2.4f, new Item.Settings()));
        POBSIDIAN_PICKAXE = reg("pobsidian_pickaxe", new PickaxeItem(ModToolTiers.POBSIDIAN, 1, -2.8f, new Item.Settings()));
        POBSIDIAN_SHOVEL = reg("pobsidian_shovel", new ShovelItem(ModToolTiers.POBSIDIAN, 1.5f, -3f, new Item.Settings()));
        POBSIDIAN_AXE = reg("pobsidian_axe", new AxeItem(ModToolTiers.POBSIDIAN, 6, -3.2f, new Item.Settings()));
        POBSIDIAN_HOE = reg("pobsidian_hoe", new HoeItem(ModToolTiers.POBSIDIAN, 0, -3f, new Item.Settings()));
        OVERPOWER_SWORD = reg("overpower_sword", new SwordItem(ModToolTiers.OVERPOWER, 3, -2.4f, new Item.Settings()));
        OVERPOWER_PICKAXE = reg("overpower_pickaxe", new PickaxeItem(ModToolTiers.OVERPOWER, 1, -2.8f, new Item.Settings()));
        OVERPOWER_SHOVEL = reg("overpower_shovel", new ShovelItem(ModToolTiers.OVERPOWER, 1.5f, -3f, new Item.Settings()));
        OVERPOWER_AXE = reg("overpower_axe", new AxeItem(ModToolTiers.OVERPOWER, 6, -3.2f, new Item.Settings()));
        HREDSTONE_SWORD = reg("hredstone_sword", new SwordItem(ModToolTiers.HREDSTONE, 3, -2.4f, new Item.Settings()));
        HREDSTONE_PICKAXE = reg("hredstone_pickaxe", new PickaxeItem(ModToolTiers.HREDSTONE, 1, -2.8f, new Item.Settings()));
        HREDSTONE_SHOVEL = reg("hredstone_shovel", new ShovelItem(ModToolTiers.HREDSTONE, 1.5f, -3f, new Item.Settings()));
        HREDSTONE_AXE = reg("hredstone_axe", new AxeItem(ModToolTiers.HREDSTONE, 6, -3.2f, new Item.Settings()));
        HREDSTONE_HOE = reg("hredstone_hoe", new HoeItem(ModToolTiers.HREDSTONE, 0, -3f, new Item.Settings()));
        HGLOWSTONE_SWORD = reg("hglowstone_sword", new SwordItem(ModToolTiers.HGLOWSTONE, 3, -2.4f, new Item.Settings()));
        HGLOWSTONE_PICKAXE = reg("hglowstone_pickaxe", new PickaxeItem(ModToolTiers.HGLOWSTONE, 1, -2.8f, new Item.Settings()));
        HGLOWSTONE_SHOVEL = reg("hglowstone_shovel", new ShovelItem(ModToolTiers.HGLOWSTONE, 1.5f, -3f, new Item.Settings()));
        HGLOWSTONE_AXE = reg("hglowstone_axe", new AxeItem(ModToolTiers.HGLOWSTONE, 6, -3.2f, new Item.Settings()));
        HGLOWSTONE_HOE = reg("hglowstone_hoe", new HoeItem(ModToolTiers.HGLOWSTONE, 0, -3f, new Item.Settings()));
        RGOLD_SWORD = reg("rgold_sword", new SwordItem(ModToolTiers.RGOLD, 3, -2.4f, new Item.Settings()));
        RGOLD_PICKAXE = reg("rgold_pickaxe", new PickaxeItem(ModToolTiers.RGOLD, 1, -2.8f, new Item.Settings()));
        RGOLD_SHOVEL = reg("rgold_shovel", new ShovelItem(ModToolTiers.RGOLD, 1.5f, -3f, new Item.Settings()));
        RGOLD_AXE = reg("rgold_axe", new AxeItem(ModToolTiers.RGOLD, 6, -3.2f, new Item.Settings()));
        RGOLD_HOE = reg("rgold_hoe", new HoeItem(ModToolTiers.RGOLD, 0, -3f, new Item.Settings()));
        RLAPIS_SWORD = reg("rlapis_sword", new SwordItem(ModToolTiers.RLAPIS, 3, -2.4f, new Item.Settings()));
        RLAPIS_PICKAXE = reg("rlapis_pickaxe", new PickaxeItem(ModToolTiers.RLAPIS, 1, -2.8f, new Item.Settings()));
        RLAPIS_SHOVEL = reg("rlapis_shovel", new ShovelItem(ModToolTiers.RLAPIS, 1.5f, -3f, new Item.Settings()));
        RLAPIS_AXE = reg("rlapis_axe", new AxeItem(ModToolTiers.RLAPIS, 6, -3.2f, new Item.Settings()));
        RLAPIS_HOE = reg("rlapis_hoe", new HoeItem(ModToolTiers.RLAPIS, 0, -3f, new Item.Settings()));
        EMERALD_HELMET = reg("emerald_helmet", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        EMERALD_CHESTPLATE = reg("emerald_chestplate", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        EMERALD_LEGGINGS = reg("emerald_leggings", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        EMERALD_BOOTS = reg("emerald_boots", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        HRED_HELMET = reg("hred_helmet", new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        HRED_CHESTPLATE = reg("hred_chestplate", new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        HRED_LEGGINGS = reg("hred_leggings", new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        HRED_BOOTS = reg("hred_boots", new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        HGLOW_HELMET = reg("hglow_helmet", new ArmorItem(ModArmorMaterials.HGLOW, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        HGLOW_CHESTPLATE = reg("hglow_chestplate", new ArmorItem(ModArmorMaterials.HGLOW, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        HGLOW_LEGGINGS = reg("hglow_leggings", new ArmorItem(ModArmorMaterials.HGLOW, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        HGLOW_BOOTS = reg("hglow_boots", new ArmorItem(ModArmorMaterials.HGLOW, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        OBSIDIAN_HELMET = reg("obsidian_helmet", new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        OBSIDIAN_CHESTPLATE = reg("obsidian_chestplate", new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        OBSIDIAN_LEGGINGS = reg("obsidian_leggings", new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        OBSIDIAN_BOOTS = reg("obsidian_boots", new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        RGOLD_HELMET = reg("rgold_helmet", new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        RGOLD_CHESTPLATE = reg("rgold_chestplate", new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        RGOLD_LEGGINGS = reg("rgold_leggings", new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        RGOLD_BOOTS = reg("rgold_boots", new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        RLAPIS_HELMET = reg("rlapis_helmet", new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        RLAPIS_CHESTPLATE = reg("rlapis_chestplate", new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        RLAPIS_LEGGINGS = reg("rlapis_leggings", new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        RLAPIS_BOOTS = reg("rlapis_boots", new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        OVERPOWER_HELMET = reg("overpower_helmet", new ModArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        OVERPOWER_CHESTPLATE = reg("overpower_chestplate", new ArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        OVERPOWER_LEGGINGS = reg("overpower_leggings", new ArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        OVERPOWER_BOOTS = reg("overpower_boots", new ArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        GHOST_SPAWN_EGG = reg("ghost_spawn_egg", new SpawnEggItem(ModEntities.GHOST, 0xFFFFFF, 0x999999, new Item.Settings()));
        ECTOPLASM = reg("ectoplasm", new Item(new Item.Settings().maxCount(64)));
        RECTO_SWORD = reg("recto_sword", new EctoSwordItem(ModToolTiers.RECTO, new Item.Settings()));
        RECTO_PICKAXE = reg("recto_pickaxe", new EctoPickaxeItem(ModToolTiers.RECTO, new Item.Settings()));
        RECTO_SHOVEL = reg("recto_shovel", new EctoShovelItem(ModToolTiers.RECTO, 1.5f, -3f, new Item.Settings()));
        RECTO_AXE = reg("recto_axe", new EctoAxeItem(ModToolTiers.RECTO, new Item.Settings()));
        RECTO_HOE = reg("recto_hoe", new EctoHoeItem(ModToolTiers.RECTO, 0, -3f, new Item.Settings()));
        REFINED_ECTOPLASM = reg("refined_ectoplasm", new Item(new Item.Settings().maxCount(64)));
        ECTO_SWORD = reg("ecto_sword", new EctoSwordItem(ModToolTiers.ECTOPLASM, new Item.Settings()));
        ECTO_PICKAXE = reg("ecto_pickaxe", new EctoPickaxeItem(ModToolTiers.ECTOPLASM, new Item.Settings()));
        ECTO_SHOVEL = reg("ecto_shovel", new EctoShovelItem(ModToolTiers.ECTOPLASM, 1.5f, -3f, new Item.Settings()));
        ECTO_AXE = reg("ecto_axe", new EctoAxeItem(ModToolTiers.ECTOPLASM, new Item.Settings()));
        ECTO_HOE = reg("ecto_hoe", new EctoHoeItem(ModToolTiers.ECTOPLASM, 0, -3f, new Item.Settings()));
        ECTO_HELMET = reg("ecto_helmet", new ArmorItem(ModArmorMaterials.ECTO, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        ECTO_CHESTPLATE = reg("ecto_chestplate", new ArmorItem(ModArmorMaterials.ECTO, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        ECTO_LEGGINGS = reg("ecto_leggings", new ArmorItem(ModArmorMaterials.ECTO, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        ECTO_BOOTS = reg("ecto_boots", new ArmorItem(ModArmorMaterials.ECTO, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        COAL_DUST = reg("coal_dust", new Item(new Item.Settings().maxCount(64)));
        HARDENED_COAL = reg("hardened_coal", new Item(new Item.Settings().maxCount(64)));
        COAL_SWORD = reg("coal_sword", new CoalSwordItem(ModToolTiers.COAL_TOOL, 2, -2.4f, new Item.Settings()));
        COAL_PICKAXE = reg("coal_pickaxe", new CoalPickaxeItem(ModToolTiers.COAL_TOOL, 1, -2.8f, new Item.Settings()));
        COAL_SHOVEL = reg("coal_shovel", new CoalShovelItem(ModToolTiers.COAL_TOOL, 1.5f, -3f, new Item.Settings()));
        COAL_AXE = reg("coal_axe", new CoalAxeItem(ModToolTiers.COAL_TOOL, 5, -3.2f, new Item.Settings()));
        COAL_HOE = reg("coal_hoe", new CoalHoeItem(ModToolTiers.COAL_TOOL, 0, -3f, new Item.Settings()));
        COAL_HELMET = reg("coal_helmet", new CoalArmorItem(ModArmorMaterials.COAL, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        COAL_CHESTPLATE = reg("coal_chestplate", new CoalArmorItem(ModArmorMaterials.COAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        COAL_LEGGINGS = reg("coal_leggings", new CoalArmorItem(ModArmorMaterials.COAL, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        COAL_BOOTS = reg("coal_boots", new CoalArmorItem(ModArmorMaterials.COAL, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        RRAW_GOLD_SWORD = reg("rraw_gold_sword", new SwordItem(ModToolTiers.RRAW_GOLD, 3, -2.4f, new Item.Settings()));
        RRAW_GOLD_PICKAXE = reg("rraw_gold_pickaxe", new PickaxeItem(ModToolTiers.RRAW_GOLD, 1, -2.8f, new Item.Settings()));
        RRAW_GOLD_SHOVEL = reg("rraw_gold_shovel", new ShovelItem(ModToolTiers.RRAW_GOLD, 1.5f, -3f, new Item.Settings()));
        RRAW_GOLD_AXE = reg("rraw_gold_axe", new AxeItem(ModToolTiers.RRAW_GOLD, 6, -3.2f, new Item.Settings()));
        RRAW_GOLD_HOE = reg("rraw_gold_hoe", new HoeItem(ModToolTiers.RRAW_GOLD, 0, -3f, new Item.Settings()));
        RRAW_COPPER_SWORD = reg("rraw_copper_sword", new SwordItem(ModToolTiers.RRAW_COPPER, 3, -2.4f, new Item.Settings()));
        RRAW_COPPER_PICKAXE = reg("rraw_copper_pickaxe", new PickaxeItem(ModToolTiers.RRAW_COPPER, 1, -2.8f, new Item.Settings()));
        RRAW_COPPER_SHOVEL = reg("rraw_copper_shovel", new ShovelItem(ModToolTiers.RRAW_COPPER, 1.5f, -3f, new Item.Settings()));
        RRAW_COPPER_AXE = reg("rraw_copper_axe", new AxeItem(ModToolTiers.RRAW_COPPER, 6, -3.2f, new Item.Settings()));
        RRAW_COPPER_HOE = reg("rraw_copper_hoe", new HoeItem(ModToolTiers.RRAW_COPPER, 0, -3f, new Item.Settings()));
        RRAW_IRON_SWORD = reg("rraw_iron_sword", new SwordItem(ModToolTiers.RRAW_IRON, 3, -2.4f, new Item.Settings()));
        RRAW_IRON_PICKAXE = reg("rraw_iron_pickaxe", new PickaxeItem(ModToolTiers.RRAW_IRON, 1, -2.8f, new Item.Settings()));
        RRAW_IRON_SHOVEL = reg("rraw_iron_shovel", new ShovelItem(ModToolTiers.RRAW_IRON, 1.5f, -3f, new Item.Settings()));
        RRAW_IRON_AXE = reg("rraw_iron_axe", new AxeItem(ModToolTiers.RRAW_IRON, 6, -3.2f, new Item.Settings()));
        RRAW_IRON_HOE = reg("rraw_iron_hoe", new HoeItem(ModToolTiers.RRAW_IRON, 0, -3f, new Item.Settings()));
        RRAW_RGOLD_SWORD = reg("rraw_rgold_sword", new SwordItem(ModToolTiers.RRAW_RGOLD, 3, -2.4f, new Item.Settings()));
        RRAW_RGOLD_PICKAXE = reg("rraw_rgold_pickaxe", new PickaxeItem(ModToolTiers.RRAW_RGOLD, 1, -2.8f, new Item.Settings()));
        RRAW_RGOLD_SHOVEL = reg("rraw_rgold_shovel", new ShovelItem(ModToolTiers.RRAW_RGOLD, 1.5f, -3f, new Item.Settings()));
        RRAW_RGOLD_AXE = reg("rraw_rgold_axe", new AxeItem(ModToolTiers.RRAW_RGOLD, 6, -3.2f, new Item.Settings()));
        RRAW_RGOLD_HOE = reg("rraw_rgold_hoe", new HoeItem(ModToolTiers.RRAW_RGOLD, 0, -3f, new Item.Settings()));
        RSCRAP_SWORD = reg("rscrap_sword", new SwordItem(ModToolTiers.RSCRAP, 3, -2.4f, new Item.Settings()));
        RSCRAP_PICKAXE = reg("rscrap_pickaxe", new PickaxeItem(ModToolTiers.RSCRAP, 1, -2.8f, new Item.Settings()));
        RSCRAP_SHOVEL = reg("rscrap_shovel", new ShovelItem(ModToolTiers.RSCRAP, 1.5f, -3f, new Item.Settings()));
        RSCRAP_AXE = reg("rscrap_axe", new AxeItem(ModToolTiers.RSCRAP, 6, -3.2f, new Item.Settings()));
        RSCRAP_HOE = reg("rscrap_hoe", new HoeItem(ModToolTiers.RSCRAP, 0, -3f, new Item.Settings()));
        CALCIFIED_AMETHYST = reg("calcified_amethyst", new Item(new Item.Settings().maxCount(64)));
        GLACIAL_SHARD = reg("glacial_shard", new Item(new Item.Settings().maxCount(64)));
        POLISHED_QUARTZ = reg("polished_quartz", new Item(new Item.Settings().maxCount(64)));
        POLISHED_PRISMARINE = reg("polished_prismarine", new Item(new Item.Settings().maxCount(64)));
        RAMETHYST_SWORD = reg("ramethyst_sword", new SwordItem(ModToolTiers.RAMETHYST, 3, -2.4f, new Item.Settings()));
        RAMETHYST_PICKAXE = reg("ramethyst_pickaxe", new PickaxeItem(ModToolTiers.RAMETHYST, 1, -2.8f, new Item.Settings()));
        RAMETHYST_SHOVEL = reg("ramethyst_shovel", new ShovelItem(ModToolTiers.RAMETHYST, 1.5f, -3f, new Item.Settings()));
        RAMETHYST_AXE = reg("ramethyst_axe", new AxeItem(ModToolTiers.RAMETHYST, 6, -3.2f, new Item.Settings()));
        RAMETHYST_HOE = reg("ramethyst_hoe", new HoeItem(ModToolTiers.RAMETHYST, 0, -3f, new Item.Settings()));
        SNOW_SWORD = reg("snow_sword", new SwordItem(ModToolTiers.SNOW_TOOL, 3, -2.4f, new Item.Settings()));
        SNOW_PICKAXE = reg("snow_pickaxe", new PickaxeItem(ModToolTiers.SNOW_TOOL, 1, -2.8f, new Item.Settings()));
        SNOW_SHOVEL = reg("snow_shovel", new ShovelItem(ModToolTiers.SNOW_TOOL, 1.5f, -3f, new Item.Settings()));
        SNOW_AXE = reg("snow_axe", new AxeItem(ModToolTiers.SNOW_TOOL, 6, -3.2f, new Item.Settings()));
        SNOW_HOE = reg("snow_hoe", new HoeItem(ModToolTiers.SNOW_TOOL, 0, -3f, new Item.Settings()));
        RQUARTZ_SWORD = reg("rquartz_sword", new SwordItem(ModToolTiers.RQUARTZ, 3, -2.4f, new Item.Settings()));
        RQUARTZ_PICKAXE = reg("rquartz_pickaxe", new PickaxeItem(ModToolTiers.RQUARTZ, 1, -2.8f, new Item.Settings()));
        RQUARTZ_SHOVEL = reg("rquartz_shovel", new ShovelItem(ModToolTiers.RQUARTZ, 1.5f, -3f, new Item.Settings()));
        RQUARTZ_AXE = reg("rquartz_axe", new AxeItem(ModToolTiers.RQUARTZ, 6, -3.2f, new Item.Settings()));
        RQUARTZ_HOE = reg("rquartz_hoe", new HoeItem(ModToolTiers.RQUARTZ, 0, -3f, new Item.Settings()));
        RPRISM_SWORD = reg("rprism_sword", new SwordItem(ModToolTiers.RPRISM, 3, -2.4f, new Item.Settings()));
        RPRISM_PICKAXE = reg("rprism_pickaxe", new PickaxeItem(ModToolTiers.RPRISM, 1, -2.8f, new Item.Settings()));
        RPRISM_SHOVEL = reg("rprism_shovel", new ShovelItem(ModToolTiers.RPRISM, 1.5f, -3f, new Item.Settings()));
        RPRISM_AXE = reg("rprism_axe", new AxeItem(ModToolTiers.RPRISM, 6, -3.2f, new Item.Settings()));
        RPRISM_HOE = reg("rprism_hoe", new HoeItem(ModToolTiers.RPRISM, 0, -3f, new Item.Settings()));
        CAMETHYST_SWORD = reg("camethyst_sword", new SwordItem(ModToolTiers.CAMETHYST, 3, -2.4f, new Item.Settings()));
        CAMETHYST_PICKAXE = reg("camethyst_pickaxe", new PickaxeItem(ModToolTiers.CAMETHYST, 1, -2.8f, new Item.Settings()));
        CAMETHYST_SHOVEL = reg("camethyst_shovel", new ShovelItem(ModToolTiers.CAMETHYST, 1.5f, -3f, new Item.Settings()));
        CAMETHYST_AXE = reg("camethyst_axe", new AxeItem(ModToolTiers.CAMETHYST, 6, -3.2f, new Item.Settings()));
        CAMETHYST_HOE = reg("camethyst_hoe", new HoeItem(ModToolTiers.CAMETHYST, 0, -3f, new Item.Settings()));
        CAMETHYST_HELMET = reg("camethyst_helmet", new ArmorItem(ModArmorMaterials.CAMETHYST, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        CAMETHYST_CHESTPLATE = reg("camethyst_chestplate", new ArmorItem(ModArmorMaterials.CAMETHYST, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        CAMETHYST_LEGGINGS = reg("camethyst_leggings", new ArmorItem(ModArmorMaterials.CAMETHYST, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        CAMETHYST_BOOTS = reg("camethyst_boots", new ArmorItem(ModArmorMaterials.CAMETHYST, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        ICE_SWORD = reg("ice_sword", new SwordItem(ModToolTiers.ICE_TOOL, 3, -2.4f, new Item.Settings()));
        ICE_PICKAXE = reg("ice_pickaxe", new PickaxeItem(ModToolTiers.ICE_TOOL, 1, -2.8f, new Item.Settings()));
        ICE_SHOVEL = reg("ice_shovel", new ShovelItem(ModToolTiers.ICE_TOOL, 1.5f, -3f, new Item.Settings()));
        ICE_AXE = reg("ice_axe", new AxeItem(ModToolTiers.ICE_TOOL, 6, -3.2f, new Item.Settings()));
        ICE_HOE = reg("ice_hoe", new HoeItem(ModToolTiers.ICE_TOOL, 0, -3f, new Item.Settings()));
        ICE_HELMET = reg("ice_helmet", new ArmorItem(ModArmorMaterials.ICE, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        ICE_CHESTPLATE = reg("ice_chestplate", new ArmorItem(ModArmorMaterials.ICE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        ICE_LEGGINGS = reg("ice_leggings", new ArmorItem(ModArmorMaterials.ICE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        ICE_BOOTS = reg("ice_boots", new ArmorItem(ModArmorMaterials.ICE, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        PQUARTZ_SWORD = reg("pquartz_sword", new SwordItem(ModToolTiers.PQUARTZ, 3, -2.4f, new Item.Settings()));
        PQUARTZ_PICKAXE = reg("pquartz_pickaxe", new PickaxeItem(ModToolTiers.PQUARTZ, 1, -2.8f, new Item.Settings()));
        PQUARTZ_SHOVEL = reg("pquartz_shovel", new ShovelItem(ModToolTiers.PQUARTZ, 1.5f, -3f, new Item.Settings()));
        PQUARTZ_AXE = reg("pquartz_axe", new AxeItem(ModToolTiers.PQUARTZ, 6, -3.2f, new Item.Settings()));
        PQUARTZ_HOE = reg("pquartz_hoe", new HoeItem(ModToolTiers.PQUARTZ, 0, -3f, new Item.Settings()));
        PQUARTZ_HELMET = reg("pquartz_helmet", new ArmorItem(ModArmorMaterials.PQUARTZ, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        PQUARTZ_CHESTPLATE = reg("pquartz_chestplate", new ArmorItem(ModArmorMaterials.PQUARTZ, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        PQUARTZ_LEGGINGS = reg("pquartz_leggings", new ArmorItem(ModArmorMaterials.PQUARTZ, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        PQUARTZ_BOOTS = reg("pquartz_boots", new ArmorItem(ModArmorMaterials.PQUARTZ, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        PPRISM_SWORD = reg("pprism_sword", new SwordItem(ModToolTiers.PPRISM, 3, -2.4f, new Item.Settings()));
        PPRISM_PICKAXE = reg("pprism_pickaxe", new PickaxeItem(ModToolTiers.PPRISM, 1, -2.8f, new Item.Settings()));
        PPRISM_SHOVEL = reg("pprism_shovel", new ShovelItem(ModToolTiers.PPRISM, 1.5f, -3f, new Item.Settings()));
        PPRISM_AXE = reg("pprism_axe", new AxeItem(ModToolTiers.PPRISM, 6, -3.2f, new Item.Settings()));
        PPRISM_HOE = reg("pprism_hoe", new HoeItem(ModToolTiers.PPRISM, 0, -3f, new Item.Settings()));
        PPRISM_HELMET = reg("pprism_helmet", new ArmorItem(ModArmorMaterials.PPRISM, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        PPRISM_CHESTPLATE = reg("pprism_chestplate", new ArmorItem(ModArmorMaterials.PPRISM, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        PPRISM_LEGGINGS = reg("pprism_leggings", new ArmorItem(ModArmorMaterials.PPRISM, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        PPRISM_BOOTS = reg("pprism_boots", new ArmorItem(ModArmorMaterials.PPRISM, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        RFLINT_SWORD = reg("rflint_sword", new SwordItem(ModToolTiers.RFLINT, 3, -2.4f, new Item.Settings()));
        RFLINT_PICKAXE = reg("rflint_pickaxe", new PickaxeItem(ModToolTiers.RFLINT, 1, -2.8f, new Item.Settings()));
        RFLINT_SHOVEL = reg("rflint_shovel", new ShovelItem(ModToolTiers.RFLINT, 1.5f, -3f, new Item.Settings()));
        RFLINT_AXE = reg("rflint_axe", new AxeItem(ModToolTiers.RFLINT, 6, -3.2f, new Item.Settings()));
        RFLINT_HOE = reg("rflint_hoe", new HoeItem(ModToolTiers.RFLINT, 0, -3f, new Item.Settings()));
        FNI_SWORD = reg("fni_sword", new SwordItem(ModToolTiers.FNI_TOOLS, 3, -2.4f, new Item.Settings()));
        FNI_PICKAXE = reg("fni_pickaxe", new PickaxeItem(ModToolTiers.FNI_TOOLS, 1, -2.8f, new Item.Settings()));
        FNI_SHOVEL = reg("fni_shovel", new ShovelItem(ModToolTiers.FNI_TOOLS, 1.5f, -3f, new Item.Settings()));
        FNI_AXE = reg("fni_axe", new AxeItem(ModToolTiers.FNI_TOOLS, 6, -3.2f, new Item.Settings()));
        FNI_HOE = reg("fni_hoe", new HoeItem(ModToolTiers.FNI_TOOLS, 0, -3f, new Item.Settings()));
        FNI_HELMET = reg("fni_helmet", new ArmorItem(ModArmorMaterials.FNI, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        FNI_CHESTPLATE = reg("fni_chestplate", new ArmorItem(ModArmorMaterials.FNI, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        FNI_LEGGINGS = reg("fni_leggings", new ArmorItem(ModArmorMaterials.FNI, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        FNI_BOOTS = reg("fni_boots", new ArmorItem(ModArmorMaterials.FNI, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        ANDESITE_SWORD = reg("andesite_sword", new SwordItem(ModToolTiers.STONE_ANDESITE, 3, -2.4f, new Item.Settings()));
        ANDESITE_PICKAXE = reg("andesite_pickaxe", new PickaxeItem(ModToolTiers.STONE_ANDESITE, 1, -2.8f, new Item.Settings()));
        ANDESITE_SHOVEL = reg("andesite_shovel", new ShovelItem(ModToolTiers.STONE_ANDESITE, 1.5f, -3f, new Item.Settings()));
        ANDESITE_AXE = reg("andesite_axe", new AxeItem(ModToolTiers.STONE_ANDESITE, 6, -3.2f, new Item.Settings()));
        ANDESITE_HOE = reg("andesite_hoe", new HoeItem(ModToolTiers.STONE_ANDESITE, 0, -3f, new Item.Settings()));
        BASALT_SWORD = reg("basalt_sword", new SwordItem(ModToolTiers.STONE_BASALT, 3, -2.5f, new Item.Settings()));
        BASALT_PICKAXE = reg("basalt_pickaxe", new PickaxeItem(ModToolTiers.STONE_BASALT, 1, -2.9f, new Item.Settings()));
        BASALT_SHOVEL = reg("basalt_shovel", new ShovelItem(ModToolTiers.STONE_BASALT, 2.0f, -3.1f, new Item.Settings()));
        BASALT_AXE = reg("basalt_axe", new AxeItem(ModToolTiers.STONE_BASALT, 7, -3.3f, new Item.Settings()));
        BASALT_HOE = reg("basalt_hoe", new HoeItem(ModToolTiers.STONE_BASALT, 0, -3.1f, new Item.Settings()));
        BLACKSTONE_SWORD = reg("blackstone_sword", new SwordItem(ModToolTiers.STONE_BLACKSTONE, 4, -2.5f, new Item.Settings()));
        BLACKSTONE_PICKAXE = reg("blackstone_pickaxe", new PickaxeItem(ModToolTiers.STONE_BLACKSTONE, 1, -2.9f, new Item.Settings()));
        BLACKSTONE_SHOVEL = reg("blackstone_shovel", new ShovelItem(ModToolTiers.STONE_BLACKSTONE, 2.0f, -3.1f, new Item.Settings()));
        BLACKSTONE_AXE = reg("blackstone_axe", new AxeItem(ModToolTiers.STONE_BLACKSTONE, 7, -3.35f, new Item.Settings()));
        BLACKSTONE_HOE = reg("blackstone_hoe", new HoeItem(ModToolTiers.STONE_BLACKSTONE, 0, -3.1f, new Item.Settings()));
        CALCITE_SWORD = reg("calcite_sword", new SwordItem(ModToolTiers.STONE_CALCITE, 2, -2.2f, new Item.Settings()));
        CALCITE_PICKAXE = reg("calcite_pickaxe", new PickaxeItem(ModToolTiers.STONE_CALCITE, 1, -2.6f, new Item.Settings()));
        CALCITE_SHOVEL = reg("calcite_shovel", new ShovelItem(ModToolTiers.STONE_CALCITE, 1.0f, -2.8f, new Item.Settings()));
        CALCITE_AXE = reg("calcite_axe", new AxeItem(ModToolTiers.STONE_CALCITE, 5, -3.0f, new Item.Settings()));
        CALCITE_HOE = reg("calcite_hoe", new HoeItem(ModToolTiers.STONE_CALCITE, 0, -2.6f, new Item.Settings()));
        DEEPSLATE_SWORD = reg("deepslate_sword", new SwordItem(ModToolTiers.STONE_DEEPSLATE, 4, -2.55f, new Item.Settings()));
        DEEPSLATE_PICKAXE = reg("deepslate_pickaxe", new PickaxeItem(ModToolTiers.STONE_DEEPSLATE, 1, -2.95f, new Item.Settings()));
        DEEPSLATE_SHOVEL = reg("deepslate_shovel", new ShovelItem(ModToolTiers.STONE_DEEPSLATE, 2.0f, -3.15f, new Item.Settings()));
        DEEPSLATE_AXE = reg("deepslate_axe", new AxeItem(ModToolTiers.STONE_DEEPSLATE, 7, -3.4f, new Item.Settings()));
        DEEPSLATE_HOE = reg("deepslate_hoe", new HoeItem(ModToolTiers.STONE_DEEPSLATE, 0, -3.1f, new Item.Settings()));
        DIORITE_SWORD = reg("diorite_sword", new SwordItem(ModToolTiers.STONE_DIORITE, 3, -2.4f, new Item.Settings()));
        DIORITE_PICKAXE = reg("diorite_pickaxe", new PickaxeItem(ModToolTiers.STONE_DIORITE, 1, -2.8f, new Item.Settings()));
        DIORITE_SHOVEL = reg("diorite_shovel", new ShovelItem(ModToolTiers.STONE_DIORITE, 1.5f, -3f, new Item.Settings()));
        DIORITE_AXE = reg("diorite_axe", new AxeItem(ModToolTiers.STONE_DIORITE, 6, -3.2f, new Item.Settings()));
        DIORITE_HOE = reg("diorite_hoe", new HoeItem(ModToolTiers.STONE_DIORITE, 0, -2.9f, new Item.Settings()));
        END_STONE_SWORD = reg("end_stone_sword", new SwordItem(ModToolTiers.STONE_END_STONE, 3, -2.35f, new Item.Settings()));
        END_STONE_PICKAXE = reg("end_stone_pickaxe", new PickaxeItem(ModToolTiers.STONE_END_STONE, 1, -2.75f, new Item.Settings()));
        END_STONE_SHOVEL = reg("end_stone_shovel", new ShovelItem(ModToolTiers.STONE_END_STONE, 1.5f, -2.95f, new Item.Settings()));
        END_STONE_AXE = reg("end_stone_axe", new AxeItem(ModToolTiers.STONE_END_STONE, 6, -3.15f, new Item.Settings()));
        END_STONE_HOE = reg("end_stone_hoe", new HoeItem(ModToolTiers.STONE_END_STONE, 0, -2.8f, new Item.Settings()));
        GRANITE_SWORD = reg("granite_sword", new SwordItem(ModToolTiers.STONE_GRANITE, 3, -2.5f, new Item.Settings()));
        GRANITE_PICKAXE = reg("granite_pickaxe", new PickaxeItem(ModToolTiers.STONE_GRANITE, 1, -2.9f, new Item.Settings()));
        GRANITE_SHOVEL = reg("granite_shovel", new ShovelItem(ModToolTiers.STONE_GRANITE, 2.0f, -3.1f, new Item.Settings()));
        GRANITE_AXE = reg("granite_axe", new AxeItem(ModToolTiers.STONE_GRANITE, 7, -3.3f, new Item.Settings()));
        GRANITE_HOE = reg("granite_hoe", new HoeItem(ModToolTiers.STONE_GRANITE, 0, -3.1f, new Item.Settings()));
        NETHERRACK_SWORD = reg("netherrack_sword", new SwordItem(ModToolTiers.STONE_NETHERRACK, 2, -2.2f, new Item.Settings()));
        NETHERRACK_PICKAXE = reg("netherrack_pickaxe", new PickaxeItem(ModToolTiers.STONE_NETHERRACK, 1, -2.6f, new Item.Settings()));
        NETHERRACK_SHOVEL = reg("netherrack_shovel", new ShovelItem(ModToolTiers.STONE_NETHERRACK, 1.0f, -2.8f, new Item.Settings()));
        NETHERRACK_AXE = reg("netherrack_axe", new AxeItem(ModToolTiers.STONE_NETHERRACK, 5, -3.0f, new Item.Settings()));
        NETHERRACK_HOE = reg("netherrack_hoe", new HoeItem(ModToolTiers.STONE_NETHERRACK, 0, -2.5f, new Item.Settings()));
        SANDSTONE_SWORD = reg("sandstone_sword", new SwordItem(ModToolTiers.STONE_SANDSTONE, 2, -2.3f, new Item.Settings()));
        SANDSTONE_PICKAXE = reg("sandstone_pickaxe", new PickaxeItem(ModToolTiers.STONE_SANDSTONE, 1, -2.7f, new Item.Settings()));
        SANDSTONE_SHOVEL = reg("sandstone_shovel", new ShovelItem(ModToolTiers.STONE_SANDSTONE, 1.0f, -2.9f, new Item.Settings()));
        SANDSTONE_AXE = reg("sandstone_axe", new AxeItem(ModToolTiers.STONE_SANDSTONE, 5, -3.1f, new Item.Settings()));
        SANDSTONE_HOE = reg("sandstone_hoe", new HoeItem(ModToolTiers.STONE_SANDSTONE, 0, -2.7f, new Item.Settings()));
        SMOOTH_BASALT_SWORD = reg("smooth_basalt_sword", new SwordItem(ModToolTiers.STONE_SMOOTH_BASALT, 3, -2.45f, new Item.Settings()));
        SMOOTH_BASALT_PICKAXE = reg("smooth_basalt_pickaxe", new PickaxeItem(ModToolTiers.STONE_SMOOTH_BASALT, 1, -2.85f, new Item.Settings()));
        SMOOTH_BASALT_SHOVEL = reg("smooth_basalt_shovel", new ShovelItem(ModToolTiers.STONE_SMOOTH_BASALT, 1.5f, -3.05f, new Item.Settings()));
        SMOOTH_BASALT_AXE = reg("smooth_basalt_axe", new AxeItem(ModToolTiers.STONE_SMOOTH_BASALT, 6, -3.25f, new Item.Settings()));
        SMOOTH_BASALT_HOE = reg("smooth_basalt_hoe", new HoeItem(ModToolTiers.STONE_SMOOTH_BASALT, 0, -3.0f, new Item.Settings()));
        TERRACOTTA_SWORD = reg("terracotta_sword", new SwordItem(ModToolTiers.STONE_TERRACOTTA, 3, -2.35f, new Item.Settings()));
        TERRACOTTA_PICKAXE = reg("terracotta_pickaxe", new PickaxeItem(ModToolTiers.STONE_TERRACOTTA, 1, -2.75f, new Item.Settings()));
        TERRACOTTA_SHOVEL = reg("terracotta_shovel", new ShovelItem(ModToolTiers.STONE_TERRACOTTA, 1.5f, -2.95f, new Item.Settings()));
        TERRACOTTA_AXE = reg("terracotta_axe", new AxeItem(ModToolTiers.STONE_TERRACOTTA, 6, -3.15f, new Item.Settings()));
        TERRACOTTA_HOE = reg("terracotta_hoe", new HoeItem(ModToolTiers.STONE_TERRACOTTA, 0, -2.8f, new Item.Settings()));
        TUFF_SWORD = reg("tuff_sword", new SwordItem(ModToolTiers.STONE_TUFF, 2, -2.35f, new Item.Settings()));
        TUFF_PICKAXE = reg("tuff_pickaxe", new PickaxeItem(ModToolTiers.STONE_TUFF, 1, -2.75f, new Item.Settings()));
        TUFF_SHOVEL = reg("tuff_shovel", new ShovelItem(ModToolTiers.STONE_TUFF, 1.5f, -2.95f, new Item.Settings()));
        TUFF_AXE = reg("tuff_axe", new AxeItem(ModToolTiers.STONE_TUFF, 5, -3.15f, new Item.Settings()));
        TUFF_HOE = reg("tuff_hoe", new HoeItem(ModToolTiers.STONE_TUFF, 0, -2.8f, new Item.Settings()));
        OAK_SWORD = reg("oak_sword", new SwordItem(ModToolTiers.WOOD_OAK, 3, -2.4f, new Item.Settings()));
        OAK_PICKAXE = reg("oak_pickaxe", new PickaxeItem(ModToolTiers.WOOD_OAK, 1, -2.8f, new Item.Settings()));
        OAK_SHOVEL = reg("oak_shovel", new ShovelItem(ModToolTiers.WOOD_OAK, 1.5f, -3f, new Item.Settings()));
        OAK_AXE = reg("oak_axe", new AxeItem(ModToolTiers.WOOD_OAK, 6, -3.2f, new Item.Settings()));
        OAK_HOE = reg("oak_hoe", new HoeItem(ModToolTiers.WOOD_OAK, 0, -3f, new Item.Settings()));
        SPRUCE_SWORD = reg("spruce_sword", new SwordItem(ModToolTiers.WOOD_SPRUCE, 3, -2.4f, new Item.Settings()));
        SPRUCE_PICKAXE = reg("spruce_pickaxe", new PickaxeItem(ModToolTiers.WOOD_SPRUCE, 1, -2.8f, new Item.Settings()));
        SPRUCE_SHOVEL = reg("spruce_shovel", new ShovelItem(ModToolTiers.WOOD_SPRUCE, 1.5f, -3f, new Item.Settings()));
        SPRUCE_AXE = reg("spruce_axe", new AxeItem(ModToolTiers.WOOD_SPRUCE, 6, -3.2f, new Item.Settings()));
        SPRUCE_HOE = reg("spruce_hoe", new HoeItem(ModToolTiers.WOOD_SPRUCE, 0, -3f, new Item.Settings()));
        BIRCH_SWORD = reg("birch_sword", new SwordItem(ModToolTiers.WOOD_BIRCH, 3, -2.4f, new Item.Settings()));
        BIRCH_PICKAXE = reg("birch_pickaxe", new PickaxeItem(ModToolTiers.WOOD_BIRCH, 1, -2.8f, new Item.Settings()));
        BIRCH_SHOVEL = reg("birch_shovel", new ShovelItem(ModToolTiers.WOOD_BIRCH, 1.5f, -3f, new Item.Settings()));
        BIRCH_AXE = reg("birch_axe", new AxeItem(ModToolTiers.WOOD_BIRCH, 6, -3.2f, new Item.Settings()));
        BIRCH_HOE = reg("birch_hoe", new HoeItem(ModToolTiers.WOOD_BIRCH, 0, -3f, new Item.Settings()));
        JUNGLE_SWORD = reg("jungle_sword", new SwordItem(ModToolTiers.WOOD_JUNGLE, 3, -2.4f, new Item.Settings()));
        JUNGLE_PICKAXE = reg("jungle_pickaxe", new PickaxeItem(ModToolTiers.WOOD_JUNGLE, 1, -2.8f, new Item.Settings()));
        JUNGLE_SHOVEL = reg("jungle_shovel", new ShovelItem(ModToolTiers.WOOD_JUNGLE, 1.5f, -3f, new Item.Settings()));
        JUNGLE_AXE = reg("jungle_axe", new AxeItem(ModToolTiers.WOOD_JUNGLE, 6, -3.2f, new Item.Settings()));
        JUNGLE_HOE = reg("jungle_hoe", new HoeItem(ModToolTiers.WOOD_JUNGLE, 0, -3f, new Item.Settings()));
        ACACIA_SWORD = reg("acacia_sword", new SwordItem(ModToolTiers.WOOD_ACACIA, 3, -2.4f, new Item.Settings()));
        ACACIA_PICKAXE = reg("acacia_pickaxe", new PickaxeItem(ModToolTiers.WOOD_ACACIA, 1, -2.8f, new Item.Settings()));
        ACACIA_SHOVEL = reg("acacia_shovel", new ShovelItem(ModToolTiers.WOOD_ACACIA, 1.5f, -3f, new Item.Settings()));
        ACACIA_AXE = reg("acacia_axe", new AxeItem(ModToolTiers.WOOD_ACACIA, 6, -3.2f, new Item.Settings()));
        ACACIA_HOE = reg("acacia_hoe", new HoeItem(ModToolTiers.WOOD_ACACIA, 0, -3f, new Item.Settings()));
        DARK_OAK_SWORD = reg("dark_oak_sword", new SwordItem(ModToolTiers.WOOD_DARK_OAK, 3, -2.4f, new Item.Settings()));
        DARK_OAK_PICKAXE = reg("dark_oak_pickaxe", new PickaxeItem(ModToolTiers.WOOD_DARK_OAK, 1, -2.8f, new Item.Settings()));
        DARK_OAK_SHOVEL = reg("dark_oak_shovel", new ShovelItem(ModToolTiers.WOOD_DARK_OAK, 1.5f, -3f, new Item.Settings()));
        DARK_OAK_AXE = reg("dark_oak_axe", new AxeItem(ModToolTiers.WOOD_DARK_OAK, 6, -3.2f, new Item.Settings()));
        DARK_OAK_HOE = reg("dark_oak_hoe", new HoeItem(ModToolTiers.WOOD_DARK_OAK, 0, -3f, new Item.Settings()));
        MANGROVE_SWORD = reg("mangrove_sword", new SwordItem(ModToolTiers.WOOD_MANGROVE, 3, -2.4f, new Item.Settings()));
        MANGROVE_PICKAXE = reg("mangrove_pickaxe", new PickaxeItem(ModToolTiers.WOOD_MANGROVE, 1, -2.8f, new Item.Settings()));
        MANGROVE_SHOVEL = reg("mangrove_shovel", new ShovelItem(ModToolTiers.WOOD_MANGROVE, 1.5f, -3f, new Item.Settings()));
        MANGROVE_AXE = reg("mangrove_axe", new AxeItem(ModToolTiers.WOOD_MANGROVE, 6, -3.2f, new Item.Settings()));
        MANGROVE_HOE = reg("mangrove_hoe", new HoeItem(ModToolTiers.WOOD_MANGROVE, 0, -3f, new Item.Settings()));
        CHERRY_SWORD = reg("cherry_sword", new SwordItem(ModToolTiers.WOOD_CHERRY, 3, -2.4f, new Item.Settings()));
        CHERRY_PICKAXE = reg("cherry_pickaxe", new PickaxeItem(ModToolTiers.WOOD_CHERRY, 1, -2.8f, new Item.Settings()));
        CHERRY_SHOVEL = reg("cherry_shovel", new ShovelItem(ModToolTiers.WOOD_CHERRY, 1.5f, -3f, new Item.Settings()));
        CHERRY_AXE = reg("cherry_axe", new AxeItem(ModToolTiers.WOOD_CHERRY, 6, -3.2f, new Item.Settings()));
        CHERRY_HOE = reg("cherry_hoe", new HoeItem(ModToolTiers.WOOD_CHERRY, 0, -3f, new Item.Settings()));
        BAMBOO_SWORD = reg("bamboo_sword", new SwordItem(ModToolTiers.WOOD_BAMBOO, 3, -2.4f, new Item.Settings()));
        BAMBOO_PICKAXE = reg("bamboo_pickaxe", new PickaxeItem(ModToolTiers.WOOD_BAMBOO, 1, -2.8f, new Item.Settings()));
        BAMBOO_SHOVEL = reg("bamboo_shovel", new ShovelItem(ModToolTiers.WOOD_BAMBOO, 1.5f, -3f, new Item.Settings()));
        BAMBOO_AXE = reg("bamboo_axe", new AxeItem(ModToolTiers.WOOD_BAMBOO, 6, -3.2f, new Item.Settings()));
        BAMBOO_HOE = reg("bamboo_hoe", new HoeItem(ModToolTiers.WOOD_BAMBOO, 0, -3f, new Item.Settings()));
        CRIMSON_SWORD = reg("crimson_sword", new SwordItem(ModToolTiers.WOOD_CRIMSON, 3, -2.4f, new Item.Settings()));
        CRIMSON_PICKAXE = reg("crimson_pickaxe", new PickaxeItem(ModToolTiers.WOOD_CRIMSON, 1, -2.8f, new Item.Settings()));
        CRIMSON_SHOVEL = reg("crimson_shovel", new ShovelItem(ModToolTiers.WOOD_CRIMSON, 1.5f, -3f, new Item.Settings()));
        CRIMSON_AXE = reg("crimson_axe", new AxeItem(ModToolTiers.WOOD_CRIMSON, 6, -3.2f, new Item.Settings()));
        CRIMSON_HOE = reg("crimson_hoe", new HoeItem(ModToolTiers.WOOD_CRIMSON, 0, -3f, new Item.Settings()));
        WARPED_SWORD = reg("warped_sword", new SwordItem(ModToolTiers.WOOD_WARPED, 3, -2.4f, new Item.Settings()));
        WARPED_PICKAXE = reg("warped_pickaxe", new PickaxeItem(ModToolTiers.WOOD_WARPED, 1, -2.8f, new Item.Settings()));
        WARPED_SHOVEL = reg("warped_shovel", new ShovelItem(ModToolTiers.WOOD_WARPED, 1.5f, -3f, new Item.Settings()));
        WARPED_AXE = reg("warped_axe", new AxeItem(ModToolTiers.WOOD_WARPED, 6, -3.2f, new Item.Settings()));
        WARPED_HOE = reg("warped_hoe", new HoeItem(ModToolTiers.WOOD_WARPED, 0, -3f, new Item.Settings()));
        LEATHER_SWORD = reg("leather_sword", new SwordItem(ModToolTiers.LEATHER, 3, -2.4f, new Item.Settings()));
        LEATHER_PICKAXE = reg("leather_pickaxe", new PickaxeItem(ModToolTiers.LEATHER, 1, -2.8f, new Item.Settings()));
        LEATHER_SHOVEL = reg("leather_shovel", new ShovelItem(ModToolTiers.LEATHER, 1.5f, -3f, new Item.Settings()));
        LEATHER_AXE = reg("leather_axe", new AxeItem(ModToolTiers.LEATHER, 6, -3.2f, new Item.Settings()));
        LEATHER_HOE = reg("leather_hoe", new HoeItem(ModToolTiers.LEATHER, 0, -3f, new Item.Settings()));
        PAPER_SWORD = reg("paper_sword", new SwordItem(ModToolTiers.PAPER, 3, -2.4f, new Item.Settings()));
        PAPER_PICKAXE = reg("paper_pickaxe", new PickaxeItem(ModToolTiers.PAPER, 1, -2.8f, new Item.Settings()));
        PAPER_SHOVEL = reg("paper_shovel", new ShovelItem(ModToolTiers.PAPER, 1.5f, -3f, new Item.Settings()));
        PAPER_AXE = reg("paper_axe", new AxeItem(ModToolTiers.PAPER, 6, -3.2f, new Item.Settings()));
        PAPER_HOE = reg("paper_hoe", new HoeItem(ModToolTiers.PAPER, 0, -3f, new Item.Settings()));
        FEATHER_SWORD = reg("feather_sword", new SwordItem(ModToolTiers.FEATHER, 3, -2.4f, new Item.Settings()));
        FEATHER_PICKAXE = reg("feather_pickaxe", new PickaxeItem(ModToolTiers.FEATHER, 1, -2.8f, new Item.Settings()));
        FEATHER_SHOVEL = reg("feather_shovel", new ShovelItem(ModToolTiers.FEATHER, 1.5f, -3f, new Item.Settings()));
        FEATHER_AXE = reg("feather_axe", new AxeItem(ModToolTiers.FEATHER, 6, -3.2f, new Item.Settings()));
        FEATHER_HOE = reg("feather_hoe", new HoeItem(ModToolTiers.FEATHER, 0, -3f, new Item.Settings()));
        GLASS_SWORD = reg("glass_sword", new SwordItem(ModToolTiers.GLASS, 3, -2.4f, new Item.Settings()));
        GLASS_PICKAXE = reg("glass_pickaxe", new PickaxeItem(ModToolTiers.GLASS, 1, -2.8f, new Item.Settings()));
        GLASS_SHOVEL = reg("glass_shovel", new ShovelItem(ModToolTiers.GLASS, 1.5f, -3f, new Item.Settings()));
        GLASS_AXE = reg("glass_axe", new AxeItem(ModToolTiers.GLASS, 6, -3.2f, new Item.Settings()));
        GLASS_HOE = reg("glass_hoe", new HoeItem(ModToolTiers.GLASS, 0, -3f, new Item.Settings()));
        RABBIT_HIDE_HELMET = reg("rabbit_hide_helmet", new ArmorItem(ModArmorMaterials.RABBIT_HIDE, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        RABBIT_HIDE_CHESTPLATE = reg("rabbit_hide_chestplate", new ArmorItem(ModArmorMaterials.RABBIT_HIDE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        RABBIT_HIDE_LEGGINGS = reg("rabbit_hide_leggings", new ArmorItem(ModArmorMaterials.RABBIT_HIDE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        RABBIT_HIDE_BOOTS = reg("rabbit_hide_boots", new ArmorItem(ModArmorMaterials.RABBIT_HIDE, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        CACTUS_SWORD = reg("cactus_sword", new SwordItem(ModToolTiers.CACTUS, 3, -2.4f, new Item.Settings()));
        CACTUS_PICKAXE = reg("cactus_pickaxe", new PickaxeItem(ModToolTiers.CACTUS, 1, -2.8f, new Item.Settings()));
        CACTUS_SHOVEL = reg("cactus_shovel", new ShovelItem(ModToolTiers.CACTUS, 1.5f, -3f, new Item.Settings()));
        CACTUS_AXE = reg("cactus_axe", new AxeItem(ModToolTiers.CACTUS, 6, -3.2f, new Item.Settings()));
        CACTUS_HOE = reg("cactus_hoe", new HoeItem(ModToolTiers.CACTUS, 0, -3f, new Item.Settings()));
        CACTUS_HELMET = reg("cactus_helmet", new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        CACTUS_CHESTPLATE = reg("cactus_chestplate", new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        CACTUS_LEGGINGS = reg("cactus_leggings", new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        CACTUS_BOOTS = reg("cactus_boots", new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        SPONGE_SWORD = reg("sponge_sword", new SwordItem(ModToolTiers.SPONGE, 3, -2.4f, new Item.Settings()));
        SPONGE_PICKAXE = reg("sponge_pickaxe", new PickaxeItem(ModToolTiers.SPONGE, 1, -2.8f, new Item.Settings()));
        SPONGE_SHOVEL = reg("sponge_shovel", new ShovelItem(ModToolTiers.SPONGE, 1.5f, -3f, new Item.Settings()));
        SPONGE_AXE = reg("sponge_axe", new AxeItem(ModToolTiers.SPONGE, 6, -3.2f, new Item.Settings()));
        SPONGE_HOE = reg("sponge_hoe", new HoeItem(ModToolTiers.SPONGE, 0, -3f, new Item.Settings()));
        BONE_SWORD = reg("bone_sword", new SwordItem(ModToolTiers.BONE, 3, -2.4f, new Item.Settings()));
        BONE_PICKAXE = reg("bone_pickaxe", new PickaxeItem(ModToolTiers.BONE, 1, -2.8f, new Item.Settings()));
        BONE_SHOVEL = reg("bone_shovel", new ShovelItem(ModToolTiers.BONE, 1.5f, -3f, new Item.Settings()));
        BONE_AXE = reg("bone_axe", new AxeItem(ModToolTiers.BONE, 6, -3.2f, new Item.Settings()));
        BONE_HOE = reg("bone_hoe", new HoeItem(ModToolTiers.BONE, 0, -3f, new Item.Settings()));
        BONE_HELMET = reg("bone_helmet", new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        BONE_CHESTPLATE = reg("bone_chestplate", new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        BONE_LEGGINGS = reg("bone_leggings", new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        BONE_BOOTS = reg("bone_boots", new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        CLAY_SWORD = reg("clay_sword", new SwordItem(ModToolTiers.CLAY, 3, -2.4f, new Item.Settings()));
        CLAY_PICKAXE = reg("clay_pickaxe", new PickaxeItem(ModToolTiers.CLAY, 1, -2.8f, new Item.Settings()));
        CLAY_SHOVEL = reg("clay_shovel", new ShovelItem(ModToolTiers.CLAY, 1.5f, -3f, new Item.Settings()));
        CLAY_AXE = reg("clay_axe", new AxeItem(ModToolTiers.CLAY, 6, -3.2f, new Item.Settings()));
        CLAY_HOE = reg("clay_hoe", new HoeItem(ModToolTiers.CLAY, 0, -3f, new Item.Settings()));
        CLAY_HELMET = reg("clay_helmet", new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        CLAY_CHESTPLATE = reg("clay_chestplate", new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        CLAY_LEGGINGS = reg("clay_leggings", new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        CLAY_BOOTS = reg("clay_boots", new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        NETHER_WART_SWORD = reg("nether_wart_sword", new SwordItem(ModToolTiers.NETHER_WART, 3, -2.4f, new Item.Settings()));
        NETHER_WART_PICKAXE = reg("nether_wart_pickaxe", new PickaxeItem(ModToolTiers.NETHER_WART, 1, -2.8f, new Item.Settings()));
        NETHER_WART_SHOVEL = reg("nether_wart_shovel", new ShovelItem(ModToolTiers.NETHER_WART, 1.5f, -3f, new Item.Settings()));
        NETHER_WART_AXE = reg("nether_wart_axe", new AxeItem(ModToolTiers.NETHER_WART, 6, -3.2f, new Item.Settings()));
        NETHER_WART_HOE = reg("nether_wart_hoe", new HoeItem(ModToolTiers.NETHER_WART, 0, -3f, new Item.Settings()));
        BRICK_SWORD = reg("brick_sword", new SwordItem(ModToolTiers.BRICK, 3, -2.4f, new Item.Settings()));
        BRICK_PICKAXE = reg("brick_pickaxe", new PickaxeItem(ModToolTiers.BRICK, 1, -2.8f, new Item.Settings()));
        BRICK_SHOVEL = reg("brick_shovel", new ShovelItem(ModToolTiers.BRICK, 1.5f, -3f, new Item.Settings()));
        BRICK_AXE = reg("brick_axe", new AxeItem(ModToolTiers.BRICK, 6, -3.2f, new Item.Settings()));
        BRICK_HOE = reg("brick_hoe", new HoeItem(ModToolTiers.BRICK, 0, -3f, new Item.Settings()));
        BRICK_HELMET = reg("brick_helmet", new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        BRICK_CHESTPLATE = reg("brick_chestplate", new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        BRICK_LEGGINGS = reg("brick_leggings", new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        BRICK_BOOTS = reg("brick_boots", new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        NETHER_BRICK_SWORD = reg("nether_brick_sword", new SwordItem(ModToolTiers.NETHER_BRICK, 3, -2.4f, new Item.Settings()));
        NETHER_BRICK_PICKAXE = reg("nether_brick_pickaxe", new PickaxeItem(ModToolTiers.NETHER_BRICK, 1, -2.8f, new Item.Settings()));
        NETHER_BRICK_SHOVEL = reg("nether_brick_shovel", new ShovelItem(ModToolTiers.NETHER_BRICK, 1.5f, -3f, new Item.Settings()));
        NETHER_BRICK_AXE = reg("nether_brick_axe", new AxeItem(ModToolTiers.NETHER_BRICK, 6, -3.2f, new Item.Settings()));
        NETHER_BRICK_HOE = reg("nether_brick_hoe", new HoeItem(ModToolTiers.NETHER_BRICK, 0, -3f, new Item.Settings()));
        NETHER_BRICK_HELMET = reg("nether_brick_helmet", new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        NETHER_BRICK_CHESTPLATE = reg("nether_brick_chestplate", new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        NETHER_BRICK_LEGGINGS = reg("nether_brick_leggings", new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        NETHER_BRICK_BOOTS = reg("nether_brick_boots", new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        POINTED_DRIPSTONE_SWORD = reg("pointed_dripstone_sword", new SwordItem(ModToolTiers.POINTED_DRIPSTONE, 3, -2.4f, new Item.Settings()));
        POINTED_DRIPSTONE_PICKAXE = reg("pointed_dripstone_pickaxe", new PickaxeItem(ModToolTiers.POINTED_DRIPSTONE, 1, -2.8f, new Item.Settings()));
        POINTED_DRIPSTONE_SHOVEL = reg("pointed_dripstone_shovel", new ShovelItem(ModToolTiers.POINTED_DRIPSTONE, 1.5f, -3f, new Item.Settings()));
        POINTED_DRIPSTONE_AXE = reg("pointed_dripstone_axe", new AxeItem(ModToolTiers.POINTED_DRIPSTONE, 6, -3.2f, new Item.Settings()));
        POINTED_DRIPSTONE_HOE = reg("pointed_dripstone_hoe", new HoeItem(ModToolTiers.POINTED_DRIPSTONE, 0, -3f, new Item.Settings()));
        COPPER_SWORD = reg("copper_sword", new SwordItem(ModToolTiers.COPPER, 3, -2.4f, new Item.Settings()));
        COPPER_PICKAXE = reg("copper_pickaxe", new PickaxeItem(ModToolTiers.COPPER, 1, -2.8f, new Item.Settings()));
        COPPER_SHOVEL = reg("copper_shovel", new ShovelItem(ModToolTiers.COPPER, 1.5f, -3f, new Item.Settings()));
        COPPER_AXE = reg("copper_axe", new AxeItem(ModToolTiers.COPPER, 6, -3.2f, new Item.Settings()));
        COPPER_HOE = reg("copper_hoe", new HoeItem(ModToolTiers.COPPER, 0, -3f, new Item.Settings()));
        COPPER_HELMET = reg("copper_helmet", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        COPPER_CHESTPLATE = reg("copper_chestplate", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        COPPER_LEGGINGS = reg("copper_leggings", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        COPPER_BOOTS = reg("copper_boots", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        PHANTOM_SWORD = reg("phantom_sword", new SwordItem(ModToolTiers.PHANTOM_MEMBRANE, 3, -2.4f, new Item.Settings()));
        PHANTOM_PICKAXE = reg("phantom_pickaxe", new PickaxeItem(ModToolTiers.PHANTOM_MEMBRANE, 1, -2.8f, new Item.Settings()));
        PHANTOM_SHOVEL = reg("phantom_shovel", new ShovelItem(ModToolTiers.PHANTOM_MEMBRANE, 1.5f, -3f, new Item.Settings()));
        PHANTOM_AXE = reg("phantom_axe", new AxeItem(ModToolTiers.PHANTOM_MEMBRANE, 6, -3.2f, new Item.Settings()));
        PHANTOM_HOE = reg("phantom_hoe", new HoeItem(ModToolTiers.PHANTOM_MEMBRANE, 0, -3f, new Item.Settings()));
        PHANTOM_HELMET = reg("phantom_helmet", new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        PHANTOM_CHESTPLATE = reg("phantom_chestplate", new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        PHANTOM_LEGGINGS = reg("phantom_leggings", new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        PHANTOM_BOOTS = reg("phantom_boots", new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        MAGMA_CREAM_SWORD = reg("magma_cream_sword", new SwordItem(ModToolTiers.MAGMA_CREAM, 3, -2.4f, new Item.Settings()));
        MAGMA_CREAM_PICKAXE = reg("magma_cream_pickaxe", new PickaxeItem(ModToolTiers.MAGMA_CREAM, 1, -2.8f, new Item.Settings()));
        MAGMA_CREAM_SHOVEL = reg("magma_cream_shovel", new ShovelItem(ModToolTiers.MAGMA_CREAM, 1.5f, -3f, new Item.Settings()));
        MAGMA_CREAM_AXE = reg("magma_cream_axe", new AxeItem(ModToolTiers.MAGMA_CREAM, 6, -3.2f, new Item.Settings()));
        MAGMA_CREAM_HOE = reg("magma_cream_hoe", new HoeItem(ModToolTiers.MAGMA_CREAM, 0, -3f, new Item.Settings()));
        MAGMA_CREAM_HELMET = reg("magma_cream_helmet", new ArmorItem(ModArmorMaterials.MAGMA_CREAM, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        MAGMA_CREAM_CHESTPLATE = reg("magma_cream_chestplate", new ArmorItem(ModArmorMaterials.MAGMA_CREAM, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        MAGMA_CREAM_LEGGINGS = reg("magma_cream_leggings", new ArmorItem(ModArmorMaterials.MAGMA_CREAM, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        MAGMA_CREAM_BOOTS = reg("magma_cream_boots", new ArmorItem(ModArmorMaterials.MAGMA_CREAM, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        SLIME_SWORD = reg("slime_sword", new SwordItem(ModToolTiers.SLIME, 3, -2.4f, new Item.Settings()));
        SLIME_PICKAXE = reg("slime_pickaxe", new PickaxeItem(ModToolTiers.SLIME, 1, -2.8f, new Item.Settings()));
        SLIME_SHOVEL = reg("slime_shovel", new ShovelItem(ModToolTiers.SLIME, 1.5f, -3f, new Item.Settings()));
        SLIME_AXE = reg("slime_axe", new AxeItem(ModToolTiers.SLIME, 6, -3.2f, new Item.Settings()));
        SLIME_HOE = reg("slime_hoe", new HoeItem(ModToolTiers.SLIME, 0, -3f, new Item.Settings()));
        SLIME_HELMET = reg("slime_helmet", new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        SLIME_CHESTPLATE = reg("slime_chestplate", new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        SLIME_LEGGINGS = reg("slime_leggings", new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        SLIME_BOOTS = reg("slime_boots", new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        BLAZE_SWORD = reg("blaze_sword", new SwordItem(ModToolTiers.BLAZE_ROD, 3, -2.4f, new Item.Settings()));
        BLAZE_PICKAXE = reg("blaze_pickaxe", new PickaxeItem(ModToolTiers.BLAZE_ROD, 1, -2.8f, new Item.Settings()));
        BLAZE_SHOVEL = reg("blaze_shovel", new ShovelItem(ModToolTiers.BLAZE_ROD, 1.5f, -3f, new Item.Settings()));
        BLAZE_AXE = reg("blaze_axe", new AxeItem(ModToolTiers.BLAZE_ROD, 6, -3.2f, new Item.Settings()));
        BLAZE_HOE = reg("blaze_hoe", new HoeItem(ModToolTiers.BLAZE_ROD, 0, -3f, new Item.Settings()));
        BLAZE_HELMET = reg("blaze_helmet", new ArmorItem(ModArmorMaterials.BLAZE, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        BLAZE_CHESTPLATE = reg("blaze_chestplate", new ArmorItem(ModArmorMaterials.BLAZE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        BLAZE_LEGGINGS = reg("blaze_leggings", new ArmorItem(ModArmorMaterials.BLAZE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        BLAZE_BOOTS = reg("blaze_boots", new ArmorItem(ModArmorMaterials.BLAZE, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        NAUTILUS_SWORD = reg("nautilus_sword", new SwordItem(ModToolTiers.NAUTILUS_SHELL, 3, -2.4f, new Item.Settings()));
        NAUTILUS_PICKAXE = reg("nautilus_pickaxe", new PickaxeItem(ModToolTiers.NAUTILUS_SHELL, 1, -2.8f, new Item.Settings()));
        NAUTILUS_SHOVEL = reg("nautilus_shovel", new ShovelItem(ModToolTiers.NAUTILUS_SHELL, 1.5f, -3f, new Item.Settings()));
        NAUTILUS_AXE = reg("nautilus_axe", new AxeItem(ModToolTiers.NAUTILUS_SHELL, 6, -3.2f, new Item.Settings()));
        NAUTILUS_HOE = reg("nautilus_hoe", new HoeItem(ModToolTiers.NAUTILUS_SHELL, 0, -3f, new Item.Settings()));
        NAUTILUS_HELMET = reg("nautilus_helmet", new ArmorItem(ModArmorMaterials.NAUTILUS, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        NAUTILUS_CHESTPLATE = reg("nautilus_chestplate", new ArmorItem(ModArmorMaterials.NAUTILUS, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        NAUTILUS_LEGGINGS = reg("nautilus_leggings", new ArmorItem(ModArmorMaterials.NAUTILUS, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        NAUTILUS_BOOTS = reg("nautilus_boots", new ArmorItem(ModArmorMaterials.NAUTILUS, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        PURPUR_SWORD = reg("purpur_sword", new SwordItem(ModToolTiers.PURPUR, 3, -2.4f, new Item.Settings()));
        PURPUR_PICKAXE = reg("purpur_pickaxe", new PickaxeItem(ModToolTiers.PURPUR, 1, -2.8f, new Item.Settings()));
        PURPUR_SHOVEL = reg("purpur_shovel", new ShovelItem(ModToolTiers.PURPUR, 1.5f, -3f, new Item.Settings()));
        PURPUR_AXE = reg("purpur_axe", new AxeItem(ModToolTiers.PURPUR, 6, -3.2f, new Item.Settings()));
        PURPUR_HOE = reg("purpur_hoe", new HoeItem(ModToolTiers.PURPUR, 0, -3f, new Item.Settings()));
        PURPUR_HELMET = reg("purpur_helmet", new ArmorItem(ModArmorMaterials.PURPUR, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        PURPUR_CHESTPLATE = reg("purpur_chestplate", new ArmorItem(ModArmorMaterials.PURPUR, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        PURPUR_LEGGINGS = reg("purpur_leggings", new ArmorItem(ModArmorMaterials.PURPUR, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        PURPUR_BOOTS = reg("purpur_boots", new ArmorItem(ModArmorMaterials.PURPUR, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        GHAST_TEAR_SWORD = reg("ghast_tear_sword", new SwordItem(ModToolTiers.GHAST_TEAR, 3, -2.4f, new Item.Settings()));
        GHAST_TEAR_PICKAXE = reg("ghast_tear_pickaxe", new PickaxeItem(ModToolTiers.GHAST_TEAR, 1, -2.8f, new Item.Settings()));
        GHAST_TEAR_SHOVEL = reg("ghast_tear_shovel", new ShovelItem(ModToolTiers.GHAST_TEAR, 1.5f, -3f, new Item.Settings()));
        GHAST_TEAR_AXE = reg("ghast_tear_axe", new AxeItem(ModToolTiers.GHAST_TEAR, 6, -3.2f, new Item.Settings()));
        GHAST_TEAR_HOE = reg("ghast_tear_hoe", new HoeItem(ModToolTiers.GHAST_TEAR, 0, -3f, new Item.Settings()));
        GHAST_TEAR_HELMET = reg("ghast_tear_helmet", new ArmorItem(ModArmorMaterials.GHAST_TEAR, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        GHAST_TEAR_CHESTPLATE = reg("ghast_tear_chestplate", new ArmorItem(ModArmorMaterials.GHAST_TEAR, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        GHAST_TEAR_LEGGINGS = reg("ghast_tear_leggings", new ArmorItem(ModArmorMaterials.GHAST_TEAR, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        GHAST_TEAR_BOOTS = reg("ghast_tear_boots", new ArmorItem(ModArmorMaterials.GHAST_TEAR, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        EYE_OF_ENDER_SWORD = reg("eye_of_ender_sword", new SwordItem(ModToolTiers.EYE_OF_ENDER, 3, -2.4f, new Item.Settings()));
        EYE_OF_ENDER_PICKAXE = reg("eye_of_ender_pickaxe", new PickaxeItem(ModToolTiers.EYE_OF_ENDER, 1, -2.8f, new Item.Settings()));
        EYE_OF_ENDER_SHOVEL = reg("eye_of_ender_shovel", new ShovelItem(ModToolTiers.EYE_OF_ENDER, 1.5f, -3f, new Item.Settings()));
        EYE_OF_ENDER_AXE = reg("eye_of_ender_axe", new AxeItem(ModToolTiers.EYE_OF_ENDER, 6, -3.2f, new Item.Settings()));
        EYE_OF_ENDER_HOE = reg("eye_of_ender_hoe", new HoeItem(ModToolTiers.EYE_OF_ENDER, 0, -3f, new Item.Settings()));
        EYE_OF_ENDER_HELMET = reg("eye_of_ender_helmet", new ArmorItem(ModArmorMaterials.EYE_OF_ENDER, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        EYE_OF_ENDER_CHESTPLATE = reg("eye_of_ender_chestplate", new ArmorItem(ModArmorMaterials.EYE_OF_ENDER, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        EYE_OF_ENDER_LEGGINGS = reg("eye_of_ender_leggings", new ArmorItem(ModArmorMaterials.EYE_OF_ENDER, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        EYE_OF_ENDER_BOOTS = reg("eye_of_ender_boots", new ArmorItem(ModArmorMaterials.EYE_OF_ENDER, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        SHULKER_SWORD = reg("shulker_sword", new SwordItem(ModToolTiers.SHULKER_SHELL, 3, -2.4f, new Item.Settings()));
        SHULKER_PICKAXE = reg("shulker_pickaxe", new PickaxeItem(ModToolTiers.SHULKER_SHELL, 1, -2.8f, new Item.Settings()));
        SHULKER_SHOVEL = reg("shulker_shovel", new ShovelItem(ModToolTiers.SHULKER_SHELL, 1.5f, -3f, new Item.Settings()));
        SHULKER_AXE = reg("shulker_axe", new AxeItem(ModToolTiers.SHULKER_SHELL, 6, -3.2f, new Item.Settings()));
        SHULKER_HOE = reg("shulker_hoe", new HoeItem(ModToolTiers.SHULKER_SHELL, 0, -3f, new Item.Settings()));
        SHULKER_HELMET = reg("shulker_helmet", new ArmorItem(ModArmorMaterials.SHULKER, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        SHULKER_CHESTPLATE = reg("shulker_chestplate", new ArmorItem(ModArmorMaterials.SHULKER, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        SHULKER_LEGGINGS = reg("shulker_leggings", new ArmorItem(ModArmorMaterials.SHULKER, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        SHULKER_BOOTS = reg("shulker_boots", new ArmorItem(ModArmorMaterials.SHULKER, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        TURTLE_SCUTE_HELMET = reg("turtle_scute_helmet", new ArmorItem(ModArmorMaterials.TURTLE_SCUTE, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        TURTLE_SCUTE_CHESTPLATE = reg("turtle_scute_chestplate", new ArmorItem(ModArmorMaterials.TURTLE_SCUTE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        TURTLE_SCUTE_LEGGINGS = reg("turtle_scute_leggings", new ArmorItem(ModArmorMaterials.TURTLE_SCUTE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        TURTLE_SCUTE_BOOTS = reg("turtle_scute_boots", new ArmorItem(ModArmorMaterials.TURTLE_SCUTE, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        ECHO_SHARD_SWORD = reg("echo_shard_sword", new SwordItem(ModToolTiers.ECHO_SHARD, 3, -2.4f, new Item.Settings()));
        ECHO_SHARD_PICKAXE = reg("echo_shard_pickaxe", new PickaxeItem(ModToolTiers.ECHO_SHARD, 1, -2.8f, new Item.Settings()));
        ECHO_SHARD_SHOVEL = reg("echo_shard_shovel", new ShovelItem(ModToolTiers.ECHO_SHARD, 1.5f, -3f, new Item.Settings()));
        ECHO_SHARD_AXE = reg("echo_shard_axe", new AxeItem(ModToolTiers.ECHO_SHARD, 6, -3.2f, new Item.Settings()));
        ECHO_SHARD_HOE = reg("echo_shard_hoe", new HoeItem(ModToolTiers.ECHO_SHARD, 0, -3f, new Item.Settings()));
        ECHO_SHARD_HELMET = reg("echo_shard_helmet", new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        ECHO_SHARD_CHESTPLATE = reg("echo_shard_chestplate", new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        ECHO_SHARD_LEGGINGS = reg("echo_shard_leggings", new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        ECHO_SHARD_BOOTS = reg("echo_shard_boots", new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        DRAGON_BREATH_SWORD = reg("dragon_breath_sword", new SwordItem(ModToolTiers.DRAGON_BREATH, 3, -2.4f, new Item.Settings()));
        DRAGON_BREATH_PICKAXE = reg("dragon_breath_pickaxe", new PickaxeItem(ModToolTiers.DRAGON_BREATH, 1, -2.8f, new Item.Settings()));
        DRAGON_BREATH_SHOVEL = reg("dragon_breath_shovel", new ShovelItem(ModToolTiers.DRAGON_BREATH, 1.5f, -3f, new Item.Settings()));
        DRAGON_BREATH_AXE = reg("dragon_breath_axe", new AxeItem(ModToolTiers.DRAGON_BREATH, 6, -3.2f, new Item.Settings()));
        DRAGON_BREATH_HOE = reg("dragon_breath_hoe", new HoeItem(ModToolTiers.DRAGON_BREATH, 0, -3f, new Item.Settings()));
        DRAGON_BREATH_HELMET = reg("dragon_breath_helmet", new ArmorItem(ModArmorMaterials.DRAGON_BREATH, ArmorItem.Type.HELMET,
                    new Item.Settings()));
        DRAGON_BREATH_CHESTPLATE = reg("dragon_breath_chestplate", new ArmorItem(ModArmorMaterials.DRAGON_BREATH, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
        DRAGON_BREATH_LEGGINGS = reg("dragon_breath_leggings", new ArmorItem(ModArmorMaterials.DRAGON_BREATH, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
        DRAGON_BREATH_BOOTS = reg("dragon_breath_boots", new ArmorItem(ModArmorMaterials.DRAGON_BREATH, ArmorItem.Type.BOOTS,
                    new Item.Settings()));
        CAKE_SWORD = reg("cake_sword", new EdibleSwordItem(ModToolTiers.CAKE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        CAKE_PICKAXE = reg("cake_pickaxe", new EdiblePickaxeItem(ModToolTiers.CAKE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        CAKE_SHOVEL = reg("cake_shovel", new EdibleShovelItem(ModToolTiers.CAKE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        CAKE_AXE = reg("cake_axe", new EdibleAxeItem(ModToolTiers.CAKE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        CAKE_HOE = reg("cake_hoe", new EdibleHoeItem(ModToolTiers.CAKE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        CAKE_HELMET = reg("cake_helmet", new EdibleArmorItem(ModArmorMaterials.CAKE, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        CAKE_CHESTPLATE = reg("cake_chestplate", new EdibleArmorItem(ModArmorMaterials.CAKE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        CAKE_LEGGINGS = reg("cake_leggings", new EdibleArmorItem(ModArmorMaterials.CAKE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        CAKE_BOOTS = reg("cake_boots", new EdibleArmorItem(ModArmorMaterials.CAKE, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        BREAD_SWORD = reg("bread_sword", new EdibleSwordItem(ModToolTiers.BREAD, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        BREAD_PICKAXE = reg("bread_pickaxe", new EdiblePickaxeItem(ModToolTiers.BREAD, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        BREAD_SHOVEL = reg("bread_shovel", new EdibleShovelItem(ModToolTiers.BREAD, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        BREAD_AXE = reg("bread_axe", new EdibleAxeItem(ModToolTiers.BREAD, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        BREAD_HOE = reg("bread_hoe", new EdibleHoeItem(ModToolTiers.BREAD, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        BREAD_HELMET = reg("bread_helmet", new EdibleArmorItem(ModArmorMaterials.BREAD, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        BREAD_CHESTPLATE = reg("bread_chestplate", new EdibleArmorItem(ModArmorMaterials.BREAD, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        BREAD_LEGGINGS = reg("bread_leggings", new EdibleArmorItem(ModArmorMaterials.BREAD, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        BREAD_BOOTS = reg("bread_boots", new EdibleArmorItem(ModArmorMaterials.BREAD, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        DRIED_KELP_SWORD = reg("dried_kelp_sword", new EdibleSwordItem(ModToolTiers.DRIED_KELP, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        DRIED_KELP_PICKAXE = reg("dried_kelp_pickaxe", new EdiblePickaxeItem(ModToolTiers.DRIED_KELP, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        DRIED_KELP_SHOVEL = reg("dried_kelp_shovel", new EdibleShovelItem(ModToolTiers.DRIED_KELP, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        DRIED_KELP_AXE = reg("dried_kelp_axe", new EdibleAxeItem(ModToolTiers.DRIED_KELP, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        DRIED_KELP_HOE = reg("dried_kelp_hoe", new EdibleHoeItem(ModToolTiers.DRIED_KELP, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        DRIED_KELP_HELMET = reg("dried_kelp_helmet", new EdibleArmorItem(ModArmorMaterials.DRIED_KELP, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        DRIED_KELP_CHESTPLATE = reg("dried_kelp_chestplate", new EdibleArmorItem(ModArmorMaterials.DRIED_KELP, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        DRIED_KELP_LEGGINGS = reg("dried_kelp_leggings", new EdibleArmorItem(ModArmorMaterials.DRIED_KELP, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        DRIED_KELP_BOOTS = reg("dried_kelp_boots", new EdibleArmorItem(ModArmorMaterials.DRIED_KELP, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        ROTTEN_FLESH_SWORD = reg("rotten_flesh_sword", new EdibleSwordItem(ModToolTiers.ROTTEN_FLESH, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        ROTTEN_FLESH_PICKAXE = reg("rotten_flesh_pickaxe", new EdiblePickaxeItem(ModToolTiers.ROTTEN_FLESH, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        ROTTEN_FLESH_SHOVEL = reg("rotten_flesh_shovel", new EdibleShovelItem(ModToolTiers.ROTTEN_FLESH, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        ROTTEN_FLESH_AXE = reg("rotten_flesh_axe", new EdibleAxeItem(ModToolTiers.ROTTEN_FLESH, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        ROTTEN_FLESH_HOE = reg("rotten_flesh_hoe", new EdibleHoeItem(ModToolTiers.ROTTEN_FLESH, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        ROTTEN_FLESH_HELMET = reg("rotten_flesh_helmet", new EdibleArmorItem(ModArmorMaterials.ROTTEN_FLESH, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        ROTTEN_FLESH_CHESTPLATE = reg("rotten_flesh_chestplate", new EdibleArmorItem(ModArmorMaterials.ROTTEN_FLESH, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        ROTTEN_FLESH_LEGGINGS = reg("rotten_flesh_leggings", new EdibleArmorItem(ModArmorMaterials.ROTTEN_FLESH, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        ROTTEN_FLESH_BOOTS = reg("rotten_flesh_boots", new EdibleArmorItem(ModArmorMaterials.ROTTEN_FLESH, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        MELON_SWORD = reg("melon_sword", new EdibleSwordItem(ModToolTiers.MELON, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        MELON_PICKAXE = reg("melon_pickaxe", new EdiblePickaxeItem(ModToolTiers.MELON, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        MELON_SHOVEL = reg("melon_shovel", new EdibleShovelItem(ModToolTiers.MELON, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        MELON_AXE = reg("melon_axe", new EdibleAxeItem(ModToolTiers.MELON, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        MELON_HOE = reg("melon_hoe", new EdibleHoeItem(ModToolTiers.MELON, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        MELON_HELMET = reg("melon_helmet", new EdibleArmorItem(ModArmorMaterials.MELON, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        MELON_CHESTPLATE = reg("melon_chestplate", new EdibleArmorItem(ModArmorMaterials.MELON, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        MELON_LEGGINGS = reg("melon_leggings", new EdibleArmorItem(ModArmorMaterials.MELON, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        MELON_BOOTS = reg("melon_boots", new EdibleArmorItem(ModArmorMaterials.MELON, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        SWEET_BERRY_SWORD = reg("sweet_berry_sword", new EdibleSwordItem(ModToolTiers.SWEET_BERRIES, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        SWEET_BERRY_PICKAXE = reg("sweet_berry_pickaxe", new EdiblePickaxeItem(ModToolTiers.SWEET_BERRIES, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        SWEET_BERRY_SHOVEL = reg("sweet_berry_shovel", new EdibleShovelItem(ModToolTiers.SWEET_BERRIES, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        SWEET_BERRY_AXE = reg("sweet_berry_axe", new EdibleAxeItem(ModToolTiers.SWEET_BERRIES, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        SWEET_BERRY_HOE = reg("sweet_berry_hoe", new EdibleHoeItem(ModToolTiers.SWEET_BERRIES, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        SWEET_BERRY_HELMET = reg("sweet_berry_helmet", new EdibleArmorItem(ModArmorMaterials.SWEET_BERRY, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        SWEET_BERRY_CHESTPLATE = reg("sweet_berry_chestplate", new EdibleArmorItem(ModArmorMaterials.SWEET_BERRY, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        SWEET_BERRY_LEGGINGS = reg("sweet_berry_leggings", new EdibleArmorItem(ModArmorMaterials.SWEET_BERRY, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        SWEET_BERRY_BOOTS = reg("sweet_berry_boots", new EdibleArmorItem(ModArmorMaterials.SWEET_BERRY, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        PUMPKIN_PIE_SWORD = reg("pumpkin_pie_sword", new EdibleSwordItem(ModToolTiers.PUMPKIN_PIE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        PUMPKIN_PIE_PICKAXE = reg("pumpkin_pie_pickaxe", new EdiblePickaxeItem(ModToolTiers.PUMPKIN_PIE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        PUMPKIN_PIE_SHOVEL = reg("pumpkin_pie_shovel", new EdibleShovelItem(ModToolTiers.PUMPKIN_PIE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        PUMPKIN_PIE_AXE = reg("pumpkin_pie_axe", new EdibleAxeItem(ModToolTiers.PUMPKIN_PIE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        PUMPKIN_PIE_HOE = reg("pumpkin_pie_hoe", new EdibleHoeItem(ModToolTiers.PUMPKIN_PIE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        PUMPKIN_PIE_HELMET = reg("pumpkin_pie_helmet", new EdibleArmorItem(ModArmorMaterials.PUMPKIN_PIE, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        PUMPKIN_PIE_CHESTPLATE = reg("pumpkin_pie_chestplate", new EdibleArmorItem(ModArmorMaterials.PUMPKIN_PIE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        PUMPKIN_PIE_LEGGINGS = reg("pumpkin_pie_leggings", new EdibleArmorItem(ModArmorMaterials.PUMPKIN_PIE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        PUMPKIN_PIE_BOOTS = reg("pumpkin_pie_boots", new EdibleArmorItem(ModArmorMaterials.PUMPKIN_PIE, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        MUSHROOM_SWORD = reg("mushroom_sword", new EdibleSwordItem(ModToolTiers.MUSHROOM, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        MUSHROOM_PICKAXE = reg("mushroom_pickaxe", new EdiblePickaxeItem(ModToolTiers.MUSHROOM, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        MUSHROOM_SHOVEL = reg("mushroom_shovel", new EdibleShovelItem(ModToolTiers.MUSHROOM, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        MUSHROOM_AXE = reg("mushroom_axe", new EdibleAxeItem(ModToolTiers.MUSHROOM, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        MUSHROOM_HOE = reg("mushroom_hoe", new EdibleHoeItem(ModToolTiers.MUSHROOM, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        MUSHROOM_HELMET = reg("mushroom_helmet", new EdibleArmorItem(ModArmorMaterials.MUSHROOM, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        MUSHROOM_CHESTPLATE = reg("mushroom_chestplate", new EdibleArmorItem(ModArmorMaterials.MUSHROOM, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        MUSHROOM_LEGGINGS = reg("mushroom_leggings", new EdibleArmorItem(ModArmorMaterials.MUSHROOM, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        MUSHROOM_BOOTS = reg("mushroom_boots", new EdibleArmorItem(ModArmorMaterials.MUSHROOM, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        PUFFERFISH_SWORD = reg("pufferfish_sword", new EdibleSwordItem(ModToolTiers.PUFFERFISH, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        PUFFERFISH_PICKAXE = reg("pufferfish_pickaxe", new EdiblePickaxeItem(ModToolTiers.PUFFERFISH, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        PUFFERFISH_SHOVEL = reg("pufferfish_shovel", new EdibleShovelItem(ModToolTiers.PUFFERFISH, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        PUFFERFISH_AXE = reg("pufferfish_axe", new EdibleAxeItem(ModToolTiers.PUFFERFISH, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        PUFFERFISH_HOE = reg("pufferfish_hoe", new EdibleHoeItem(ModToolTiers.PUFFERFISH, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        PUFFERFISH_HELMET = reg("pufferfish_helmet", new EdibleArmorItem(ModArmorMaterials.PUFFERFISH, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        PUFFERFISH_CHESTPLATE = reg("pufferfish_chestplate", new EdibleArmorItem(ModArmorMaterials.PUFFERFISH, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        PUFFERFISH_LEGGINGS = reg("pufferfish_leggings", new EdibleArmorItem(ModArmorMaterials.PUFFERFISH, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        PUFFERFISH_BOOTS = reg("pufferfish_boots", new EdibleArmorItem(ModArmorMaterials.PUFFERFISH, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        HONEY_SWORD = reg("honey_sword", new EdibleSwordItem(ModToolTiers.HONEY, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        HONEY_PICKAXE = reg("honey_pickaxe", new EdiblePickaxeItem(ModToolTiers.HONEY, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        HONEY_SHOVEL = reg("honey_shovel", new EdibleShovelItem(ModToolTiers.HONEY, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        HONEY_AXE = reg("honey_axe", new EdibleAxeItem(ModToolTiers.HONEY, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        HONEY_HOE = reg("honey_hoe", new EdibleHoeItem(ModToolTiers.HONEY, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        HONEY_HELMET = reg("honey_helmet", new EdibleArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        HONEY_CHESTPLATE = reg("honey_chestplate", new EdibleArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        HONEY_LEGGINGS = reg("honey_leggings", new EdibleArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        HONEY_BOOTS = reg("honey_boots", new EdibleArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        CHORUS_FRUIT_SWORD = reg("chorus_fruit_sword", new EdibleSwordItem(ModToolTiers.CHORUS_FRUIT, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        CHORUS_FRUIT_PICKAXE = reg("chorus_fruit_pickaxe", new EdiblePickaxeItem(ModToolTiers.CHORUS_FRUIT, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        CHORUS_FRUIT_SHOVEL = reg("chorus_fruit_shovel", new EdibleShovelItem(ModToolTiers.CHORUS_FRUIT, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        CHORUS_FRUIT_AXE = reg("chorus_fruit_axe", new EdibleAxeItem(ModToolTiers.CHORUS_FRUIT, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        CHORUS_FRUIT_HOE = reg("chorus_fruit_hoe", new EdibleHoeItem(ModToolTiers.CHORUS_FRUIT, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        CHORUS_FRUIT_HELMET = reg("chorus_fruit_helmet", new EdibleArmorItem(ModArmorMaterials.CHORUS_FRUIT, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        CHORUS_FRUIT_CHESTPLATE = reg("chorus_fruit_chestplate", new EdibleArmorItem(ModArmorMaterials.CHORUS_FRUIT, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        CHORUS_FRUIT_LEGGINGS = reg("chorus_fruit_leggings", new EdibleArmorItem(ModArmorMaterials.CHORUS_FRUIT, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        CHORUS_FRUIT_BOOTS = reg("chorus_fruit_boots", new EdibleArmorItem(ModArmorMaterials.CHORUS_FRUIT, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
        GOLDEN_APPLE_SWORD = reg("golden_apple_sword", new EdibleSwordItem(ModToolTiers.GOLDEN_APPLE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        GOLDEN_APPLE_PICKAXE = reg("golden_apple_pickaxe", new EdiblePickaxeItem(ModToolTiers.GOLDEN_APPLE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        GOLDEN_APPLE_SHOVEL = reg("golden_apple_shovel", new EdibleShovelItem(ModToolTiers.GOLDEN_APPLE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
        GOLDEN_APPLE_AXE = reg("golden_apple_axe", new EdibleAxeItem(ModToolTiers.GOLDEN_APPLE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.1f).build())));
        GOLDEN_APPLE_HOE = reg("golden_apple_hoe", new EdibleHoeItem(ModToolTiers.GOLDEN_APPLE, new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
        GOLDEN_APPLE_HELMET = reg("golden_apple_helmet", new EdibleArmorItem(ModArmorMaterials.GOLDEN_APPLE, ArmorItem.Type.HELMET,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.1f).build())));
        GOLDEN_APPLE_CHESTPLATE = reg("golden_apple_chestplate", new EdibleArmorItem(ModArmorMaterials.GOLDEN_APPLE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        GOLDEN_APPLE_LEGGINGS = reg("golden_apple_leggings", new EdibleArmorItem(ModArmorMaterials.GOLDEN_APPLE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(14).saturationModifier(0.1f).build())));
        GOLDEN_APPLE_BOOTS = reg("golden_apple_boots", new EdibleArmorItem(ModArmorMaterials.GOLDEN_APPLE, ArmorItem.Type.BOOTS,
                    new Item.Settings()
                            .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.1f).build())));
    }

    private static <T extends Item> T reg(String name, T item) {
        Registry.register(Registries.ITEM, new Identifier(UsefultoolsMod.MOD_ID, name), item);
        return item;
    }
}
