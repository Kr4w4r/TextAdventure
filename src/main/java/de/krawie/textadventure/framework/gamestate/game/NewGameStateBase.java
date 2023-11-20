package de.krawie.textadventure.framework.gamestate.game;

import java.util.Optional;

import de.krawie.textadventure.framework.game.GameData;
import de.krawie.textadventure.framework.game.GameInitializer;
import de.krawie.textadventure.framework.gamestate.GameState;

public abstract class NewGameStateBase implements GameState {

    protected GameData gameData;

    protected abstract GameInitializer getNewGameInitializer();
    protected abstract GameState createStateAfterLoadComplete();

    @Override
    public void onEnter() {
        gameData = new GameData(getNewGameInitializer());
    }

    @Override
    public Optional<GameState> update() {
        return Optional.of(createStateAfterLoadComplete());
    }

    @Override
    public void onLeave() {}
    
}
