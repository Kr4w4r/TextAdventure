package de.krawie.textadventure.framework.input;

import java.util.Arrays;
import java.util.List;

import de.krawie.textadventure.framework.game.GameData;
import de.krawie.textadventure.framework.input.command.Command;
import de.krawie.textadventure.framework.input.command.HelpCommand;
import de.krawie.textadventure.framework.input.command.InspectCommand;
import de.krawie.textadventure.framework.input.command.InventoryCommand;
import de.krawie.textadventure.framework.input.command.LoadCommand;
import de.krawie.textadventure.framework.input.command.LookAroundCommand;
import de.krawie.textadventure.framework.input.command.MoveCommand;
import de.krawie.textadventure.framework.input.command.SaveCommand;
import de.krawie.textadventure.framework.input.command.UseCommand;

public class GameInputHandler extends InputHandlerBase {

    public GameInputHandler(GameData gameData) {
        super(gameData);
    }

    @Override
    public List<Command> getAvailableCommands() {
        return Arrays.asList(
			new MoveCommand(gameData.getPlayer()), 
			new LookAroundCommand(gameData.getPlayer()), 
			new InspectCommand(gameData.getPlayer()),
			new UseCommand(gameData.getPlayer()), 
			new InventoryCommand(gameData.getPlayer()), 
			new HelpCommand(),
            new LoadCommand(),
			new SaveCommand());
    }
    
}
