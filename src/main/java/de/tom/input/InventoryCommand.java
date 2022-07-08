package de.tom.input;

import java.util.List;

import de.tom.item.Item;
import de.tom.player.Player;

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
