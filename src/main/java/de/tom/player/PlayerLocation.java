package de.tom.player;

import de.tom.Scene;
import de.tom.location.Location;
import de.tom.location.LocationData;

public class PlayerLocation {
	public static LocationData getPlayerLocation(Player player) {
		Location location = player.getLocation();
		return Scene.getLocation(location);
	}
}
