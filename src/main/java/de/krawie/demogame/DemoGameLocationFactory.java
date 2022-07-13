package de.krawie.demogame;

import java.lang.reflect.InvocationTargetException;

import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.LocationFactory;

public class DemoGameLocationFactory implements LocationFactory{

    @Override
    public Location createLocation(Class<? extends Location> locationClass) {
        try {
            return locationClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            throw new LocationCanNotBeInstantiatedException(locationClass, e);
        }
    }

}
