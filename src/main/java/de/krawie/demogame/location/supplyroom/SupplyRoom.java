package de.krawie.demogame.location.supplyroom;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.entrancehall.EntranceHall;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class SupplyRoom extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(EntranceHall.class)
    );

    @Override
    public String getName() {
        return "Versorgungsraum unter der Treppe";
    }

    @Override
    public String getLocationKey() {
        return "Versorgungsraum";
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
