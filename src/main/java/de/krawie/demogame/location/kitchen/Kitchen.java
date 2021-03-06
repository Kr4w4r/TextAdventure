package de.krawie.demogame.location.kitchen;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.dinningroom.DinningRoom;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class Kitchen extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(DinningRoom.class)
    );

    @Override
    public String getName() {
        return "Eingestaubte Küche";
    }

    @Override
    public String getLocationKey() {
        return "Küche";
    }

    @Override
    public List<Path> getAvailablePaths() {
        return availablePaths;
    }

    @Override
    public List<PointOfInterest> getPointsOfInterest() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
