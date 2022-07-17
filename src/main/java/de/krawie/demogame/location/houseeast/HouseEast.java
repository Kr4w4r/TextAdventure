package de.krawie.demogame.location.houseeast;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.dinningroom.DinningRoom;
import de.krawie.demogame.location.garden.Garden;
import de.krawie.textadventure.framework.location.HiddenPath;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class HouseEast extends Location {

	private final List<Path> availablePaths = Arrays.asList(
		new Path(Garden.class),
		new Path(DinningRoom.class, new WindowToHighPathBlocker(), new HiddenPath())
	);

	private final List<PointOfInterest> pois = Arrays.asList(
		new UnlockedWindowPOI()
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
		return pois;
	}
    
}
