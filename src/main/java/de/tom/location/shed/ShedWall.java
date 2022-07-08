package de.tom.location.shed;

import java.util.Optional;

import de.tom.item.Item;
import de.tom.item.Ladder;
import de.tom.location.PointOfInterest;
import de.tom.player.Player;

public class ShedWall implements PointOfInterest {

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Item> inspect() {
        System.out.println("Du gehst um den Schuppen und findest eine Leiter an der Wand angelehnt.\n" +
        "Die könnte noch nützlich werden.\n" +
        "Du nimmst die Leiter mit.");
        return Optional.of(new Ladder());
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

}
