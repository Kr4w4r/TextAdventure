package de.krawie.textadventure.framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import de.krawie.textadventure.framework.location.HiddenPath;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.LocationFactory;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PathBlocker;

public class Scene {

	private static LocationFactory factory;
	private static Map<Class<? extends Location>, Location> locations = new HashMap<>();
	
	private Scene() {}

	public static void initInstance(LocationFactory factory) {
		Scene.factory = factory;
	}

	public static Location getLocation(Class<? extends Location> locationClass) {
		locations.computeIfAbsent(locationClass, loc -> factory.createLocation(loc));

		return locations.get(locationClass);
	}

	public static Optional<Path> getPath(Class<? extends Location> startLocationClass, Class<? extends Location> tartetLocationClass) {
		Location location = getLocation(startLocationClass);

		return location.getAvailablePaths().stream()
			.filter(path -> path.getLocationToGo().equals(tartetLocationClass))
			.findFirst();
	}

	public static Optional<PathBlocker> getPathBlocker(Class<? extends Location> startLocationClass, Class<? extends Location> tartetLocationClass) {
		Optional<Path> optionalPath = getPath(startLocationClass, tartetLocationClass);
		
		return optionalPath.map(path -> path.getPathBlocker());
	}

	public static Optional<HiddenPath> getHiddenPath(Class<? extends Location> startLocationClass, Class<? extends Location> tartetLocationClass) {
		Optional<Path> optionalPath = getPath(startLocationClass, tartetLocationClass);
		
		return optionalPath.map(path -> path.getHiddenPath());
	}
}
