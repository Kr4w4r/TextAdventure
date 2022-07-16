package de.krawie.demogame.location.garden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.gardenfence.GardenFence;
import de.krawie.demogame.location.houseeast.HouseEast;
import de.krawie.demogame.location.houseentrance.HouseEntrance;
import de.krawie.demogame.location.housewest.HouseWest;
import de.krawie.demogame.location.shed.Shed;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class Garden extends Location {

	private final List<Path> availablePaths = Arrays.asList(
		new Path(GardenFence.class),
		new Path(HouseEntrance.class),
		new Path(Shed.class),
		new Path(HouseWest.class),
		new Path(HouseEast.class)
	);
		
	public Garden() {
		super();
	}

	@Override
	public String getName() {
		return "Großer Garten mit Brunnen";
	}

	@Override
	public String getLocationKey() {
		return "Garten";
	}

	@Override
	public List<PointOfInterest> getPointsOfInterest() {
		return new ArrayList<>();
	}

	@Override
	public List<Path> getAvailablePaths() {
		return availablePaths;
	}
}
