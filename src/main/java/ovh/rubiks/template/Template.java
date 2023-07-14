package ovh.rubiks.template;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Template extends JavaPlugin implements @NotNull Listener {


    @Override
    public void onEnable() {
        // Plugin startup logic
        // Register events
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + "!"));
        // Send a message to all players
        Bukkit.broadcast(Component.text("Welcome to the server, " + event.getPlayer().getName() + "!"));
    }

    // On leave
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        event.getPlayer().sendMessage(Component.text("Goodbye, " + event.getPlayer().getName() + "!"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
