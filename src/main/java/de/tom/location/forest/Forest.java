package de.tom.location.forest;

import java.util.Arrays;
import java.util.List;

import de.tom.location.Location;
import de.tom.location.LocationData;
import de.tom.location.Path;
import de.tom.location.PointOfInterest;

public class Forest extends LocationData {

	private List<Path> availablePaths = Arrays.asList(
		new Path(Location.GARDEN_FENCE_WITH_DOOR)
		);

	TreeStomp treeStomp = new TreeStomp();
	

	public Forest() {
		super(Location.FOREST);
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
