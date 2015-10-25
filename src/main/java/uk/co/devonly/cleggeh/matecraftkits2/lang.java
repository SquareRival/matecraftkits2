/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.devonly.cleggeh.matecraftkits2;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import uk.co.devonly.square.matecraftkits2.MatecraftKits;

/**
 *
 * @author martin
 */
public class lang {

    private final MatecraftKits plugin;

    public lang(MatecraftKits plugin) {
        this.plugin = plugin;
    }

    public void colourhelp(Player p) {
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] red");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] orange");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] yellow");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] green");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] lime");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] aqua");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] cyan");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] blue");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] violet");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] purple");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] pink");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] black");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] white");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] brown");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] grey");
        p.sendMessage("§7[§5§lMatecraft§7] " + ChatColor.GREEN + "/dye [piece(s)] RGB " + ChatColor.RED + "[1 - 255] " + ChatColor.GREEN + "[1 - 255] " + ChatColor.BLUE + "[1 - 255] ");
    }
    
   public void allarmour(Player p) {
       p.sendMessage("§7[§5§lMatecraft§7] " +ChatColor.RED + "You must be wearing a full set of leather armour to dye all!");
   }
   public void dyedarmour(Player p) {
       p.sendMessage("§7[§5§lMatecraft§7] " +ChatColor.GREEN + "Your armour has been dyed!");
   }
}
