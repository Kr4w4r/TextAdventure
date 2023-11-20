package de.krawie.textadventure.framework.savegame;

public class GameLogRecorder {
    
    private static GameLogRecorder instance = new GameLogRecorder();
    private GameLog gameLog = new GameLog();

    public static GameLogRecorder getInstance() {
        return instance;
    }

    private GameLogRecorder() {}

    public void addInput(String playerInput) {
        gameLog.addInput(playerInput);
    }

    public GameLog getGameLog() {
        return gameLog;
    }

    public void reset() {
        gameLog = new GameLog();
    }
}
