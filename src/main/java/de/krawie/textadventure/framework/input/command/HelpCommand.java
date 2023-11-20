package de.krawie.textadventure.framework.input.command;

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
			"benutze <Gegenstand oder Ort> - Benutze einen Gegenstand oder einen Ort\n" +
			"benutze <Gegenstand> an <Ort> - Benutze einen Gegenstand an einen Ort\n" +
			"Inventar - Zeigt alle Gegenstände in deinem Inventar."
		);
	}
}
