package de.krawie.demogame.location.storageroom;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.floor.Floor;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class StorageRoom extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(Floor.class)
    );

    @Override
    public String getName() {
        return "Alter Lagerraum";
    }

    @Override
    public String getLocationKey() {
        return "Lager";
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
