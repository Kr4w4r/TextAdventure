package de.krawie.demogame.gamestate;

import de.krawie.demogame.DemoGameLocationFactory;
import de.krawie.demogame.location.forest.Forest;
import de.krawie.textadventure.framework.game.GameInitializer;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.LocationFactory;

public class NewDemoGameInitializer implements GameInitializer {

    @Override
    public LocationFactory getLocationFactory() {
        return new DemoGameLocationFactory();
    }

    @Override
    public Class<? extends Location> getPlayerStartLocation() {
        return Forest.class;
    }
    
}
