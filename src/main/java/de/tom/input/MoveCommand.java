package de.tom.input;

import java.util.List;
import java.util.Optional;

import de.tom.Scene;
import de.tom.location.Location;
import de.tom.location.LocationData;
import de.tom.location.path.Path;
import de.tom.player.Player;

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
		Location location = Location.fromName(locationName);

		LocationData playerLocation = getPlayerLocation();
		List<Path> availablePaths = playerLocation.getAvailablePaths();
		Optional<Path> pathToLocation = availablePaths.stream()
			.filter(path -> path.getLocationToGo() == location)
			.findFirst();

		if (pathToLocation.isPresent()) {
			move(pathToLocation.get());
		} else {
			System.err.println("Von hier führt kein weg nach " + locationName);
		}
	}

	private LocationData getPlayerLocation() {
		return Scene.getLocation(player.getLocation());
	}

	private void move(Path pathToTake) {

		if (pathToTake.isBlocked()) {
			System.out.println("Der Weg zum Bereich " + pathToTake.getLocationToGo().getName() + " ist blockiert. " + pathToTake.getPathBlocker().getBlockingText());
		} else {
			player.setLocation(pathToTake.getLocationToGo());
		}
	}
}
