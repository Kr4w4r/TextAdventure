package de.tom.location;

import java.util.Arrays;
import java.util.List;

import de.tom.location.path.GartenDoorPathBlocker;
import de.tom.location.path.Path;
import de.tom.location.pointofinterest.GardenFence;
import de.tom.location.pointofinterest.GardenFenceDoor;
import de.tom.location.pointofinterest.PointOfInterest;

public class GardenFenceWithDoor extends LocationData {

	private static final GartenDoorPathBlocker gardenDoorPathBlocker = new GartenDoorPathBlocker();
	private static final List<Path> AVAILABLE_PATHS = Arrays.asList(
		new Path(Location.FOREST),
		new Path(Location.GARDEN, gardenDoorPathBlocker)
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
		return Arrays.asList(
			new GardenFence(),
			new GardenFenceDoor(gardenDoorPathBlocker)
		);
	}


	@Override
	public List<Path> getAvailablePaths() {
		return AVAILABLE_PATHS;
	}
	
}
