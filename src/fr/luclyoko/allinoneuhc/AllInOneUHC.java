package fr.luclyoko.allinoneuhc;

import org.bukkit.plugin.java.JavaPlugin;

public class AllInOneUHC extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Initializing plugin ...");
    }

    @Override
    public void onDisable() {
        getLogger().info("Stopping plugin ...");
    }
}
