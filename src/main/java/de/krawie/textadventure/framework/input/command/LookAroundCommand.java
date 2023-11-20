package de.krawie.textadventure.framework.input.command;

import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.player.Player;

public class LookAroundCommand implements Command{

	private final Player player;

	public LookAroundCommand(final Player player) {
		this.player = player;
	}

	@Override
	public String getCommandPrefix() {
		return "umsehen";
	}

	@Override
	public void handleCommand(String playerInput) {
		Location location = Scene.getLocation(player.getLocation());
		location.printLookAround();
	}

}
