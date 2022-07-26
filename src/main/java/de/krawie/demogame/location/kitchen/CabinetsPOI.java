package de.krawie.demogame.location.kitchen;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class CabinetsPOI implements PointOfInterest {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Optional<Item> inspect() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Item> use(Player player) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Item> useItem(Player player, Item itemToUse) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
