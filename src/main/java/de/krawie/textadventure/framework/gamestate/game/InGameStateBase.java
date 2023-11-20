package de.krawie.textadventure.framework.gamestate.game;

import java.util.Optional;

import de.krawie.textadventure.framework.game.GameData;
import de.krawie.textadventure.framework.gamestate.GameState;
import de.krawie.textadventure.framework.input.ConsolePlayerInputProvider;
import de.krawie.textadventure.framework.input.GameInputHandler;
import de.krawie.textadventure.framework.input.InputHandler;

public abstract class InGameStateBase implements GameState {

    protected GameData gameData;
    protected GameLoop gameLoop;

    public InGameStateBase(GameData gameData) {
        this.gameData = gameData;
    }
    
    @Override
    public void onEnter() {
        gameLoop = new GameLoop(gameData, createInputProvider(), createInputHandler());
        gameLoop.onEnter();
    }
    
    protected ConsolePlayerInputProvider createInputProvider() {
        return new ConsolePlayerInputProvider();
    }
    
    protected InputHandler createInputHandler() {
        return new GameInputHandler(gameData);
    }

    @Override
    public Optional<GameState> update() {
        return gameLoop.update();
    }

    @Override
    public void onLeave() {
        gameLoop.onLeave();
    }
    
}
