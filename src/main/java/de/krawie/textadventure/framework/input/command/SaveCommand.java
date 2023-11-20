package de.krawie.textadventure.framework.input.command;

import org.apache.commons.lang3.StringUtils;

import de.krawie.textadventure.framework.savegame.GameLog;
import de.krawie.textadventure.framework.savegame.GameLogRecorder;
import de.krawie.textadventure.framework.savegame.GameLogSaver;

public class SaveCommand implements Command {

    @Override
    public String getCommandPrefix() {
        return "save";
    }

    @Override
    public void handleCommand(String playerInput) {

        String fileName = getCommandDataFromInput(playerInput);
        if (StringUtils.isNotBlank(fileName)) {   
            GameLog gameLog = GameLogRecorder.getInstance().getGameLog();
            
            GameLogSaver saver = new GameLogSaver(gameLog);
            saver.save(fileName);
        }
    }
    
}
