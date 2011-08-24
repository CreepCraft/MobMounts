package net.creepcraft.iPencil;

import java.util.logging.Logger;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;
import org.bukkit.util.config.Configuration;

public class MobMounts extends JavaPlugin{

	  private final MobMountsPlayerListener playerListener = new MobMountsPlayerListener(this);
	  private final MobMountsEntityListener entityListener = new MobMountsEntityListener(this);
	  public static final Logger log = Logger.getLogger("Minecraft");
	  
	    public Configuration config;
	    public Integer Zombietame;
	    public Integer Creepertame;
	    public Integer Skeletontame;
	    public Integer Spidertame;
	    public Integer Pigtame;
	    public Integer Sheeptame;
	    public Integer Cowtame;
	    public Integer Chickentame;
	    public Integer Squidtame;	    
	
		public void onDisable() {
		    log.info("[MobMounts]" + "version" + getDescription().getVersion() +" by iPencil" + " disabled!");
		    
		    
		}

		public void onEnable() {
			
		    log.info("[MobMounts]" + " version " + getDescription().getVersion() +" by iPencil" + " enabled!");
	    	PluginManager pm = getServer().getPluginManager();
			pm.registerEvent(Event.Type.PLAYER_INTERACT_ENTITY, playerListener, Event.Priority.Highest, this);	 
			pm.registerEvent(Event.Type.ENTITY_TARGET, entityListener, Event.Priority.Highest, this);
			config = getConfiguration();
			config.setHeader("Here you can define the items that are required to mount the mobs onto you.");
			Zombietame = config.getInt("Zombie tame item", 268);
			Creepertame = config.getInt("Creeper tame item", 289);
			Skeletontame = config.getInt("Skeleton tame item", 262);
			Spidertame = config.getInt("Spider tame item", 287);
			Pigtame = config.getInt("Pig tame item", 296);
			Sheeptame = config.getInt("Sheep tame item", 296);
			Cowtame = config.getInt("Cow tame item", 296);
			Chickentame = config.getInt("Chicken tame item", 295);
			Squidtame = config.getInt("Squid tame item", 338);
			config.save();
	        
		}
		
		public void cancelTarget(Entity entity, Player p){
			
			for (LivingEntity entity2 : p.getWorld().getLivingEntities()) {
			
				 Vector vel = p.getVelocity();
				
				if (entity2.isInsideVehicle()){
				
				entity2.setVelocity(vel);
				}
		}
		    
		    
}
}
		
		
		
		
		

		