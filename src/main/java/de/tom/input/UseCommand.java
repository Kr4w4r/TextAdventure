package de.tom.input;

import java.util.Optional;

import de.tom.item.Item;
import de.tom.location.InputToPointOfInterest;
import de.tom.location.PointOfInterest;
import de.tom.player.InputToItem;
import de.tom.player.Player;
import de.tom.player.PlayerLocation;

public class UseCommand implements Command {

	private final Player player;

	public UseCommand(final Player player) {
		this.player = player;
	}

	@Override
	public String getCommandPrefix() {
		return "benutze";
	}

	@Override
	public void handleCommand(String playerInput) {
		String commandData = getCommandDataFromInput(playerInput);

		if (commandData.contains(" an ")) {
			String[] splitCommand = commandData.split(" an ");
			String itemName = splitCommand[0].trim();
			Optional<Item> item = InputToItem.findItemInInventoryByName(player, itemName);

			String poiName = splitCommand[1].trim();
			Optional<PointOfInterest> poi = InputToPointOfInterest.findByName(PlayerLocation.getPlayerLocation(player), poiName);

			if (item.isPresent() == false) {
				System.out.println("Ich habe keinen Gegenstand: " + itemName);
				return;
			}
			if (poi.isPresent() == false) {
				System.out.println("Es gibt keinen Ort: " + poiName);
				return;
			}

			useItemOnPointOfInterest(item.get(), poi.get());
		} else {
			String itemName = commandData.trim();
			Optional<Item> item = InputToItem.findItemInInventoryByName(player, itemName);
			
			if (item.isPresent() == false) {
				System.out.println("Ich habe keinen Gegenstand: " + itemName);
				return;
			}
			
			useItem(item.get());
		}
	}

	private void useItemOnPointOfInterest(Item item, PointOfInterest pointOfInterest) {
		Optional<Item> optionalFoundItem = pointOfInterest.useItem(player, item);
		optionalFoundItem.ifPresent(player::addItemToInventory);
	}

	private void useItem(Item item) {
		Optional<Item> optionalFoundItem = item.use(player);
		optionalFoundItem.ifPresent(player::addItemToInventory);
	}
}
