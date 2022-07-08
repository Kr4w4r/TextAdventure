package de.tom.location;

import java.util.Optional;

import de.tom.Inspectable;
import de.tom.item.Item;
import de.tom.player.Player;

public interface PointOfInterest extends Inspectable {

	String getName();
	Optional<Item> useItem(Player player, Item itemToUse);
}
