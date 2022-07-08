package de.tom.item;

import java.util.Optional;

import de.tom.player.Player;

public class DoorKnob implements Item {

    @Override
    public String getName() {
        return "Türknauf";
    }

    @Override
    public ItemType getType() {
        return ItemType.DOORKNOB;
    }

    @Override
    public Optional<Item> inspect() {
        System.out.println("Der Türknauf der Haustür. Du hast ihn ausversehen abgebrochen.");
        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        System.out.println("Du wirfst den Türknauf ein paar mal hoch und fängst ihr wieder auf. Sonst passiert nichts.");
        return Optional.empty();
    }
    
}
