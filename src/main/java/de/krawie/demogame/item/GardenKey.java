package de.krawie.demogame.item;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.player.Player;

public class GardenKey implements Item {

	@Override
	public String getName() {
		return "Schlüssel";
	}

	@Override
	public Optional<Item> inspect() {
		System.out.println("Ein alter rostiger Schlüssel. Er scheint länger draußen gelegen zu haben.");
		return Optional.empty();
	}

	@Override
	public Optional<Item> use(Player player) {
		System.out.println("Du jonglierst ein wenig mit dem Schlüssel. Sonst passiert nichts weiter.");
		return Optional.empty();
	}
}
