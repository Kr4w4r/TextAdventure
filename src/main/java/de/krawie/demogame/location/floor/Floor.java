package de.krawie.demogame.location.floor;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.bedroom.BedRoom;
import de.krawie.demogame.location.kidsroom.KidsRoom;
import de.krawie.demogame.location.officeroom.OfficeRoom;
import de.krawie.demogame.location.storageroom.StorageRoom;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class Floor extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(BedRoom.class),
        new Path(KidsRoom.class),
        new Path(OfficeRoom.class),
        new Path(StorageRoom.class)
    );

    @Override
    public String getName() {
        return "Flur Obergeschoss";
    }

    @Override
    public String getLocationKey() {
        return "Flur";
    }

    @Override
    public List<Path> getAvailablePaths() {
        return availablePaths;
    }

    @Override
    public List<PointOfInterest> getPointsOfInterest() {
        return null;
    }
    
}
