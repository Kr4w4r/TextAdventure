package de.krawie.textadventure.framework;

import java.util.HashMap;
import java.util.Map;

import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.LocationFactory;

public class Scene {

	private static LocationFactory factory;
	private static Map<Class<? extends Location>, Location> locations = new HashMap<>();
	
	private Scene() {}

	public static void initInstance(LocationFactory factory) {
		Scene.factory = factory;
	}

	public static Location getLocation(Class<? extends Location> location) {
		locations.computeIfAbsent(location, loc -> factory.createLocation(loc));

		return locations.get(location);
	}
}
