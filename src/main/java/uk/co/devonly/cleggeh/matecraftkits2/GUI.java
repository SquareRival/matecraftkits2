/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.devonly.cleggeh.matecraftkits2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.Plugin;

import uk.co.devonly.square.matecraftkits2.MatecraftKits;

/**
 *
 * @author martin
 */
public class GUI implements Listener {

    List<String> hats = new ArrayList<>();
    ItemStack head1, head2, head3, head4, head5, head6, head7, head8;
    Inventory inv;
    String prefix = "§7[§5§lMatecraft§7]";

    private final MatecraftKits plugin;

    public GUI(MatecraftKits plugin) {
        this.plugin = plugin;
    }
        public void Menu(Plugin p) {

        inv = Bukkit.getServer().createInventory(null, 9, "Hats");

        //ItemName = createItem(Material ID , ChatColor. + Item Name, Skull name -- null if none, Amount, lore, lore1, ECT); 
        head1 = createItem(397, (short) 3, 1, ChatColor.AQUA + "A Hat", "Cleggeh", "A Letter Hat.");
        head2 = createItem(397, (short) 3, 1, ChatColor.AQUA + "B Hat", "none", "B Letter Hat.");
        head3 = createItem(397, (short) 3, 1, ChatColor.AQUA + "C Hat", "none", "C Letter Hat.");
        head4 = createItem(397, (short) 3, 1, ChatColor.AQUA + "D Hat", "none", "D Letter Hat.");
        head5 = createItem(397, (short) 3, 1, ChatColor.AQUA + "E Hat", "none", "E Letter Hat.");
        head6 = createItem(397, (short) 3, 1, ChatColor.AQUA + "F Hat", "none", "F Letter Hat.");
        head7 = createItem(397, (short) 3, 1, ChatColor.AQUA + "G Hat", "none", "G Letter Hat.");
        head8 = createItem(397, (short) 3, 1, ChatColor.AQUA + "Item", "none", "Testing....");

        inv.setItem(1, head1);
        inv.setItem(2, head2);
        inv.setItem(3, head3);

        Bukkit.getServer().getPluginManager().registerEvents(this.plugin, p);
        }

        /*Creates a method that takes an item ID, durability, 
        * amount, name, skullowner, and lore and turns it into an item.
        */
    private ItemStack createItem(int id, short dur, int amount, String name, String skullname, String... lore) {
        List<String> LoreList = Arrays.asList(lore);
        ItemStack i = new ItemStack(Material.getMaterial(id), amount);
        i.setDurability(dur);
        ItemMeta im = i.getItemMeta();
        im.setDisplayName(name);
        im.setLore(LoreList);
        i.setItemMeta(im);
        if (!("none".equals(skullname))) {
            SkullMeta meta = (SkullMeta) Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
            meta.setOwner(skullname);
        }
        return i;
    }

    public void onInventoryClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        PlayerInventory pi = p.getInventory();
        // Stops them from moving the hat if has one.
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Hat") && hats.equals(p)) {
            e.setCancelled(true);
            p.sendMessage(prefix + ChatColor.RED + "Use /delhat to remove the Hat.");
        }
        if (!e.getInventory().getName().equalsIgnoreCase(inv.getName())) {
            return;
        }
        if (e.getCurrentItem().getItemMeta() == null) {
            return;
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Hat")) {
            pi.setHelmet(e.getCurrentItem());
            //Add them to the hats ArrayList.
            e.setCancelled(true);
        } else {
            e.setCancelled(true);
        }
    }

    public void show(Player p) {
        p.openInventory(inv);
    }
}
