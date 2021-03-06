package com.gmail.nossr50.runnables.skills;

import com.gmail.nossr50.skills.fishing.FishingManager;
import org.bukkit.entity.FishHook;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

public class MasterAnglerTask extends BukkitRunnable {
    private final @NotNull FishHook fishHook;
    private final @NotNull FishingManager fishingManager;

    public MasterAnglerTask(@NotNull FishHook fishHook, @NotNull FishingManager fishingManager) {
        this.fishHook = fishHook;
        this.fishingManager = fishingManager;
    }

    @Override
    public void run() {
        fishingManager.processMasterAngler(fishHook);
    }
}
