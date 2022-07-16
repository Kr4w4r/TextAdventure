package de.krawie.textadventure.framework.location;

import java.util.Optional;

import de.krawie.textadventure.framework.Inspectable;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.player.Player;

public interface PointOfInterest extends Inspectable {

	String getName();
	Optional<Item> use(Player player);
	Optional<Item> useItem(Player player, Item itemToUse);
}
