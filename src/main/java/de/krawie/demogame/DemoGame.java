package de.krawie.demogame;

import de.krawie.demogame.gamestate.mainmenu.DemoGameMainMenu;
import de.krawie.textadventure.framework.Game;
import de.krawie.textadventure.framework.gamestate.GameState;

public class DemoGame extends Game {
    
    // @Override
    // protected LocationFactory getLocationFactory() {
    //     return new DemoGameLocationFactory();
    // }

    // @Override
    // public Class<? extends Location> getPlayerStartLocation() {
    //     return Forest.class;
    // }

    @Override
    protected GameState getInitialGameState() {
        return new DemoGameMainMenu();
    }
}
