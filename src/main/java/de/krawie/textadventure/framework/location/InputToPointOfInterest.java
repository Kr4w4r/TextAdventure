package de.krawie.textadventure.framework.location;

import java.util.Optional;

public class InputToPointOfInterest {

	private InputToPointOfInterest() {}
	
	public static Optional<PointOfInterest> findByName(Location location, String pointOfInterestName) {
		return location.getPointsOfInterest().stream()
			.filter(poi -> poi.getName().equals(pointOfInterestName))
			.findFirst();
	}
}
