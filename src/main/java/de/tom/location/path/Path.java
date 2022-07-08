package de.tom.location.path;

import de.tom.location.Location;

public class Path {
	private Location locationToGo;
	private PathBlocker pathBlocker;

	

	public Path(Location locationToGo) {
		this.locationToGo = locationToGo;
		pathBlocker = null;
	}

	public Path(Location locationToGo, PathBlocker pathBlocker) {
		this.locationToGo = locationToGo;
		this.pathBlocker = pathBlocker;
	}

	public Location getLocationToGo() {
		return locationToGo;
	}

	public PathBlocker getPathBlocker() {
		return pathBlocker;
	}

	public boolean isBlocked() {
		return pathBlocker != null && pathBlocker.isBlocking();
	}
}
