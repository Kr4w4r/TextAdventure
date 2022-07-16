package de.krawie.demogame.location.shed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class ShedInside extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(Shed.class)
    );

    @Override
    public String getName() {
        return "Schuppen innen";
    }

    @Override
    public List<Path> getAvailablePaths() {
        return availablePaths;
    }

    @Override
    public List<PointOfInterest> getPointsOfInterest() {
        return new ArrayList<>();
    }
    
}
