package de.krawie.demogame.location.entrancehall;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.bathroomgroundlevel.BathRoomGroundLevel;
import de.krawie.demogame.location.dinningroom.DinningRoom;
import de.krawie.demogame.location.livingroom.LivingRoom;
import de.krawie.demogame.location.stairs.Stairs;
import de.krawie.demogame.location.supplyroom.SupplyRoom;
import de.krawie.textadventure.framework.location.HiddenPath;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class EntranceHall extends Location {

    private static List<Path> availablePaths = Arrays.asList(
        new Path(LivingRoom.class),
        new Path(DinningRoom.class),
        new Path(BathRoomGroundLevel.class),
        new Path(Stairs.class),
        new Path(SupplyRoom.class, new SupplyRoomDoorBlocker(), new HiddenPath())
    );

    @Override
    public String getName() {
        return "Eingangshalle des Hauses";
    }

    @Override
    public String getLocationKey() {
        return "Eingangshalle";
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
