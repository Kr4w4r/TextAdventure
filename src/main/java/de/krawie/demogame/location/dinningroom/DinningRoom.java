package de.krawie.demogame.location.dinningroom;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.entrancehall.EntranceHall;
import de.krawie.demogame.location.kitchen.Kitchen;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class DinningRoom extends Location {

    @Override
    public String getName() {
        return "Großes Esszimmer mit Tisch";
    }

    @Override
    public String getLocationKey() {
        return "Esszimmer";
    }

    @Override
    public List<Path> getAvailablePaths() {
        return Arrays.asList(
            new Path(EntranceHall.class),
            new Path(Kitchen.class)
        );
    }

    @Override
    public List<PointOfInterest> getPointsOfInterest() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
