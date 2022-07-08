package de.tom.location.pointofinterest;

import java.util.Optional;

import de.tom.Inspectable;
import de.tom.item.Item;

public interface PointOfInterest extends Inspectable {

	String getName();
	Optional<Item> useItem(Item itemToUse);
}
