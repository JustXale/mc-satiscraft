package net.justxale.cyber.registries;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.justxale.cyber.Cyber;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CyberTabs {
    /*public static final ItemGroup TEST_DECO = FabricItemGroupBuilder.build(new Identifier(Test.MOD_ID, "deco"),
            () -> new ItemStack(Items.BOOKSHELF));

    public static final ItemGroup TEST_BLOCKS = FabricItemGroupBuilder.build(new Identifier(Test.MOD_ID, "blocks"),
            () -> new ItemStack(Items.BRICKS));

    public static final ItemGroup TEST_ITEMS = FabricItemGroupBuilder.build(new Identifier(Test.MOD_ID, "items"),
            () -> new ItemStack(ModItems.SINGULARITY_STONE));*/

    public static final ItemGroup CYBER_TOOLS = FabricItemGroupBuilder.build(new Identifier(Cyber.MOD_ID, "tools"),
            () -> new ItemStack(ModItems.AEROAXE));
}
