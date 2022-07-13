package de.krawie.textadventure.framework;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;

public interface Inspectable {
	Optional<Item> inspect();
}
