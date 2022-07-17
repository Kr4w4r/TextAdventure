package de.krawie.demogame.item;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.player.Player;

public class Ladder implements Item {


    @Override
    public String getName() {
        return "Leiter";
    }

    @Override
    public Optional<Item> inspect() {
        System.out.println("Eine alte Holzleiter. Sie könnte mich gerade so halten.");
        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        System.out.println("Du stellst die Leiter aufrecht hin. Dann steigst auf die erste Stufe und balancierst eine Weile auf ihr.\n" + 
                "Eine Windböhe erfasst dich und bringt dich mit der Leiter zu fall.\n" + 
                "Etwas verdutzt stehst du wieder auf. Die Leiter scheint aber noch intakt zu sein.");
        return Optional.empty();
    }
    
}
