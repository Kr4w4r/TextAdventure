package de.krawie.demogame.location.houseentrance;

import java.util.Optional;

import de.krawie.demogame.DefaultMessages;
import de.krawie.demogame.item.DoorKnob;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class HouseDoorPOI implements PointOfInterest {

    private boolean hasDoorKnob = true;

    @Override
    public Optional<Item> inspect() {

        if (hasDoorKnob) {
            System.out.println("Die Haustür ist geschlossen. Vielleicht kann ich siehe ja öffnen");
        } else {
            System.out.println("Die Haustür ist geschlossen und der Türknauf ist abgebrochen.\n" +
                    "Über die Tür komme ich nicht ins Haus");
        }
        return Optional.empty();
    }

    @Override
    public String getName() {
        return "Haustür";
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);
        
        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        if (hasDoorKnob) {
            System.out.println("Du versuchst die Tür zu öffnen und brichst dabei den Türknauf ab.\n" +
                "Hier komme ich wohl nicht rein. Aber vielleicht kann ich den Türknauf noch gebrauchen.\n" + 
                "Du nimmst den Türknauf mit.");
        } else {
            System.out.println("Du hast den Türknauf schon abgebrochen. Diese Tür kriegst du von außen nicht mehr auf.");
        }

        return Optional.of(new DoorKnob());
    }
    
}
