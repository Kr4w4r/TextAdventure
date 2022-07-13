package de.krawie.textadventure.framework.location;

import java.util.List;

import de.krawie.textadventure.framework.Scene;

public abstract class Location {

	public abstract String getName();
	public abstract List<Path> getAvailablePaths();
	public abstract List<PointOfInterest> getPointsOfInterest();


	public Path getPath(Class<? extends Location> targetLocation) {
		return getAvailablePaths().stream()
			.filter(l -> l.getLocationToGo().equals(targetLocation))
			.findFirst()
			.orElse(null);
	}

	public void printPaths() {
		System.err.println("Zu diesen Orten kannst du gehen:");
		for (Path path : getAvailablePaths()) {
			if (path.isHidden() == false) {
				Location targetLocation = Scene.getLocation(path.getLocationToGo());
				System.out.println("- \"" + targetLocation.getName() + "\"");
			}
		}
	}

	public void printLookAround() {
		
		if (getPointsOfInterest().size() == 0) {
			System.out.println("Hier ist nichts besonderes zu sehen.");
		} else {
			System.out.println("Du siehst dich um. Dabei siehst du:");
			
			for (PointOfInterest poi : getPointsOfInterest()) {
				System.out.println("-\"" + poi.getName() + "\"");
			}
		}
	}
}
