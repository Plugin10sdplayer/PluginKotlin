package com.pluginkotlin

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerChatEvent
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.plugin.java.JavaPlugin

class MainKotlin : JavaPlugin(), Listener{
    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(this, this)
        logger.info("Hello world!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler fun PlayerMessage(event: PlayerMoveEvent){
        var player: Player = event.player
        player.sendMessage("Hello world!")
    }
    @EventHandler fun PlayerChat(event: PlayerChatEvent){
        var player: Player = event.player
        player.sendMessage("Hello world! "+ player.name)
    }
}