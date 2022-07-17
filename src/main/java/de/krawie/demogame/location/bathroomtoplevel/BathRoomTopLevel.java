package de.krawie.demogame.location.bathroomtoplevel;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.bedroom.BedRoom;
import de.krawie.demogame.location.kidsroom.KidsRoom;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class BathRoomTopLevel extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(BedRoom.class),
        new Path(KidsRoom.class)
    );

    @Override
    public String getName() {
        return "Badezimmer im Obergeschoss";
    }

    @Override
    public String getLocationKey() {
        return "Bad";
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
