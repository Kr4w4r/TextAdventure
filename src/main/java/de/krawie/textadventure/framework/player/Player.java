package de.krawie.textadventure.framework.player;

import java.util.ArrayList;
import java.util.List;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.Location;

public class Player {
	private Class<? extends Location> location;
	private List<Item> inventory = new ArrayList<>();

	public Player(Class<? extends Location> startLocation) {
		location = startLocation;
	}

	public Class<? extends Location> getLocation() {
		return location;
	}

	public void setLocation(Class<? extends Location> location) {
		this.location = location;
	}

	public void addItemToInventory(Item itemToAdd) {
		inventory.add(itemToAdd);
	}

	public boolean hasItem(Class<? extends Item> itemClass) {
		return inventory.stream().anyMatch(item -> item.getClass().equals(itemClass));
	}

	public void dropItem(Item itemToDrop) {
		inventory.remove(itemToDrop);
	}

	public void dropItem(Class<? extends Item> itemClass) {
		inventory.removeIf(item -> item.getClass().equals(itemClass));
	}

	public List<Item> getInventoryItems() {
		return inventory;
	}
}
