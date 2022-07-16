package de.krawie.demogame.location.shed;

import java.util.Optional;

import de.krawie.demogame.DefaultMessages;
import de.krawie.textadventure.framework.Hidable;
import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class ShedWallPOI implements PointOfInterest {

	@Override
	public String getName() {
		return "Schuppen";
	}

	@Override
	public Optional<Item> inspect() {
		if (isShedWindowHidden()) {
			System.out.println("Du gehst um den Schuppen und findest ein Fenster aber es ist ziemlich zugewachsen.\n" +
					"Sonst liegt um das Haus nur Gerümpel.");

			unhideShedWindow();
		} else {
			System.out.println("Du gehst um den Schuppen und findest nur Gerümpel.\n" +
					"Das Fenster hast du hast du vorhin schon entdeckt.");
		}

		return Optional.empty();
	}

	@Override
	public Optional<Item> useItem(Player player, Item itemToUse) {
		DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);

		return Optional.empty();
	}

	@Override
	public Optional<Item> use(Player player) {
		System.out.println("Wie soll ich eine Wand benutzen?");

		return Optional.empty();
	}

	private Hidable getShedWindow() {
		return Scene.getPointOfInterest(Shed.class, ShedWindowPOI.class)
				.orElseThrow();
	}

	private boolean isShedWindowHidden() {
		return getShedWindow().isHidden();
	}

	private void unhideShedWindow() {
		getShedWindow().unhide();
	}

}
