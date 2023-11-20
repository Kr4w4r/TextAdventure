package de.krawie.textadventure.framework.gamestate.game;

import java.util.Optional;

import de.krawie.textadventure.framework.game.GameData;
import de.krawie.textadventure.framework.game.GameInitializer;
import de.krawie.textadventure.framework.gamestate.GameState;
import de.krawie.textadventure.framework.input.GameInputHandler;
import de.krawie.textadventure.framework.input.InputHandler;
import de.krawie.textadventure.framework.input.InputProvider;
import de.krawie.textadventure.framework.input.ReplayGameInputProvider;
import de.krawie.textadventure.framework.savegame.GameLog;
import de.krawie.textadventure.framework.savegame.GameLogLoader;

public abstract class GameLoadStateBase implements GameState {

    protected LoadGameData loadData;
    protected GameData gameData;
    
    protected InputProvider inputProvider;
    protected GameLoop gameLoop;

    public GameLoadStateBase(LoadGameData loadData) {
        this.loadData = loadData;
    }

    protected abstract GameInitializer getNewGameInitializer();
    protected abstract GameState createStateAfterLoadComplete();

    @Override
    public void onEnter() {
        gameData = new GameData(getNewGameInitializer());
        inputProvider = createInputProvider();
        gameLoop = new GameLoop(gameData, inputProvider, createInputHandler(gameData));
        gameLoop.onEnter();
        // Scene.setInstance(gameData.getScene());
        // inputHandler = createInputHandler(gameData);
        // GameLog gameLog = new GameLogLoader().loadSave(loadData.getFileToLoad());
        // inputProvider2 = new ReplayGameInputProvider(gameLog);
    }

    private InputProvider createInputProvider() {
        GameLog gameLog = new GameLogLoader().loadSave(loadData.getFileToLoad());
        return new ReplayGameInputProvider(gameLog);
    }

    protected InputHandler createInputHandler(GameData gameData) {
        return new GameInputHandler(gameData);
    }

    @Override
    public Optional<GameState> update() {

        Optional<GameState> optNextState = gameLoop.update();

        return optNextState.or(() -> {
            if (inputProvider.hasMoreInputs() == false) {
                return Optional.ofNullable(createStateAfterLoadComplete());
            }
            return Optional.empty();
        });
    }

    @Override
    public void onLeave() {
        gameLoop.onLeave();
    }
    
}
