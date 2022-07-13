package de.krawie.textadventure.framework.item;

import java.util.Optional;

import de.krawie.textadventure.framework.Inspectable;
import de.krawie.textadventure.framework.player.Player;

public interface Item extends Inspectable {
	
	public enum ItemType {
		GARDENKEY,
		DOORKNOB, 
		LADDER
	}

	String getName();
	ItemType getType();
	Optional<Item> use(Player player);
}
