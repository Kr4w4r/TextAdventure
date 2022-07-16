package de.krawie.demogame.location.ShedInside;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.shed.Shed;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class ShedInside extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(Shed.class)
    );
    private static final List<PointOfInterest> pointsOfInterest = Arrays.asList(
        new ShedShelfPOI("Links"),
        new ShedShelfPOI("Mitte"),
        new ShedShelfPOI("Rechts")
    );

    @Override
    public String getName() {
        return "Schuppen innen";
    }

    @Override
    public String getLocationKey() {
        return "Schuppen innen";
    }

    @Override
    public List<Path> getAvailablePaths() {
        return availablePaths;
    }

    @Override
    public List<PointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }
}
