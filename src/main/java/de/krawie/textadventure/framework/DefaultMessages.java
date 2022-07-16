package de.krawie.textadventure.framework;

import de.krawie.textadventure.framework.item.Item;

public class DefaultMessages {
    private DefaultMessages() {

    }

    public static void getPointOfInterestCanNotBeUsed() {
        System.out.println("I");
    }

    public static void getItemCanNotBeUsedAtLocation(Item item) {
        System.out.println(item.getName() + " kann hier nicht verwendet werden.");
    }
}
