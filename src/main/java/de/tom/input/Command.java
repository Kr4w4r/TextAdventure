package de.tom.input;

public interface Command {
	
	String getCommandPrefix();
	
	default boolean isCommand(String playerInput) {
		return playerInput.startsWith(getCommandPrefix());
	}

	default String getCommandDataFromInput(String playerInput) {
		return playerInput.replace(getCommandPrefix(), "").trim();
	}

	void handleCommand(String playerInput);
}
