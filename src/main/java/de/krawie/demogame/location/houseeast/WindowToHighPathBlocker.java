package de.krawie.demogame.location.houseeast;

import de.krawie.textadventure.framework.location.PathBlocker;

public class WindowToHighPathBlocker extends PathBlocker {

    public WindowToHighPathBlocker() {
        super("Das Fenster ist zu weit oben");
    }
    
    @Override
    public String getBlockingText() {
        return "Das Fenster ist zu weit oben. Du kannst es nicht erreichen.";
    }
}
