package com.pluginkotlin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Hello world!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void PlayerMessage(PlayerMoveEvent event){
        Player player = event.getPlayer();
        player.sendMessage("Hello world!");
    }
    @EventHandler
    public void PlayerChat(PlayerChatEvent event){
        Player player = event.getPlayer();
        player.sendMessage("Hello world! "+ player.getName());
    }
}
