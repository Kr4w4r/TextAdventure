package de.krawie.demogame.location.forest;

import java.util.Optional;

import de.krawie.demogame.item.GardenKey;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class TreeStomp implements PointOfInterest {

	private int inspectCount = 0;

	@Override
	public String getName() {
		return "Baumstumpf";
	}

	@Override
	public Optional<Item> inspect() {
		inspectCount++;

		switch (inspectCount) {
			case 1: 
				System.out.println("Du schaust dir den Baumstumpf oberflächlich an. Du kannst aber nichts finden.");
				return Optional.empty();
			case 2:
				System.out.println("Du durchsuchst den Stumpf nochmal. Unter ein paar Blättern siehst du etwas gläzendes und hebst es auf.\n" +
					"Es ist ein Schlüssel.\n"+
					"Du steckst ihn in deine Tasche.");
				return Optional.of(new GardenKey());
			default:
				System.out.println("Du hast den Stumpf komplett abgesucht, hier ist nichts mehr zu finden.");
				return Optional.empty();
		}
	}

	@Override
	public Optional<Item> useItem(Player player, Item itemToUse) {
		System.out.println(itemToUse.getName() + " kann hier nicht verwendet werden.");
		return Optional.empty();
	}

	@Override
	public Optional<Item> use(Player player) {
		System.out.println("Du kannst den Baumstumpf nicht benutzen");

		return Optional.empty();
	}
}
