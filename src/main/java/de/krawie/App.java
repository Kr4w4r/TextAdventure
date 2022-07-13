package de.krawie;

import de.krawie.demogame.DemoGame;
import de.krawie.textadventure.framework.Game;

public class App {
    
    public static void main(String[] args) {
        Game game = new DemoGame();
        game.start();
    }
}
