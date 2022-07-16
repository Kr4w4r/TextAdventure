package de.krawie.demogame.location.houseentrance;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.garden.Garden;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class HouseEntrance extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(Garden.class)/* ,
        new Path(Location.HOUSE_EAST_SIDE),
        new Path(Location.HOUSE_WEST_SIDE)*/
    );
    private List<PointOfInterest> pointOfInterests = Arrays.asList(
        new HouseDoor()
    );

    public HouseEntrance() {
        super();
    }
    
    @Override
    public String getName() {
        return "Haustür";
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
