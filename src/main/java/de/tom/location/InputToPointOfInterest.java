package de.tom.location;

import java.util.Optional;

public class InputToPointOfInterest {

	private InputToPointOfInterest() {}
	
	public static Optional<PointOfInterest> findByName(LocationData location, String pointOfInterestName) {
		return location.getPointsOfInterest().stream()
			.filter(poi -> poi.getName().equals(pointOfInterestName))
			.findFirst();
	}
}
