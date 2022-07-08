package de.tom.location.garden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.tom.location.Location;
import de.tom.location.LocationData;
import de.tom.location.Path;
import de.tom.location.PointOfInterest;

public class Garden extends LocationData {

	private List<Path> availablePaths = Arrays.asList(
		new Path(Location.GARDEN_FENCE_WITH_DOOR),
		new Path(Location.HOUSE_ENTRANCE),
		new Path(Location.SHED)
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
		return availablePaths;
	}
	
}
