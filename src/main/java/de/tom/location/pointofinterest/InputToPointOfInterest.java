package de.tom.location.pointofinterest;

import java.util.Optional;

import de.tom.location.LocationData;

public class InputToPointOfInterest {

	private InputToPointOfInterest() {}
	
	public static Optional<PointOfInterest> findByName(LocationData location, String pointOfInterestName) {
		return location.getPointsOfInterest().stream()
			.filter(poi -> poi.getName().equals(pointOfInterestName))
			.findFirst();
	}
}
