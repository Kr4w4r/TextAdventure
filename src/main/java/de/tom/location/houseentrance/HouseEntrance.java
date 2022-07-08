package de.tom.location.houseentrance;

import java.util.Arrays;
import java.util.List;

import de.tom.location.Location;
import de.tom.location.LocationData;
import de.tom.location.Path;
import de.tom.location.PointOfInterest;

public class HouseEntrance extends LocationData {

    private List<Path> availablePaths = Arrays.asList(
        new Path(Location.GARDEN),
        new Path(Location.HOUSE_EAST_SIDE),
        new Path(Location.HOUSE_WEST_SIDE)
    );
    private List<PointOfInterest> pointOfInterests = Arrays.asList(
        new HouseDoor()
    );

    public HouseEntrance() {
        super(Location.HOUSE_ENTRANCE);
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
