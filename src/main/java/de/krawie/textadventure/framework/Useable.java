package de.krawie.textadventure.framework;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.player.Player;

public interface Useable {
    Optional<Item> use(Player player);
}
