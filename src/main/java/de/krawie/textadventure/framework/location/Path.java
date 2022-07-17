package de.krawie.textadventure.framework.location;

public class Path {
	private Class<? extends Location> locationToGo;
	private PathBlocker pathBlocker;
	private HiddenPath hiddenPath;
	
	public Path(Class<? extends Location> locationToGo) {
		this.locationToGo = locationToGo;
		pathBlocker = null;
		hiddenPath = null;
	}

	public Path(Class<? extends Location> locationToGo, PathBlocker pathBlocker) {
		this.locationToGo = locationToGo;
		this.pathBlocker = pathBlocker;
		hiddenPath = null;
	}

	public Path(Class<? extends Location> locationToGo, HiddenPath hiddenPath) {
		this.locationToGo = locationToGo;
		pathBlocker = null;
		this.hiddenPath = hiddenPath;
	}

	public Path(Class<? extends Location> locationToGo, PathBlocker pathBlocker, HiddenPath hiddenPath) {
		this.locationToGo = locationToGo;
		this.pathBlocker = pathBlocker;
		this.hiddenPath = hiddenPath;
	}

	public Class<? extends Location> getLocationToGo() {
		return locationToGo;
	}

	public PathBlocker getPathBlocker() {
		return pathBlocker;
	}

	public boolean isBlocked() {
		return pathBlocker != null && pathBlocker.isBlocking();
	}

	public HiddenPath getHiddenPath() {
		return hiddenPath;
	}

	public boolean isHidden() {
		return hiddenPath != null && hiddenPath.isHidden();
	}
}
