package me.olafgoud;

import org.bukkit.plugin.java.JavaPlugin;

import me.olafgoud.commands.BuyGunPowderCommand;
import me.olafgoud.commands.BuyWoodCommand;
import me.olafgoud.commands.saveInventory;
import me.olafgoud.listeners.AnimalDeathListener;
import me.olafgoud.listeners.BlockBreakListener;
import me.olafgoud.listeners.BlockClick;
import me.olafgoud.listeners.InventoryListener;
import me.olafgoud.listeners.PlayerJoinsWorld;
import me.olafgoud.listeners.RespawnGetKit;
import me.olafgoud.listeners.UitlogEvent;
import me.olafgoud.utils.DelayedTask;

public class Main extends JavaPlugin{
	public void onEnable() {


		getCommand("buygunpowder").setExecutor(new BuyGunPowderCommand());
		getCommand("buywood").setExecutor(new BuyWoodCommand());
		getCommand("inventorysystem").setExecutor(new saveInventory());

		getServer().getPluginManager().registerEvents(new UitlogEvent(), this);
		getServer().getPluginManager().registerEvents(new BlockClick(), this);
		getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
		getServer().getPluginManager().registerEvents(new InventoryListener(this), this);
		getServer().getPluginManager().registerEvents(new RespawnGetKit(this), this);
		getServer().getPluginManager().registerEvents(new AnimalDeathListener(), this);
		getServer().getPluginManager().registerEvents(new PlayerJoinsWorld(), this);
		
		new DelayedTask(this);
		
	}
	
	
	public void onDisable() {
		saveConfig();
	}
}
