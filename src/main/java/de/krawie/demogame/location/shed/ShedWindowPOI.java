package de.krawie.demogame.location.shed;

import java.util.Optional;

import de.krawie.demogame.DefaultMessages;
import de.krawie.textadventure.framework.item.Item;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.player.Player;

public class ShedWindowPOI implements PointOfInterest {
    
    private boolean isHidden = true;
    private boolean isWindowClean = false;

    @Override
    public String getName() {
        return "Fenster";
    }

    @Override
    public Optional<Item> inspect() {
        if (isWindowClean) {
			System.out.println("Ein Fenster. Es ist verschlossen.\n" + 
                    "Du hast die Pflanzen entfernt und kannst jetzt durchsehen.\n" + 
					"Im Dunkeln kannst du einen Haufen Gerümpel sehen sowie eine Leiter.");
        } else {
            System.out.println("Ein Fenster. Es ist ziemlich zugewachsen. Daher kannst du nicht hineinsehen.");
		}

        return Optional.empty();
    }

    @Override
    public Optional<Item> use(Player player) {
        System.out.println("Du entfernst die Pflanzen vom Fenster und kannst jetzt hineinsehen.");
        isWindowClean = true;

        return Optional.empty();
    }

    @Override
    public Optional<Item> useItem(Player player, Item itemToUse) {
        DefaultMessages.getItemCanNotBeUsedAtLocation(itemToUse);

        return Optional.empty();
    }
    
    @Override
    public boolean isHidden() {
        return isHidden;
    }

    @Override
    public void unhide() {
        isHidden = false;
    }
}
