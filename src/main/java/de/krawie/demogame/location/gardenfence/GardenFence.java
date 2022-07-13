package de.krawie.demogame.location.gardenfence;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

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
	public Optional<Item> useItem(Player player, Item itemToUse) {
		System.out.println(itemToUse.getName() + " kann hier nicht verwendet werden.");
		return Optional.empty();
	}
	
}
