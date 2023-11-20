package de.krawie.textadventure.framework.game;

import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.LocationFactory;

public interface GameInitializer {
    LocationFactory getLocationFactory();
	Class<? extends Location> getPlayerStartLocation();
}
