package de.tom.location;

import java.util.Arrays;
import java.util.List;

import de.tom.location.path.Path;
import de.tom.location.pointofinterest.PointOfInterest;
import de.tom.location.pointofinterest.TreeStomp;

public class Forest extends LocationData {

	private static final List<Path> AVAILABLE_PATHS = Arrays.asList(
		new Path(Location.GARDEN_FENCE_WITH_DOOR)
		);

	TreeStomp treeStomp = new TreeStomp();
	

	protected Forest() {
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
		return AVAILABLE_PATHS;
	}
	
}
