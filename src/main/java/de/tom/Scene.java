package de.tom;

import java.util.EnumMap;
import java.util.Map;

import de.tom.location.Location;
import de.tom.location.LocationData;
import de.tom.location.LocationFactory;

public class Scene {
	private static Map<Location, LocationData> locations = new EnumMap<>(Location.class);

	private Scene() {}

	public static LocationData getLocation(Location location) {
		locations.computeIfAbsent(location, loc -> LocationFactory.createLocationData(loc));

		return locations.get(location);
	}
}
