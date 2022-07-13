package de.krawie.textadventure.framework.input;

import java.util.List;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.player.Player;

public class InventoryCommand implements Command {

	private Player player;

	public InventoryCommand(Player player) {
		this.player = player;
	}

	@Override
	public String getCommandPrefix() {
		return "Inventar";
	}

	@Override
	public void handleCommand(String playerInput) {
		System.out.println("Dein Inventar:");

		List<Item> inventoryItems = player.getInventoryItems();
		for (Item item : inventoryItems) {
			System.out.println("- \"" + item.getName() + "\"");
		}
	}
	
}
