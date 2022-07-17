package de.krawie.textadventure.framework.item;

import java.util.Optional;

import de.krawie.textadventure.framework.Inspectable;
import de.krawie.textadventure.framework.Useable;
import de.krawie.textadventure.framework.player.Player;

public interface Item extends Inspectable, Useable {

	String getName();
	Optional<Item> use(Player player);
	
	default boolean is(Class<? extends Item> itemClass) {
		return getClass().equals(itemClass);
	}
}
