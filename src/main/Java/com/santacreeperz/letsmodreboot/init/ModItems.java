package com.santacreeperz.letsmodreboot.init;

import com.santacreeperz.letsmodreboot.item.ItemLMRB;
import com.santacreeperz.letsmodreboot.item.ItemActiveRuneFire;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMRB activeRuneFire = new ItemActiveRuneFire();
    public static void init()
    {
        GameRegistry.registerItem(activeRuneFire,"activeRuneFire");
    }
}
