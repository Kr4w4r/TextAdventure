package de.krawie.demogame.location.kitchen;

import java.util.Optional;

import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class ShelfPOI implements PointOfInterest {

	private boolean isInspected = false;

	@Override
	public String getName() {
		return "Regal";
	}

	@Override
	public Optional<Item> inspect() {
		PointOfInterest knifePOI = Scene.getPointOfInterest(Kitchen.class, KnifePOI.class).orElseThrow();
		
		TextBuilder inspectionText = new TextBuilder()
			.appendLine("Ein staubiges Küchenregal mit 3 Ebenen.");

		if (!isInspected) {
			// First time the shelf is inspected
			isInspected = true;
			knifePOI.unhide();
		} 
		
		if (!knifePOI.isHidden()) {
			// Knife is revealed but not taken
			inspectionText.appendLine("Es liegt nur ein Messer im Regal.");
		} else {
			// Knife is taken
			inspectionText.appendLine("Hier habe ich ein Messer gefunden.");
		}

		inspectionText.print();

		return Optional.empty();
	}

	@Override
	public Optional<Item> use(Player player) {
		new TextBuilder()
				.appendLine("Du malst ein Herz in den Staub auf dem Regal.")
				.appendLine("Was anderes kann ich mit dem Regal nicht machen.")
				.print();

		return Optional.empty();
	}

	@Override
	public Optional<Item> useItem(Player player, Item itemToUse) {
		DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);

		return Optional.empty();
	}

}
