package de.krawie.demogame.gamestate.game;

import de.krawie.demogame.gamestate.NewDemoGameInitializer;
import de.krawie.textadventure.framework.game.GameInitializer;
import de.krawie.textadventure.framework.gamestate.GameState;
import de.krawie.textadventure.framework.gamestate.game.NewGameStateBase;

public class NewDemoState extends NewGameStateBase {

    @Override
    protected GameInitializer getNewGameInitializer() {
        return new NewDemoGameInitializer();
    }

    @Override
    protected GameState createStateAfterLoadComplete() {
        return new IngameDemoState(gameData);
    }
}
