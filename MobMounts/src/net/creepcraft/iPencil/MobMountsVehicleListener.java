package net.creepcraft.iPencil;

import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleListener;

public class MobMountsVehicleListener extends VehicleListener{
	private MobMounts plugin;  
	
	public MobMountsVehicleListener(MobMounts plugin) {
        this.plugin = plugin;
        
	}
	
    public void onVehicleEnter(VehicleEnterEvent event){
        
    	this.plugin.getServer().broadcastMessage("Enter!");
    	
    }
    
}
