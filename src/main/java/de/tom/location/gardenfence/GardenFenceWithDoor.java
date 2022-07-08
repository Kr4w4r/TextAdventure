package de.tom.location.gardenfence;

import java.util.Arrays;
import java.util.List;

import de.tom.location.Location;
import de.tom.location.LocationData;
import de.tom.location.Path;
import de.tom.location.PointOfInterest;

public class GardenFenceWithDoor extends LocationData {

	private GartenDoorPathBlocker gardenDoorPathBlocker = new GartenDoorPathBlocker();
	private List<Path> availablePaths = Arrays.asList(
		new Path(Location.FOREST),
		new Path(Location.GARDEN, gardenDoorPathBlocker)
	);
	private List<PointOfInterest> pointOfInterests = Arrays.asList(
		new GardenFence(),
		new GardenFenceDoor(gardenDoorPathBlocker)
	);

	public GardenFenceWithDoor() {
		super(Location.GARDEN_FENCE_WITH_DOOR);
	}

	@Override
	public String getName() {
		return "Garten Zaun mit Tür";
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
