package de.krawie.textadventure.framework.location;

public class PathBlocker {
	private String name;
	private boolean isBlocking = true;

	public PathBlocker(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isBlocking() {
		return isBlocking;
	}

	public void unblock() {
		isBlocking = false;
	}

	public String getBlockingText() {
		return "Der Weg ist Blockiert";
	}
}
