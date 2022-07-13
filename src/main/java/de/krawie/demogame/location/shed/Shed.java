package de.krawie.demogame.location.shed;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.garden.Garden;
import de.krawie.demogame.location.houseentrance.HouseEntrance;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class Shed extends Location {

    private List<Path> availablePaths = Arrays.asList(
		new Path(Garden.class),
        new Path(HouseEntrance.class)
		//new Path(Location.HOUSE_WEST_SIDE)
	);
    private List<PointOfInterest> pointOfInterests = Arrays.asList(
        new ShedDoor(),
        new ShedWall()
    );

    public Shed() {
        super();
    }

    @Override
    public String getName() {
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
