package me.olafgoud.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import io.github.bananapuncher714.nbteditor.NBTEditor;

public class InventoryUtils {

	public static Inventory woodBuyInventory(Player p) {
		Inventory inv = Bukkit.createInventory(p, 9 * 3, "Wood Shop");
		
		inv.setItem(13, ItemUtils.getItem(Material.WOOD, "&2Wood Planks", "&5Official PracticeMC Resource"));

		return inv;
	}
	
	public static Inventory gunpowderBuyMenu(Player p) {
		Inventory inv = Bukkit.createInventory(p, 9 * 3, "Gunpowder Shop");
		
		inv.setItem(13, ItemUtils.getItem(Material.SULPHUR, "&2GunPowder", "&5Official PracticeMC Resource"));

		return inv;
	}
	
	
	
	public static Inventory smelterInventory(Player p) {
		Inventory inv = Bukkit.createInventory(p, 9*3, "Material Smelter");
		inv.setItem(0, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(1, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(2, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(3, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(4, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(5, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(6, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(7, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(8, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(9, ItemUtils.getItem(Material.IRON_BLOCK, "&2Iron Block", "&29 Iron Ingot"));
		inv.setItem(10, ItemUtils.getItem(Material.IRON_INGOT, "&2Iron Ingot", "&26 Iron Nugget"));
		inv.setItem(11, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(12, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(13, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(14, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(15, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(16, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(17, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(18, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(19, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(20, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(21, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(22, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(23, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(24, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(25, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(26, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		return inv;
	}
	
	
	public static Inventory weaponInventory(Player p) {
		Inventory inv = Bukkit.createInventory(p, 9 * 3, "Weaponbench");
		inv.setItem(0, NBTEditor.set(ItemUtils.getItem(Material.WOOD_HOE, "&8Walter PP", "&c3x Wood, 3x Iron Ingot, 8x Iron Piece"), "walterpp", "practicemc"));
		inv.setItem(1, NBTEditor.set(ItemUtils.getItem(Material.WOOD_HOE, "&8P92", "&c2x Iron Block, 10x Iron Ingot, 7x Iron Piece"), "p92", "practicemc"));
		inv.setItem(2, NBTEditor.set(ItemUtils.getItem(Material.WOOD_HOE, "&8M24", "&c4x Iron Block, 7x Iron Ingot, 10x Iron Piece"), "m24", "practicemc"));
		inv.setItem(3, NBTEditor.set(ItemUtils.getItem(Material.WOOD_HOE, "&8Mossberg 500", "&c10x Wood, 1x Iron Block, 5x Iron Ingot, 5x Iron Nugget"), "mossberg500", "practicemc"));
		inv.setItem(4, NBTEditor.set(ItemUtils.getItem(Material.WOOD_HOE, "&8T4", "&c3x Iron Block, 9x Iron Ingot, 7x Iron Piece"), "t4", "practicemc"));
		inv.setItem(5, NBTEditor.set(ItemUtils.getItem(Material.WOOD_HOE, "&8AK-47", "&c10x Wood, 2x Iron Block, 10x Iron Ingot, 5x Iron Piece"), "ak-47", "practicemc"));
		inv.setItem(6, NBTEditor.set(ItemUtils.getItem(Material.WOOD_HOE, "&8Thompson", "&c6x Wood 1x Iron Block, 4x Iron Ingot, 3x Iron Piece"), "thompson", "practicemc"));
		inv.setItem(7, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(8, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(9, NBTEditor.set(ItemUtils.getItem(Material.IRON_INGOT, "&8Thompson Ammo", "&c3x Iron Ingot, 7x Gunpowder"), "thompsonammo", "practicemc"));
		inv.setItem(10, NBTEditor.set(ItemUtils.getItem(Material.IRON_INGOT, "&89mm", "&c3x Iron Piece, 3x Gunpowder"), "9mm", "practicemc"));
		inv.setItem(11, NBTEditor.set(ItemUtils.getItem(Material.IRON_INGOT, "&85.6x61mm", "&c4x Iron Ingot, 5x Gunpowder"), "5_6x61mm", "practicemc"));
		inv.setItem(12, NBTEditor.set(ItemUtils.getItem(Material.IRON_INGOT, "&8Shell", "&c3x Iron Ingot, 2x Gunpowder"), "shell", "practicemc"));
		inv.setItem(13, NBTEditor.set(ItemUtils.getItem(Material.IRON_INGOT, "&87.62x51mm", "&c4x Iron Piece 3x Gunpowder"), "7_62x51mm", "practicemc"));
		inv.setItem(14, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(15, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(16, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(17, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(18, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(19, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(20, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(21, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(22, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(23, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(24, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(25, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(26, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		return inv;
	}
	
	
	
	public static Inventory armorInventory(Player p) {
		Inventory inv = Bukkit.createInventory(p, 9 * 5, "Armorbench");
		//rij 1
		inv.setItem(0, ItemUtils.getItem(Material.LEATHER_HELMET, "&7Wild Gear", "&c3 Wool"));
		inv.setItem(1, ItemUtils.getItem(Material.LEATHER_HELMET, "&fCloth Gear", "&c5 Wool"));
		inv.setItem(2, ItemUtils.getItem(Material.LEATHER_HELMET, "&8Leather Gear", " "));
		inv.setItem(3, ItemUtils.getItem(Material.LEATHER_HELMET, "&9Reinforced Leather Gear", " "));
		inv.setItem(4, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&5Tacticle Gear", " "));
		inv.setItem(5, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&3Combat Gear", " "));
		inv.setItem(6, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&bAdvanced Combat Gear", " "));
		inv.setItem(7, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&1Heavy Combat Gear", " "));
		inv.setItem(8, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&2Wilderniss Gear", " "));
		//rij 2
		inv.setItem(9, ItemUtils.getItem(Material.LEATHER_CHESTPLATE, "&7Wild Gear", "&c4 Wool"));
		inv.setItem(10, ItemUtils.getItem(Material.LEATHER_CHESTPLATE, "&fCloth Gear", "&c7 Wool"));
		inv.setItem(11, ItemUtils.getItem(Material.LEATHER_CHESTPLATE, "&8Leather Gear", " "));
		inv.setItem(12, ItemUtils.getItem(Material.LEATHER_CHESTPLATE, "&9Reinforced Leather Gear", " "));
		inv.setItem(13, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&5Tacticle Gear", " "));
		inv.setItem(14, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&3Combat Gear", " "));
		inv.setItem(15, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&bAdvanced Combat Gear", " "));
		inv.setItem(16, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&1Heavy Combat Gear", " "));
		inv.setItem(17, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&2Wilderniss Gear", " "));
		//rij 3
		inv.setItem(18, ItemUtils.getItem(Material.LEATHER_LEGGINGS, "&7Wild Gear", "&c3 Wool"));
		inv.setItem(19, ItemUtils.getItem(Material.LEATHER_LEGGINGS, "&fCloth Gear", "&c6 Wool"));
		inv.setItem(20, ItemUtils.getItem(Material.LEATHER_LEGGINGS, "&8Leather Gear", " "));
		inv.setItem(21, ItemUtils.getItem(Material.LEATHER_LEGGINGS, "&9Reinforced Leather Gear", " "));
		inv.setItem(22, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&5Tacticle Gear", " "));
		inv.setItem(23, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&3Combat Gear", " "));
		inv.setItem(24, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&bAdvanced Combat Gear", " "));
		inv.setItem(25, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&1Heavy Combat Gear", " "));
		inv.setItem(26, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&2Wilderniss Gear", " "));
		//rij 4
		inv.setItem(27, ItemUtils.getItem(Material.LEATHER_BOOTS, "&7Wild Gear", "&c3 Wool"));
		inv.setItem(28, ItemUtils.getItem(Material.LEATHER_BOOTS, "&fCloth Gear", "&c5 Wool"));
		inv.setItem(29, ItemUtils.getItem(Material.LEATHER_BOOTS, "&8Leather Gear", " "));
		inv.setItem(30, ItemUtils.getItem(Material.LEATHER_BOOTS, "&9Reinforced Leather Gear", " "));
		inv.setItem(31, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&5Tacticle Gear", " "));
		inv.setItem(32, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&3Combat Gear", " "));
		inv.setItem(33, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&bAdvanced Combat Gear", " "));
		inv.setItem(34, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&1Heavy Combat Gear", " "));
		inv.setItem(35, ItemUtils.getItem(Material.STAINED_GLASS_PANE, "&2Wilderniss Gear", " "));
		//rij 5
		inv.setItem(36, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(37, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(38, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(39, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(40, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(41, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(42, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(43, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		inv.setItem(44, ItemUtils.getItem(Material.STAINED_GLASS_PANE, " ", " "));
		
		
		return inv;
	}
	
	
}
