package net.megaroid.MagicalWeaponry.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;

public class ToolMaterial implements Tier {
    // We place copper somewhere between stone and iron.
    public static final ToolMaterial MAGIC_MATERIAL = new ToolMaterial(
            // The tag that determines what blocks this material cannot break. See below for more information.
    );

    @Override
    public int getUses() {
        return 1561;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public float getAttackDamageBonus() {
        return 3;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return null;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}

