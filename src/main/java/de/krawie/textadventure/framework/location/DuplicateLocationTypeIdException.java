package de.krawie.textadventure.framework.location;

public class DuplicateLocationTypeIdException extends RuntimeException {
    public DuplicateLocationTypeIdException(String id) {
        super("Location ID " + id + " is used twice.");
    }
}
