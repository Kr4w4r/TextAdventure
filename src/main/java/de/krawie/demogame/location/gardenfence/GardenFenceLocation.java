package de.krawie.demogame.location.gardenfence;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.forest.ForestLocation;
import de.krawie.demogame.location.garden.Garden;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class GardenFenceLocation extends Location {

	private GardenDoorPathBlocker gardenDoorPathBlocker = new GardenDoorPathBlocker();
	private List<Path> availablePaths = Arrays.asList(
		new Path(ForestLocation.class),
		new Path(Garden.class, gardenDoorPathBlocker)
	);
	private List<PointOfInterest> pointOfInterests = Arrays.asList(
		new GardenFence(),
		new GardenFenceDoor(gardenDoorPathBlocker)
	);

	public GardenFenceLocation() {
		super();
	}
	
	@Override
	public String getName() {
		return "Gartenzaun";
	}

	@Override
	public List<PointOfInterest> getPointsOfInterest() {
		return pointOfInterests;
	}

	@Override
	public List<Path> getAvailablePaths() {
		return availablePaths;
	}

	
}
