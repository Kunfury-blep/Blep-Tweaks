package com.kunfury.blepTweaks;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Setup extends JavaPlugin {
	 private static Plugin plugin;
	 public static FileConfiguration config;
	 
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	plugin = this;
    	
    	config = this.getConfig();
    	
    	File configFile;
    	configFile = new File(getDataFolder(), "config.yml");
    	 
    	if(!configFile.exists()){
            ConfigCreate();
	        }
    	saveConfig();
    	
    	Reload();
    	
    	
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
       
    public static Plugin getPlugin() {
        return plugin;
      }
    
    private void ConfigCreate() {
//    	config.set("EXP Drops", true);
//		config.set("Max EXP", 3);
//		config.set("Min EXP", 1);
    }
    
    private void Reload() {
//    	Harvest.xpDrops = config.getBoolean("EXP Drops");
//    	Harvest.minXp = config.getInt("Min EXP");
//    	Harvest.maxXp = config.getInt("Max EXP");
    }
   
}
