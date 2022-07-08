package de.tom.input;

public class HelpCommand implements Command{

	@Override
	public String getCommandPrefix() {
		return "?";
	}

	@Override
	public void handleCommand(String playerInput) {
		System.out.println("--- \n"+
			"? - für diese Hilfe\n" +
			"gehe nach <Umgebung> - Gehen in eine andere Umgebung\n" +
			"umsehen - Sehe dich in der Umgebung um und entdecke besondere Orte\n" +
			"untersuche <Ort oder Gegenstand> - Untersuche einen Gegenstand oder Ort\n" + 
			"benutze <gegenstand> - Benutze einen Gegenstand\n" +
			"benutze <gegenstand> an <Ort> - Benutze einen Gegenstand an einen Ort"
		);
	}
	
}
