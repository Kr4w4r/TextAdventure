package de.krawie.demogame.location.bathroomgroundlevel;

import java.util.Optional;

import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class BathTubePOI implements PointOfInterest {
    
    @Override
    public String getName() {
        return "Badewanne";
    }

    @Override
    public Optional<Item> inspect() {
        new TextBuilder()
            .append("Eine Badewanne gefüllt mit Schutt. Da ist nichts spannendes drin.")
            .println();

        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        new TextBuilder()
            .appendLine("Du hebst ein großes Stück Schutt auf und betrachtest es.")
            .appendLine("Damit kannst du wohl nichts anfangen. Daher wirfst du es zurück")
            .println();

        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);

        return Optional.empty();
    }

    
}
