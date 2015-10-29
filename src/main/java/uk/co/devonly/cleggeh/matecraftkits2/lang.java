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

    lang(lang lang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
    
    // Not used ATM.
    public void haterror(Player p) {
        p.sendMessage(prefix + ChatColor.RED + "Use /delhat to remove the Hat.");
    }

    public void invalidargs(Player p) {
        p.sendMessage(prefix + ChatColor.RED + "Invalid arguments!");
    }

    public void RGBargs(Player p) {
        p.sendMessage("");

        p.sendMessage(prefix + ChatColor.RED + "Too many arguments given!");
        p.sendMessage(prefix + ChatColor.RED + "Proper use: /dye all RGB [redValue(0 - 255)] [greenValue(0 - 255)] [blueValue(0 - 255)]");
        p.sendMessage(prefix + ChatColor.GREEN + "If you need help choosing a colour, check here: " + ChatColor.LIGHT_PURPLE + "http://www.colorpicker.com/");
    }

    public void kitinfo(Player p) {
        p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
        p.sendMessage(ChatColor.GREEN + "§ /mkit info");
        p.sendMessage(ChatColor.GRAY + " > Gives info about MatecraftKits");
        if (p.hasPermission("matecraftkits.use")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit");
            p.sendMessage(ChatColor.GRAY + " > Shows this menu");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.use");
        }
        if (p.hasPermission("matecraftkits.list")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit list");
            p.sendMessage(ChatColor.GRAY + " > Shows all available MatecraftKits");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.list");
        }
        if (p.hasPermission("matecraftkits.disco.toggle")) {
            p.sendMessage(ChatColor.GREEN + "§ /disco");
            p.sendMessage(ChatColor.GRAY + " > Toggles your use of disco armour");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.disco.toggle");
        }
        if (p.hasPermission("matecraftkits.disco.toggle")) {
            p.sendMessage(ChatColor.GREEN + "§ /rainbow");
            p.sendMessage(ChatColor.GRAY + " > Toggles your use of rainbow armour");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.rainbow.toggle");
        }
        if (p.hasPermission("matecraftkits.setcolourdelay")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit setcolourdelay [value]");
            p.sendMessage(ChatColor.GRAY + " > Sets the amount of ticks per colour change for disco armour");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.setcolourdelay");
        }
        if (p.hasPermission("matecraftkits.reload")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit reload");
            p.sendMessage(ChatColor.GRAY + " > Reload MatecraftKits (Does nothing at the moment)");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.reload");
        }
        if (p.hasPermission("matecraftkits.dye")) {
            p.sendMessage(ChatColor.GREEN + "§ /dye [all, helmet, chestplate, leggings, boots] [colour / RGB] (redValue) (greenValue) (blueValue)");
            p.sendMessage(ChatColor.GRAY + " > Changes the colour of your leather armour");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.dye");
        }
        if (p.hasPermission("matecraftkits.dye")) {
            p.sendMessage(ChatColor.GREEN + "§ /dye colours");
            p.sendMessage(ChatColor.GRAY + " > Shows all the colours");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.dye");
        }
        p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
    }

    public static void kitlist(Player p) {
        p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
        if (p.hasPermission("matecraftkits.use.starter")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit starter");
            p.sendMessage(ChatColor.GRAY + " > Gives starter kit");
            p.sendMessage(ChatColor.GRAY + " > Kit includes:");
            p.sendMessage(ChatColor.GRAY + " > §f1 §dPickaxe");
            p.sendMessage(ChatColor.GRAY + " > §f1 §dAxe");
            p.sendMessage(ChatColor.GRAY + " > §f1 §dShovel");
            p.sendMessage(ChatColor.GRAY + " > §f64 §dKFCs");
            p.sendMessage(ChatColor.GRAY + "§8§l§m+----------------------+");
        }
        if (p.hasPermission("matecraftkits.use.disco")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit disco");
            p.sendMessage(ChatColor.GRAY + " > Gives disco armour kit");
            p.sendMessage(ChatColor.GRAY + " > Kit includes:");
            p.sendMessage(ChatColor.GRAY + " > §f1 §dDisco Armour Set");
        }
        if (p.hasPermission("matecraftkits.use.rainbow")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit rainbow");
            p.sendMessage(ChatColor.GRAY + " > Gives rainbow armour kit");
            p.sendMessage(ChatColor.GRAY + " > Kit includes:");
            p.sendMessage(ChatColor.GRAY + " > §f1 §drainbow Armour Set");
        }
    }

    public static void help(Player p) {
        p.sendMessage("§8§l§m---------§r§8§l[§5MatecraftKits§8§l]§m---------");
        if (p.hasPermission("matecraftkits.use")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit");
            p.sendMessage(ChatColor.GRAY + " > Shows this menu");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.use");
        }
        if (p.hasPermission("matecraftkits.list")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit list");
            p.sendMessage(ChatColor.GRAY + " > Shows all available MatecraftKits");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.list");
        }
        if (p.hasPermission("matecraftkits.disco.toggle")) {
            p.sendMessage(ChatColor.GREEN + "§ /disco");
            p.sendMessage(ChatColor.GRAY + " > Toggles your use of disco armour");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.disco.toggle");
        }
        if (p.hasPermission("matecraftkits.setcolourdelay")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit setcolourdelay [value]");
            p.sendMessage(ChatColor.GRAY + " > Sets the amount of ticks per colour change for disco armour");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.setcolourdelay");
        }
        if (p.hasPermission("matecraftkits.reload")) {
            p.sendMessage(ChatColor.GREEN + "§ /mkit reload");
            p.sendMessage(ChatColor.GRAY + " > Reload MatecraftKits (Does nothing at the moment)");
            p.sendMessage(ChatColor.GRAY + " > Permission: " + ChatColor.LIGHT_PURPLE + "matecraftkits.reload");
        }
    }
}
