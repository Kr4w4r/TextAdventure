package de.tom.location;

import java.util.List;

public abstract class LocationData {

	private Location location;

	protected LocationData(Location location) {
		this.location = location;
	}
	
	public abstract List<Path> getAvailablePaths();
	public abstract List<PointOfInterest> getPointsOfInterest();
	
	public String getName() {
		return location.getName();
	}

	public Path getPath(Location targetLocation) {
		return getAvailablePaths().stream()
			.filter(l -> l.getLocationToGo() == targetLocation)
			.findFirst()
			.orElse(null);
	}

	public void printPaths() {
		System.err.println("Zu diesen Orten kannst du gehen:");
		for (Path path : getAvailablePaths()) {
			if (path.isHidden() == false) {
				System.out.println("- \"" + path.getLocationToGo().getName() + "\"");
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
