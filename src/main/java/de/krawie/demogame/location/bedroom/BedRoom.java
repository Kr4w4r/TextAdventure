package de.krawie.demogame.location.bedroom;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.bathroomtoplevel.BathRoomTopLevel;
import de.krawie.demogame.location.floor.Floor;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class BedRoom extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(Floor.class),
        new Path(BathRoomTopLevel.class)
    );

    @Override
    public String getName() {
        return "Unordentliches Schlafzimmer";
    }

    @Override
    public String getLocationKey() {
        return "Schlafzimmer";
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
