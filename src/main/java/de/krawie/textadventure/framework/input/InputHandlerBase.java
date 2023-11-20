package de.krawie.textadventure.framework.input;

import java.util.List;
import java.util.Optional;

import de.krawie.textadventure.framework.game.GameData;
import de.krawie.textadventure.framework.gamestate.GameState;
import de.krawie.textadventure.framework.input.command.Command;
import de.krawie.textadventure.framework.input.command.SaveCommand;
import de.krawie.textadventure.framework.savegame.GameLogRecorder;

public abstract class InputHandlerBase implements InputHandler {
	private GameLogRecorder gameLogRecorder;

	private List<Command> commands;
	protected GameData gameData;
	
	public InputHandlerBase(GameData gameData) {
		this.gameData = gameData;

		// TODO avoid singleton and get a GameLogRecorder interface instead
		gameLogRecorder = GameLogRecorder.getInstance();
		commands = getAvailableCommands();
	}

	protected abstract List<Command> getAvailableCommands();

	/*public void handlePlayerInput() {
		System.out.println("\nWas möchtest du tun?");
		String input = inputProvider.getInput();

		System.out.println();

		commands.stream()
			.filter(command -> command.isCommand(input))
			.findFirst()
			.ifPresent(command -> {
				command.handleCommand(input);

				if (command instanceof SaveCommand == false) {
					gameLogRecorder.addInput(input);
				}
			});
	}*/

	@Override
	public Optional<GameState> handlePlayerInput(String input) {
		System.out.println();
		//TODO let commands return a game state or pass game data to it with a field for the next state.
		commands.stream()
			.filter(command -> command.isCommand(input))
			.findFirst()
			.ifPresent(command -> {
				command.handleCommand(input);

				if (command instanceof SaveCommand == false) {
					gameLogRecorder.addInput(input);
				}
			});

		return Optional.empty();
	}
}
