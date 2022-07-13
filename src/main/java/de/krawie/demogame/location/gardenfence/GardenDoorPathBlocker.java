package de.krawie.demogame.location.gardenfence;

import de.krawie.textadventure.framework.location.PathBlocker;

public class GardenDoorPathBlocker extends PathBlocker {

	public GardenDoorPathBlocker() {
		super("Gartentor");
	}

	@Override
	public String getBlockingText() {
		return "Ein verschlossenes Gartentor versperrt dir den Weg.";
	}
	
}
