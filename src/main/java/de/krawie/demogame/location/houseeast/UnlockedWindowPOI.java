package de.krawie.demogame.location.houseeast;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class UnlockedWindowPOI implements PointOfInterest {
    
    @Override
    public String getName() {
        return "Fenster";
    }

    @Override
    public Optional<Item> inspect() {

        System.out.println("Ein Fenster mit weißen Rahmen. Es scheint einen Spalt geöffnet zu sein");

        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
    
}
