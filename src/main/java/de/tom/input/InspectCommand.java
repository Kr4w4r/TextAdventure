package de.tom.input;

import java.util.Optional;

import de.tom.Inspectable;
import de.tom.Scene;
import de.tom.item.Item;
import de.tom.location.Location;
import de.tom.location.LocationData;
import de.tom.player.Player;

public class InspectCommand implements Command {

	private final Player player;

	public InspectCommand(final Player player) {
		this.player = player;
	}

	@Override
	public String getCommandPrefix() {
		return "untersuche";
	}

	@Override
	public void handleCommand(String playerInput) {
		String thingToInspect = getCommandDataFromInput(playerInput);

		Optional<Inspectable> inspectable = findInspectable(thingToInspect);

		if (inspectable.isPresent()) {
			Optional<Item> itemFound = inspectable.get().inspect();
			if (itemFound.isPresent()) {
				player.addItemToInventory(itemFound.get());
			}
		} else {
			System.out.println("Ich kann " + thingToInspect + " nicht untersuchen.");
		}
	}

	private Optional<Inspectable> findInspectable(String thingToInspect) {
		Optional<Inspectable> inspectable = findPointOfInterest(thingToInspect);
		if (inspectable.isPresent() == false) {
			inspectable = findInventoryItem(thingToInspect);
		}
		return inspectable;
	}

	private Optional<Inspectable> findPointOfInterest(String thingToInspect) {
		LocationData playerLocation = getPlayerLocation();
		return playerLocation.getPointsOfInterest().stream()
			.filter(poi -> poi.getName().equals(thingToInspect))
			.map(poi -> (Inspectable)poi)
			.findFirst();
	}

	private LocationData getPlayerLocation() {
		Location location = player.getLocation();
		return Scene.getLocation(location);
	}

	
	private Optional<Inspectable> findInventoryItem(String thingToInspect) {
		return player.getInventoryItems().stream()
			.filter(item -> item.getName().equals(thingToInspect))
			.map(item -> (Inspectable)item)
			.findFirst();
	}
}
