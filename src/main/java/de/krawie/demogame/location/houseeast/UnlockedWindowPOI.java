package de.krawie.demogame.location.houseeast;

import java.util.Optional;

import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class UnlockedWindowPOI implements PointOfInterest {
    
    boolean windowOpened = false;

    @Override
    public String getName() {
        return "Fenster";
    }

    @Override
    public Optional<Item> inspect() {

        System.out.println("Ein Fenster mit weißen Rahmen. Es scheint einen Spalt geöffnet zu sein");

        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);
        
        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        if (windowOpened) {

        } else {
            System.out.println("Das Fenster ist nicht verschlossen und du kannst es vollständig öffnen." + 
                    "Durch das Fenster könnte ich in das Haus gelangen. Es ist nur leider zu weit oben.");
            windowOpened = true;
        }

        return Optional.empty();
    }
    
}
