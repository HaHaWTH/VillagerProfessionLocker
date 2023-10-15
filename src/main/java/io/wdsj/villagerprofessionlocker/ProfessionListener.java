package io.wdsj.villagerprofessionlocker;

import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerCareerChangeEvent;
import org.bukkit.plugin.Plugin;

public class ProfessionListener implements Listener {
    private final Plugin plugin;
    public ProfessionListener(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onVillagerCareerChange(VillagerCareerChangeEvent event) {
        Villager villager = event.getEntity();
        villager.setVillagerExperience(villager.getVillagerExperience() + 1);
    }
}
