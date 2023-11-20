package de.krawie.demogame.gamestate.game;

import de.krawie.demogame.gamestate.NewDemoGameInitializer;
import de.krawie.textadventure.framework.game.GameData;
import de.krawie.textadventure.framework.game.GameInitializer;
import de.krawie.textadventure.framework.gamestate.GameState;
import de.krawie.textadventure.framework.gamestate.game.GameLoadStateBase;
import de.krawie.textadventure.framework.gamestate.game.LoadGameData;
import de.krawie.textadventure.framework.input.GameInputHandler;
import de.krawie.textadventure.framework.input.InputHandler;

public class LoadDemoState extends GameLoadStateBase {

    public LoadDemoState(LoadGameData loadData) {
        super(loadData);
    }

    @Override
    protected GameInitializer getNewGameInitializer() {
        return new NewDemoGameInitializer();
    }

    @Override
    protected InputHandler createInputHandler(GameData gameData) {
        return new GameInputHandler(gameData);
    }

    @Override
    protected GameState createStateAfterLoadComplete() {
        return new IngameDemoState(gameData);
    }
    
}
