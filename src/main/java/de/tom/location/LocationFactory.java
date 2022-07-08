package de.tom.location;

import de.tom.location.forest.Forest;
import de.tom.location.garden.Garden;
import de.tom.location.gardenfence.GardenFenceWithDoor;
import de.tom.location.houseentrance.HouseEntrance;
import de.tom.location.shed.Shed;

public class LocationFactory {
	
	private LocationFactory() {}

	public static LocationData createLocationData(Location location) {
		switch (location) {
			case FOREST: return new Forest();
			case GARDEN: return new Garden();
			case GARDEN_FENCE_WITH_DOOR: return new GardenFenceWithDoor();
			case HOUSE_ENTRANCE: return new HouseEntrance();
			case SHED: return new Shed();
			default:
				return null;
		}
	}
}
