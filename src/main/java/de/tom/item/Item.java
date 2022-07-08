package de.tom.item;

import java.util.Optional;

import de.tom.Inspectable;
import de.tom.player.Player;

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
