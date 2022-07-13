package de.krawie.textadventure.framework.player;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;

public class InputToItem {
	
	public static Optional<Item> findItemInInventoryByName(Player player, String itemName) {
		return player.getInventoryItems().stream()
				.filter(item -> item.getName().equals(itemName))
				.findFirst();
	}
}
