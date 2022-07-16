package de.krawie.demogame.location.housewest;

import java.util.Optional;

import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class LockedWindowPOI implements PointOfInterest {

    @Override
    public String getName() {
        return "Fenster";
    }

    @Override
    public Optional<Item> inspect() {
        
        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);
        
        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        System.out.println("Du versuchst das Fenster zu öffnen, aber ist scheint verschlossen zu sein.");
        
        return Optional.empty();
    }

}
