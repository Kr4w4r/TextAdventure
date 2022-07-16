package de.krawie.demogame.location.gardenfence;

import java.util.Optional;

import de.krawie.demogame.location.garden.Garden;
import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.item.Item.ItemType;
import de.krawie.textadventure.framework.location.PathBlocker;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class GardenFenceDoorPOI implements PointOfInterest {

	public GardenFenceDoorPOI() {}

	@Override
	public String getName() {
		return "Gartentor";
	}

	@Override
	public Optional<Item> inspect() {
		if (isDoorLocked()) {
			System.out.println("Eine altes rostiges aber unüberwindbares Gartentor. Es ist verschlossen.");
		} else {
			System.out.println("Eine altes rostiges Gartentor. Du hast es geöffnet.");
		}

		return Optional.empty();
	}

	private PathBlocker getGardenDoorPathBlocker() {
		return Scene.getPathBlocker(
			GardenFence.class, 
			Garden.class)
			.orElseThrow();
	}

	private boolean isDoorLocked() {
		return getGardenDoorPathBlocker().isBlocking();
	}

	@Override
	public Optional<Item> useItem(Player player, Item itemToUse) {

		if (isDoorLocked() && itemToUse.getType() == ItemType.GARDENKEY) {
			System.out.println("Du steckst den Schlüssel in das Schloss des Tores. Er passt. Mit ein wenig kraft kannst du ihn drehen. Das Tor ist jetzt offen.");
			
			getGardenDoorPathBlocker().unblock();
			player.dropItem(itemToUse);
		} else if (isDoorLocked() == false) {
			System.out.println("Du hast die Tür schon geöffnet. Der weg ist jetzt frei.");
		} else {
			System.out.println(itemToUse.getName() + " kann hier nicht verwendet werden.");
		}
		return Optional.empty();
	}

	@Override
	public Optional<Item> use(Player player) {

		if (isDoorLocked()) {
			System.out.println("Du versuchst das Tor zu öffnen, aber es ist verschlossen.\n" +
					"Ohne Schlüssel kommst du hier nicht weiter.");
		} else {
			System.out.println("Du hast die Tür schon geöffnet. Der weg ist jetzt frei.");
		}

		return Optional.empty();
	}
	
}
