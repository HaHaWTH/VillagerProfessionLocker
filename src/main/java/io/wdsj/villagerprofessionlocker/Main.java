package io.wdsj.villagerprofessionlocker;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new ProfessionListener(this),this);
        Bukkit.getLogger().info("VillagerProfessionLocker is successfully loaded!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        HandlerList.unregisterAll();
        Bukkit.getLogger().info("VillagerProfessionLocker is successfully unloaded!");
    }
}
