package de.krawie.demogame.location.shed;

import java.util.Optional;

import de.krawie.demogame.DefaultMessages;
import de.krawie.demogame.location.ShedInside.ShedInside;
import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.HiddenPath;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class ShedDoorPOI implements PointOfInterest {

    @Override
    public String getName() {
        return "Tür";
    }

    @Override
    public Optional<Item> inspect() {

        if (isDoorClosed()) {
            System.out.println("Eine marode Tür in den Schuppen. Sie ist geschlossen.\n" +
                    "Eventuell kann ich sie öffnen.");
        } else {
            System.out.println("Eine marode Tür in den Schuppen. Du hast sie geöffnet. Du kannst ihn jetzt betreten.");
        }

        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);

        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        if (isDoorClosed()) {
            System.out.println("Du ziehst an der Tür und nach einigen Versuchen kannst du sie öffnen.\n" +
                "Der Weg in den Schuppen ist jetzt frei.");
            
            unhidePathToShedInside();
        } else {
            System.out.println("Du hast die Tür schon geöffnet.");
        }
        
        return Optional.empty();
    }
    
    private HiddenPath getPathToShedInside() {
        return Scene
            .getPath(Shed.class, ShedInside.class)
            .orElseThrow()
            .getHiddenPath();
    }

    private void unhidePathToShedInside() {
        getPathToShedInside().unhide();
    }

    private boolean isDoorClosed() {
        return getPathToShedInside().isHidden();
    }
}
