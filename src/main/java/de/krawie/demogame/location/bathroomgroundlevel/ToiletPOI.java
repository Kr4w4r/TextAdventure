package de.krawie.demogame.location.bathroomgroundlevel;

import java.util.Optional;

import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class ToiletPOI implements PointOfInterest {

    private boolean ratEventTriggered = false;

    @Override
    public String getName() {
        return "Toilette";
    }

    @Override
    public Optional<Item> inspect() {
        new TextBuilder()
            .appendLine("Eine ziemlich eingestaubte Toilette mit geschlossenen Klodeckel.")
            .appendLine("Neben der Toilette findest du eine alte Zeitung. Sie ist von vor 30 Jahren.")
            .appendLine("Das bestimmt interessant mal zu sehen was damals so geschrieben wurde.")
            .append("Du nimmst du Zeitung mit.")
            .println();
        

        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        if (ratEventTriggered == false) {
            new TextBuilder()
                .appendLine("Du versuchst zu spühlen.")
                .appendLine("Es kommt kein Wasser. Stattdessen taucht eine Ratte im Spülbecken auf und klettert aus der Toilette.")
                .appendLine("Dann verschwindet die Ratte in einem Loch in der Wand.")
                .println();
        } else {
            new TextBuilder()
                .appendLine("Du versuchst zu spühlen.")
                .appendLine("Es kommt kein Wasser.")
                .println();
        }

        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);

        return Optional.empty();
    }
}
