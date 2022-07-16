package de.krawie.textadventure.framework.location;

import de.krawie.textadventure.framework.Hidable;
import de.krawie.textadventure.framework.Inspectable;
import de.krawie.textadventure.framework.Useable;
import de.krawie.textadventure.framework.UseableWithItem;

public interface PointOfInterest extends Inspectable, Hidable, Useable, UseableWithItem {

	String getName();
}
