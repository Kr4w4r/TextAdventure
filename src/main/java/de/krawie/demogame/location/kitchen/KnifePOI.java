package de.krawie.demogame.location.kitchen;

import java.util.Optional;

import de.krawie.demogame.item.ShineyKnife;
import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class KnifePOI implements PointOfInterest {

	private boolean isHidden = true;
	private boolean isTaken = false;

	@Override
	public String getName() {
		return "Messer im Regal";
	}

	@Override
	public Optional<Item> inspect() {

		new TextBuilder()
				.appendLine("Ein Messer in einem überraschend guten Zustand. Es ist so sauber, dass ich mich darin spiegeln kann.")
				.appendLine("Das könnte ggf. noch nützlich werden.")
				.appendLine("Ich nehme das Messer mal mit.")
				.print();

		isTaken = true;
		return Optional.of(new ShineyKnife());
	}

	@Override
	public Optional<Item> use(Player player) {
		return inspect();
	}

	@Override
	public Optional<Item> useItem(Player player, Item itemToUse) {
		DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);

		return Optional.empty();
	}

	@Override
	public boolean isHidden() {
		return isHidden || isTaken;
	}

	@Override
	public void unhide() {
		isHidden = false;
	}
	
}
