package com.fungus_soft.bukkitfabric;

import com.fungus_soft.bukkitfabric.FakeLogger;

import net.fabricmc.api.ModInitializer;

public class BukkitFabricMod implements ModInitializer {

    @Override
    public void onInitialize() {
        FakeLogger.getLogger().info("Copyright \u00A9 2020 Fungus Software");
    }

}