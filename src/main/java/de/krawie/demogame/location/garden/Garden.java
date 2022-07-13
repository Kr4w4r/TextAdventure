package de.krawie.demogame.location.garden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.gardenfence.GardenFenceLocation;
import de.krawie.demogame.location.houseentrance.HouseEntrance;
import de.krawie.demogame.location.shed.Shed;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class Garden extends Location {

	private List<Path> availablePaths = Arrays.asList(
		new Path(GardenFenceLocation.class),
		new Path(HouseEntrance.class),
		new Path(Shed.class)
	);
		
	public Garden() {
		super();
	}

	@Override
	public String getName() {
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
