package de.krawie.textadventure.framework.input;

import java.util.Optional;

import de.krawie.textadventure.framework.gamestate.GameState;

public interface InputHandler {
    Optional<GameState> handlePlayerInput(String input);
}
