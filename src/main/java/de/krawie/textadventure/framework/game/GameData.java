package de.krawie.textadventure.framework.game;

import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.player.Player;

public class GameData {
    private final Player player;
    private final Scene scene;

    public GameData(GameInitializer initializer) {
        player = new Player(initializer.getPlayerStartLocation());
        scene = new Scene(initializer.getLocationFactory());
    }

    public Player getPlayer() {
        return player;
    }

    public Scene getScene() {
        return scene;
    }
}
