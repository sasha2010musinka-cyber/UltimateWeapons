
package com.ultimateweapons;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier {

    LEGENDARY(
        2500,
        12.0F,
        5.0F,
        5,
        25
    );

    private final int durability;
    private final float speed;
    private final float attackDamage;
    private final int harvestLevel;
    private final int enchantability;

    ModItemTier(
            int durability,
            float speed,
            float attackDamage,
            int harvestLevel,
            int enchantability
    ) {
        this.durability = durability;
        this.speed = speed;
        this.attackDamage = attackDamage;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
    }

    @Override
    public int getMaxUses() {
        return durability;
    }

    @Override
    public float getEfficiency() {
        return speed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(Items.NETHERITE_INGOT);
    }
}
