package de.krawie.demogame.location.garden;

import java.util.Optional;

import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class FountainPOI implements PointOfInterest {

    @Override
    public String getName() {
        return "Brunnen";
    }

    @Override
    public Optional<Item> inspect() {
        System.out.println("Ein zugewachsener Brunnen mit einer Statue in der Mitte. Er sah fürher bestimmt mal hübsch aus.");

        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        System.out.println("Du hebst eine Steinchen auf und wirst ihn ins Wasser.\n" +
            "Sonst passiert nichts.");

        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);

        return Optional.empty();
    }
    
}
