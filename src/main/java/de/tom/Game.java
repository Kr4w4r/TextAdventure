package de.tom;

import de.tom.input.Input;
import de.tom.location.LocationData;
import de.tom.player.Player;

public class Game {
	
	boolean running = true;
	private Player player = new Player();
	
	public void start() {
		Input input = new Input(player);

		while (running) {
			LocationData location = Scene.getLocation(player.getLocation());
			System.out.println("\nDu bist hier: " + location.getName());
			location.printPaths();

			input.handlePlayerInput();
		}
	}
}
