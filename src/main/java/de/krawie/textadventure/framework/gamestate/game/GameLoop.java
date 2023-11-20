package de.krawie.textadventure.framework.gamestate.game;

import java.util.Optional;

import com.diogonunes.jcolor.Attribute;

import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.game.GameData;
import de.krawie.textadventure.framework.gamestate.GameState;
import de.krawie.textadventure.framework.input.InputHandler;
import de.krawie.textadventure.framework.input.InputProvider;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class GameLoop {
    
    private GameData gameData;
    private InputProvider inputProvider;
    private InputHandler inputHandler;

    public GameLoop(GameData gameData, InputProvider inputProvider, InputHandler inputHandler) {
        this.gameData = gameData;
        this.inputProvider = inputProvider;
        this.inputHandler = inputHandler;
    }

    public void onEnter() {
        Scene.setInstance(gameData.getScene());
    }
    
    public Optional<GameState> update() {
        Location location = Scene.getLocation(gameData.getPlayer().getLocation());
        new TextBuilder()
                .appendNewLine()
                .append("Du bist hier: ", Attribute.FRAMED())
                .append(location.getName())
                .appendNewLine()
                .println();

        location.printPaths();

        Optional<GameState> optNewGameState = Optional.empty();
        if (inputProvider.hasMoreInputs()) {
            String input = inputProvider.getInput();

            optNewGameState = inputHandler.handlePlayerInput(input);
        }

        // Split this round visually
        new TextBuilder()
                .appendNewLine()
                .append("\n", Attribute.WHITE_BACK())
                .print();

        return optNewGameState;
    }

    public void onLeave() {

    }
}
