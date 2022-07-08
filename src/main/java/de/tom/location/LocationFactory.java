package de.tom.location;

public class LocationFactory {
	
	private LocationFactory() {}

	public static LocationData createLocationData(Location location) {
		switch (location) {
			case FOREST: return new Forest();
			case GARDEN: return new Garden();
			case GARDEN_FENCE_WITH_DOOR: return new GardenFenceWithDoor();
			default:
				return null;
		}
	}
}
