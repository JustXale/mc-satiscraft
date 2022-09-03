package net.justxale.cyber.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.justxale.cyber.Cyber;
import net.justxale.cyber.item.CyberItemArmor;
import net.justxale.cyber.item.CyberItemAxe;
import net.justxale.cyber.item.CyberToolMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static Item AEROAXE = registerItem("aeroaxe",
            new CyberItemAxe(CyberToolMaterials.AX_TELDER_STEEL, 0, -3.1f,
                    new FabricItemSettings().group(CyberTabs.CYBER_TOOLS)));

    public static Item HOLOVISOR = registerItem("holovisor",
            new CyberItemArmor(ArmorMaterials.IRON, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(CyberTabs.CYBER_TOOLS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Cyber.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Cyber.LOGGER.info("Registering mod items for " + Cyber.MOD_ID);
    }
}
