package net.justxale.cyber.item;

import java.util.function.Supplier;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

public enum CyberToolMaterials implements ToolMaterial {
    // Battle Pickaxe
    BP_WOOD(MiningLevels.WOOD, 59, 1.5f, 3.0f, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    BP_STONE(MiningLevels.STONE, 131, 3.5f, 4.0f, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    BP_IRON(MiningLevels.IRON, 250, 5.5f, 5.0f, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    BP_DIAMOND(MiningLevels.DIAMOND, 1561, 7.5f, 6.0f, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    BP_GOLD(MiningLevels.WOOD, 32, 11.5f, 3.0f, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    BP_NETHERITE(MiningLevels.NETHERITE, 2031, 8.5f, 7.0f, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    //BP_STEEL(MiningLevels.NETHERITE, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    BP_TELDER_STEEL(MiningLevels.IRON, 320, 5.5f, 5.0f, 16, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    BP_ETHRIL(MiningLevels.STONE, 51, 11.5f, 3.0f, 24, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    // Telder Steel
    PA_TELDER_STEEL(MiningLevels.IRON, 320, 7.0f, 4.0f, 16, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    AX_TELDER_STEEL(MiningLevels.IRON, 320, 7.0f, 9.0f, 16, () -> Ingredient.ofItems(Items.ACACIA_BOAT)),
    SW_TELDER_STEEL(MiningLevels.IRON, 320, 7.0f, 7.0f, 16, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    SH_TELDER_STEEL(MiningLevels.IRON, 320, 7.0f, 4.5f, 16, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    HE_TELDER_STEEL(MiningLevels.IRON, 320, 7.0f, 2.0f, 16, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    // Ethril
    PA_ETHRIL(MiningLevels.STONE, 51, 13.0f, 2.0f, 24, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    AX_ETHRIL(MiningLevels.STONE, 51, 13.0f, 7.0f, 24, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    SW_ETHRIL(MiningLevels.STONE, 51, 13.0f, 5.0f, 24, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    SH_ETHRIL(MiningLevels.STONE, 51, 13.0f, 2.5f, 24, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    HE_ETHRIL(MiningLevels.STONE, 51, 13.0f, 2.0f, 24, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private CyberToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
