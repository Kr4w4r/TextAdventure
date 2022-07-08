package de.tom.location;

import java.util.Arrays;
import java.util.Optional;

public enum Location {
	FOREST("Dunkler Wald"),
	GARDEN_FENCE_WITH_DOOR("Gartenzaun"),
	GARDEN("Garten");

	private final String name;

	private Location(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static Location fromName(String name) {
		Optional<Location> location = Arrays.stream(Location.values())
			.filter(loc -> loc.name.equals(name))
			.findFirst();
		
		if (location.isPresent()) {
			return location.get();
		}
		return null;
	}
}
