package de.krawie.textadventure.framework.input.command;

import java.util.List;

import com.diogonunes.jcolor.Attribute;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

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
		new TextBuilder()
			.appendLine("Dein Inventar:", Attribute.WHITE_TEXT(), Attribute.BACK_COLOR(245))
			.print();

		List<Item> inventoryItems = player.getInventoryItems();
		if (inventoryItems.isEmpty()) {
			new TextBuilder()
				.appendLine("Du hast nichts")
				.println();
		} else {
			for (Item item : inventoryItems) {
				System.out.println("- \"" + item.getName() + "\"");
			}
		}
	}
	
}
