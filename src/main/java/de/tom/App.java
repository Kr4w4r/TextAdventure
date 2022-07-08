package de.tom;

/**
 * Hello world!
 */
public class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
