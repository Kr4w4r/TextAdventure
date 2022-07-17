package de.krawie.demogame.location.housewest;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.garden.Garden;
import de.krawie.demogame.location.houseeast.WindowToHighPathBlocker;
import de.krawie.demogame.location.livingroom.LivingRoom;
import de.krawie.demogame.location.shed.Shed;
import de.krawie.textadventure.framework.location.HiddenPath;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class HouseWest extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(Garden.class),
        new Path(Shed.class),
        new Path(LivingRoom.class, new WindowToHighPathBlocker(), new HiddenPath())
    );

    private static final List<PointOfInterest> pois = Arrays.asList(
        new LockedWindowPOI()
    );
        
    @Override
    public String getName() {
        return "Westseite des Hauses";
    }

    @Override
    public String getLocationKey() {
        return "Westseite";
    }

    @Override
    public List<Path> getAvailablePaths() {
        return availablePaths;
    }

    @Override
    public List<PointOfInterest> getPointsOfInterest() {
        return pois;
    }
}
