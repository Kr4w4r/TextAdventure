package de.krawie.demogame.location.bathroomgroundlevel;

import java.util.Optional;

import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class BathroomSinkPOI implements PointOfInterest {
    
    @Override
    public String getName() {
        return "Waschbecken";
    }

    @Override
    public Optional<Item> inspect() {
        new TextBuilder()
            .appendLine("Ein Waschbecken. Ein Stück ist abgebrochen. Das kann man wohl nicht mehr verwenden.")
            .println();

        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        new TextBuilder()
            .appendLine("Du drehst den Wasserhahn auf. Bis auf ein bisschen Staub kommt aber nichts raus.")
            .println();

        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);

        return Optional.empty();
    }
}
