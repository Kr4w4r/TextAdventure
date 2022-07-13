package de.krawie.demogame;

import de.krawie.textadventure.framework.location.Location;

public class LocationCanNotBeInstantiatedException extends RuntimeException {

    public LocationCanNotBeInstantiatedException(Class<? extends Location> locationClass, Throwable cause) {
        super("Location for class" + locationClass.getName() + " can not be instantiated", cause);
    }

}
