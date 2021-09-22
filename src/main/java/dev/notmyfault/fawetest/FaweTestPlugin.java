package dev.notmyfault.fawetest;

import com.sk89q.worldedit.WorldEdit;
import com.sk89q.worldedit.extension.platform.Capability;
import org.bukkit.plugin.java.JavaPlugin;

public final class FaweTestPlugin extends JavaPlugin {

    int dataVersion = WorldEdit.getInstance().getPlatformManager().queryCapability(Capability.WORLD_EDITING).getDataVersion();

    @Override
    public void onEnable() {
        if (dataVersion >= 2566) {
            getLogger().info("We are on a version >= 1.16");
            // This obviously won't work in onEnable and must be called after Fawe set up its platform hooks.
        }
    }
}
