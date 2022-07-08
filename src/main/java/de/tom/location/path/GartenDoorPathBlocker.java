package de.tom.location.path;

public class GartenDoorPathBlocker extends PathBlocker {

	public GartenDoorPathBlocker() {
		super("Gartentor");
	}

	@Override
	public String getBlockingText() {
		return "Ein verschlossenes Gartentor versperrt dir den Weg.";
	}
	
}
