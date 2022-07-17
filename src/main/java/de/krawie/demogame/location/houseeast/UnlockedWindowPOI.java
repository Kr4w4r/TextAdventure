package de.krawie.demogame.location.houseeast;

import java.util.Optional;

import de.krawie.demogame.item.Ladder;
import de.krawie.demogame.location.dinningroom.DinningRoom;
import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.Scene;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.HiddenPath;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class UnlockedWindowPOI implements PointOfInterest {

    boolean windowOpened = false;
    boolean hasLadder = false;

    @Override
    public String getName() {
        return "Fenster";
    }

    @Override
    public Optional<Item> inspect() {
        if (windowOpened == false) {
            System.out.println(
                    "Ein Fenster. Es liegt ein wenig weiter oben, aber du könntest es mit der Hand erreichen.\n" +
                            "Vielleicht ist es ja offen?");
        } else if (hasLadder == false) {
            System.out.println("Ein Fenster. Du hast es geöffnet. Aber es liegt so weit oben, dass du nicht einfach reinklettern kannst.\n" +
                    "Vielleicht finde ich ja etwas um ans Fenster anzukommen.");
        } else {
            System.out.println(
                    "Ein Fenster. Du hast es geöffnet und eine Leiter angelegt. Du könntest so ins Haus kommen.");
        }

        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {

        if (itemToUse instanceof Ladder && windowOpened) {
            System.out.println("Du lehnst die Leiter an die Hauswand. Damit kommst du jetzt ans Fenster.");

            hasLadder = true;
            unblockPathToHouse();
            player.dropItem(Ladder.class);
        } else if (itemToUse instanceof Ladder) {
            System.out.println("Ich weiß nicht ob es sinnvoll ist, die Leiter hier anzulehnen.\n" +
                    "Vielleicht prüfe ich erstmal das Fenster.");
        } else {
            DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);
        }

        return Optional.empty();
    }

    private void unblockPathToHouse() {
        Scene.getHiddenPath(HouseEast.class, DinningRoom.class)
                .ifPresent(HiddenPath::unhide);
    }

    @Override
    public Optional<Item> use(Player player) {
        if (windowOpened) {
            System.out.println("Du hast das Fenster bereits geöffnet.");
        } else {
            System.out.println("Das Fenster ist nicht verschlossen und du kannst es vollständig öffnen.\n" +
                    "Durch das Fenster könnte ich in das Haus gelangen. Es ist nur leider zu weit oben.");

            windowOpened = true;
            unhidePathToHouse();
        }

        return Optional.empty();
    }

    private void unhidePathToHouse() {
        Scene.getHiddenPath(HouseEast.class, DinningRoom.class)
                .ifPresent(HiddenPath::unhide);
    }
}
