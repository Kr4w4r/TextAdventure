package de.krawie.textadventure.framework.location;

import de.krawie.textadventure.framework.Hidable;

public class HiddenPath implements Hidable {
    private boolean isHidden = true;

    @Override
    public boolean isHidden() {
        return isHidden;
    }

    @Override
    public void unhide() {
        this.isHidden = false;
    }
}
