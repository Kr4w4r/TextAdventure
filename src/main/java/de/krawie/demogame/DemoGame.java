package de.krawie.demogame;

import de.krawie.demogame.location.forest.ForestLocation;
import de.krawie.textadventure.framework.Game;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.LocationFactory;

public class DemoGame extends Game {
    
    @Override
    protected LocationFactory getLocationFactory() {
        return new DemoGameLocationFactory();
    }

    @Override
    public Class<? extends Location> getPlayerStartLocation() {
        return ForestLocation.class;
    }
}
