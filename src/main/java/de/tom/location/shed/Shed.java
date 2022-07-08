package de.tom.location.shed;

import java.util.Arrays;
import java.util.List;

import de.tom.location.Location;
import de.tom.location.LocationData;
import de.tom.location.Path;
import de.tom.location.PointOfInterest;

public class Shed extends LocationData {

    private List<Path> availablePaths = Arrays.asList(
		new Path(Location.GARDEN),
        new Path(Location.HOUSE_ENTRANCE),
		new Path(Location.HOUSE_WEST_SIDE)
	);
    private List<PointOfInterest> pointOfInterests = Arrays.asList(
        new ShedDoor(),
        new ShedWall()
    );

    public Shed() {
        super(Location.SHED);
    }

    @Override
    public List<Path> getAvailablePaths() {
        return availablePaths;
    }

    @Override
    public List<PointOfInterest> getPointsOfInterest() {
        return pointOfInterests;
    }
    
}
