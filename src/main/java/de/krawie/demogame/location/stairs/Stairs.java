package de.krawie.demogame.location.stairs;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.entrancehall.EntranceHall;
import de.krawie.demogame.location.floor.Floor;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class Stairs extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(EntranceHall.class),
        new Path(Floor.class, new StairsGhostBlocker())
    );

    @Override
    public String getName() {
        return "Treppen";
    }

    @Override
    public String getLocationKey() {
        return "Treppen";
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
