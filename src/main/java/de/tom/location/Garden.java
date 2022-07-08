package de.tom.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.tom.location.path.Path;
import de.tom.location.pointofinterest.PointOfInterest;

public class Garden extends LocationData {

	private static final List<Path> AVAILABLE_PATHS = Arrays.asList(
		new Path(Location.GARDEN_FENCE_WITH_DOOR)
		);
		
	public Garden() {
		super(Location.GARDEN);
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
		return AVAILABLE_PATHS;
	}
	
}
