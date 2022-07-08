package de.tom.item;

import java.util.Optional;

import de.tom.player.Player;

public class Rust implements Item {

	@Override
	public Optional<Item> inspect() {
		
		return Optional.empty();
	}

	@Override
	public String getName() {
		return "Rost";
	}

	@Override
	public ItemType getType() {
		return ItemType.RUST;
	}

	@Override
	public Optional<Item> use(Player player) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
}
