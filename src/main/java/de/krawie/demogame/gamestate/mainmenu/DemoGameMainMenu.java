package de.krawie.demogame.gamestate.mainmenu;

import de.krawie.demogame.gamestate.game.LoadDemoState;
import de.krawie.demogame.gamestate.game.NewDemoState;
import de.krawie.textadventure.framework.gamestate.GameState;
import de.krawie.textadventure.framework.gamestate.game.LoadGameData;
import de.krawie.textadventure.framework.gamestate.mainmenu.MainMenuStateBase;

public class DemoGameMainMenu extends MainMenuStateBase {

    @Override
    protected GameState getStartNewGameState() {
        return new NewDemoState();
    }

    @Override
    protected GameState getLoadGameState(LoadGameData loadGameData) {
        return new LoadDemoState(loadGameData);
    }
}
