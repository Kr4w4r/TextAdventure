package de.krawie.textadventure.framework.player;

import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.location.Location;

public class PlayerLocation {
	public static Location getPlayerLocation(Player player) {
		Class<? extends Location> location = player.getLocation();
		return Scene.getLocation(location);
	}
}
