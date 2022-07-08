package de.tom.player;

import java.util.ArrayList;
import java.util.List;

import de.tom.item.Item;
import de.tom.item.Item.ItemType;
import de.tom.location.Location;

public class Player {
	private Location location = Location.FOREST;
	private List<Item> inventory = new ArrayList<>();

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void addItemToInventory(Item itemToAdd) {
		inventory.add(itemToAdd);
	}

	public boolean hasItem(ItemType itemType) {
		return inventory.stream().anyMatch(item -> item.getType() == itemType);
	}

	public void dropItem(Item itemToDrop) {
		inventory.remove(itemToDrop);
	}

	public void dropItem(ItemType itemTypeToDrop) {
		inventory.removeIf(item -> item.getType() == itemTypeToDrop);
	}

	public List<Item> getInventoryItems() {
		return inventory;
	}
}
