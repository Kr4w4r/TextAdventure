package de.tom.input;

import de.tom.Scene;
import de.tom.location.LocationData;
import de.tom.player.Player;

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
		LocationData location = Scene.getLocation(player.getLocation());
		location.printLookAround();
	}

}
