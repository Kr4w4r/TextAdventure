package de.krawie.textadventure.framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import de.krawie.textadventure.framework.location.HiddenPath;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.LocationFactory;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PathBlocker;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class Scene {

	private static Scene instance;

	private LocationFactory factory;
	private Map<Class<? extends Location>, Location> locations = new HashMap<>();
	
	public static void setInstance(Scene instance) {
		Scene.instance = instance;
	}

	public Scene(LocationFactory factory) {
		this.factory = factory;
	}

	public static Location getLocation(Class<? extends Location> locationClass) {
		instance.locations.computeIfAbsent(locationClass, loc -> instance.factory.createLocation(loc));

		return instance.locations.get(locationClass);
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

	public static Optional<PointOfInterest> getPointOfInterest(Class<? extends Location> locationClass, Class<? extends PointOfInterest> POIClass) {
		 Optional<PointOfInterest> foundPoi = getLocation(locationClass).getPointsOfInterest().stream()
		 	.filter(poi -> poi.getClass().equals(POIClass))
			.findFirst();

		return foundPoi;
	}
}
