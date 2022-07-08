package de.tom.location.gardenfence;

import java.util.Optional;

import de.tom.item.Item;
import de.tom.item.Item.ItemType;
import de.tom.location.PointOfInterest;
import de.tom.player.Player;

public class GardenFenceDoor implements PointOfInterest {

	boolean isLocked = true;
	private GartenDoorPathBlocker gardenDoorPathBlocker;

	public GardenFenceDoor(GartenDoorPathBlocker gardenDoorPathBlocker) {
		this.gardenDoorPathBlocker = gardenDoorPathBlocker;
	}

	@Override
	public String getName() {
		return "Gartentor";
	}

	@Override
	public Optional<Item> inspect() {
		if (gardenDoorPathBlocker.isBlocking()) {
			System.out.println("Eine altes rostiges aber unüberwindbares Gartentor. Es ist verschlossen.");
		} else {
			System.out.println("Eine altes rostiges Gartentor. Du hast es geöffnet.");
		}

		return Optional.empty();
	}

	@Override
	public Optional<Item> useItem(Player player, Item itemToUse) {
		if (itemToUse.getType() == ItemType.GARDENKEY) {
			System.out.println("Du steckst den Schlüssel in das Schloss des Tores. Er passt. Mit ein wenig kraft kannst du ihn drehen. Das Tor ist jetzt offen.");
			
			gardenDoorPathBlocker.unblock();
			player.dropItem(itemToUse);

			return Optional.empty();
		} else {
			System.out.println("Diesen Gegenstand kann ich hier nicht benutzen.");
		}
		return Optional.empty();
	}
	
}
