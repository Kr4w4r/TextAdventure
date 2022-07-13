package de.krawie.textadventure.framework;

import de.krawie.textadventure.framework.input.Input;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.LocationFactory;
import de.krawie.textadventure.framework.player.Player;

public abstract class Game {
	
	boolean running = true;
	private Player player;

	public Game() {
		player = new Player(getPlayerStartLocation());
	}

	protected abstract LocationFactory getLocationFactory();
	protected abstract Class<? extends Location> getPlayerStartLocation();

	public void start() {
		Scene.initInstance(getLocationFactory());
		Input input = new Input(player);

		while (running) {
			Location location = Scene.getLocation(player.getLocation());
			System.out.println("\nDu bist hier: " + location.getName());
			location.printPaths();

			input.handlePlayerInput();
		}
	}
}
