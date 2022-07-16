package de.krawie.demogame.location.shed;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.ShedInside.ShedInside;
import de.krawie.demogame.location.garden.Garden;
import de.krawie.demogame.location.housewest.HouseWest;
import de.krawie.textadventure.framework.location.HiddenPath;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class Shed extends Location {

    private final List<Path> availablePaths = Arrays.asList(
		new Path(Garden.class),
        new Path(HouseWest.class),
        new Path(ShedInside.class, new HiddenPath())
	);
    private final List<PointOfInterest> pointOfInterests = Arrays.asList(
        new ShedDoorPOI(),
        new ShedWallPOI()
    );

    public Shed() {
        super();
    }

    @Override
    public String getName() {
        return "Alter Schuppen";
    }

    @Override
    public String getLocationKey() {
        return "Schuppen";
    }

    @Override
    public List<Path> getAvailablePaths() {
        return availablePaths;
    }

    @Override
    public List<PointOfInterest> getPointsOfInterest() {
        return pointOfInterests;
    }

    
}
