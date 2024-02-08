package me.olafgoud.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Parrot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import me.olafgoud.utils.ItemUtils;

public class AnimalDeathListener implements Listener {
	@EventHandler
	public void onEntityDeath(EntityDeathEvent e) {
		Entity ent = e.getEntity();
		if (ent.getWorld().getName().equalsIgnoreCase("Olaffff2")) {
			if (ent instanceof Cow) {
				ent.getLocation();
				e.setDroppedExp(0);
				e.getDrops().clear();
				ent.getWorld().dropItemNaturally(ent.getLocation(), NBTEditor.set(ItemUtils.getItem(Material.LEATHER, "Leather", "Official PracticeMC Resource"), "leather", "material"));
			} else if (ent instanceof Pig) {
				ent.getLocation();
				e.setDroppedExp(0);
				e.getDrops().clear();
				ent.getWorld().dropItemNaturally(ent.getLocation(), NBTEditor.set(ItemUtils.getItem(Material.LEATHER, "Leather", "Official PracticeMC Resource"), "leather", "material"));
			} else if (ent instanceof Sheep) {
				ent.getLocation();
				e.setDroppedExp(0);
				e.getDrops().clear();
				ent.getWorld().dropItemNaturally(ent.getLocation(), NBTEditor.set(ItemUtils.getItem(Material.WOOD, "Wool", "Official PracticeMC Resource"), "wool", "material"));
			} else if (ent instanceof Zombie) {
				ent.getLocation();
				e.setDroppedExp(0);
				e.getDrops().clear();
				ent.getWorld().dropItemNaturally(ent.getLocation(), (NBTEditor.set(ItemUtils.getItem(Material.WOOD, "Wool", "Official PracticeMC Resource"), "wool", "material")));
				ent.getWorld().dropItemNaturally(ent.getLocation(), (NBTEditor.set(ItemUtils.getItem(Material.WOOD, "Wool", "Official PracticeMC Resource"), "wool", "material")));
				ent.getWorld().dropItemNaturally(ent.getLocation(), (NBTEditor.set(ItemUtils.getItem(Material.WOOD, "Wool", "Official PracticeMC Resource"), "wool", "material")));
			} else if (ent instanceof Parrot) {
				ent.getLocation();
				e.setDroppedExp(0);
				e.getDrops().clear();
			}
		}
	}
}
