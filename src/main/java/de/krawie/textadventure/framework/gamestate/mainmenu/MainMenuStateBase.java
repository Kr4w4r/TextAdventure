package de.krawie.textadventure.framework.gamestate.mainmenu;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

import com.diogonunes.jcolor.Attribute;

import de.krawie.textadventure.framework.gamestate.GameState;
import de.krawie.textadventure.framework.gamestate.game.LoadGameData;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public abstract class MainMenuStateBase implements GameState {

    @Override
    public void onEnter() {
        
    }

    @Override
    public Optional<GameState> update() {

        new TextBuilder()
                .appendLine("Hauptmenü", Attribute.WHITE_TEXT(), Attribute.BOLD(), Attribute.BRIGHT_BLUE_BACK())
                .appendNewLine()
                .appendLine("neu - Starte ein neues Spiel")
                .appendLine("laden <Speicherstandname> - Lade ein gespeichertes Spiel")
                .print();

        String input = System.console().readLine();

        if (StringUtils.startsWith(input, "neu")) {
            return Optional.of(getStartNewGameState());
        } else if (StringUtils.startsWith(input, "laden")) {
            return Optional.of(getLoadGameState(new LoadGameData("asd")));
        }
        
        return Optional.empty();
    }

    protected abstract GameState getStartNewGameState();
    protected abstract GameState getLoadGameState(LoadGameData loadGameData);

    @Override
    public void onLeave() {
        
    }
    
}
