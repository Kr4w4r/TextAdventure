package de.krawie.textadventure.framework.savegame;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class GameLog {
    
    public static final String SAVE_FILE_ENDING = ".sav";
    private List<String> playerInputs = new ArrayList<>();

    public void addInput(String playerInput) {
        playerInputs.add(playerInput);
    }

    public List<String> getInputs() {
        return ListUtils.unmodifiableList(playerInputs);
    }
}
