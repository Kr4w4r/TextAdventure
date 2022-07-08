package de.tom;

import java.util.Optional;

import de.tom.item.Item;

public interface Inspectable {
	Optional<Item> inspect();
}
