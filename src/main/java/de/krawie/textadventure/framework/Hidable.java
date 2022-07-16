package de.krawie.textadventure.framework;

public interface Hidable {
    default boolean isHidden() {
        return false;
    };

    default void unhide() {};
}
