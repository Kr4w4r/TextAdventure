package de.krawie.textadventure.framework.input;

import java.util.List;
import java.util.Optional;

import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.player.Player;

public class MoveCommand implements Command {
	
	private Player player;

	public MoveCommand(Player player) {
		this.player = player;
	}

	@Override
	public String getCommandPrefix() {
		return "gehe nach";
	}

	@Override
	public void handleCommand(String playerInput) {
		String locationNameToGo = getCommandDataFromInput(playerInput);
		move(locationNameToGo);
	}

	private void move(String locationName) {

		List<Path> availablePaths = getPlayerLocation().getAvailablePaths();
		Optional<Path> pathToLocation = availablePaths.stream()
			.filter(path -> {
				Class<? extends Location> targetLocationClass = path.getLocationToGo();
				Location location = Scene.getLocation(targetLocationClass);

				return location.getLocationKey().equals(locationName) || 
					location.getName().equals(locationName);
			})
			.findFirst();

		if (pathToLocation.isPresent()) {
			move(pathToLocation.get());
		} else {
			System.err.println("Von hier führt kein weg nach " + locationName);
		}
	}

	private Location getPlayerLocation() {
		return Scene.getLocation(player.getLocation());
	}

	private void move(Path pathToTake) {
		Location locationToGo = Scene.getLocation(pathToTake.getLocationToGo());

		if (pathToTake.isHidden()) {
			System.err.println("Von hier führt kein weg nach " + locationToGo.getName());
		} else if (pathToTake.isBlocked()) {
			System.out.println(pathToTake.getPathBlocker().getBlockingText());
		} else {
			player.setLocation(locationToGo.getClass());
		}
	}
}
