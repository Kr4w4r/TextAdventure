package de.krawie.textadventure.framework.location;

public interface LocationFactory {
    Location createLocation(Class<? extends Location> locationClass);
}
