package de.krawie.textadventure.framework.location;

public class HiddenPath {
    private boolean isHidden;

    public boolean isHidden() {
        return isHidden;
    }

    public void unhide() {
        this.isHidden = false;
    }
}
