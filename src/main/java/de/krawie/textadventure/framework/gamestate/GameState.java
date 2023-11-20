package de.krawie.textadventure.framework.gamestate;

import java.util.Optional;

public interface GameState {
    
    void onEnter();
    Optional<GameState> update();
    void onLeave();
    
    default boolean isRunning() {
        return true;
    }
}
