package de.tom.location;

public class Path {
	private Location locationToGo;
	private PathBlocker pathBlocker;
	private HiddenPath hiddenPath;
	
	public Path(Location locationToGo) {
		this.locationToGo = locationToGo;
		pathBlocker = null;
		hiddenPath = null;
	}

	public Path(Location locationToGo, PathBlocker pathBlocker) {
		this.locationToGo = locationToGo;
		this.pathBlocker = pathBlocker;
		hiddenPath = null;
	}

	public Path(Location locationToGo, HiddenPath hiddenPath) {
		this.locationToGo = locationToGo;
		pathBlocker = null;
		this.hiddenPath = hiddenPath;
	}

	public Path(Location locationToGo, PathBlocker pathBlocker, HiddenPath hiddenPath) {
		this.locationToGo = locationToGo;
		this.pathBlocker = pathBlocker;
		this.hiddenPath = hiddenPath;
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

	public boolean isHidden() {
		return hiddenPath != null && hiddenPath.isHidden();
	}
}
