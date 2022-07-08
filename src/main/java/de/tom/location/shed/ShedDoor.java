package de.tom.location.shed;

import java.util.Optional;

import de.tom.item.Item;
import de.tom.location.PointOfInterest;
import de.tom.player.Player;

public class ShedDoor implements PointOfInterest {

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
    public Optional<Item> useItem(Player player, Item itemToUse) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
    
}
