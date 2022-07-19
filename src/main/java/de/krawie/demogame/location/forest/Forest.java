package de.krawie.demogame.location.forest;

import java.util.Arrays;
import java.util.List;

import com.diogonunes.jcolor.Attribute;

import de.krawie.demogame.location.gardenfence.GardenFence;
import de.krawie.textadventure.framework.location.Location;
import de.krawie.textadventure.framework.location.Path;
import de.krawie.textadventure.framework.location.PointOfInterest;
import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class Forest extends Location {

	private final List<Path> availablePaths = Arrays.asList(
			new Path(GardenFence.class)
	);

	TreeStompPOI treeStomp = new TreeStompPOI();

	public Forest() {
		super();
	}

	@Override
	public String getName() {
		return new TextBuilder()
			.append("Dunkler Wald", Attribute.GREEN_TEXT(), Attribute.SLOW_BLINK())
			.toString();
	}

	@Override
	public String getLocationKey() {
		return "Wald";
	}

	@Override
	public List<PointOfInterest> getPointsOfInterest() {
		return Arrays.asList(treeStomp);
	}

	@Override
	public List<Path> getAvailablePaths() {
		return availablePaths;
	}

}
