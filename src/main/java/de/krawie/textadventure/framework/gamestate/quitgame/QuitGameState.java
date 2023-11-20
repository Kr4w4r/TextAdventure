package de.krawie.textadventure.framework.gamestate.quitgame;

import java.util.Optional;

import de.krawie.textadventure.framework.gamestate.GameState;

public class QuitGameState implements GameState {

    @Override
    public void onEnter() {}

    @Override
    public Optional<GameState> update() {
        return Optional.empty();
    }

    @Override
    public void onLeave() {}

    @Override
    public boolean isRunning() {
        return false;
    }
    
}
