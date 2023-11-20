package de.krawie.demogame.location.dinningroom;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class CandleHolderPOI implements PointOfInterest {

    @Override
    public String getName() {
        return "Kerzenständer";
    }

    @Override
    public Optional<Item> inspect() {
        new TextBuilder()
            .appendLine("");

        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public boolean isHidden() {
        return true;
    }
    
    @Override
    public void unhide() {

    }

    
}
