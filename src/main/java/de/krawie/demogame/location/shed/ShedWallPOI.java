package de.krawie.demogame.location.shed;

import java.util.Optional;

import de.krawie.demogame.item.Ladder;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class ShedWallPOI implements PointOfInterest {

    @Override
    public String getName() {
        return "Schuppenwand";
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

    @Override
    public Optional<Item> use(Player player) {
        System.out.println("Wie soll ich eine Wand benutzen?");
        return Optional.empty();
    }

}
