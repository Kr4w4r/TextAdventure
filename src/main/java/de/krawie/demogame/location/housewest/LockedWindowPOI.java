package de.krawie.demogame.location.housewest;

import java.util.Optional;

import de.krawie.demogame.item.DoorKnob;
import de.krawie.demogame.item.Ladder;
import de.krawie.demogame.location.livingroom.LivingRoom;
import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.HiddenPath;
import de.krawie.textadventure.framework.location.PathBlocker;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class LockedWindowPOI implements PointOfInterest {

    private boolean isWindowSmashed = false;
    private boolean hasLadder = false;

    @Override
    public String getName() {
        return "Fenster";
    }

    @Override
    public Optional<Item> inspect() {
        if (isWindowSmashed == false) {
            System.out.println(
                    "Ein Fenster. Es liegt ein wenig weiter oben, aber du könntest es mit der Hand erreichen.\n" +
                            "Vielleicht ist es ja offen?");
        } else if (hasLadder == false) {
            System.out.println("Ein Fenster. Du hast es eingeworfen aber ist passierbar.\n" +
                    "Aber es liegt so weit oben, dass du nicht einfach reinklettern kannst.\n" +
                    "Vielleicht finde ich ja etwas um ans Fenster anzukommen.");
        } else {
            System.out.println("Ein Fenster. Du hast es geöffnet und eine Leiter angelegt. Du könntest so ins Haus kommen.");
        }

        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        if (itemToUse instanceof Ladder && isWindowSmashed) {
            System.out.println("Du lehnst die Leiter an die Hauswand. Damit kommst du jetzt ans Fenster.");

            hasLadder = true;
            unblockPathToHouse();
        } else if (itemToUse instanceof Ladder) {
            System.out.println("Ich weiß nicht ob es sinnvoll ist, die Leiter hier anzulehnen.\n" +
                    "Vielleicht prüfe ich erstmal das Fenster.");
        } else if (itemToUse instanceof DoorKnob) {
            System.out.println("Du wirst den Türknauf durch das Fenster und die Scheibe zerspringt in mehrere Teile.\n" +
                            "Jetzt könnte ich durch das Fenster in das Haus gelangen. Es ist nur leider zu weit oben.");
            
            isWindowSmashed = true;
            unhidePathToHouse();
            player.dropItem(DoorKnob.class);
        } else {
            DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);
        }

        return Optional.empty();
    }

    private void unhidePathToHouse() {
        Scene.getHiddenPath(HouseWest.class, LivingRoom.class)
                .ifPresent(HiddenPath::unhide);
    }

    private void unblockPathToHouse() {
        Scene.getPathBlocker(HouseWest.class, LivingRoom.class)
            .ifPresent(PathBlocker::unblock);
    }
    
    @Override
    public Optional<Item> use(Player player) {
        System.out.println("Du versuchst das Fenster zu öffnen, aber ist scheint verschlossen zu sein.");

        return Optional.empty();
    }
}
