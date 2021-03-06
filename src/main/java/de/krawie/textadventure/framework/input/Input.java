package de.krawie.textadventure.framework.input;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import de.krawie.textadventure.framework.player.Player;

public class Input {
	private MoveCommand moveCommand;
	private LookAroundCommand lookAroundCommand;
	private InspectCommand inspectCommand;
	private UseCommand useCommand;
	private InventoryCommand inventoryCommand;
	private HelpCommand helpCommand = new HelpCommand();
	private List<Command> commands;
	
	public Input(Player player) {
		moveCommand = new MoveCommand(player);
		lookAroundCommand = new LookAroundCommand(player);
		inspectCommand = new InspectCommand(player);
		useCommand = new UseCommand(player);
		inventoryCommand = new InventoryCommand(player);

		commands = Arrays.asList(moveCommand, lookAroundCommand, inspectCommand, useCommand, inventoryCommand, helpCommand);
	}

	public void handlePlayerInput() {
	System.out.println("\nWas möchtest du tun?");
		String playerInput = System.console().readLine();

		System.out.println();

		Optional<Command> playerCommand = commands.stream()
			.filter(command -> command.isCommand(playerInput))
			.findFirst();

		playerCommand.ifPresent(command -> command.handleCommand(playerInput));
	}
}
