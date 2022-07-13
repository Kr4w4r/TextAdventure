package de.krawie.demogame.location.forest;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.gardenfence.GardenFenceLocation;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class ForestLocation extends Location {

	private List<Path> availablePaths = Arrays.asList(
			new Path(GardenFenceLocation.class)
	);

	TreeStomp treeStomp = new TreeStomp();

	public ForestLocation() {
		super();
	}

	@Override
	public String getName() {
		return "Dunkler Wald";
	}

	@Override
	public List<PointOfInterest> getPointsOfInterest() {
		return Arrays.asList(treeStomp);
	}

	@Override
	public List<Path> getAvailablePaths() {
		return availablePaths;
	}

}
