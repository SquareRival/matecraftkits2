/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.devonly.cleggeh.matecraftkits2;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
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
    String prefix = "§7[§5§lMatecraft§7]";

    public void colourhelp(Player p) {
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] red");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] orange");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] yellow");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] green");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] lime");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] aqua");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] cyan");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] blue");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] violet");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] purple");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] pink");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] black");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] white");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] brown");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] grey");
        p.sendMessage(prefix + ChatColor.GREEN + "/dye [piece(s)] RGB " + ChatColor.RED + "[1 - 255] " + ChatColor.GREEN + "[1 - 255] " + ChatColor.BLUE + "[1 - 255] ");
    }

    public void allarmour(Player p) {
        p.sendMessage(prefix + ChatColor.RED + "You must be wearing a full set of leather armour to dye all!");
    }

    public void dyedarmour(Player p) {
        p.sendMessage(prefix + ChatColor.GREEN + "Your armour has been dyed!");
    }

    public void consoleerror(CommandSender sender) {
        sender.sendMessage(prefix + ChatColor.RED + "Welp! That didn't work. Try /mkit give [player] instead!");
    }

    public void noperms(Player p) {
        p.sendMessage(prefix + ChatColor.RED + "No permission!");
    }

    public void args(Player p) {
        p.sendMessage(prefix + ChatColor.RED + "Not enough arguments!");
    }

    public void RGBargs(Player p) {
        p.sendMessage("");

        p.sendMessage(prefix + ChatColor.RED + "Too many arguments given!");
        p.sendMessage(prefix + ChatColor.RED + "Proper use: /dye all RGB [redValue(0 - 255)] [greenValue(0 - 255)] [blueValue(0 - 255)]");
        p.sendMessage(prefix + ChatColor.GREEN + "If you need help choosing a colour, check here: " + ChatColor.LIGHT_PURPLE + "http://www.colorpicker.com/");
    }
}
