package uk.co.devonly.square.matecraftkits2;

import com.google.common.io.ByteStreams;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
//import uk.co.devonly.square.matecraftkits2.SettingsManager;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class SettingsManager {

    private final MatecraftKits plugin;

    public SettingsManager(MatecraftKits plugin) {
        this.plugin = plugin;
    }
    FileConfiguration config;
    File cfile;

    FileConfiguration players;
    File pfile;

    private boolean copyDefault(String source, String dest) {
        File destFile = new File(plugin.getDataFolder(), dest);
        if (!destFile.exists()) {
            try {
                destFile.getParentFile().mkdirs();
                InputStream in = getClass().getClassLoader().getResourceAsStream(source);
                if (in != null) {
                    try {
                        try (OutputStream out = new FileOutputStream(destFile)) {
                            ByteStreams.copy(in, out);
                        }
                    } finally {
                        in.close();
                    }
                    return true;
                }
            } catch (IOException e) {
                plugin.getLogger().log(Level.WARNING, "Error copying default " + dest, e);
            }
        }

        return false;
    }

    public void setup(Plugin p) {
        copyDefault("config.yml", "config.yml");
        copyDefault("players.yml", "players.yml");
    }

    public FileConfiguration getPlayers() {
        if (players == null) {
            players = YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "data.yml"));
        }
        return players;
    }

    public void savePlayers() {
        try {
            players.save(pfile);
        } catch (IOException e) {
            plugin.getLogger().log(Level.WARNING, "Could not save data.yml");
        }
    }

    public void reloadPlayers() {
        YamlConfiguration.loadConfiguration(pfile);
    }

    public FileConfiguration getConfig() {
        if (config == null) {
            config = YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "config.yml"));
        }
        return config;
    }

    public void saveConfig() {
        try {
            config.save(cfile);
        } catch (IOException e) {
            plugin.getLogger().log(Level.WARNING, "Could not save Config.yml");
        }
    }

    public void reloadConfig() {
        YamlConfiguration.loadConfiguration(cfile);
    }
}
