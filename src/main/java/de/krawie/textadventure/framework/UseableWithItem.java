package de.krawie.textadventure.framework;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.player.Player;

public interface UseableWithItem {
    Optional<Item> useItem(Player player, Item itemToUse);
}