package de.krawie.demogame.location.ShedInside;

import java.util.Optional;

import de.krawie.demogame.item.Ladder;
import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class ShedShelfPOI implements PointOfInterest {
    
    private final String postFix;
    private boolean inspected = false;

    private static int inspectedShelfs = 0;

    public ShedShelfPOI(String namePostFix) {
        this.postFix = namePostFix;
    }

    @Override
    public String getName() {
        return "Regal " + postFix;
    }
    
    @Override
    public Optional<Item> inspect() {
        
        Optional<Item> itemToFind = Optional.empty();

        if (inspectedShelfs == 0) {
            System.out.println("Du betrachtest das Regal. Es ist nur Plunder darin. Vielleicht finde ich in den anderen Regalen etwas.");
        } else if (inspectedShelfs == 1 && inspected == false) {
            System.out.println("Du betrachtest das Regal. Es ist nur Plunder darin. Aber an das Regal gelehnt findest du eine Leiter.\n" +
            "Die könnte noch nützlich werden. Du nimmst die Leiter mit.");
            itemToFind = Optional.of(new Ladder());
        } else {
            System.out.println("Du betrachtest das Regal. Es ist nur Plunder darin.");
        }
        
        if (inspected == false) {
            inspected = true;
            inspectedShelfs++;
        }

        return itemToFind;
    }

    @Override
    public Optional<Item> use(Player player) {
        DefaultMessages.getPointOfInterestCanNotBeUsed();
        
        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);
        
        return Optional.empty();
    }
}
