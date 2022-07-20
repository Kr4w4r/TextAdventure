package de.krawie.demogame.item;

import java.util.Optional;

import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.player.Player;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class Newspaper implements Item {

    @Override
    public String getName() {
        return "Alte Zeitung";
    }
    
    @Override
    public Optional<Item> inspect() {
        new TextBuilder()
            .appendLine("Eine alte Zeitung. Sie ist etwa 30 Jahre alt, aber noch gut erhalten.")
            .appendLine("Schlagzeile - Letzer Bewohner des Gutshauses ist unerwartet verstorben")
            .print();

        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {

        double random = Math.random();

        if (random > 0.6) {
            new TextBuilder()
                .appendLine("Du nimmst die Zeitung und ließt ein wenig.")
                .print();
        } else if (0.6 <= random && random < 0.8) {
            new TextBuilder()
                .appendLine("Du nimmst die Zeitung und rollst sie zusammen.")
                .appendLine("Dann schlägst du mit ihr der Fliege die dich schon eine Weile nervt.")
                .append("Leider triffst du sie nicht. Sie wird dich wohl noch eine weile begleiten")
                .print();
        } else {
            new TextBuilder()
                .appendLine("Du nimmst die Zeitung und rollst sie zusammen.")
                .appendLine("Dann schlägst du mit ihr der Fliege die dich schon eine Weile nervt.")
                .appendLine("Du erwischt die Fliege. Jetzt ist erstmal wieder Ruhe.")
                .print();
        }

        return Optional.empty();
    }
    
}
