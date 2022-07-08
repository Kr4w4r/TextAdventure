package de.tom.location.pointofinterest;

import java.util.Optional;

import de.tom.item.Item;

public class GardenFence implements PointOfInterest {
	@Override
	public String getName() {
		return "Gartenzaun";
	}

	@Override
	public Optional<Item> inspect() {
		System.out.println("Ein alter Gartenzaun, etwa 2 Meter hoch mit Spitzen.\n" +
				"Da sollte man besser nicht rüberklettern.");
		return Optional.empty();
	}

	@Override
	public Optional<Item> useItem(Item itemToUse) {
		System.out.println(itemToUse.getName() + " kann hier nicht verwendet werden.");
		return Optional.empty();
	}
	
}
