package de.krawie.demogame.item;

import java.util.Optional;

import com.diogonunes.jcolor.Attribute;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class ShineyKnife implements Item {

	private static final String KNIFE_ITEM_NAME = "Messer";
	private static final Attribute[] KNIFE_TEXT_ATTRIBUTES = { Attribute.BLACK_TEXT(), Attribute.BRIGHT_BLUE_BACK() };

	@Override
	public String getName() {
		return new TextBuilder()
				.appendLine(KNIFE_ITEM_NAME)
				.toString();
	}

	@Override
	public Optional<Item> inspect() {
		new TextBuilder()
				.append("Ein blitz blank poliertes ")
				.append(KNIFE_ITEM_NAME, KNIFE_TEXT_ATTRIBUTES)
				.appendLine(".")
				.appendLine("Das ist so sauber, dass man sich darin spiegeln kann.")
				.print();

		return Optional.empty();
	}

	@Override
	public Optional<Item> use(Player player) {
		new TextBuilder()
				.append("Ich habe nichts, was ich mit dem ")
				.append(KNIFE_ITEM_NAME, KNIFE_TEXT_ATTRIBUTES)
				.appendLine(" schneiden kann")
				.print();

		return Optional.empty();
	}
	
}
