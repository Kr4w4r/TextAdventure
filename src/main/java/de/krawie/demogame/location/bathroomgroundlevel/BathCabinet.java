package de.krawie.demogame.location.bathroomgroundlevel;

import java.util.Optional;

import de.krawie.textadventure.framework.DefaultMessages;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class BathCabinet implements PointOfInterest {

    @Override
    public String getName() {
        return "Badschrank";
    }

    @Override
    public Optional<Item> inspect() {
        new TextBuilder()
            .append("Ein Schrank über dem Waschbecken. Der Spiegel scheint entfernt worden zu sein.")
            .println();
        
        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        new TextBuilder()
            .append("Du öffnest den Schrank. Du siehst eine Maus und sie sieht dich an. Vor lauter Panik läuft sie weg.\n")
            .append("Sonst ist da nichts.")
            .println();
    
        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);

        return Optional.empty();
    }

}
