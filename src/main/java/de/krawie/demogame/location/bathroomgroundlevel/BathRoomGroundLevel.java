package de.krawie.demogame.location.bathroomgroundlevel;

import java.util.Arrays;
import java.util.List;

import de.krawie.demogame.location.entrancehall.EntranceHall;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;

public class BathRoomGroundLevel extends Location {

    private final List<Path> availablePaths = Arrays.asList(
        new Path(EntranceHall.class)
    );
    private final List<PointOfInterest> pois = Arrays.asList(
        new BathTubePOI(),
        new BathroomSinkPOI(),
        new BathCabinetPOI(),
        new ToiletPOI()
    );

    @Override
    public String getName() {
        return "Gästebadezimmer im Erdgeschoss";
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
        return pois;
    }    
}
