package io.github.staudlol;

import io.github.staudlol.listener.EnderButtListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class EnderButtPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new EnderButtListener(), this));
    }
}
