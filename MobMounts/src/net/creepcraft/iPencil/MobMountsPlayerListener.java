package net.creepcraft.iPencil;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Zombie;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.inventory.Inventory;

public class MobMountsPlayerListener extends PlayerListener {
	private MobMounts plugin;
	
	
	public MobMountsPlayerListener(MobMounts plugin) {
        this.plugin = plugin;
        
	}
	
	public void onPlayerInteractEntity(PlayerInteractEntityEvent event)
	{
		Player p = event.getPlayer();
		Entity mob = event.getRightClicked();
		
		if (mob instanceof Zombie)
		{	
			if (event.getPlayer().getItemInHand().getTypeId() == plugin.Zombietame)
			{
			Zombie Zombie = (Zombie) event.getRightClicked();
			
       	 p.setPassenger(Zombie);
		}else{}	
}
		
		if (mob instanceof Creeper)
		{	
			if (event.getPlayer().getItemInHand().getTypeId() == plugin.Creepertame)
			{
			Creeper Creeper = (Creeper) event.getRightClicked();
			
       	 p.setPassenger(Creeper);
		}else{}	
}
		
		if (mob instanceof Skeleton)
		{	
			if (event.getPlayer().getItemInHand().getTypeId() == plugin.Skeletontame)
			{
				Skeleton Skeleton = (Skeleton) event.getRightClicked();
			
       	 p.setPassenger(Skeleton);
		}else{}	
			
}
		if (mob instanceof Spider)
		{	
			if (event.getPlayer().getItemInHand().getTypeId() == plugin.Spidertame)
			{
				Spider Spider = (Spider) event.getRightClicked();
			
       	 p.setPassenger(Spider);
		}else{}	
			
}
		if (mob instanceof Pig)
		{	
			if (event.getPlayer().getItemInHand().getTypeId() == plugin.Pigtame)
			{
				Pig Pig = (Pig) event.getRightClicked();
			
       	 p.setPassenger(Pig);
		}else{}	
			
}
		
		if (mob instanceof Cow)
		{	
			if (event.getPlayer().getItemInHand().getTypeId() == plugin.Cowtame)
			{
				Cow Cow = (Cow) event.getRightClicked();
			
       	 p.setPassenger(Cow);
		}else{}	
			
}
		
		if (mob instanceof Sheep)
		{	
			if (event.getPlayer().getItemInHand().getTypeId() == plugin.Sheeptame)
			{
				Sheep Sheep = (Sheep) event.getRightClicked();
			
       	 p.setPassenger(Sheep);
		}else{}	
			
}
		
		
		
		if (mob instanceof Chicken)
		{	
			if (event.getPlayer().getItemInHand().getTypeId() == plugin.Chickentame)
			{
				Chicken Chicken = (Chicken) event.getRightClicked();
			
       	 p.setPassenger(Chicken);
		}else{}	
			
}
		
		if (mob instanceof Squid)
		{	
			if (event.getPlayer().getItemInHand().getTypeId() == plugin.Squidtame)
			{
				Squid Squid = (Squid) event.getRightClicked();
			
       	 p.setPassenger(Squid);
		}else{}	
			
}
	
	
		
	}

	
}