package net.creepcraft.iPencil;

import org.bukkit.event.entity.EntityListener;
import org.bukkit.event.entity.EntityTargetEvent;

public class MobMountsEntityListener extends EntityListener {
	private MobMounts plugin;

	public MobMountsEntityListener(MobMounts plugin) {
		this.plugin = plugin;

	}

	@Override
	public void onEntityTarget(EntityTargetEvent e) {

		this.plugin.getServer().broadcastMessage("Target!");

	}

}