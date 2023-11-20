package de.krawie.textadventure.framework.input.command;

import java.util.Optional;

import de.krawie.textadventure.framework.Useable;
import de.krawie.textadventure.framework.UseableWithItem;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.InputToPointOfInterest;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.InputToItem;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.player.PlayerLocation;

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
			useItemOnCommand(commandData);
		} else {
			useCommand(commandData);
		}
	}

	private void useCommand(String commandData) {
		String thingNameToUse = commandData.trim();

		Optional<Useable> useable = findUseableByName(thingNameToUse);
		if (useable.isEmpty()) {
			System.out.println("Ich kann " + thingNameToUse + " nicht benutzen.");
		}
		
		useUseable(useable.get());
	}

	private Optional<Useable> findUseableByName(String thingName) {
		Optional<Item> item = InputToItem.findItemInInventoryByName(player, thingName);
		Optional<Useable> useable = item.map(itemToMap -> (Useable) itemToMap);

		if (useable.isEmpty()) {
			Location playerLocation = PlayerLocation.getPlayerLocation(player);
			Optional<PointOfInterest> poi = InputToPointOfInterest.findByName(playerLocation, thingName);
			useable = poi.map(poiToMap -> (Useable)poiToMap);
		}

		return useable;
	}

	private void useUseable(Useable useable) {
		Optional<Item> optionalFoundItem = useable.use(player);
		optionalFoundItem.ifPresent(player::addItemToInventory);
	}

	private void useItemOnCommand(String commandData) {
		String[] splitCommand = commandData.split(" an ");
		String itemName = splitCommand[0].trim();
		Optional<Item> item = InputToItem.findItemInInventoryByName(player, itemName);

		String thingNameToUseItemOn = splitCommand[1].trim();

		Optional<UseableWithItem> useableWithItem = findUseableWithItemByName(thingNameToUseItemOn);
		
		if (item.isEmpty()) {
			System.out.println("Ich habe keinen Gegenstand: " + itemName);
		} else if (useableWithItem.isEmpty()) {
			System.out.println("Es gibt kein " + thingNameToUseItemOn + " wo ich " + itemName + " benutzen kann.");
		} else {
			useItemOnPointOfInterest(item.get(), useableWithItem.get());
		}
	}

	private Optional<UseableWithItem> findUseableWithItemByName(String thingName) {
		Location playerLocation = PlayerLocation.getPlayerLocation(player);
		Optional<PointOfInterest> poi = InputToPointOfInterest.findByName(playerLocation, thingName);

		return poi.map(poiToMap -> (UseableWithItem) poiToMap);
	}

	private void useItemOnPointOfInterest(Item item, UseableWithItem useableWithItem) {
		Optional<Item> optionalFoundItem = useableWithItem.useItem(player, item);
		optionalFoundItem.ifPresent(player::addItemToInventory);
	}
}
