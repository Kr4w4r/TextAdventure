package de.krawie.demogame.location.shed;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class ShedDoorPOI implements PointOfInterest {

    @Override
    public String getName() {
        return "Schuppentür";
    }

    @Override
    public Optional<Item> inspect() {
        System.out.println("Eine Tür in den Schuppen. Sie scheint nicht verschlossen zu sein. Eventuell kann ich sie öffnen.");

        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
		System.out.println(itemToUse.getName() + " kann hier nicht verwendet werden.");

        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        System.out.println("Du öffnest die Tür in den Schuppen.");

        return Optional.empty();
    }
    
}
