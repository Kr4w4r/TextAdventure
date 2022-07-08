package de.tom.location.houseentrance;

import java.util.Optional;

import de.tom.item.DoorKnob;
import de.tom.item.Item;
import de.tom.location.PointOfInterest;
import de.tom.player.Player;

public class HouseDoor implements PointOfInterest {

    @Override
    public Optional<Item> inspect() {
        System.out.println("Die Haustür ist geschlossen. Du versuchst die Tür zu öffnen und brichst dabei den Türknauf ab.\n" +
                "Hier komme ich wohl nicht rein. Aber vielleicht kann ich den Türknauf noch gebrauchen.\n" + 
                "Du nimmst den Türknauf mit.");
        return Optional.of(new DoorKnob());
    }

    @Override
    public String getName() {
        return "Haustür";
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        System.out.println("Du kann " + itemToUse.getName() + " hier nicht benutzen");
        return Optional.empty();
    }
    
}
