package de.krawie.demogame.location.houseeast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.garden.Garden;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class HouseEast extends Location {

	private final List<Path> availablePaths = Arrays.asList(
		new Path(Garden.class)
	);

	@Override
	public String getName() {
		return "Ostseite des Hauses";
	}

	@Override
	public String getLocationKey() {
		return "Ostseite";
	}

	@Override
	public List<Path> getAvailablePaths() {
		return availablePaths;
	}

	@Override
	public List<PointOfInterest> getPointsOfInterest() {
		return new ArrayList<>();
	}
    
}
