package de.krawie.textadventure.framework;

import java.util.Optional;

import de.krawie.textadventure.framework.gamestate.GameState;

public abstract class Game {
	
	private GameState currentState;

	// private boolean running = true;
	// private Player player;
	// private InputProvider inputProvider;

	public Game() {
		
		// player = new Player(getPlayerStartLocation());
	}

	protected abstract GameState getInitialGameState();
	// protected abstract LocationFactory getLocationFactory();
	// protected abstract Class<? extends Location> getPlayerStartLocation();

	public void run() {

		setNewState(getInitialGameState());

		do {
			Optional<GameState> optionalNewState = currentState.update();

			optionalNewState.ifPresent(this::setNewState);
		} while (currentState.isRunning());
	}

	private void setNewState(GameState newState) {
		if (currentState != null) {
			currentState.onLeave();
		}

		currentState = newState;
		currentState.onEnter();
	}

	// public void start() {
	// 	inputProvider = new ConsolePlayerInputProvider();
	// 	startGameloop();
	// }

	// public void startFromSaveFile() {
	// 	GameLogLoader loader = new GameLogLoader();

	// 	new TextBuilder()
	// 		.appendLine("Name des Speicherstandes, welcher geladen werden soll: ")
	// 		.print();
	// 	String fileName = System.console().readLine();
	// 	GameLog loadedSave = loader.loadSave(fileName);

	// 	inputProvider = new ReplayGameInputProvider(loadedSave, new ConsolePlayerInputProvider());
	// 	startGameloop();
	// }

	// private void startGameloop() {
	// 	Scene.setLocationFactory(getLocationFactory());
	// 	Input input = new Input(player, inputProvider);

	// 	while (running) {
	// 		Location location = Scene.getLocation(player.getLocation());
	// 		System.out.println("\nDu bist hier: " + location.getName());
	// 		location.printPaths();

	// 		input.handlePlayerInput();
	// 	}
	// }
}
