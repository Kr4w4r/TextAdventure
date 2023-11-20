package de.krawie.textadventure.framework.input;

public class ConsolePlayerInputProvider implements InputProvider {

	@Override
	public String getInput() {
		return System.console().readLine();
	}

	@Override
	public boolean hasMoreInputs() {
		// Player can't run out of commands
		return true;
	}
}
