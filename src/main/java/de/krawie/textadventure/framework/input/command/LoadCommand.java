package de.krawie.textadventure.framework.input.command;

import de.krawie.textadventure.framework.savegame.GameLog;
import de.krawie.textadventure.framework.savegame.GameLogLoader;
import de.krawie.textadventure.framework.savegame.GameLogRecorder;

public class LoadCommand implements Command {

    @Override
    public String getCommandPrefix() {
        return "load";
    }

    @Override
    public void handleCommand(String playerInput) {

        String fileName = getCommandDataFromInput(playerInput);
        
        GameLogLoader loader = new GameLogLoader();
        GameLog loadedGameLog = loader.loadSave(fileName);

        GameLogRecorder.getInstance().reset();
    }
    
}
