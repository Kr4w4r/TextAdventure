package de.krawie.textadventure.framework.gamestate.game;

public class LoadGameData {
    private final String fileToLoad;

    public LoadGameData(String fileToLoad) {
        this.fileToLoad = fileToLoad;
    }

    public String getFileToLoad() {
        return fileToLoad;
    }
}
